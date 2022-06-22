package com.example.elibrary.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.elibrary.R;
import com.example.elibrary.adapters.BookPagerAdapter;
import com.example.elibrary.models.BookResponse.Doc;

import java.util.List;

import butterknife.BindView;

public class BookDetail extends AppCompatActivity {
    @BindView(R.id.viewPager) ViewPager mViewPager;
    private BookPagerAdapter adapterViewPager;
    List<Doc> mRestaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);
    }
}