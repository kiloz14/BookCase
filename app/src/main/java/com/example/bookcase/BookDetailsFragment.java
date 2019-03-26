package com.example.bookcase;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BookDetailsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BookDetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BookDetailsFragment extends Fragment {


    private OnFragmentInteractionListener mListener;
    TextView textView;
    String bookName;

    public static final String BOOK_KEY = "bookTitle";

    public BookDetailsFragment() {
        // Required empty public constructor
    }


    public static BookDetailsFragment newInstance(String book) {
        BookDetailsFragment fragment = new BookDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putString(BOOK_KEY, book);

        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            bookName = getArguments().getString(BOOK_KEY);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_book_details,container,false);
        textView = view.findViewById(R.id.bookTitle);

        displayBookSelected(bookName);

        return view;
    }




    public void displayBookSelected(String bookName) {
        textView.setText(bookName);
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }





}
