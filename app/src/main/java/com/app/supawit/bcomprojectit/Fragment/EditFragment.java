package com.app.supawit.bcomprojectit.Fragment;


import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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
public class EditFragment extends Fragment {

    String Name,Mail,Phone,User;
    EditText userdt,password,fullname,tel,email;
    Button save;
    ConnectionSQL connectionSQL;
    Statement stmt = null;
    ResultSet rs = null;
    public EditFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_edit, null);
        getActivity().setTitle("แก้ไขข้อมูลส่วนตัว");
        Bundle bundle  = this.getArguments();
        String area = bundle.getString("Key");
        //set init
        password = (EditText) v.findViewById(R.id.edpassword);
        fullname = (EditText) v.findViewById(R.id.edfullname);
        tel = (EditText) v.findViewById(R.id.edphone);
        email = (EditText) v.findViewById(R.id.edemail);
        save = (Button) v.findViewById(R.id.buttonsave);
        userdt = (EditText) v.findViewById(R.id.edusername);

        ///set data in edittext

        try {
            connectionSQL = new ConnectionSQL();
            Connection con = connectionSQL.CONN();
            stmt = con.createStatement();
            String query =
                    "select *from mas_user where username = '"+area+"' ";

            rs = stmt.executeQuery(query);


            while(rs.next()) {
                Name = rs.getString("FULLNAME");
                Mail = rs.getString("EMAIL");
                Phone = rs.getString("MOBILE");
                User = rs.getString("USERNAME");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        fullname.setText(Name);
        email.setText(Mail);
        tel.setText(Phone);
        userdt.setText(User);




        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(),password.getText().toString(),Toast.LENGTH_SHORT).show();
                String pass = password.getText().toString();
                String full = fullname.getText().toString();
                String mobile = tel.getText().toString();
                String mail = email.getText().toString();
                String u = userdt.getText().toString();

                if(pass.trim().equals(""))
                {
                    Toast.makeText(getContext(),"กรุณาใส่รหัสผ่าน",Toast.LENGTH_SHORT).show();
                }
                else {

                    if(pass.length() < 4)
                    {
                        Toast.makeText(getContext(),"กรุณาใส่รหัสผ่านอย่างน้อย 4 ตัว",Toast.LENGTH_SHORT).show();
                    }
                    else{

                        try {
                            connectionSQL = new ConnectionSQL();
                            Connection con = connectionSQL.CONN();

                            String query =
                                    "update mas_user " +
                                            "set PASSWORD = '"+pass+"',FULLNAME = '"+full+"'" +
                                            ",MOBILE = '"+mobile+"',EMAIL = '"+mail+"'    " +
                                            "where username = '"+u+"' ";
                            stmt = con.createStatement();
                            stmt.executeUpdate(query);

                        } catch (SQLException e) {
                            e.printStackTrace();
                            Toast.makeText(getContext(),e.toString(),Toast.LENGTH_SHORT).show();
                        }

                        Toast.makeText(getContext(),"แก้ไขข้อมูลสำเร็จ",Toast.LENGTH_SHORT).show();
                        android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                        fragmentManager.executePendingTransactions();
                        fragmentManager.popBackStack("tag",1);
                        fragmentManager.executePendingTransactions();
                }

                }

            }
        });

        return v;
    }


}
