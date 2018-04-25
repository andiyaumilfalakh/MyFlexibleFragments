package com.project.ayf.myflexiblefragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragments extends Fragment implements View.OnClickListener{

    public HomeFragments() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_home_fragments, container, false);
        Button btnCategory = (Button) view.findViewById(R.id.btn_category);
            btnCategory.setOnClickListener(this);
            return view;
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_category){

        }
    }
}
