package com.example.elibrary.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.elibrary.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.textView) EditText searchInput;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.button) Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        submit.setOnClickListener(v -> {
            String book = searchInput.getText().toString();
            Intent intentSubmit = new Intent(MainActivity.this, WorksActivity.class);
            intentSubmit.putExtra("book", book);
            startActivity(intentSubmit);
        });
    }
}