package com.example.bookcase;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BookListFragment.GetBookInterface{

    BookListFragment listFragmentf;
    FragmentManager detailsFragmentf;

    boolean singlePane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        singlePane = findViewById(R.id.container2) == null;
        listFragmentf = new BookListFragment();


        detailsFragmentf = getSupportFragmentManager();

        detailsFragmentf.beginTransaction()
                .replace(R.id.container1, new BookListFragment())
                .commit();


        if(!singlePane){
            detailsFragmentf.beginTransaction()
                    .replace(R.id.container2,listFragmentf)
                    .commit();
        }

    }






    @Override
    public void bookSelected(String books) {

    }
}
