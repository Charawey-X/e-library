package com.example.elibrary.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.elibrary.R;
import com.example.elibrary.adapters.BookAdapter;
import com.example.elibrary.models.BookResponse.BookResponse;
import com.example.elibrary.models.BookResponse.Doc;
import com.example.elibrary.network.LibraryApi;
import com.example.elibrary.network.LibraryClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WorksActivity extends AppCompatActivity {
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.listView) ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_works);

        ButterKnife.bind(this);
        Intent intent = getIntent();
        String book = intent.getStringExtra("book");

        LibraryApi client = LibraryClient.getClient();
        Call<BookResponse> call = client.getResults(book);

        call.enqueue(new Callback<BookResponse>() {
            @Override
            public void onResponse(Call<BookResponse> call, Response<BookResponse> response) {
                hideProgressBar();
                if(response.isSuccessful()){
                    List<Doc> bookList = response.body().getDocs();
                    String [] books = new String[bookList.size()];
                    String [] authors = new String[bookList.size()];

                    for (int i = 0; i < books.length; i++){
                        books[i] = bookList.get(i).getTitle();
                    }

                    for (int i = 0; i < authors.length; i++) {
                        authors[i] = String.valueOf(bookList.get(i).getAuthorName());
                    }

                    ArrayAdapter adapter = new BookAdapter(WorksActivity.this, android.R.layout.simple_list_item_1, books, authors);
                    mListView.setAdapter(adapter);
                    showSongs();
                } else showUnsuccessfulMessage();
            }

            @Override
            public void onFailure(Call<BookResponse> call, Throwable t) {
                Log.e("Error Message", "onFailure: ",t );
                hideProgressBar();
                showFailureMessage();
            }
        });
    }

    private static final String TAG = WorksActivity.class.getSimpleName();
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.errorTextView)
    TextView mErrorTextView;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;

    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showSongs() {
        mListView.setVisibility(View.VISIBLE);
        //songTextView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }
}