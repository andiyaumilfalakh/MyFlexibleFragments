package com.project.ayf.myflexiblefragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        HomeFragments mHomeFragment = new HomeFragments();
        mFragmentTransaction.add(R.id.frame_container, mHomeFragment, HomeFragments.class.getSimpleName());

        Log.d("MyFlexibleFragment", "Fragment Name :"+HomeFragments.class.getSimpleName());
        mFragmentTransaction.commit();
    }
}