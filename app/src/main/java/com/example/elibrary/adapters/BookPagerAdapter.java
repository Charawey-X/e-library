package com.example.elibrary.adapters;

import android.support.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.elibrary.models.BookResponse.Doc;
import com.example.elibrary.ui.BookDetailFragment;

import java.util.List;

public class BookPagerAdapter  extends FragmentPagerAdapter {
    private List<Doc> books;

    public BookPagerAdapter(@NonNull FragmentManager fm, int behavior, List<Doc> books) {
        super(fm, behavior);
        books = books;
    }

    @Override
    public Fragment getItem(int position) {
        return BookDetailFragment.newInstance(books.get(position));
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return books.get(position).getTitle();
    }
}
