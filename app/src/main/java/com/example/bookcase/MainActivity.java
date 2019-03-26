package com.example.bookcase;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BookListFragment.GetBookInterface{

    BookDetailsFragment detailsFragment;
    BookListFragment    listFragment;
   // FragmentManager fragmentManager;

    public static  final String BOOK_KEY = "book";
    boolean singlePane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        singlePane = findViewById(R.id.container2) == null;
        detailsFragment = new BookDetailsFragment();
        listFragment = new BookListFragment();
        addFragment(listFragment,R.id.container1);

  /*      detailsFragmentf = getSupportFragmentManager();

        detailsFragmentf.beginTransaction()
                .replace(R.id.container1, new BookListFragment())
                .commit();
*/

        if(!singlePane){

            addFragment(listFragment,R.id.container1);
            addFragment(detailsFragment,R.id.container2);
        }

    }

    private void addFragment(Fragment fragment,int id) {
        getSupportFragmentManager().beginTransaction()
                .replace(id,fragment)
                .addToBackStack(null)
                .commit();
    }


    @Override
    public void bookSelected(String books) {

        detailsFragment.displayBookSelected(books);
        }
    }

