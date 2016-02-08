package com.example.estacionvl_tc_014.masterdetail.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.estacionvl_tc_014.masterdetail.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MasterFragment extends Fragment implements AdapterView.OnItemClickListener {

    public interface MasterI{
        void onColorSelected(int pos);
    }


    ListView list;
    MasterI masterI;

    public MasterFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        masterI = (MasterI) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.f_master, container, false);
        list = (ListView) v.findViewById(R.id.list);
        list.setOnItemClickListener(this);
        return v;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        masterI.onColorSelected(position);
    }
}
