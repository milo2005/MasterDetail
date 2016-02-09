package com.example.estacionvl_tc_014.masterdetail;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.estacionvl_tc_014.masterdetail.fragments.DetailFragment;
import com.example.estacionvl_tc_014.masterdetail.fragments.MasterFragment;

public class MainActivity extends AppCompatActivity implements MasterFragment.MasterI{

    MasterFragment master;
    DetailFragment detail;

    boolean phone, land, detailF;

    String colors[];
    int colorV[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);

        detailF  =false;

        colors = getResources().getStringArray(R.array.colores);
        colorV = getResources().getIntArray(R.array.colores_valor);

        master = new MasterFragment();
        detail = new DetailFragment();

        phone = getResources().getBoolean(R.bool.phone);
        land = getResources().getBoolean(R.bool.land);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.master, master);

        if(!phone && land)
            ft.replace(R.id.detail, detail);
        ft.commit();

    }

    @Override
    public void onColorSelected(int pos) {

        detail.setColor(colors[pos], colorV[pos]);

        if(phone || (!phone && !land)) {
            putFragment(R.id.master, detail);
            detailF = true;
        }


    }

    @Override
    public void onBackPressed() {
        if(detailF){
         putFragment(R.id.master,master);
        }else {
            super.onBackPressed();
        }
    }

    public void putFragment(int container, Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(container, fragment);
        ft.commit();
    }

}
