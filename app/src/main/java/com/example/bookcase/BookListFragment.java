package com.example.bookcase;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BookListFragment.GetBookInterface} interface
 * to handle interaction events.
 * Use the {@link BookListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BookListFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    ListView listView;

    Context parent;

    private GetBookInterface mListener;

    public BookListFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.parent = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_book_list,container,false);
        listView = v.findViewById(R.id.listV);

        listView.setAdapter(new ArrayAdapter<>(parent, android.R.layout.simple_list_item_1,parent.getResources().getStringArray(R.array.books)));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String books = (String) parent.getItemAtPosition(position);
                ((GetBookInterface)parent).bookSelected(books);
            }
        });

         return v;
    }





    public interface GetBookInterface {
        // TODO: Update argument type and name
        void bookSelected(String books);
    }
}
