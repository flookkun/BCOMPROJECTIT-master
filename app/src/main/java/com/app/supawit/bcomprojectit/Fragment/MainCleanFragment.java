package com.app.supawit.bcomprojectit.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.AndroidRuntimeException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public class MainCleanFragment extends Fragment {

    public MainCleanFragment() {
        // Required empty public constructor
    }
    List<String> groupList;

    int chkclick1 = 0,chkclick2 = 0,chkclick3 = 0,chkclick4 = 0,chkclick5 = 0
            ,chkclick6 = 0,chkclick7 = 0,chkclick8 = 0,chkclick9 = 0,chkclick10 = 0
            ,chkclick11 = 0,chkclick12 = 0,chkclick13 = 0,chkclick14 = 0,chkclick15 = 0
            ,chkclick16 = 0,chkclick17 = 0,chkclick18 = 0,chkclick19 = 0,chkclick20 = 0
            ,chkclick21 = 0,chkclick22 = 0,chkclick23 = 0,chkclick24 = 0,chkclick25 = 0
            ,chkclick26 = 0,chkclick27 = 0,chkclick28 = 0,chkclick29 = 0;


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
            ,viewGroup17
            ,viewGroup18
            ,viewGroup19
            ,viewGroup20
            ,viewGroup21
            ,viewGroup22
            ,viewGroup23
            ,viewGroup24
            ,viewGroup25
            ,viewGroup26
            ,viewGroup27
            ,viewGroup28
            ,viewGroup29;

    TextView az,score
            ,date1,date2,date3,date4
            ,date5,date6,date7,date8
            ,date9,date10,date11,date12
            ,date13,date14,date15,date16
            ,date17,date18,date19,date20,date21,date22
            ,date23,date24,date25,date26
            ,date27,date28,date29;


    int ii = 0;
    int vg1 = 0,vg2 = 0,vg3 = 0,vg4 = 0
            ,vg5 = 0,vg6 = 0,vg7 = 0
            ,vg8 = 0,vg9 = 0,vg10 = 0
            ,vg11 = 0,vg12 = 0,vg13 = 0
            ,vg14 = 0,vg15 = 0,vg16 = 0
            ,vg17 = 0,vg18 = 0,vg19 = 0,vg20 = 0
            ,vg21 = 0,vg22 = 0,vg23 = 0
            ,vg24 = 0,vg25 = 0,vg26 = 0
            ,vg27 = 0,vg28 = 0,vg29 = 0;


    int vb1 = 0,vb2 = 0,vb3 = 0,vb4 = 0
            ,vb5 = 0,vb6 = 0,vb7 = 0
            ,vb8 = 0,vb9 = 0,vb10 = 0
            ,vb11 = 0,vb12 = 0,vb13 = 0
            ,vb14 = 0,vb15 = 0,vb16 = 0
            ,vb17 = 0,vb18 = 0,vb19 = 0,vb20 = 0
            ,vb21 = 0,vb22 = 0,vb23 = 0
            ,vb24 = 0,vb25 = 0,vb26 = 0
            ,vb27 = 0,vb28 = 0,vb29 = 0;

    int edchk1 = 0,edchk2 = 0,edchk3 = 0,edchk4 = 0,edchk5 = 0,edchk6 = 0,edchk7 = 0
            ,edchk8 = 0,edchk9 = 0,edchk10 = 0,edchk11 = 0,edchk12 = 0,edchk13 = 0,edchk14 = 0
            ,edchk15 = 0,edchk16 = 0,edchk17 = 0,edchk18 = 0,edchk19 = 0,edchk20 = 0,edchk21 = 0,edchk22 = 0
            ,edchk23 = 0,edchk24 = 0
            ,edchk25 = 0,edchk26 = 0,edchk27 = 0,edchk28 = 0,edchk29 = 0;


    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9
            ,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18
            ,ed19,ed20,ed21,ed22,ed23,ed24,ed25,ed26,ed27
            ,ed28,ed29;


    ConnectionSQL connectionSQL;
    Statement stmt = null;
    ResultSet rs = null;
    String whcode;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final RadioGroup rg1,rg2,rg3,rg4,rg5,rg6,rg7,rg8,rg9,rg10,rg11,rg12,rg13,rg14,rg15,rg16,rg17,rg18,
        rg19,rg20,rg21,rg22,rg23,rg24,rg25,rg26,rg27,rg28,rg29;
        final Bundle bundle  = this.getArguments();
        final Integer chk = bundle.getInt("chk");
        final String a = bundle.getString("Key");
        final String area = bundle.getString("area");
        final String abbname = bundle.getString("wh");
        final String head[] = new String[100];
        View v = inflater.inflate(R.layout.fragment_main_clean,null);

        //Toast.makeText(getContext(),"chk = "+chk,Toast.LENGTH_SHORT).show();

        score = (TextView) v.findViewById(R.id.txtscore);

        score.setText(ii+"/29");

        getActivity().setTitle("Cleanliness ( ความสะอาด )");

        TextView txt = (TextView) v.findViewById(R.id.txtqsc2);

        txt.setText(a);


        if(chk==1){

            /// set ViewGroup ///


            viewGroup1 = (CustomViewGroup) v.findViewById(R.id.viewgroup11);
            viewGroup2 = (CustomViewGroup) v.findViewById(R.id.viewgroup21);
            viewGroup3 = (CustomViewGroup) v.findViewById(R.id.viewgroup31);
            viewGroup4 = (CustomViewGroup) v.findViewById(R.id.viewgroup41);
            viewGroup5 = (CustomViewGroup) v.findViewById(R.id.viewgroup51);
            viewGroup6 = (CustomViewGroup) v.findViewById(R.id.viewgroup61);
            viewGroup7 = (CustomViewGroup) v.findViewById(R.id.viewgroup71);
            viewGroup8 = (CustomViewGroup) v.findViewById(R.id.viewgroup81);
            viewGroup9 = (CustomViewGroup) v.findViewById(R.id.viewgroup91);
            viewGroup10 = (CustomViewGroup) v.findViewById(R.id.viewgroup101);
            viewGroup11 = (CustomViewGroup) v.findViewById(R.id.viewgroup111);
            viewGroup12 = (CustomViewGroup) v.findViewById(R.id.viewgroup121);
            viewGroup13 = (CustomViewGroup) v.findViewById(R.id.viewgroup131);
            viewGroup14 = (CustomViewGroup) v.findViewById(R.id.viewgroup141);
            viewGroup15 = (CustomViewGroup) v.findViewById(R.id.viewgroup151);
            viewGroup16 = (CustomViewGroup) v.findViewById(R.id.viewgroup161);
            viewGroup17 = (CustomViewGroup) v.findViewById(R.id.viewgroup171);
            viewGroup18 = (CustomViewGroup) v.findViewById(R.id.viewgroup181);
            viewGroup19 = (CustomViewGroup) v.findViewById(R.id.viewgroup191);
            viewGroup20 = (CustomViewGroup) v.findViewById(R.id.viewgroup201);
            viewGroup21 = (CustomViewGroup) v.findViewById(R.id.viewgroup211);
            viewGroup22 = (CustomViewGroup) v.findViewById(R.id.viewgroup221);
            viewGroup23 = (CustomViewGroup) v.findViewById(R.id.viewgroup231);
            viewGroup24 = (CustomViewGroup) v.findViewById(R.id.viewgroup241);
            viewGroup25 = (CustomViewGroup) v.findViewById(R.id.viewgroup251);
            viewGroup26 = (CustomViewGroup) v.findViewById(R.id.viewgroup261);
            viewGroup27 = (CustomViewGroup) v.findViewById(R.id.viewgroup271);
            viewGroup28 = (CustomViewGroup) v.findViewById(R.id.viewgroup281);
            viewGroup29 = (CustomViewGroup) v.findViewById(R.id.viewgroup291);

            /// set text ///

            head[0] = viewGroup1.settxt("1. อาคาร และป้ายไฟ Beauty Buffet ");
            head[1] = viewGroup2.settxt("2. บริเวณรอบร้าน พื้นทางเดินและหน้าร้าน");
            head[2] = viewGroup3.settxt("3. Chef B.B /  POP /ธงญี่ปุ่น");
            head[3] = viewGroup4.settxt("4. กระจกรอบร้าน และขอบกระจก");
            head[4] = viewGroup5.settxt("5. คานูปี้");
            head[5] = viewGroup6.settxt("6. กล้องวงจรปิด");
            head[6] = viewGroup7.settxt("7. เฟอร์นิเจอร์ ภายในตู้ ลิ้นชัก");
            head[7] = viewGroup8.settxt("8. ชั้นวางอะคิลิค ");
            head[8] = viewGroup9.settxt("9. Prop ตกแต่ง / Standy Chef B.B / POP");
            head[9] = viewGroup10.settxt("10. พื้น");
            head[10] = viewGroup11.settxt("11. กระจกส่องหน้าติดผนัง ");
            head[11] = viewGroup12.settxt("12. โต๊ะแต่งหน้า");
            head[12] = viewGroup13.settxt("13. อุปกรณ์ tester โต๊ะแต่งหน้า ");
            head[13] = viewGroup14.settxt("14. โคมไฟ หลอดไฟ");
            head[14] = viewGroup15.settxt("15. โทรทัศน์ เครื่องเล่นวีดีโอ ");
            head[15] = viewGroup16.settxt("16. หน้ากากช่องแอร์,ช่องระบายอากาศ ");
            head[16] = viewGroup17.settxt("17. อุณหภูมิภายในร้าน ");
            head[17] = viewGroup18.settxt("18. พัดลม ");
            head[18] = viewGroup19.settxt("19. เปิดเพลงตลอดทั้งวัน");
            head[19] = viewGroup20.settxt("20. ฉีดน้ำหอมร้านระหว่างวัน");
            head[20] = viewGroup21.settxt("21. ถังขยะ อุปกรณ์ทำความสะอาด ");
            head[21] = viewGroup22.settxt("22. การจัดเรียงสินค้า");
            head[22] = viewGroup23.settxt("23. ความเป็นระเบียบเรียบร้อย ");
            head[23] = viewGroup24.settxt("24. ความสะอาด");
            head[24] = viewGroup25.settxt("25. บริเวณเคาน์เตอร์โชว์เครื่องครัว บอร์ด ");
            head[25] = viewGroup26.settxt("26. บริเวณเคาน์เตอร์แคชเชียร์ ");
            head[26] = viewGroup27.settxt("27. อุปกรณ์คอมพิวเตอร์และสายไฟ ");
            head[27] = viewGroup28.settxt("28. เครื่องคิดเงิน เครื่องรูดบัตร ");
            head[28] = viewGroup29.settxt("29. ไม่มีอุปกรณ์อื่นที่ไม่เกี่ยวข้อง ");

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
            rg18 = (RadioGroup) viewGroup18.findViewById(R.id.customradiogroup);
            rg19 = (RadioGroup) viewGroup19.findViewById(R.id.customradiogroup);
            rg20 = (RadioGroup) viewGroup20.findViewById(R.id.customradiogroup);
            rg21 = (RadioGroup) viewGroup21.findViewById(R.id.customradiogroup);
            rg22 = (RadioGroup) viewGroup22.findViewById(R.id.customradiogroup);
            rg23 = (RadioGroup) viewGroup23.findViewById(R.id.customradiogroup);
            rg24 = (RadioGroup) viewGroup24.findViewById(R.id.customradiogroup);
            rg25 = (RadioGroup) viewGroup25.findViewById(R.id.customradiogroup);
            rg26 = (RadioGroup) viewGroup26.findViewById(R.id.customradiogroup);
            rg27 = (RadioGroup) viewGroup27.findViewById(R.id.customradiogroup);
            rg28 = (RadioGroup) viewGroup28.findViewById(R.id.customradiogroup);
            rg29 = (RadioGroup) viewGroup29.findViewById(R.id.customradiogroup);


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
            ed18 = (EditText) viewGroup18.findViewById(R.id.customedt);
            ed19 = (EditText) viewGroup19.findViewById(R.id.customedt);
            ed20 = (EditText) viewGroup20.findViewById(R.id.customedt);
            ed21 = (EditText) viewGroup21.findViewById(R.id.customedt);
            ed22 = (EditText) viewGroup22.findViewById(R.id.customedt);
            ed23 = (EditText) viewGroup23.findViewById(R.id.customedt);
            ed24 = (EditText) viewGroup24.findViewById(R.id.customedt);
            ed25 = (EditText) viewGroup25.findViewById(R.id.customedt);
            ed26 = (EditText) viewGroup26.findViewById(R.id.customedt);
            ed27 = (EditText) viewGroup27.findViewById(R.id.customedt);
            ed28 = (EditText) viewGroup28.findViewById(R.id.customedt);
            ed29 = (EditText) viewGroup29.findViewById(R.id.customedt);


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
            date18 = (TextView) viewGroup18.findViewById(R.id.setdate);
            date19 = (TextView) viewGroup19.findViewById(R.id.setdate);
            date20 = (TextView) viewGroup20.findViewById(R.id.setdate);
            date21 = (TextView) viewGroup21.findViewById(R.id.setdate);
            date22 = (TextView) viewGroup22.findViewById(R.id.setdate);
            date23 = (TextView) viewGroup23.findViewById(R.id.setdate);
            date24 = (TextView) viewGroup24.findViewById(R.id.setdate);
            date25 = (TextView) viewGroup25.findViewById(R.id.setdate);
            date26 = (TextView) viewGroup26.findViewById(R.id.setdate);
            date27 = (TextView) viewGroup27.findViewById(R.id.setdate);
            date28 = (TextView) viewGroup28.findViewById(R.id.setdate);
            date29 = (TextView) viewGroup29.findViewById(R.id.setdate);

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
            date18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup18.settime();
                }
            });
            date19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup19.settime();
                }
            });
            date20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup20.settime();
                }
            });
            date21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup21.settime();
                }
            });
            date22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup22.settime();
                }
            });
            date23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup23.settime();
                }
            });
            date24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup24.settime();
                }
            });
            date25.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup25.settime();
                }
            });
            date26.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup26.settime();
                }
            });
            date27.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup27.settime();
                }
            });
            date28.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup28.settime();
                }
            });
            date29.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup29.settime();
                }
            });



            /// setOncheck ///


            //// Clean ////

            rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    chkclick1 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });


            rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick2 = 1;
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
                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");
                }
            });

            rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick3 = 1;
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
                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");
                }
            });

            rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick4 = 1;
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
                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");
                }
            });

            rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick5 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });

            rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick6 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });

            rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick7 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });

            rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {


                    chkclick8 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });

            rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick9 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");
                }


            });

            rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick10 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });


            rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick11 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });

            rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick12 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });

            rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick13 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });


            rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    chkclick14 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });

            rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    chkclick15 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });

            rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick16 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });

            rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick17 = 1;
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

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");
                }


            });

            rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick18 = 1;
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg18 = viewGroup18.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup18.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg18 = viewGroup18.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup18.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });

            rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick19 = 1;
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg19 = viewGroup19.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup19.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg19 = viewGroup19.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup19.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });

            rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                        chkclick20 = 1;
                        switch (checkedId)
                        {
                            case R.id.customrb1 :
                                vg20 = viewGroup20.setvaluerb(R.id.customrb1);
                                //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                                viewGroup20.setinvisble();
                                break;
                            case R.id.customrb2 :
                                vg20 = viewGroup20.setvaluerb(R.id.customrb2);
                                //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                                viewGroup20.setvisble();
                                //ea1 = ed1.getText().toString();
                                break;
                        }

                        score.setText(ii+vg1+vg2+vg3+vg4
                                +vg5+vg6+vg7+vg8+
                                vg9+vg10+vg11+vg12+
                                vg13+vg14+vg15+vg16+vg17+vg18+
                                vg19+vg20+vg21+vg22+
                                vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                    }


                });

                rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                        chkclick21 = 1;
                        switch (checkedId)
                        {
                            case R.id.customrb1 :
                                vg21 = viewGroup21.setvaluerb(R.id.customrb1);
                                //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                                viewGroup21.setinvisble();
                                break;
                            case R.id.customrb2 :
                                vg21 = viewGroup21.setvaluerb(R.id.customrb2);
                                //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                                viewGroup21.setvisble();
                                //ea1 = ed1.getText().toString();
                                break;
                        }

                        score.setText(ii+vg1+vg2+vg3+vg4
                                +vg5+vg6+vg7+vg8+
                                vg9+vg10+vg11+vg12+
                                vg13+vg14+vg15+vg16+vg17+vg18+
                                vg19+vg20+vg21+vg22+
                                vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                    }


            });

            rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick22 = 1;

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg22 = viewGroup22.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup22.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg22 = viewGroup22.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup22.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }


            });

            rg23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick23 = 1;

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg23 = viewGroup23.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup23.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg23 = viewGroup23.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup23.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }

            });


            rg24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick24 = 1;
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg24 = viewGroup24.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup24.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg24 = viewGroup24.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup24.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }

            });

            rg25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick25 = 1;
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg25 = viewGroup25.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup25.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg25 = viewGroup25.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup25.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }

            });

            rg26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick26 = 1;
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg26 = viewGroup26.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup26.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg26 = viewGroup26.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup26.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }

            });

            rg27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick27 = 1;
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg27 = viewGroup27.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup27.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg27 = viewGroup27.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup27.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }

            });

            rg28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick28 = 1;
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg28 = viewGroup28.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup28.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg28 = viewGroup28.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup28.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }

            });

            rg29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    chkclick29 = 1;
                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vg29 = viewGroup29.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"checkedId",Toast.LENGTH_SHORT).show();
                            viewGroup29.setinvisble();
                            break;
                        case R.id.customrb2 :
                            vg29 = viewGroup29.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup29.setvisble();
                            //ea1 = ed1.getText().toString();
                            break;
                    }

                    score.setText(ii+vg1+vg2+vg3+vg4
                            +vg5+vg6+vg7+vg8+
                            vg9+vg10+vg11+vg12+
                            vg13+vg14+vg15+vg16+vg17+vg18+
                            vg19+vg20+vg21+vg22+
                            vg23+vg24+vg25+vg26+vg27+vg28+vg29+"/29");

                }

            });

            ////// Clean End/////




            /////////////////////////////////////////////////////////////////////////////////////////////


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
                    int max = 29;
                    int sum = chkclick1+chkclick2+chkclick3+chkclick4+chkclick5
                            +chkclick6+chkclick7+chkclick8+chkclick9+chkclick10
                            +chkclick11+chkclick12+chkclick13+chkclick14+chkclick15
                            +chkclick16+chkclick17+chkclick18+chkclick19+chkclick20
                            +chkclick21+chkclick22 +chkclick23+chkclick24+chkclick25
                            +chkclick26+chkclick27 +chkclick28+chkclick29;

                    ///// check edittext /////
                    if(vg1 == 0){
                        ed1.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed1.requestFocus();
                        String edt = ed1.getText().toString();
                        String dt = date1.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk1 = 1;
                        }
                        else
                        {
                            edchk1 = 0;
                        }
                    }
                    if(vg2 == 0){
                        ed2.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed2.requestFocus();
                        String edt = ed2.getText().toString();
                        String dt = date2.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk2 = 1;
                        }
                        else
                        {
                            edchk2 = 0;
                        }
                    }
                    if(vg3 == 0){
                        ed3.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed3.requestFocus();
                        String edt = ed3.getText().toString();
                        String dt = date3.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk3 = 1;
                        }
                        else
                        {
                            edchk3 = 0;
                        }
                    }
                    if(vg4 == 0){
                        ed4.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed4.requestFocus();
                        String edt = ed4.getText().toString();
                        String dt = date4.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk4 = 1;
                        }
                        else
                        {
                            edchk4 = 0;
                        }
                    }
                    if(vg5 == 0){
                        ed5.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed5.requestFocus();
                        String edt = ed5.getText().toString();
                        String dt = date5.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk5 = 1;
                        }
                        else
                        {
                            edchk5 = 0;
                        }
                    }
                    if(vg6 == 0){
                        ed6.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed6.requestFocus();
                        String edt = ed6.getText().toString();
                        String dt = date6.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk6 = 1;
                        }
                        else
                        {
                            edchk6 = 0;
                        }
                    }
                    if(vg7 == 0){
                        ed7.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed7.requestFocus();
                        String edt = ed7.getText().toString();
                        String dt = date7.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk7 = 1;
                        }
                        else
                        {
                            edchk7 = 0;
                        }
                    }
                    if(vg8 == 0){
                        ed8.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed8.requestFocus();
                        String edt = ed8.getText().toString();
                        String dt = date8.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk8 = 1;
                        }
                        else
                        {
                            edchk8 = 0;
                        }
                    }
                    if(vg9 == 0){
                        ed9.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed9.requestFocus();
                        String edt = ed9.getText().toString();
                        String dt = date9.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk9 = 1;
                        }
                        else
                        {
                            edchk9 = 0;
                        }
                    }
                    if(vg10 == 0){
                        ed10.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed10.requestFocus();
                        String edt = ed10.getText().toString();
                        String dt = date10.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk10 = 1;
                        }
                        else
                        {
                            edchk10 = 0;
                        }
                    }
                    if(vg11 == 0){
                        ed11.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed11.requestFocus();
                        String edt = ed11.getText().toString();
                        String dt = date11.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk11 = 1;
                        }
                        else
                        {
                            edchk11 = 0;
                        }
                    }
                    if(vg12 == 0){
                        ed12.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed12.requestFocus();
                        String edt = ed12.getText().toString();
                        String dt = date12.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk12 = 1;
                        }
                        else
                        {
                            edchk12 = 0;
                        }
                    }
                    if(vg13 == 0){
                        ed13.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed13.requestFocus();
                        String edt = ed13.getText().toString();
                        String dt = date13.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk13 = 1;
                        }
                        else
                        {
                            edchk13 = 0;
                        }
                    }
                    if(vg14 == 0){
                        ed14.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed14.requestFocus();
                        String edt = ed14.getText().toString();
                        String dt = date14.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk14 = 1;
                        }
                        else
                        {
                            edchk14 = 0;
                        }
                    }
                    if(vg15 == 0){
                        ed15.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed15.requestFocus();
                        String edt = ed15.getText().toString();
                        String dt = date15.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk15 = 1;
                        }
                        else
                        {
                            edchk15 = 0;
                        }
                    }
                    if(vg16 == 0){
                        ed16.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed16.requestFocus();
                        String edt = ed16.getText().toString();
                        String dt = date16.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk16 = 1;
                        }
                        else
                        {
                            edchk16 = 0;
                        }
                    }
                    if(vg17 == 0){
                        ed17.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed17.requestFocus();
                        String edt = ed17.getText().toString();
                        String dt = date17.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk17 = 1;
                        }
                        else
                        {
                            edchk17 = 0;
                        }
                    }
                    if(vg18 == 0){
                        ed18.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed18.requestFocus();
                        String edt = ed18.getText().toString();
                        String dt = date18.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk18 = 1;
                        }
                        else
                        {
                            edchk18 = 0;
                        }
                    }
                    if(vg19 == 0){
                        ed19.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed19.requestFocus();
                        String edt = ed19.getText().toString();
                        String dt = date19.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk19 = 1;
                        }
                        else
                        {
                            edchk19 = 0;
                        }
                    }
                    if(vg20 == 0){
                        ed20.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed20.requestFocus();
                        String edt = ed20.getText().toString();
                        String dt = date20.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk20 = 1;
                        }
                        else
                        {
                            edchk20 = 0;
                        }
                    }
                    if(vg21 == 0){
                        ed21.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed21.requestFocus();
                        String edt = ed21.getText().toString();
                        String dt = date21.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk21 = 1;
                        }
                        else
                        {
                            edchk21 = 0;
                        }
                    }
                    if(vg22 == 0){
                        ed22.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed22.requestFocus();
                        String edt = ed22.getText().toString();
                        String dt = date22.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk22 = 1;
                        }
                        else
                        {
                            edchk22 = 0;
                        }
                    }
                    if(vg23 == 0){
                        ed23.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed23.requestFocus();
                        String edt = ed23.getText().toString();
                        String dt = date23.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk23 = 1;
                        }
                        else
                        {
                            edchk23 = 0;
                        }
                    }
                    if(vg24 == 0){
                        ed24.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed24.requestFocus();
                        String edt = ed24.getText().toString();
                        String dt = date24.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk24 = 1;
                        }
                        else
                        {
                            edchk24 = 0;
                        }
                    }
                    if(vg25 == 0){
                        ed25.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed25.requestFocus();
                        String edt = ed25.getText().toString();
                        String dt = date25.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk25 = 1;
                        }
                        else
                        {
                            edchk25 = 0;
                        }
                    }
                    if(vg26 == 0){
                        ed26.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed26.requestFocus();
                        String edt = ed26.getText().toString();
                        String dt = date26.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk26 = 1;
                        }
                        else
                        {
                            edchk26 = 0;
                        }
                    }
                    if(vg27 == 0){
                        ed27.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed27.requestFocus();
                        String edt = ed27.getText().toString();
                        String dt = date27.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk27 = 1;
                        }
                        else
                        {
                            edchk27 = 0;
                        }
                    }
                    if(vg28 == 0){
                        ed28.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed28.requestFocus();
                        String edt = ed28.getText().toString();
                        String dt = date28.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk28 = 1;
                        }
                        else
                        {
                            edchk28 = 0;
                        }
                    }
                    if(vg29 == 0){
                        ed29.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed29.requestFocus();
                        String edt = ed29.getText().toString();
                        String dt = date29.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk29 = 1;
                        }
                        else
                        {
                            edchk29 = 0;
                        }
                    }


                    /// check vg = 1///
                    if(vg1 == 1){
                        edchk1 = 0;
                    }
                    if(vg2 == 1){
                        edchk2 = 0;
                    }
                    if(vg3 == 1){
                        edchk3 = 0;
                    }
                    if(vg4 == 1){
                        edchk4 = 0;
                    }
                    if(vg5 == 1){
                        edchk5 = 0;
                    }
                    if(vg6 == 1){
                        edchk6 = 0;
                    }
                    if(vg7 == 1){
                        edchk7 = 0;
                    }
                    if(vg8 == 1){
                        edchk8 = 0;
                    }
                    if(vg9 == 1){
                        edchk9 = 0;
                    }
                    if(vg10 == 1){
                        edchk10 = 0;
                    }
                    if(vg11 == 1){
                        edchk11 = 0;
                    }
                    if(vg12 == 1){
                        edchk12 = 0;
                    }
                    if(vg13 == 1){
                        edchk13 = 0;
                    }
                    if(vg14 == 1){
                        edchk14 = 0;
                    }
                    if(vg15 == 1){
                        edchk15 = 0;
                    }
                    if(vg16 == 1){
                        edchk16 = 0;
                    }
                    if(vg17 == 1){
                        edchk17 = 0;
                    }
                    if(vg18 == 1){
                        edchk18 = 0;
                    }
                    if(vg19 == 1){
                        edchk19 = 0;
                    }
                    if(vg20 == 1){
                        edchk20 = 0;
                    }
                    if(vg21 == 1){
                        edchk21 = 0;
                    }
                    if(vg22 == 1){
                        edchk22 = 0;
                    }
                    if(vg23 == 1){
                        edchk23 = 0;
                    }
                    if(vg24 == 1){
                        edchk24 = 0;
                    }
                    if(vg25 == 1){
                        edchk25 = 0;
                    }
                    if(vg26 == 1){
                        edchk26 = 0;
                    }
                    if(vg27 == 1){
                        edchk27 = 0;
                    }
                    if(vg28 == 1){
                        edchk28 = 0;
                    }
                    if(vg29 == 1){
                        edchk29 = 0;
                    }


                    int sumed = edchk1+edchk2+edchk3+edchk4+edchk5+edchk6+edchk7
                            +edchk8+edchk9+edchk10+edchk11+edchk12+edchk13+edchk14
                            +edchk15+edchk16+edchk17+edchk18+edchk19+edchk20+edchk21
                            +edchk22+edchk23+edchk24 +edchk25+edchk26+edchk27+edchk28+edchk29;



                    //Toast.makeText(getContext(),"sum ="+sumed,Toast.LENGTH_SHORT).show();



                    //Toast.makeText(getContext(),"sum ="+sum,Toast.LENGTH_SHORT).show();
                    if(sum != max || sumed >= 1)
                    {
                        Toast.makeText(getContext(),"กรุณากรอกข้อมูลให้ครบถ้วน",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        int[] allscore = new int[1];
                        allscore[0] = max - (ii+vg1+vg2+vg3+vg4
                                +vg5+vg6+vg7+vg8+
                                vg9+vg10+vg11+vg12+
                                vg13+vg14+vg15+vg16+vg17+vg18+
                                vg19+vg20+vg21+vg22+
                                vg23+vg24+vg25+vg26+vg27+vg28+vg29);

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
                        text[17] = ed18.getText().toString();
                        text[18] = ed19.getText().toString();
                        text[19] = ed20.getText().toString();
                        text[20] = ed21.getText().toString();
                        text[21] = ed22.getText().toString();
                        text[22] = ed23.getText().toString();
                        text[23] = ed24.getText().toString();
                        text[24] = ed25.getText().toString();
                        text[25] = ed26.getText().toString();
                        text[26] = ed27.getText().toString();
                        text[27] = ed28.getText().toString();
                        text[28] = ed29.getText().toString();

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
                        point[17] = vg18;
                        point[18] = vg19;
                        point[19] = vg20;
                        point[20] = vg21;
                        point[21] = vg22;
                        point[22] = vg23;
                        point[23] = vg24;
                        point[24] = vg25;
                        point[25] = vg26;
                        point[26] = vg27;
                        point[27] = vg28;
                        point[28] = vg29;

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
                        dd[17] = date18.getText().toString();
                        dd[18] = date19.getText().toString();
                        dd[19] = date20.getText().toString();
                        dd[20] = date21.getText().toString();
                        dd[21] = date22.getText().toString();
                        dd[22] = date23.getText().toString();
                        dd[23] = date24.getText().toString();
                        dd[24] = date25.getText().toString();
                        dd[25] = date26.getText().toString();
                        dd[26] = date27.getText().toString();
                        dd[27] = date28.getText().toString();
                        dd[28] = date29.getText().toString();


                        try {
                            connectionSQL = new ConnectionSQL();
                            Connection con = connectionSQL.CONN();
                            for (int i = 0 ; i < 29 ;i++)
                            {
                                stmt = con.createStatement();
                                String commands = "insert MAS_PJ_C " +
                                        //"select '"+a+"','"+ head[i]+"','"+area+"',GETDATE(),'"+dd[i]+"','"+text[i]+"','"+ point[i] +"','"+az.getText().toString()+"'";
                                        " VALUES ('"+a+"','"+head[i]+"','"+area+"',CONVERT(VARCHAR(10),GETDATE(),110),'"+dd[i]+"','"+text[i]+"','"+ point[i] +"','"+score.getText().toString()+"',CONVERT(VARCHAR(10),GETDATE(),110),'"+a.substring(0,4)+"')";
                                PreparedStatement preStmt = con.prepareStatement(commands);
                                preStmt.executeUpdate();
                            }
                            stmt = con.createStatement();
                            String commands = "insert MAS_PJ_REPORT_C " +
                                    //"select '"+a+"','"+ head[i]+"','"+area+"',GETDATE(),'"+dd[i]+"','"+text[i]+"','"+ point[i] +"','"+az.getText().toString()+"'";
                                    " VALUES ('"+ whcode +"','"+a+"','"+area+"',CONVERT(VARCHAR(10),GETDATE(),110),'"+score.getText().toString()+"','"+allscore[0]+"')";
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

                }
            });

        }

        else if (chk == 0)
        {
            ArrayList<String> list1 = null,list2 = null,list3 = null,list4 = null;
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
                String query = "select * from mas_pj_c where DOC_NUMBER = '"+a+"'";

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


            viewGroup1 = (CustomViewGroup) v.findViewById(R.id.viewgroup11);
            viewGroup2 = (CustomViewGroup) v.findViewById(R.id.viewgroup21);
            viewGroup3 = (CustomViewGroup) v.findViewById(R.id.viewgroup31);
            viewGroup4 = (CustomViewGroup) v.findViewById(R.id.viewgroup41);
            viewGroup5 = (CustomViewGroup) v.findViewById(R.id.viewgroup51);
            viewGroup6 = (CustomViewGroup) v.findViewById(R.id.viewgroup61);
            viewGroup7 = (CustomViewGroup) v.findViewById(R.id.viewgroup71);
            viewGroup8 = (CustomViewGroup) v.findViewById(R.id.viewgroup81);
            viewGroup9 = (CustomViewGroup) v.findViewById(R.id.viewgroup91);
            viewGroup10 = (CustomViewGroup) v.findViewById(R.id.viewgroup101);
            viewGroup11 = (CustomViewGroup) v.findViewById(R.id.viewgroup111);
            viewGroup12 = (CustomViewGroup) v.findViewById(R.id.viewgroup121);
            viewGroup13 = (CustomViewGroup) v.findViewById(R.id.viewgroup131);
            viewGroup14 = (CustomViewGroup) v.findViewById(R.id.viewgroup141);
            viewGroup15 = (CustomViewGroup) v.findViewById(R.id.viewgroup151);
            viewGroup16 = (CustomViewGroup) v.findViewById(R.id.viewgroup161);
            viewGroup17 = (CustomViewGroup) v.findViewById(R.id.viewgroup171);
            viewGroup18 = (CustomViewGroup) v.findViewById(R.id.viewgroup181);
            viewGroup19 = (CustomViewGroup) v.findViewById(R.id.viewgroup191);
            viewGroup20 = (CustomViewGroup) v.findViewById(R.id.viewgroup201);
            viewGroup21 = (CustomViewGroup) v.findViewById(R.id.viewgroup211);
            viewGroup22 = (CustomViewGroup) v.findViewById(R.id.viewgroup221);
            viewGroup23 = (CustomViewGroup) v.findViewById(R.id.viewgroup231);
            viewGroup24 = (CustomViewGroup) v.findViewById(R.id.viewgroup241);
            viewGroup25 = (CustomViewGroup) v.findViewById(R.id.viewgroup251);
            viewGroup26 = (CustomViewGroup) v.findViewById(R.id.viewgroup261);
            viewGroup27 = (CustomViewGroup) v.findViewById(R.id.viewgroup271);
            viewGroup28 = (CustomViewGroup) v.findViewById(R.id.viewgroup281);
            viewGroup29 = (CustomViewGroup) v.findViewById(R.id.viewgroup291);




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
            rg18 = (RadioGroup) viewGroup18.findViewById(R.id.customradiogroup);
            rg19 = (RadioGroup) viewGroup19.findViewById(R.id.customradiogroup);
            rg20 = (RadioGroup) viewGroup20.findViewById(R.id.customradiogroup);
            rg21 = (RadioGroup) viewGroup21.findViewById(R.id.customradiogroup);
            rg22 = (RadioGroup) viewGroup22.findViewById(R.id.customradiogroup);
            rg23 = (RadioGroup) viewGroup23.findViewById(R.id.customradiogroup);
            rg24 = (RadioGroup) viewGroup24.findViewById(R.id.customradiogroup);
            rg25 = (RadioGroup) viewGroup25.findViewById(R.id.customradiogroup);
            rg26 = (RadioGroup) viewGroup26.findViewById(R.id.customradiogroup);
            rg27 = (RadioGroup) viewGroup27.findViewById(R.id.customradiogroup);
            rg28 = (RadioGroup) viewGroup28.findViewById(R.id.customradiogroup);
            rg29 = (RadioGroup) viewGroup29.findViewById(R.id.customradiogroup);

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
            ed18 = (EditText) viewGroup18.findViewById(R.id.customedt);
            ed19 = (EditText) viewGroup19.findViewById(R.id.customedt);
            ed20 = (EditText) viewGroup20.findViewById(R.id.customedt);
            ed21 = (EditText) viewGroup21.findViewById(R.id.customedt);
            ed22 = (EditText) viewGroup22.findViewById(R.id.customedt);
            ed23 = (EditText) viewGroup23.findViewById(R.id.customedt);
            ed24 = (EditText) viewGroup24.findViewById(R.id.customedt);
            ed25 = (EditText) viewGroup25.findViewById(R.id.customedt);
            ed26 = (EditText) viewGroup26.findViewById(R.id.customedt);
            ed27 = (EditText) viewGroup27.findViewById(R.id.customedt);
            ed28 = (EditText) viewGroup28.findViewById(R.id.customedt);
            ed29 = (EditText) viewGroup29.findViewById(R.id.customedt);


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
            date18 = (TextView) viewGroup18.findViewById(R.id.setdate);
            date19 = (TextView) viewGroup19.findViewById(R.id.setdate);
            date20 = (TextView) viewGroup20.findViewById(R.id.setdate);
            date21 = (TextView) viewGroup21.findViewById(R.id.setdate);
            date22 = (TextView) viewGroup22.findViewById(R.id.setdate);
            date23 = (TextView) viewGroup23.findViewById(R.id.setdate);
            date24 = (TextView) viewGroup24.findViewById(R.id.setdate);
            date25 = (TextView) viewGroup25.findViewById(R.id.setdate);
            date26 = (TextView) viewGroup26.findViewById(R.id.setdate);
            date27 = (TextView) viewGroup27.findViewById(R.id.setdate);
            date28 = (TextView) viewGroup28.findViewById(R.id.setdate);
            date29 = (TextView) viewGroup29.findViewById(R.id.setdate);

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
            date18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup18.settime();
                }
            });
            date19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup19.settime();
                }
            });
            date20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup20.settime();
                }
            });
            date21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup21.settime();
                }
            });
            date22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup22.settime();
                }
            });
            date23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup23.settime();
                }
            });
            date24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup24.settime();
                }
            });
            date25.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup25.settime();
                }
            });
            date26.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup26.settime();
                }
            });
            date27.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup27.settime();
                }
            });
            date28.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup28.settime();
                }
            });
            date29.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewGroup29.settime();
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
            viewGroup18.settxt(oldh[17]);
            viewGroup19.settxt(oldh[18]);
            viewGroup20.settxt(oldh[19]);
            viewGroup21.settxt(oldh[20]);
            viewGroup22.settxt(oldh[21]);
            viewGroup23.settxt(oldh[22]);
            viewGroup24.settxt(oldh[23]);
            viewGroup25.settxt(oldh[24]);
            viewGroup26.settxt(oldh[25]);
            viewGroup27.settxt(oldh[26]);
            viewGroup28.settxt(oldh[27]);
            viewGroup29.settxt(oldh[28]);



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
            vb18 = viewGroup18.setcheckrb(test[17]);
            vb19 = viewGroup19.setcheckrb(test[18]);
            vb20 = viewGroup20.setcheckrb(test[19]);
            vb21 = viewGroup21.setcheckrb(test[20]);
            vb22 = viewGroup22.setcheckrb(test[21]);
            vb23 = viewGroup23.setcheckrb(test[22]);
            vb24 = viewGroup24.setcheckrb(test[23]);
            vb25 = viewGroup25.setcheckrb(test[24]);
            vb26 = viewGroup26.setcheckrb(test[25]);
            vb27 = viewGroup27.setcheckrb(test[26]);
            vb28 = viewGroup28.setcheckrb(test[27]);
            vb29 = viewGroup29.setcheckrb(test[28]);


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
            viewGroup18.setEdt(oldedit[17]);
            viewGroup19.setEdt(oldedit[18]);
            viewGroup20.setEdt(oldedit[19]);
            viewGroup21.setEdt(oldedit[20]);
            viewGroup22.setEdt(oldedit[21]);
            viewGroup23.setEdt(oldedit[22]);
            viewGroup24.setEdt(oldedit[23]);
            viewGroup25.setEdt(oldedit[24]);
            viewGroup26.setEdt(oldedit[25]);
            viewGroup27.setEdt(oldedit[26]);
            viewGroup28.setEdt(oldedit[27]);
            viewGroup29.setEdt(oldedit[28]);


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
            viewGroup18.setDate(olddt[17]);
            viewGroup19.setDate(olddt[18]);
            viewGroup20.setDate(olddt[19]);
            viewGroup21.setDate(olddt[20]);
            viewGroup22.setDate(olddt[21]);
            viewGroup23.setDate(olddt[22]);
            viewGroup24.setDate(olddt[23]);
            viewGroup25.setDate(olddt[24]);
            viewGroup26.setDate(olddt[25]);
            viewGroup27.setDate(olddt[26]);
            viewGroup28.setDate(olddt[27]);
            viewGroup29.setDate(olddt[28]);


            score.setText(ii+vb1+vb2+vb3+vb4+
                    vb5+vb6+vb7+vb8+
                    vb9+vb10+vb11+vb12+
                    vb13+vb14+vb15+vb16+vb17+vb18+
                    vb19+vb20+vb21+vb22+vb23+vb24+
                    vb25+vb26+vb27+vb28+vb29+"/29");




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

                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");

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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
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
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
                }
            });

            rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb18 = viewGroup18.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup18.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb18 = viewGroup18.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup18.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
                }
            });

            rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb19 = viewGroup19.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup19.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb19 = viewGroup19.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup19.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
                }
            });

            rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb20 = viewGroup20.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup20.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb20 = viewGroup20.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup20.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
                }
            });


            rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb21 = viewGroup21.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup21.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb21 = viewGroup21.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup21.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
                }
            });

            rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb22 = viewGroup22.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup22.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb22 = viewGroup22.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup22.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
                }
            });

            rg23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb23 = viewGroup23.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup23.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb23 = viewGroup23.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup23.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
                }
            });


            rg24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb24 = viewGroup24.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup24.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb24 = viewGroup24.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup24.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
                }
            });

            rg25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb25 = viewGroup25.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup25.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb25 = viewGroup25.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup25.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
                }
            });

            rg26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb26 = viewGroup26.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup26.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb26 = viewGroup26.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup26.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
                }
            });

            rg27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb27 = viewGroup27.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup27.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb27 = viewGroup27.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup27.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
                }
            });


            rg28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb28 = viewGroup28.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup28.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb28 = viewGroup28.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup28.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
                }
            });

            rg29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId)
                    {
                        case R.id.customrb1 :
                            vb29 = viewGroup29.setvaluerb(R.id.customrb1);
                            //Toast.makeText(getContext(),"HELLO",Toast.LENGTH_SHORT).show();
                            viewGroup29.setinvisble();

                            break;

                        case R.id.customrb2 :
                            vb29 = viewGroup29.setvaluerb(R.id.customrb2);
                            //Toast.makeText(getContext(),"GG",Toast.LENGTH_SHORT).show();
                            viewGroup29.setvisble();
                            //ea4 = ed4.getText().toString();
                            break;
                    }
                    score.setText(ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29+"/29");
                }
            });
            if(vb1 == 0){
                ed1.setError("ไม่ผ่าน");
                ed1.requestFocus();
            }
            if(vb2 == 0){
                ed2.setError("ไม่ผ่าน");
                ed2.requestFocus();
            }
            if(vb3 == 0){
                ed3.setError("ไม่ผ่าน");
                ed3.requestFocus();
            }
            if(vb4 == 0){
                ed4.setError("ไม่ผ่าน");
                ed4.requestFocus();
            }
            if(vb5 == 0){
                ed5.setError("ไม่ผ่าน");
                ed5.requestFocus();
            }
            if(vb6 == 0){
                ed6.setError("ไม่ผ่าน");
                ed6.requestFocus();
            }
            if(vb7 == 0){
                ed7.setError("ไม่ผ่าน");
                ed7.requestFocus();
            }
            if(vb8 == 0){
                ed8.setError("ไม่ผ่าน");
                ed8.requestFocus();
            }
            if(vb9 == 0){
                ed9.setError("ไม่ผ่าน");
                ed9.requestFocus();
            }
            if(vb10 == 0){
                ed10.setError("ไม่ผ่าน");
                ed10.requestFocus();
            }
            if(vb11 == 0){
                ed11.setError("ไม่ผ่าน");
                ed11.requestFocus();
            }
            if(vb12 == 0){
                ed12.setError("ไม่ผ่าน");
                ed12.requestFocus();
            }
            if(vb13 == 0){
                ed13.setError("ไม่ผ่าน");
                ed13.requestFocus();
            }
            if(vb14 == 0){
                ed14.setError("ไม่ผ่าน");
                ed14.requestFocus();
            }
            if(vb15 == 0){
                ed15.setError("ไม่ผ่าน");
                ed15.requestFocus();
            }
            if(vb16 == 0){
                ed16.setError("ไม่ผ่าน");
                ed16.requestFocus();
            }
            if(vb17 == 0){
                ed17.setError("ไม่ผ่าน");
                ed17.requestFocus();
            }
            if(vb18 == 0){
                ed18.setError("ไม่ผ่าน");
                ed18.requestFocus();
            }
            if(vb19 == 0){
                ed19.setError("ไม่ผ่าน");
                ed19.requestFocus();
            }
            if(vb20 == 0){
                ed20.setError("ไม่ผ่าน");
                ed20.requestFocus();
            }
            if(vb21 == 0){
                ed21.setError("ไม่ผ่าน");
                ed21.requestFocus();
            }
            if(vb22 == 0){
                ed22.setError("ไม่ผ่าน");
                ed22.requestFocus();
            }
            if(vb23 == 0){
                ed23.setError("ไม่ผ่าน");
                ed23.requestFocus();
            }
            if(vb24 == 0){
                ed24.setError("ไม่ผ่าน");
                ed24.requestFocus();
            }
            if(vb25 == 0){
                ed25.setError("ไม่ผ่าน");
                ed25.requestFocus();
            }
            if(vb26 == 0){
                ed26.setError("ไม่ผ่าน");
                ed26.requestFocus();
            }
            if(vb27 == 0){
                ed27.setError("ไม่ผ่าน");
                ed27.requestFocus();
            }
            if(vb28 == 0){
                ed28.setError("ไม่ผ่าน");
                ed28.requestFocus();
            }
            if(vb29 == 0){
                ed29.setError("ไม่ผ่าน");
                ed29.requestFocus();
            }


            FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    int max = 29;
                    allscore[0] = max - (ii+vb1+vb2+vb3+vb4+
                            vb5+vb6+vb7+vb8+
                            vb9+vb10+vb11+vb12+
                            vb13+vb14+vb15+vb16+vb17+vb18+
                            vb19+vb20+vb21+vb22+vb23+vb24+
                            vb25+vb26+vb27+vb28+vb29);

                    ///// check edittext /////
                    if(vb1 == 0){
                        ed1.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed1.requestFocus();
                        String edt = ed1.getText().toString();
                        String dt = date1.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk1 = 1;
                        }
                        else
                        {
                            edchk1 = 0;
                        }
                    }
                    if(vb2 == 0){
                        ed2.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed2.requestFocus();
                        String edt = ed2.getText().toString();
                        String dt = date2.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk2 = 1;
                        }
                        else
                        {
                            edchk2 = 0;
                        }
                    }
                    if(vb3 == 0){
                        ed3.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed3.requestFocus();
                        String edt = ed3.getText().toString();
                        String dt = date3.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk3 = 1;
                        }
                        else
                        {
                            edchk3 = 0;
                        }
                    }
                    if(vb4 == 0){
                        ed4.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed4.requestFocus();
                        String edt = ed4.getText().toString();
                        String dt = date4.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk4 = 1;
                        }
                        else
                        {
                            edchk4 = 0;
                        }
                    }
                    if(vb5 == 0){
                        ed5.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed5.requestFocus();
                        String edt = ed5.getText().toString();
                        String dt = date5.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk5 = 1;
                        }
                        else
                        {
                            edchk5 = 0;
                        }
                    }
                    if(vb6 == 0){
                        ed6.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed6.requestFocus();
                        String edt = ed6.getText().toString();
                        String dt = date6.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk6 = 1;
                        }
                        else
                        {
                            edchk6 = 0;
                        }
                    }
                    if(vb7 == 0){
                        ed7.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed7.requestFocus();
                        String edt = ed7.getText().toString();
                        String dt = date7.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk7 = 1;
                        }
                        else
                        {
                            edchk7 = 0;
                        }
                    }
                    if(vb8 == 0){
                        ed8.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed8.requestFocus();
                        String edt = ed8.getText().toString();
                        String dt = date8.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk8 = 1;
                        }
                        else
                        {
                            edchk8 = 0;
                        }
                    }
                    if(vb9 == 0){
                        ed9.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed9.requestFocus();
                        String edt = ed9.getText().toString();
                        String dt = date9.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk9 = 1;
                        }
                        else
                        {
                            edchk9 = 0;
                        }
                    }
                    if(vb10 == 0){
                        ed10.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed10.requestFocus();
                        String edt = ed10.getText().toString();
                        String dt = date10.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk10 = 1;
                        }
                        else
                        {
                            edchk10 = 0;
                        }
                    }
                    if(vb11 == 0){
                        ed11.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed11.requestFocus();
                        String edt = ed11.getText().toString();
                        String dt = date11.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk11 = 1;
                        }
                        else
                        {
                            edchk11 = 0;
                        }
                    }
                    if(vb12 == 0){
                        ed12.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed12.requestFocus();
                        String edt = ed12.getText().toString();
                        String dt = date12.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk12 = 1;
                        }
                        else
                        {
                            edchk12 = 0;
                        }
                    }
                    if(vb13 == 0){
                        ed13.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed13.requestFocus();
                        String edt = ed13.getText().toString();
                        String dt = date13.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk13 = 1;
                        }
                        else
                        {
                            edchk13 = 0;
                        }
                    }
                    if(vb14 == 0){
                        ed14.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed14.requestFocus();
                        String edt = ed14.getText().toString();
                        String dt = date14.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk14 = 1;
                        }
                        else
                        {
                            edchk14 = 0;
                        }
                    }
                    if(vb15 == 0){
                        ed15.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed15.requestFocus();
                        String edt = ed15.getText().toString();
                        String dt = date15.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk15 = 1;
                        }
                        else
                        {
                            edchk15 = 0;
                        }
                    }
                    if(vb16 == 0){
                        ed16.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed16.requestFocus();
                        String edt = ed16.getText().toString();
                        String dt = date16.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk16 = 1;
                        }
                        else
                        {
                            edchk16 = 0;
                        }
                    }
                    if(vb17 == 0){
                        ed17.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed17.requestFocus();
                        String edt = ed17.getText().toString();
                        String dt = date17.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk17 = 1;
                        }
                        else
                        {
                            edchk17 = 0;
                        }
                    }
                    if(vb18 == 0){
                        ed18.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed18.requestFocus();
                        String edt = ed18.getText().toString();
                        String dt = date18.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk18 = 1;
                        }
                        else
                        {
                            edchk18 = 0;
                        }
                    }
                    if(vb19 == 0){
                        ed19.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed19.requestFocus();
                        String edt = ed19.getText().toString();
                        String dt = date19.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk19 = 1;
                        }
                        else
                        {
                            edchk19 = 0;
                        }
                    }
                    if(vb20 == 0){
                        ed20.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed20.requestFocus();
                        String edt = ed20.getText().toString();
                        String dt = date20.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk20 = 1;
                        }
                        else
                        {
                            edchk20 = 0;
                        }
                    }
                    if(vb21 == 0){
                        ed21.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed21.requestFocus();
                        String edt = ed21.getText().toString();
                        String dt = date21.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk21 = 1;
                        }
                        else
                        {
                            edchk21 = 0;
                        }
                    }
                    if(vb22 == 0){
                        ed22.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed22.requestFocus();
                        String edt = ed22.getText().toString();
                        String dt = date22.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk22 = 1;
                        }
                        else
                        {
                            edchk22 = 0;
                        }
                    }
                    if(vb23 == 0){
                        ed23.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed23.requestFocus();
                        String edt = ed23.getText().toString();
                        String dt = date23.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk23 = 1;
                        }
                        else
                        {
                            edchk23 = 0;
                        }
                    }
                    if(vb24 == 0){
                        ed24.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed24.requestFocus();
                        String edt = ed24.getText().toString();
                        String dt = date24.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk24 = 1;
                        }
                        else
                        {
                            edchk24 = 0;
                        }
                    }
                    if(vb25 == 0){
                        ed25.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed25.requestFocus();
                        String edt = ed25.getText().toString();
                        String dt = date25.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk25 = 1;
                        }
                        else
                        {
                            edchk25 = 0;
                        }
                    }
                    if(vb26 == 0){
                        ed26.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed26.requestFocus();
                        String edt = ed26.getText().toString();
                        String dt = date26.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk26 = 1;
                        }
                        else
                        {
                            edchk26 = 0;
                        }
                    }
                    if(vb27 == 0){
                        ed27.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed27.requestFocus();
                        String edt = ed27.getText().toString();
                        String dt = date27.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk27 = 1;
                        }
                        else
                        {
                            edchk27 = 0;
                        }
                    }
                    if(vb28 == 0){
                        ed28.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed28.requestFocus();
                        String edt = ed28.getText().toString();
                        String dt = date28.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk28 = 1;
                        }
                        else
                        {
                            edchk28 = 0;
                        }
                    }
                    if(vb29 == 0){
                        ed29.setError("กรุณาข้อมูลให้ครบถ้วน");
                        ed29.requestFocus();
                        String edt = ed29.getText().toString();
                        String dt = date29.getText().toString();
                        if(edt.matches("") || dt.matches("เลือกวันที่")){
                            edchk29 = 1;
                        }
                        else
                        {
                            edchk29 = 0;
                        }
                    }


                    /// check vg = 1///
                    if(vb1 == 1){
                        edchk1 = 0;
                    }
                    if(vb2 == 1){
                        edchk2 = 0;
                    }
                    if(vb3 == 1){
                        edchk3 = 0;
                    }
                    if(vb4 == 1){
                        edchk4 = 0;
                    }
                    if(vb5 == 1){
                        edchk5 = 0;
                    }
                    if(vb6 == 1){
                        edchk6 = 0;
                    }
                    if(vb7 == 1){
                        edchk7 = 0;
                    }
                    if(vb8 == 1){
                        edchk8 = 0;
                    }
                    if(vb9 == 1){
                        edchk9 = 0;
                    }
                    if(vb10 == 1){
                        edchk10 = 0;
                    }
                    if(vb11 == 1){
                        edchk11 = 0;
                    }
                    if(vb12 == 1){
                        edchk12 = 0;
                    }
                    if(vb13 == 1){
                        edchk13 = 0;
                    }
                    if(vb14 == 1){
                        edchk14 = 0;
                    }
                    if(vb15 == 1){
                        edchk15 = 0;
                    }
                    if(vb16 == 1){
                        edchk16 = 0;
                    }
                    if(vb17 == 1){
                        edchk17 = 0;
                    }
                    if(vb18 == 1){
                        edchk18 = 0;
                    }
                    if(vb19 == 1){
                        edchk19 = 0;
                    }
                    if(vb20 == 1){
                        edchk20 = 0;
                    }
                    if(vb21 == 1){
                        edchk21 = 0;
                    }
                    if(vb22 == 1){
                        edchk22 = 0;
                    }
                    if(vb23 == 1){
                        edchk23 = 0;
                    }
                    if(vb24 == 1){
                        edchk24 = 0;
                    }
                    if(vb25 == 1){
                        edchk25 = 0;
                    }
                    if(vb26 == 1){
                        edchk26 = 0;
                    }
                    if(vb27 == 1){
                        edchk27 = 0;
                    }
                    if(vb28 == 1){
                        edchk28 = 0;
                    }
                    if(vb29 == 1){
                        edchk29 = 0;
                    }


                    int sumed = edchk1+edchk2+edchk3+edchk4+edchk5+edchk6+edchk7
                            +edchk8+edchk9+edchk10+edchk11+edchk12+edchk13+edchk14
                            +edchk15+edchk16+edchk17+edchk18+edchk19+edchk20+edchk21
                            +edchk22+edchk23+edchk24 +edchk25+edchk26+edchk27+edchk28+edchk29;


                    if(sumed >= 1){
                        Toast.makeText(getContext(),"กรุณากรอกข้อมูลให้ครบถ้วน",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        //Toast.makeText(getContext(),"score : = "+ allscore[0],Toast.LENGTH_SHORT).show();
                        String text[] = new String[40];

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
                        text[17] = ed18.getText().toString();
                        text[18] = ed19.getText().toString();
                        text[19] = ed20.getText().toString();
                        text[20] = ed21.getText().toString();
                        text[21] = ed22.getText().toString();
                        text[22] = ed23.getText().toString();
                        text[23] = ed24.getText().toString();
                        text[24] = ed25.getText().toString();
                        text[25] = ed26.getText().toString();
                        text[26] = ed27.getText().toString();
                        text[27] = ed28.getText().toString();
                        text[28] = ed29.getText().toString();



                        Integer point[] = new Integer[40];
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
                        point[17] = vb18;
                        point[18] = vb19;
                        point[19] = vb20;
                        point[20] = vb21;
                        point[21] = vb22;
                        point[22] = vb23;
                        point[23] = vb24;
                        point[24] = vb25;
                        point[25] = vb26;
                        point[26] = vb27;
                        point[27] = vb28;
                        point[28] = vb29;

                        String dd[] = new String[40];
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
                        dd[17] = date18.getText().toString();
                        dd[18] = date19.getText().toString();
                        dd[19] = date20.getText().toString();
                        dd[20] = date21.getText().toString();
                        dd[21] = date22.getText().toString();
                        dd[22] = date23.getText().toString();
                        dd[23] = date24.getText().toString();
                        dd[24] = date25.getText().toString();
                        dd[25] = date26.getText().toString();
                        dd[26] = date27.getText().toString();
                        dd[27] = date28.getText().toString();
                        dd[28] = date29.getText().toString();

                        try {

                            connectionSQL = new ConnectionSQL();

                            Connection con = connectionSQL.CONN();
                            for (int i = 0 ; i < 29 ;i++)
                            {
                                stmt = con.createStatement();
                                String commands = "update MAS_PJ_C " +
                                        "set POINT = '"+ point[i] +"',TOTAL_POINT = '"+score.getText().toString()+"" +
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
                            String commands = "update MAS_PJ_REPORT_C " +
                                    "set COUNTEDIT = '"+allscore[0]+"',TOTAL_POINT = '"+score.getText().toString()+"' " +
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

                }
            });
        }


        return v;
    }


}
