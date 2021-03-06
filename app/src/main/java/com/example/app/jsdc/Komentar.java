package com.example.app.jsdc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Komentar extends Fragment {
    // Store instance variables
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static Komentar newInstance(int page) {
        Komentar komentar = new Komentar();
        Bundle args = new Bundle();
        args.putInt("1", page);
        komentar.setArguments(args);
        return komentar;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("2");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_komentar, container, false);
        return view;
    }
}