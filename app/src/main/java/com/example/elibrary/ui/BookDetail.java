package com.example.elibrary.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.elibrary.R;
import com.example.elibrary.adapters.BookPagerAdapter;
import com.example.elibrary.models.BookResponse.Doc;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BookDetail extends AppCompatActivity {
    @BindView(R.id.viewPager) ViewPager mViewPager;
    private BookPagerAdapter adapterViewPager;
    List<Doc> books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);
        ButterKnife.bind(this);

        books = Parcels.unwrap(getIntent().getParcelableExtra("books"));
        int startingPosition = getIntent().getIntExtra("position", 0);

        adapterViewPager = new BookPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, books);
        mViewPager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);
    }
}