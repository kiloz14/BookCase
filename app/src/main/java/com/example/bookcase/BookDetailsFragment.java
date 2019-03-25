package com.example.bookcase;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BookDetailsFragment extends Fragment {

  //  private OnFragmentInteractionListener mListener;
    TextView textView;
    String bookName ;

    public static final String BOOK_KEY = "book_name";

    public BookDetailsFragment() {
        // Required empty public constructor
    }



    // TODO: Rename and change types and number of parameters
    public static BookDetailsFragment newInstance() {

        return new BookDetailsFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_book_details,container,false);
        textView = textView.findViewById(R.id.bookTitle);
        return view;
    }

    public void bookSelected(){
        bookName = getArguments().getString("book");
        textView.setText(bookName);
    }
}
