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
    String bookName = "";

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
        return inflater.inflate(R.layout.fragment_book_details, container, false);
    }



    /*// TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }*/


    /*public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }*/

        /* @Override
     public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         if (getArguments() != null) {
             mParam1 = getArguments().getString(ARG_PARAM1);
             mParam2 = getArguments().getString(ARG_PARAM2);
         }
     }

 */
}
