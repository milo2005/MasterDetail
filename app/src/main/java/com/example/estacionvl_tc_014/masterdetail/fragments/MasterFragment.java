package com.example.estacionvl_tc_014.masterdetail.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.estacionvl_tc_014.masterdetail.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MasterFragment extends Fragment {


    public MasterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.f_master, container, false);
    }

}
