package com.app.supawit.bcomprojectit.Fragment;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.supawit.bcomprojectit.ConnectionSQL;
import com.app.supawit.bcomprojectit.R;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class menuQAFragment extends Fragment {

    private static final int TAKE_PICTURE = 1;
    private int yy, mm, dd;
    Uri imageuri ;
    Statement stmt = null;
    ResultSet rs = null;
    ImageView imageView;
    String area;
    String abbname;
    String aa;
    ConnectionSQL connectionSQL;
    Integer check = 1;
    RelativeLayout btna,btnb;
    public menuQAFragment() {
        // Required empty public constructor
    }

    @TargetApi(23)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_menu_qa, null);


        Bundle bundle  = this.getArguments();
        final String a = bundle.getString("Key");
        area = bundle.getString("area");
        abbname = bundle.getString("wh");



        final Calendar cal = Calendar.getInstance();
        dd = cal.get(Calendar.DAY_OF_MONTH);
        mm = cal.get(Calendar.MONTH);
        yy = cal.get(Calendar.YEAR);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String dateString = sdf.format(date);



        //StringBuilder date1 = new StringBuilder().append(yy).append(mm+1).append(dd);


        final TextView test = (TextView) v.findViewById(R.id.txttest);
        test.setText(a.substring(0,4)+"-"+ area +"QS"+ dateString.substring(2,8)+"01" );
        //Button btnc = (Button) v.findViewById(R.id.btncamera);
        //Button btnq = (Button) v.findViewById(R.id.btnqa);
        btna = (RelativeLayout) v.findViewById(R.id.relativebtn1);
        btnb = (RelativeLayout) v.findViewById(R.id.relativebtn2);

        final String dd = test.getText().toString();
        try {
            connectionSQL = new ConnectionSQL();
            Connection con = connectionSQL.CONN();
            stmt = con.createStatement();
            String query = "select * from Imgtbl2 where ImgName = '"+dd+"'";

            rs = stmt.executeQuery(query);

            if (rs.next()) {
                aa = "ss";
            }
            else
            {
                aa = "ff";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(aa == "ss"){
            //r1.setBackgroundColor(Color.GRAY);
            final int sdk = android.os.Build.VERSION.SDK_INT;
            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                btnb.setBackgroundDrawable( getResources().getDrawable(R.drawable.bgbtn1) );
            } else {
                btnb.setBackground( getResources().getDrawable(R.drawable.bgbtn1));
            }
        }
        else{

            btnb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CapFragment fragment = new CapFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("Key",test.getText().toString());
                    bundle.putString("area",area);

                    fragment.setArguments(bundle);
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragTransaction = fragmentManager.beginTransaction();
                    //fragTransaction.replace(R.id.fragment_con,fragment);
                    fragTransaction.replace(R.id.fragment_con,fragment).addToBackStack(null).commit();
                }
            });
        }




        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                QSCFragment fragment = new QSCFragment();
                Bundle bundle = new Bundle();
                bundle.putString("Key",test.getText().toString());
                bundle.putString("area",area);
                bundle.putString("wh",a.substring(0,4));
                bundle.putInt("chk",check);
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragTransaction = fragmentManager.beginTransaction();
                //fragTransaction.replace(R.id.fragment_con,fragment);
                fragTransaction.replace(R.id.fragment_con,fragment).addToBackStack("1").commit();

            }
        });


       /*btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File photo = new File(Environment.getExternalStorageDirectory(),  "Pic.jpg");
                intent.putExtra(MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(photo));
                imageuri = Uri.fromFile(photo);
                startActivityForResult(intent, TAKE_PICTURE);
            }
        });*/

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
