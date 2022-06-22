package com.example.elibrary.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

public class BookAdapter extends ArrayAdapter {
    private final Context mContext;
    private final String[] mSongList;
    private final String[] artists;

    public BookAdapter(Context mContext,int resource, String[] mSongList, String[] artists) {
        super(mContext,resource);
        this.mContext=mContext;
        this.mSongList=mSongList;
        this.artists=artists;
    }

    @Override
    public int getCount() {
        return mSongList.length;
    }

    @Override
    public Object getItem(int position) {
        String song = mSongList[position];
        String artist = artists[position];
        return String.format("%s \nBy %s",song,artist);
    }
}
