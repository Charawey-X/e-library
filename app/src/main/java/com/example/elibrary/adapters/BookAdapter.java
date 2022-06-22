package com.example.elibrary.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.elibrary.R;
import com.example.elibrary.models.BookResponse.Doc;
import com.example.elibrary.ui.BookDetail;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    private final Context mContext;
    private List<Doc> mBooks;

    public BookAdapter(Context mContext, List<Doc> mBooks) {
        this.mContext=mContext;
        this.mBooks = mBooks;
    }

    @Override
    public BookAdapter.BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_list_item, parent, false);
        BookViewHolder viewHolder = new BookViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BookAdapter.BookViewHolder holder, int position) {
        holder.bindBook(mBooks.get(position));
    }

    @Override
    public int getItemCount() {
        return mBooks.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.bookImageView) ImageView mBookImageView;
        @BindView(R.id.bookNameTextView) TextView mNameTextView;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        @BindView(R.id.publisherTextView) TextView mRatingTextView;
        private Context mContext;

        public BookViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
            itemView.setOnClickListener(this);
        }

        @SuppressLint("SetTextI18n")
        public void bindBook(Doc book) {
            Picasso.get().load("https://covers.openlibrary.org/b/olid/"+book.getCoverEditionKey()+"-M.jpg").into(mBookImageView);
            mNameTextView.setText(book.getTitle());
            mCategoryTextView.setText(String.valueOf(book.getAuthorName()).replaceAll("[]\\[\\]]",""));
            mRatingTextView.setText("Publisher: " + book.getPublisher().get(0));
        }
        @Override
        public void onClick(View v) {
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(mContext, BookDetail.class);
            intent.putExtra("position", itemPosition);
            intent.putExtra("books", Parcels.wrap(mBooks));
            mContext.startActivity(intent);
        }
    }

}
