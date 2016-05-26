package com.app.supawit.bcomprojectit.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.app.supawit.bcomprojectit.R;


public class QSCFragment extends Fragment {

    RelativeLayout r1,r2,r3;


    public QSCFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_qsc, null);
        getActivity().setTitle("QSC");
        final Bundle bundle  = this.getArguments();
        final String test = bundle.getString("Key");
        final String area = bundle.getString("area");
        final String abbname = bundle.getString("wh");
        final Integer check = bundle.getInt("chk");
        final TextView txt = (TextView) v.findViewById(R.id.txtqsc1);

        //Toast.makeText(getContext(),"cc = "+check,Toast.LENGTH_SHORT).show();
        r1 = (RelativeLayout) v.findViewById(R.id.relativebtnqsc1);
        r2 = (RelativeLayout) v.findViewById(R.id.relativebtnqsc2);
        r3 = (RelativeLayout) v.findViewById(R.id.relativebtnqsc3);

        if(check == 0){

            txt.setText("");
            //Toast.makeText(getContext(),"vv = "+test,Toast.LENGTH_SHORT).show();
            r1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    HistoryFragment fragment = new HistoryFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("Key",test);
                    bundle.putInt("chk",check);
                    fragment.setArguments(bundle);
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragTransaction = fragmentManager.beginTransaction();
                    //fragTransaction.replace(R.id.fragment_con,fragment);
                    fragTransaction.replace(R.id.fragment_con,fragment).addToBackStack("1").commit();

                }
            });
            r2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    HistorySerivesFragment fragment = new HistorySerivesFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("Key",test);
                    bundle.putInt("chk",check);
                    fragment.setArguments(bundle);
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragTransaction = fragmentManager.beginTransaction();
                    //fragTransaction.replace(R.id.fragment_con,fragment);
                    fragTransaction.replace(R.id.fragment_con,fragment).addToBackStack("1").commit();

                }
            });

            r3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HistoryCleanFragment fragment = new HistoryCleanFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("Key",test);
                    bundle.putInt("chk",check);
                    fragment.setArguments(bundle);
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragTransaction = fragmentManager.beginTransaction();
                    //fragTransaction.replace(R.id.fragment_con,fragment);
                    fragTransaction.replace(R.id.fragment_con,fragment).addToBackStack("1").commit();
                }
            });

        }
        else{

            txt.setText(test);
            r1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    MainFragment fragment = new MainFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("Key",txt.getText().toString());
                    bundle.putString("area",area);
                    bundle.putString("wh",abbname);
                    bundle.putInt("chk",check);
                    fragment.setArguments(bundle);
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragTransaction = fragmentManager.beginTransaction();
                    //fragTransaction.replace(R.id.fragment_con,fragment);
                    fragTransaction.replace(R.id.fragment_con,fragment).addToBackStack("1").commit();

                }
            });

            r2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    MainserviceFragment fragment = new MainserviceFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("Key",txt.getText().toString());
                    bundle.putString("area",area);
                    bundle.putString("wh",abbname);
                    bundle.putInt("chk",check);
                    fragment.setArguments(bundle);
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragTransaction = fragmentManager.beginTransaction();
                    //fragTransaction.replace(R.id.fragment_con,fragment);
                    fragTransaction.replace(R.id.fragment_con,fragment).addToBackStack("1").commit();

                }
            });

            r3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    MainCleanFragment fragment = new MainCleanFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("Key",txt.getText().toString());
                    bundle.putString("area",area);
                    bundle.putString("wh",abbname);
                    bundle.putInt("chk",check);
                    fragment.setArguments(bundle);
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragTransaction = fragmentManager.beginTransaction();
                    //fragTransaction.replace(R.id.fragment_con,fragment);
                    fragTransaction.replace(R.id.fragment_con,fragment).addToBackStack("1").commit();

                }
            });
        }


        FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });









        return v;
    }

}
