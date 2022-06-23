package com.example.elibrary.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.elibrary.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.searchInput) EditText searchInput;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.submit) Button submit;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.cancel) Button cancel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ButterKnife.bind(this);
        submit.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v == submit) {
            String book = searchInput.getText().toString();
            Intent intent = new Intent(SearchActivity.this, WorksActivity.class);
            intent.putExtra("book", book);
            startActivity(intent);
        }

        if(v==cancel){
            Intent intentCancel = new Intent(SearchActivity.this, MainActivity.class);
            startActivity(intentCancel);
        }
    }
}