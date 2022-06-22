package com.example.elibrary.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.elibrary.R;
import com.example.elibrary.models.BookResponse.Doc;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BookDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BookDetailFragment extends Fragment {

    @BindView(R.id.bookImageView) ImageView mImageLabel;
    @BindView(R.id.bookNameTextView) TextView mNameLabel;
    @BindView(R.id.authorTextView) TextView mCategoriesLabel;
    @BindView(R.id.publisherTextView) TextView mRatingLabel;
    @BindView(R.id.websiteTextView) TextView mWebsiteLabel;
    @BindView(R.id.phoneTextView) TextView mPhoneLabel;
    @BindView(R.id.saveBookButton) TextView mSaveRestaurantButton;


    private Doc book;

    public BookDetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param book
     * @return A new instance of fragment BookDetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BookDetailFragment newInstance(Doc book) {
        BookDetailFragment fragment = new BookDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("book", Parcels.wrap(book));
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getArguments() != null;
        book = Parcels.unwrap(getArguments().getParcelable("book"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_book_detail, container, false);
        ButterKnife.bind(this, view);
        Picasso.get().load("https://covers.openlibrary.org/b/olid/"+book.getCoverEditionKey()+"-M.jpg").into(mImageLabel);

        List<String> subjects = new ArrayList<>();

        for ( String subject: book.getSubject()) {
            subjects.add(subject);
        }

        mNameLabel.setText(book.getTitle());
        mCategoriesLabel.setText(android.text.TextUtils.join(", ", subjects));
        mRatingLabel.setText("Last Modified: " + book.getLastModifiedI());
        mPhoneLabel.setText("First Published: " + book.getFirstPublishYear());

        return view;
    }
}