package com.example.estacionvl_tc_014.masterdetail.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.estacionvl_tc_014.masterdetail.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    TextView txt;
    String color;
    int colorValor;

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        colorValor = ContextCompat.getColor(getActivity(),R.color.azul);
        color = getActivity().getString(R.string.azul);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detail, container, false);

        txt = (TextView) v.findViewById(R.id.txt);
        txt.setText(color);
        txt.setBackgroundColor(colorValor);

        return v;
    }

    public void setColor(String color, int colorValor){
        this.color = color;
        this.colorValor = colorValor;

        if(txt != null){
            txt.setText(color);
            txt.setBackgroundColor(colorValor);
        }
    }

}
