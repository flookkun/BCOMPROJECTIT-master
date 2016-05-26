package com.app.supawit.bcomprojectit.Fragment;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.AndroidRuntimeException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.app.supawit.bcomprojectit.ConnectionSQL;
import com.app.supawit.bcomprojectit.R;
import com.app.supawit.bcomprojectit.View.CustomViewGroup;

import java.io.IOError;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment{


    ExpandableListView expListView;

    List<String> groupList;

    CustomViewGroup viewGroup1
            ,viewGroup2
            ,viewGroup3
            ,viewGroup4
            ,viewGroup5
            ,viewGroup6
            ,viewGroup7
            ,viewGroup8
            ,viewGroup9
            ,viewGroup10
            ,viewGroup11
            ,viewGroup12
            ,viewGroup13
            ,viewGroup14
            ,viewGroup15
            ,viewGroup16
            ,viewGroup17;

    TextView az
            ,date1,date2,date3,date4
            ,date5,date6,date7,date8
            ,date9,date10,date11,date12
            ,date13,date14,date15,date16
            ,date17;


    int ii = 0;
    int vg1 = 0,vg2 = 0,vg3 = 0,vg4 = 0
            ,vg5 = 0,vg6 = 0,vg7 = 0
            ,vg8 = 0,vg9 = 0,vg10 = 0
            ,vg11 = 0,vg12 = 0,vg13 = 0
            ,vg14 = 0,vg15 = 0,vg16 = 0
            ,vg17 = 0;


    int vb1 = 0,vb2 = 0,vb3 = 0,vb4 = 0
            ,vb5 = 0,vb6 = 0,vb7 = 0
            ,vb8 = 0,vb9 = 0,vb10 = 0
            ,vb11 = 0,vb12 = 0,vb13 = 0
            ,vb14 = 0,vb15 = 0,vb16 = 0
            ,vb17 = 0;

    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17;


    ConnectionSQL connectionSQL;
    Statement stmt = null;
    ResultSet rs = null;
    String whcode;



    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, final Bundle savedInstanceState) {

        //createGroupList();
        //createCollection();
        getActivity().setTitle("Quanlity ( คุณภาพสินค้า )");
        final RadioGroup rg1,rg2,rg3,rg4,rg5,rg6,rg7,rg8,rg9,rg10,rg11,rg12,rg13,rg14,rg15,rg16,rg17;
        final Bundle bundle  = this.getArguments();
        final String head[] = new String[100];
        final Integer chk = bundle.getInt("chk");
        final View v = inflater.inflate(R.layout.fragment_main,null);


        az = (TextView) v.findViewById(R.id.txtscore);


        az.setText(ii+"/17");

        if(chk==1){

            /// set ViewGroup ///


            viewGroup1 = (CustomViewGroup) v.findViewById(R.id.viewgroup1);
            viewGroup2 = (CustomViewGroup) v.findViewById(R.id.viewgroup2);
            viewGroup3 = (CustomViewGroup) v.findViewById(R.id.viewgroup3);
            viewGroup4 = (CustomViewGroup) v.findViewById(R.id.viewgroup4);
            viewGroup5 = (CustomViewGroup) v.findViewById(R.id.viewgroup5);
            viewGroup6 = (CustomViewGroup) v.findViewById(R.id.viewgroup6);
            viewGroup7 = (CustomViewGroup) v.findViewById(R.id.viewgroup7);
            viewGroup8 = (CustomViewGroup) v.findViewById(R.id.viewgroup8);
            viewGroup9 = (CustomViewGroup) v.findViewById(R.id.viewgroup9);
            viewGroup10 = (CustomViewGroup) v.findViewById(R.id.viewgroup10);
            viewGroup11 = (CustomViewGroup) v.findViewById(R.id.viewgroup11);
            viewGroup12 = (CustomViewGroup) v.findViewById(R.id.viewgroup12);
            viewGroup13 = (CustomViewGroup) v.findViewById(R.id.viewgroup13);
            viewGroup14 = (CustomViewGroup) v.findViewById(R.id.viewgroup14);
            viewGroup15 = (CustomViewGroup) v.findViewById(R.id.viewgroup15);
            viewGroup16 = (CustomViewGroup) v.findViewById(R.id.viewgroup16);
            viewGroup17 = (CustomViewGroup) v.findViewById(R.id.viewgroup17);

            /// set text ///

            head[0] = viewGroup1.settxt("1. สินค้า 30  อันดับขายดี ( Top 30) มีครบ");
            head[1] = viewGroup2.settxt("2. สินค้าครบสี เบอร์ (ที่ไม่ขาดจากบริษัท)");
            head[2] = viewGroup3.settxt("3. จัดเรียงแบบ FIFO, Fronting, Facing");
            head[3] = viewGroup4.settxt("4. การจัดเรียงสินค้าเป็น series และ function");
            head[4] = viewGroup5.settxt("5. ตำแหน่งการจัดเรียงสินค้าตาม plan-o-gram ");
            head[5] = viewGroup6.settxt("6. ไม่มีสินค้า Expired หรือ Nearly Expired");
            head[6] = viewGroup7.settxt("7. ความสะอาดของตัวสินค้าที่วางบนชั้นโชว์");
            head[7] = viewGroup8.settxt("8. ความสะอาด/ปริมาณ ของบรรจุภัณฑ์และเนื้อสินค้า tester ");
            head[8] = viewGroup9.settxt("9. ป้ายสติ๊กเกอร์สินค้า, บรรจุภัณฑ์ไม่ซีด ไม่หลุด");
            head[9] = viewGroup10.settxt("10. ปาดหน้าลิป tester");
            head[10] = viewGroup11.settxt("11. พัฟสะอาด ");
            head[11] = viewGroup12.settxt("12. tester แป้ง,ปัดแก้ม,อายแชโดว์ เปลี่ยนใหม่ตามเกณฑ์ที่กำหนด");
            head[12] = viewGroup13.settxt("13. ติดสติ๊กเกอร์ tester ครบ ถูกต้อง เรียบร้อย");
            head[13] = viewGroup14.settxt("14. ความถูกต้องของป้ายราคาปกติและป้ายโปรโมชั่น");
            head[14] = viewGroup15.settxt("15. การจัดวางป้ายราคาและป้ายอื่นๆ ");
            head[15] = viewGroup16.settxt("16. การจัดวางแท่น tester และรางป้าย ");
            head[16] = viewGroup17.settxt("17. POP /Standy /Banner เป็นระเบียบ ถูกต้องตามตำแหน่ง ");

            /// set radiobutton ///

            rg1 = (RadioGroup) viewGroup1.findViewById(R.id.customradiogroup);
            rg2 = (RadioGroup) viewGroup2.findViewById(R.id.customradiogroup);
            rg3 = (RadioGroup) viewGroup3.findViewById(R.id.customradiogroup);
            rg4 = (RadioGroup) viewGroup4.findViewById(R.id.customradiogroup);
            rg5 = (RadioGroup) viewGroup5.findViewById(R.id.customradiogroup);
            rg6 = (RadioGroup) viewGroup6.findViewById(R.id.customradiogroup);
            rg7 = (RadioGroup) viewGroup7.findViewById(R.id.customradiogroup);
            rg8 = (RadioGroup) viewGroup8.findViewById(R.id.customradiogroup);
            rg9 = (RadioGroup) viewGroup9.findViewById(R.id.customradiogroup);
            rg10 = (RadioGroup) viewGroup10.findViewById(R.id.customradiogroup);
            rg11 = (RadioGroup) viewGroup11.findViewById(R.id.customradiogroup);
            rg12 = (RadioGroup) viewGroup12.findViewById(R.id.customradiogroup);
            rg13 = (RadioGroup) viewGroup13.findViewById(R.id.customradiogroup);
            rg14 = (RadioGroup) viewGroup14.findViewById(R.id.customradiogroup);
            rg15 = (RadioGroup) viewGroup15.findViewById(R.id.customradiogroup);
            rg16 = (RadioGroup) viewGroup16.findViewById(R.id.customradiogroup);
            rg17 = (RadioGroup) viewGroup17.findViewById(R.id.customradiogroup);


            /// set edittext ///


            ed1 = (EditText) viewGroup1.findViewById(R.id.customedt);
            ed2 = (EditText) viewGroup2.findViewById(R.id.customedt);
            ed3 = (EditText) viewGroup3.findViewById(R.id.customedt);
            ed4 = (EditText) viewGroup4.findViewById(R.id.customedt);
            ed5 = (EditText) viewGroup5.findViewById(R.id.customedt);
            ed6 = (EditText) viewGroup6.findViewById(R.id.customedt);
            ed7 = (EditText) viewGroup7.findViewById(R.id.customedt);
            ed8 = (EditText) viewGroup8.findViewById(R.id.customedt);
            ed9 = (EditText) viewGroup9.findViewById(R.id.customedt);
            ed10 = (EditText) viewGroup10.findViewById(R.id.customedt);
            ed11 = (EditText) viewGroup11.findViewById(R.id.customedt);
            ed12 = (EditText) viewGroup12.findViewById(R.id.customedt);
            ed13 = (EditText) viewGroup13.findViewById(R.id.customedt);
            ed14 = (EditText) viewGroup14.findViewById(R.id.customedt);
            ed15 = (EditText) viewGroup15.findViewById(R.id.customedt);
            ed16 = (EditText) viewGroup16.findViewById(R.id.customedt);
            ed17 = (EditText) viewGroup17.findViewById(R.id.customedt);



            //set textview date///

            date1 = (TextView) viewGroup1.findViewById(R.id.setdate);
            date2 = (TextView) viewGroup2.findViewById(R.id.setdate);
            date3 = (TextView) viewGroup3.findViewById(R.id.setdate);
            date4 = (TextView) viewGroup4.findViewById(R.id.setdate);
            date5 = (TextView) viewGroup5.findViewById(R.id.setdate);
            date6 = (TextView) viewGroup6.findViewById(R.id.setdate);
            date7 = (TextView) viewGroup7.findViewById(R.id.setdate);
            date8 = (TextView) viewGroup8.findViewById(R.id.setdate);
            date9 = (TextView) viewGroup9.findViewById(R.id.setdate);
            date10 = (TextView) viewGroup10.findViewById(R.id.setdate);
            date11 = (TextView) viewGroup11.findViewById(R.id.setdate);
            date12 = (TextView) viewGroup12.findViewById(R.id.setdate);
            date13 = (TextView) viewGroup13.findViewById(R.id.setdate);
            date14 = (TextView) viewGroup14.findViewById(R.id.setdate);
            date15 = (TextView) viewGroup15.findViewById(R.id.setdate);
            date16 = (TextView) viewGroup16.findViewById(R.id.setdate);
            date17 = (TextView) viewGroup17.findViewById(R.id.setdate);


            /// set Onclick txt ///



            date1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup1.settime();
                }
            });
            date2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup2.settime();
                }
            });
            date3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup3.settime();
                }
            });
            date4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup4.settime();
                }
            });
            date5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup5.settime();
                }
            });
            date6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup6.settime();
                }
            });
            date7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup7.settime();
                }
            });
            date8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup8.settime();
                }
            });
            date9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup9.settime();
                }
            });
            date10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup10.settime();
                }
            });
            date11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup11.settime();
                }
            });
            date12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup12.settime();
                }
            });
            date13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup13.settime();
                }
            });
            date14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup14.settime();
                }
            });
            date15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup15.settime();
                }
            });
            date16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup16.settime();
                }
            });
            date17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup17.settime();
                }
            });


            /// setOncheck ///

            //// Quanlity ////

            rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg1 = viewGroup1.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup1.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg1 = viewGroup1.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup1.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });


            rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg2 = viewGroup2.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup2.setinvisble();
                            // az.setText("2/30");
                            break;

                        case R.id.customrb2 :
                            vg2 = viewGroup2.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup2.setvisble();
                            //ea2 = ed2.getText().toString();
                            //az.setText("2/30");
                            break;
                    }
                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");
            }
            });

            rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg3 = viewGroup3.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup3.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg3 = viewGroup3.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup3.setvisble();
                            //ea3 = ed3.getText().toString();
                            break;
                    }
                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");
                }
            });

            rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg4 = viewGroup4.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup4.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vg4 = viewGroup4.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup4.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");
                }
            });

            rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg5 = viewGroup5.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup5.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg5 = viewGroup5.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup5.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });

            rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg6 = viewGroup6.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup6.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg6 = viewGroup6.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup6.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });

            rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg7 = viewGroup7.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup7.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg7 = viewGroup7.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup7.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });

            rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg8 = viewGroup8.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup8.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg8 = viewGroup8.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup8.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });

            rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg9 = viewGroup9.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup9.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg9 = viewGroup9.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup9.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });

            rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg10 = viewGroup10.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup10.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg10 = viewGroup10.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup10.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });


            rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg11 = viewGroup11.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup11.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg11 = viewGroup11.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup11.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });

            rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg12 = viewGroup12.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup12.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg12 = viewGroup12.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup12.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });

            rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg13 = viewGroup13.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup13.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg13 = viewGroup13.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup13.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });


            rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg14 = viewGroup14.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup14.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg14 = viewGroup14.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup14.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });

            rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg15 = viewGroup15.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup15.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg15 = viewGroup15.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup15.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });

            rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg16 = viewGroup16.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup16.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg16 = viewGroup16.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup16.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });

            rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg17 = viewGroup17.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup17.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg17 = viewGroup17.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup17.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+"/17");

                }


            });

            ////// Quanlity End/////




            /////////////////////////////////////////////////////////////////////////////////////////////

            final TextView ax = (TextView) v.findViewById(R.id.txttest1);
            final String a = bundle.getString("Key");
            final String area = bundle.getString("area");
            final String abbname = bundle.getString("wh");



            ax.setText(a);


            /// Link DB //

            try {
                connectionSQL = new ConnectionSQL();
                Connection con = connectionSQL.CONN();
                stmt = con.createStatement();
                String query =
                        "select *from Tmp_whcode where whcode = '"+abbname+"'";

                rs = stmt.executeQuery(query);

                while(rs.next()) {
                    whcode = rs.getString("ABBNAME");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }


            FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int max = 17;

                    int[] allscore = new int[1];
                    allscore[0] = max - (ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17);

                    String text[] = new String[64];

                    text[0] = ed1.getText().toString();
                    text[1] = ed2.getText().toString();
                    text[2] = ed3.getText().toString();
                    text[3] = ed4.getText().toString();
                    text[4] = ed5.getText().toString();
                    text[5] = ed6.getText().toString();
                    text[6] = ed7.getText().toString();
                    text[7] = ed8.getText().toString();
                    text[8] = ed9.getText().toString();
                    text[9] = ed10.getText().toString();
                    text[10] = ed11.getText().toString();
                    text[11] = ed12.getText().toString();
                    text[12] = ed13.getText().toString();
                    text[13] = ed14.getText().toString();
                    text[14] = ed15.getText().toString();
                    text[15] = ed16.getText().toString();
                    text[16] = ed17.getText().toString();

                    Integer point[] = new Integer[64];
                    point[0] = vg1;
                    point[1] = vg2;
                    point[2] = vg3;
                    point[3] = vg4;
                    point[4] = vg5;
                    point[5] = vg6;
                    point[6] = vg7;
                    point[7] = vg8;
                    point[8] = vg9;
                    point[9] = vg10;
                    point[10] = vg11;
                    point[11] = vg12;
                    point[12] = vg13;
                    point[13] = vg14;
                    point[14] = vg15;
                    point[15] = vg16;
                    point[16] = vg17;


                    String dd[] = new String[64];
                    dd[0] = date1.getText().toString();
                    dd[1] = date2.getText().toString();
                    dd[2] = date3.getText().toString();
                    dd[3] = date4.getText().toString();
                    dd[4] = date5.getText().toString();
                    dd[5] = date6.getText().toString();
                    dd[6] = date7.getText().toString();
                    dd[7] = date8.getText().toString();
                    dd[8] = date9.getText().toString();
                    dd[9] = date10.getText().toString();
                    dd[10] = date11.getText().toString();
                    dd[11] = date12.getText().toString();
                    dd[12] = date13.getText().toString();
                    dd[13] = date14.getText().toString();
                    dd[14] = date15.getText().toString();
                    dd[15] = date16.getText().toString();
                    dd[16] = date17.getText().toString();


                    try {
                        connectionSQL = new ConnectionSQL();
                        Connection con = connectionSQL.CONN();
                        for (int i = 0 ; i < 17 ;i++)
                        {
                            stmt = con.createStatement();
                            String commands = "insert MAS_PJ " +
                                    //"select '"+a+"','"+ head[i]+"','"+area+"',GETDATE(),'"+dd[i]+"','"+text[i]+"','"+ point[i] +"','"+az.getText().toString()+"'";
                                    " VALUES ('"+a+"','"+head[i]+"','"+area+"',CONVERT(VARCHAR(10),GETDATE(),110),'"+dd[i]+"','"+text[i]+"','"+ point[i] +"','"+az.getText().toString()+"',CONVERT(VARCHAR(10),GETDATE(),110))";
                            PreparedStatement preStmt = con.prepareStatement(commands);
                            preStmt.executeUpdate();
                        }
                        stmt = con.createStatement();
                        String commands = "insert MAS_PJ_REPORT " +
                                //"select '"+a+"','"+ head[i]+"','"+area+"',GETDATE(),'"+dd[i]+"','"+text[i]+"','"+ point[i] +"','"+az.getText().toString()+"'";
                                " VALUES ('"+ whcode +"','"+a+"','"+area+"',CONVERT(VARCHAR(10),GETDATE(),110),'"+az.getText().toString()+"','"+allscore[0]+"')";
                        PreparedStatement preStmt = con.prepareStatement(commands);
                        preStmt.executeUpdate();
                        Toast.makeText(getActivity(),"บันทึกสำเร็จ",Toast.LENGTH_SHORT).show();
                        //เปิดหน้า fragment
                        //getFragmentManager().executePendingTransactions();
                        getFragmentManager().popBackStack();

                    }catch (SQLException ex){
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    } catch (IOError ex) {
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    } catch (AndroidRuntimeException ex) {
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    } catch (NullPointerException ex) {
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    } catch (Exception ex) {
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    }

                }
            });

        }




        else if (chk == 0){


            ArrayList<String> list1 = null,list2 = null,list3 = null,list4 = null;
            az = (TextView) v.findViewById(R.id.txtscore);
            final TextView ax = (TextView) v.findViewById(R.id.txttest1);
            final String a = bundle.getString("Key");
            final String area = bundle.getString("area");
            final String abbname = bundle.getString("wh");


            ax.setText(a);
            String olddata;
            String oldedittext;
            String olddate;
            String oldhead;
            final String[] test,oldedit,oldh,olddt;
            final int[] allscore = new int[1];
            /// Link DB //

            try {
                connectionSQL = new ConnectionSQL();
                Connection con = connectionSQL.CONN();
                stmt = con.createStatement();
                String query = "select * from mas_pj where DOC_NUMBER = '"+a+"'";

                list1 = new ArrayList<>();
                list2 = new ArrayList<>();
                list3 = new ArrayList<>();
                list4 = new ArrayList<>();

                rs = stmt.executeQuery(query);

                while(rs.next()) {
                    olddata = rs.getString("POINT");
                    oldedittext = rs.getString("DOC_TEXT");
                    oldhead = rs.getString("DOC_HEAD");
                    olddate = rs.getString("DATE");
                    list1.add(olddata);
                    list2.add(oldedittext);
                    list3.add(oldhead);
                    list4.add(olddate);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }



            /// set ViewGroup ///


            viewGroup1 = (CustomViewGroup) v.findViewById(R.id.viewgroup1);
            viewGroup2 = (CustomViewGroup) v.findViewById(R.id.viewgroup2);
            viewGroup3 = (CustomViewGroup) v.findViewById(R.id.viewgroup3);
            viewGroup4 = (CustomViewGroup) v.findViewById(R.id.viewgroup4);
            viewGroup5 = (CustomViewGroup) v.findViewById(R.id.viewgroup5);
            viewGroup6 = (CustomViewGroup) v.findViewById(R.id.viewgroup6);
            viewGroup7 = (CustomViewGroup) v.findViewById(R.id.viewgroup7);
            viewGroup8 = (CustomViewGroup) v.findViewById(R.id.viewgroup8);
            viewGroup9 = (CustomViewGroup) v.findViewById(R.id.viewgroup9);
            viewGroup10 = (CustomViewGroup) v.findViewById(R.id.viewgroup10);
            viewGroup11 = (CustomViewGroup) v.findViewById(R.id.viewgroup11);
            viewGroup12 = (CustomViewGroup) v.findViewById(R.id.viewgroup12);
            viewGroup13 = (CustomViewGroup) v.findViewById(R.id.viewgroup13);
            viewGroup14 = (CustomViewGroup) v.findViewById(R.id.viewgroup14);
            viewGroup15 = (CustomViewGroup) v.findViewById(R.id.viewgroup15);
            viewGroup16 = (CustomViewGroup) v.findViewById(R.id.viewgroup16);
            viewGroup17 = (CustomViewGroup) v.findViewById(R.id.viewgroup17);



            /// set radiobutton ///

            rg1 = (RadioGroup) viewGroup1.findViewById(R.id.customradiogroup);
            rg2 = (RadioGroup) viewGroup2.findViewById(R.id.customradiogroup);
            rg3 = (RadioGroup) viewGroup3.findViewById(R.id.customradiogroup);
            rg4 = (RadioGroup) viewGroup4.findViewById(R.id.customradiogroup);
            rg5 = (RadioGroup) viewGroup5.findViewById(R.id.customradiogroup);
            rg6 = (RadioGroup) viewGroup6.findViewById(R.id.customradiogroup);
            rg7 = (RadioGroup) viewGroup7.findViewById(R.id.customradiogroup);
            rg8 = (RadioGroup) viewGroup8.findViewById(R.id.customradiogroup);
            rg9 = (RadioGroup) viewGroup9.findViewById(R.id.customradiogroup);
            rg10 = (RadioGroup) viewGroup10.findViewById(R.id.customradiogroup);
            rg11 = (RadioGroup) viewGroup11.findViewById(R.id.customradiogroup);
            rg12 = (RadioGroup) viewGroup12.findViewById(R.id.customradiogroup);
            rg13 = (RadioGroup) viewGroup13.findViewById(R.id.customradiogroup);
            rg14 = (RadioGroup) viewGroup14.findViewById(R.id.customradiogroup);
            rg15 = (RadioGroup) viewGroup15.findViewById(R.id.customradiogroup);
            rg16 = (RadioGroup) viewGroup16.findViewById(R.id.customradiogroup);
            rg17 = (RadioGroup) viewGroup17.findViewById(R.id.customradiogroup);


            /// set edittext ///


            ed1 = (EditText) viewGroup1.findViewById(R.id.customedt);
            ed2 = (EditText) viewGroup2.findViewById(R.id.customedt);
            ed3 = (EditText) viewGroup3.findViewById(R.id.customedt);
            ed4 = (EditText) viewGroup4.findViewById(R.id.customedt);
            ed5 = (EditText) viewGroup5.findViewById(R.id.customedt);
            ed6 = (EditText) viewGroup6.findViewById(R.id.customedt);
            ed7 = (EditText) viewGroup7.findViewById(R.id.customedt);
            ed8 = (EditText) viewGroup8.findViewById(R.id.customedt);
            ed9 = (EditText) viewGroup9.findViewById(R.id.customedt);
            ed10 = (EditText) viewGroup10.findViewById(R.id.customedt);
            ed11 = (EditText) viewGroup11.findViewById(R.id.customedt);
            ed12 = (EditText) viewGroup12.findViewById(R.id.customedt);
            ed13 = (EditText) viewGroup13.findViewById(R.id.customedt);
            ed14 = (EditText) viewGroup14.findViewById(R.id.customedt);
            ed15 = (EditText) viewGroup15.findViewById(R.id.customedt);
            ed16 = (EditText) viewGroup16.findViewById(R.id.customedt);
            ed17 = (EditText) viewGroup17.findViewById(R.id.customedt);



            //set textview date///

            date1 = (TextView) viewGroup1.findViewById(R.id.setdate);
            date2 = (TextView) viewGroup2.findViewById(R.id.setdate);
            date3 = (TextView) viewGroup3.findViewById(R.id.setdate);
            date4 = (TextView) viewGroup4.findViewById(R.id.setdate);
            date5 = (TextView) viewGroup5.findViewById(R.id.setdate);
            date6 = (TextView) viewGroup6.findViewById(R.id.setdate);
            date7 = (TextView) viewGroup7.findViewById(R.id.setdate);
            date8 = (TextView) viewGroup8.findViewById(R.id.setdate);
            date9 = (TextView) viewGroup9.findViewById(R.id.setdate);
            date10 = (TextView) viewGroup10.findViewById(R.id.setdate);
            date11 = (TextView) viewGroup11.findViewById(R.id.setdate);
            date12 = (TextView) viewGroup12.findViewById(R.id.setdate);
            date13 = (TextView) viewGroup13.findViewById(R.id.setdate);
            date14 = (TextView) viewGroup14.findViewById(R.id.setdate);
            date15 = (TextView) viewGroup15.findViewById(R.id.setdate);
            date16 = (TextView) viewGroup16.findViewById(R.id.setdate);
            date17 = (TextView) viewGroup17.findViewById(R.id.setdate);


            /// set Onclick txt ///



            date1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup1.settime();
                }
            });
            date2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup2.settime();
                }
            });
            date3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup3.settime();
                }
            });
            date4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup4.settime();
                }
            });
            date5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup5.settime();
                }
            });
            date6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup6.settime();
                }
            });
            date7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup7.settime();
                }
            });
            date8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup8.settime();
                }
            });
            date9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup9.settime();
                }
            });
            date10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup10.settime();
                }
            });
            date11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup11.settime();
                }
            });
            date12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup12.settime();
                }
            });
            date13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup13.settime();
                }
            });
            date14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup14.settime();
                }
            });
            date15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup15.settime();
                }
            });
            date16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup16.settime();
                }
            });
            date17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup17.settime();
                }
            });



            test = list1.toArray(new String[list1.size()]);
            oldedit = list2.toArray(new String[list2.size()]);
            oldh = list3.toArray(new String[list3.size()]);
            olddt = list4.toArray(new String[list4.size()]);


            //set olddata

            viewGroup1.settxt(oldh[0]);
            viewGroup2.settxt(oldh[1]);
            viewGroup3.settxt(oldh[2]);
            viewGroup4.settxt(oldh[3]);
            viewGroup5.settxt(oldh[4]);
            viewGroup6.settxt(oldh[5]);
            viewGroup7.settxt(oldh[6]);
            viewGroup8.settxt(oldh[7]);
            viewGroup9.settxt(oldh[8]);
            viewGroup10.settxt(oldh[9]);
            viewGroup11.settxt(oldh[10]);
            viewGroup12.settxt(oldh[11]);
            viewGroup13.settxt(oldh[12]);
            viewGroup14.settxt(oldh[13]);
            viewGroup15.settxt(oldh[14]);
            viewGroup16.settxt(oldh[15]);
            viewGroup17.settxt(oldh[16]);




            vb1 = viewGroup1.setcheckrb(test[0]);
            vb2 = viewGroup2.setcheckrb(test[1]);
            vb3 = viewGroup3.setcheckrb(test[2]);
            vb4 = viewGroup4.setcheckrb(test[3]);
            vb5 = viewGroup5.setcheckrb(test[4]);
            vb6 = viewGroup6.setcheckrb(test[5]);
            vb7 = viewGroup7.setcheckrb(test[6]);
            vb8 = viewGroup8.setcheckrb(test[7]);
            vb9 = viewGroup9.setcheckrb(test[8]);
            vb10 = viewGroup10.setcheckrb(test[9]);
            vb11 = viewGroup11.setcheckrb(test[10]);
            vb12 = viewGroup12.setcheckrb(test[11]);
            vb13 = viewGroup13.setcheckrb(test[12]);
            vb14 = viewGroup14.setcheckrb(test[13]);
            vb15 = viewGroup15.setcheckrb(test[14]);
            vb16 = viewGroup16.setcheckrb(test[15]);
            vb17 = viewGroup17.setcheckrb(test[16]);



            viewGroup1.setEdt(oldedit[0]);
            viewGroup2.setEdt(oldedit[1]);
            viewGroup3.setEdt(oldedit[2]);
            viewGroup4.setEdt(oldedit[3]);
            viewGroup5.setEdt(oldedit[4]);
            viewGroup6.setEdt(oldedit[5]);
            viewGroup7.setEdt(oldedit[6]);
            viewGroup8.setEdt(oldedit[7]);
            viewGroup9.setEdt(oldedit[8]);
            viewGroup10.setEdt(oldedit[9]);
            viewGroup11.setEdt(oldedit[10]);
            viewGroup12.setEdt(oldedit[11]);
            viewGroup13.setEdt(oldedit[12]);
            viewGroup14.setEdt(oldedit[13]);
            viewGroup15.setEdt(oldedit[14]);
            viewGroup16.setEdt(oldedit[15]);
            viewGroup17.setEdt(oldedit[16]);


            viewGroup1.setDate(olddt[0]);
            viewGroup2.setDate(olddt[1]);
            viewGroup3.setDate(olddt[2]);
            viewGroup4.setDate(olddt[3]);
            viewGroup5.setDate(olddt[4]);
            viewGroup6.setDate(olddt[5]);
            viewGroup7.setDate(olddt[6]);
            viewGroup8.setDate(olddt[7]);
            viewGroup9.setDate(olddt[8]);
            viewGroup10.setDate(olddt[9]);
            viewGroup11.setDate(olddt[10]);
            viewGroup12.setDate(olddt[11]);
            viewGroup13.setDate(olddt[12]);
            viewGroup14.setDate(olddt[13]);
            viewGroup15.setDate(olddt[14]);
            viewGroup16.setDate(olddt[15]);
            viewGroup17.setDate(olddt[16]);



            az.setText(ii+vb1+vb2+vb3+vb4+
                    vb5+vb6+vb7+vb8+
                    vb9+vb10+vb11+vb12+
                    vb13+vb14+vb15+vb16+vb17+"/17");




            /// setOncheck ///

            rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb1 = viewGroup1.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup1.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vb1 = viewGroup1.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup1.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");

                }


            });


            rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb2 = viewGroup2.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup2.setinvisble();
                            // az.setText("2/30");
                            break;

                        case R.id.customrb2 :
                            vb2 = viewGroup2.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup2.setvisble();
                            //ea2 = ed2.getText().toString();
                            //az.setText("2/30");
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb3 = viewGroup3.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup3.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vb3 = viewGroup3.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup3.setvisble();
                            //ea3 = ed3.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb4 = viewGroup4.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup4.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb4 = viewGroup4.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup4.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb5 = viewGroup5.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup5.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb5 = viewGroup5.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup5.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb6 = viewGroup6.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup6.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb6 = viewGroup6.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup6.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb7 = viewGroup7.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup7.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb7 = viewGroup7.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup7.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb8 = viewGroup8.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup8.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb8 = viewGroup8.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup8.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb9 = viewGroup9.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup9.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb9 = viewGroup9.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup9.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb10 = viewGroup10.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup10.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb10 = viewGroup10.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup10.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb11 = viewGroup11.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup11.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb11 = viewGroup11.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup11.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb12 = viewGroup12.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup12.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb12 = viewGroup12.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup12.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb13 = viewGroup13.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup13.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb13 = viewGroup13.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup13.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });


            rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb14 = viewGroup14.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup14.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb14 = viewGroup14.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup14.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb15 = viewGroup15.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup15.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb15 = viewGroup15.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup15.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb16 = viewGroup16.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup16.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb16 = viewGroup16.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup16.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });

            rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb17 = viewGroup17.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup17.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb17 = viewGroup17.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup17.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    az.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+"/17");
                }
            });


            FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    int max = 17;
                    allscore[0] = max - (ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17);

                    //Toast.makeText(getContext(),"score : = "+ allscore[0],Toast.LENGTH_SHORT).show();
                    String text[] = new String[17];

                    text[0] = ed1.getText().toString();
                    text[1] = ed2.getText().toString();
                    text[2] = ed3.getText().toString();
                    text[3] = ed4.getText().toString();
                    text[4] = ed5.getText().toString();
                    text[5] = ed6.getText().toString();
                    text[6] = ed7.getText().toString();
                    text[7] = ed8.getText().toString();
                    text[8] = ed9.getText().toString();
                    text[9] = ed10.getText().toString();
                    text[10] = ed11.getText().toString();
                    text[11] = ed12.getText().toString();
                    text[12] = ed13.getText().toString();
                    text[13] = ed14.getText().toString();
                    text[14] = ed15.getText().toString();
                    text[15] = ed16.getText().toString();
                    text[16] = ed17.getText().toString();



                    Integer point[] = new Integer[17];
                    point[0] = vb1;
                    point[1] = vb2;
                    point[2] = vb3;
                    point[3] = vb4;
                    point[4] = vb5;
                    point[5] = vb6;
                    point[6] = vb7;
                    point[7] = vb8;
                    point[8] = vb9;
                    point[9] = vb10;
                    point[10] = vb11;
                    point[11] = vb12;
                    point[12] = vb13;
                    point[13] = vb14;
                    point[14] = vb15;
                    point[15] = vb16;
                    point[16] = vb17;

                    String dd[] = new String[17];
                    dd[0] = date1.getText().toString();
                    dd[1] = date2.getText().toString();
                    dd[2] = date3.getText().toString();
                    dd[3] = date4.getText().toString();
                    dd[4] = date5.getText().toString();
                    dd[5] = date6.getText().toString();
                    dd[6] = date7.getText().toString();
                    dd[7] = date8.getText().toString();
                    dd[8] = date9.getText().toString();
                    dd[9] = date10.getText().toString();
                    dd[10] = date11.getText().toString();
                    dd[11] = date12.getText().toString();
                    dd[12] = date13.getText().toString();
                    dd[13] = date14.getText().toString();
                    dd[14] = date15.getText().toString();
                    dd[15] = date16.getText().toString();
                    dd[16] = date17.getText().toString();


                    try {

                        connectionSQL = new ConnectionSQL();

                        Connection con = connectionSQL.CONN();
                        for (int i = 0 ; i < 17 ;i++)
                        {
                            stmt = con.createStatement();
                            String commands = "update MAS_PJ " +
                                    "set POINT = '"+ point[i] +"',TOTAL_POINT = '"+az.getText().toString()+"" +
                                    "',DOCUPDATE = CONVERT(VARCHAR(10),GETDATE(),110),DATE = '"+dd[i]+"',DOC_TEXT = '"+text[i]+"'  "+
                                    "where DOC_NUMBER = '"+a+"' and DOC_HEAD like '"+(i+1)+"%' ";
                                    //"select '"+a+"','"+ head[i]+"','"+area+"',GETDATE(),'"+dd[i]+"','"+text[i]+"','"+ point[i] +"','"+az.getText().toString()+"'";
                                    //" VALUES ('"+a+"','"+head[i]+"','"+area+"',CONVERT(VARCHAR(10),GETDATE(),110),'"+dd[i]+"','"+text[i]+"','"+ point[i] +"','"+az.getText().toString()+"',CONVERT(VARCHAR(10),GETDATE(),110))";
                            PreparedStatement preStmt = con.prepareStatement(commands);
                            preStmt.executeUpdate();
                            //Toast.makeText(getContext(),"jkj = "+ (i+1),Toast.LENGTH_SHORT).show();
                        }
                        //////////////////////////////////////////////

                        //getFragmentManager().popBackStack();

                    }catch (SQLException ex){
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    } catch (IOError ex) {
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    } catch (AndroidRuntimeException ex) {
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    } catch (NullPointerException ex) {
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    } catch (Exception ex) {
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    }


                    try {
                        connectionSQL = new ConnectionSQL();
                        Connection con = connectionSQL.CONN();
                        stmt = con.createStatement();
                        String commands = "update MAS_PJ_REPORT " +
                                "set COUNTEDIT = '"+allscore[0]+"',TOTAL_POINT = '"+az.getText().toString()+"' " +
                                "where DOC_NUMBER = '"+a+"'";
                        //"select '"+a+"','"+ head[i]+"','"+area+"',GETDATE(),'"+dd[i]+"','"+text[i]+"','"+ point[i] +"','"+az.getText().toString()+"'";
                        //" VALUES ('"+ whcode +"','"+a+"','"+area+"',CONVERT(VARCHAR(10),GETDATE(),110),'"+az.getText().toString()+"','"+allscore[0]+"')";
                        PreparedStatement preStmt = con.prepareStatement(commands);
                        preStmt.executeUpdate();
                        Toast.makeText(getActivity(),"บันทึกสำเร็จ",Toast.LENGTH_SHORT).show();
                        //เปิดหน้า fragment
                        //getFragmentManager().executePendingTransactions();
                        //////////////////////////////////////////////

                    }catch (SQLException ex){
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    } catch (IOError ex) {
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    } catch (AndroidRuntimeException ex) {
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    } catch (NullPointerException ex) {
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    } catch (Exception ex) {
                        Toast.makeText(getActivity(),ex.toString(),Toast.LENGTH_SHORT).show();
                    }

                    getFragmentManager().popBackStack();


                }
            });
        }


        return  v;
    }

   /*private List<ParentListItem> generateCrimes() {
        CrimeLab crimeLab = CrimeLab.get(getActivity());
        List<Crime> crimes = crimeLab.getCrimes();
        List<ParentListItem> parentListItems = new ArrayList<>();
        for (Crime crime : crimes) {
            List<CrimeChild> childItemList = new ArrayList<>();
            childItemList.add(new CrimeChild(crime.getDate(), crime.isSolved()));
            crime.setChildItemList(childItemList);
            parentListItems.add(crime);
        }
        return parentListItems;
    }*/

    private void createGroupList() {

        String a[] = {"1","2","3","4","5","6","7","8","9","10"};
        groupList = new ArrayList<String>();
        for (int i = 0 ; i < 10 ; i++) {
            groupList.add(a[i]+".หัวข้อ");
        }
        /*groupList.add("1");
        groupList.add("2");
        groupList.add("3");
        groupList.add("4");
        groupList.add("5");
        groupList.add("6");*/
    }

    /*private void updateDisplay() {
        GregorianCalendar c = new GregorianCalendar(mYear, mMonth, mDay);
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");

        dt1.setText(sdf.format(c.getTime()));

        sdf = new SimpleDateFormat("yyyy-MM-dd");

        transDateString = sdf.format(c.getTime());
    }*/


    /*    private void createCollection() {

            String[] hpModels = { "HP Pavilion G6-2014TX", "ProBook HP 4540",
                    "HP Envy 4-1025TX" };
            String[] hclModels = { "HCL S2101", "HCL L2102", "HCL V2002" };
            String[] lenovoModels = { "IdeaPad Z Series", "Essential G Series",
                    "ThinkPad X Series", "Ideapad Z Series" };
            String[] sonyModels = { "VAIO E Series", "VAIO Z Series",
                    "VAIO S Series", "VAIO YB Series" };
            String[] dellModels = { "Inspiron", "Vostro", "XPS" };
            String[] samsungModels = { "NP Series", "Series 5", "SF Series" };

            Collection = new LinkedHashMap<String, List<String>>();

            for (String laptop : groupList) {
                if (laptop.equals("HP")) {
                    loadChild(hpModels);
                } else if (laptop.equals("Dell"))
                    loadChild(dellModels);
                else if (laptop.equals("Sony"))
                    loadChild(sonyModels);
                else if (laptop.equals("HCL"))
                    loadChild(hclModels);
                else if (laptop.equals("Samsung"))
                    loadChild(samsungModels);
                else
                    loadChild(lenovoModels);

                Collection.put(laptop, childList);
            }
        }

        private void loadChild(String[] laptopModels) {
            childList = new ArrayList<String>();
            for (String model : laptopModels)
                childList.add(model);
        }
    */











    /*public void createData() //วน for ใส่ค่า
    {
        /*for (int j = 0; j < g.length; j++) {
            EGroup group = new EGroup("1");
            for (int i = 0; i < test.length; i++) {
                group.children.add(test[i]);
            }
            groups.append(j, group);
        }
    }*/

}
