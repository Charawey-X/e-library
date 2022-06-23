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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.textView) EditText searchInput;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.button) Button submit;
    @BindView(R.id.savedBooksButton) Button mSavedBooksButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        submit.setOnClickListener(this);
        mSavedBooksButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v == submit) {
            String book = searchInput.getText().toString();
            Intent intent = new Intent(MainActivity.this, WorksActivity.class);
            intent.putExtra("book", book);
            startActivity(intent);
        }

        if (v == mSavedBooksButton) {
            Intent intent = new Intent(MainActivity.this, WorksActivity.class);
            startActivity(intent);
        }
    }
}