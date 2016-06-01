package com.app.supawit.bcomprojectit.Fragment;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.app.supawit.bcomprojectit.ConnectionSQL;
import com.app.supawit.bcomprojectit.R;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class WarehousehistoryFragment extends Fragment {


    private ListView lv;
    String abbname;
    ArrayAdapter<String> adapter;
    EditText inputSearch;
    ConnectionSQL connectionSQL;
    ArrayList<String> list;
    Statement stmt = null;
    ResultSet rs = null;
    String area;
    int chk;

    public WarehousehistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_warehousehistory, null);
        Bundle bundle  = this.getArguments();
        area = bundle.getString("Key");
        chk = bundle.getInt("chk");
        getActivity().setTitle("สาขาที่ตรวจแล้ว");

        try {
            connectionSQL = new ConnectionSQL();
            Connection con = connectionSQL.CONN();
            stmt = con.createStatement();
            String query =
                    "select *from MAS_PJ_REPORT where ARCODE = '"+area +"'";

            rs = stmt.executeQuery(query);

            list = new ArrayList<>();

            while(rs.next()) {
                abbname = rs.getString("ABBNAME");
                list.add(abbname);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        lv = (ListView) v.findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(getActivity(), R.layout.list_item, R.id.product_name, list);
        //StableArrayAdapter adapter = new StableArrayAdapter(getActivity(),R.layout.list_item,list);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new ItemList());

        FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getFragmentManager().popBackStack();

            }
        });


        return v;
    }

    class ItemList implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            ViewGroup vg = (ViewGroup) view;
            TextView txt = (TextView) vg.findViewById(R.id.product_name);
            //Toast.makeText(getActivity(), txt.getText().toString(), Toast.LENGTH_SHORT).show();

            QSCFragment fragment = new QSCFragment();
            Bundle bundle = new Bundle();
            //bundle.putString("Key", txt.getText().toString());
            bundle.putString("Key",area);
            bundle.putString("abn",txt.getText().toString());
            bundle.putInt("chk",0);
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragTransaction = fragmentManager.beginTransaction();
            //fragTransaction.replace(R.id.fragment_con,fragment);
            fragTransaction.replace(R.id.fragment_con, fragment).addToBackStack(null).commit();


        }
    }

}
