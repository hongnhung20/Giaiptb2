package com.example.phuongtrinhbac2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btnThoat;
 //   TextView tvketqua;
 //   EditText hesoa,hesob,hesoc;
//    double a, b, c, x1, x2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();

//        giaiPT.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String kq="";
//                try {
//                    a = Double.parseDouble(hesoa.getText().toString());
//                    b = Double.parseDouble(hesob.getText().toString());
//                    c = Double.parseDouble(hesoc.getText().toString());
//                    double delta = b * b - 4 * a * c;
//                    if (delta < 0) {
//                        kq="Vô nghiệm";
//                        tvketqua.setText("Vô nghiệm");
//                    } else if (delta == 0) {
//                        x1 = x2 = -b / (2 * a);
//                        kq="X1 = X2 = " + x1;
//                        tvketqua.setText("X1 = X2 = " + x1);
//                    } else {
//                        delta = Math.sqrt(delta);
//                        x1 = (-b + delta) / (2 * a);
//                        x2 = (-b - delta) / (2 * a);
//                        kq="X1 = " + (double) Math.round(x1 * 1000) / 1000 + " và X2 = " + (double) Math.round(x2 * 1000) / 1000;
//                        tvketqua.setText("X1 = " + (double) Math.round(x1 * 1000) / 1000 + " và X2 = " + (double) Math.round(x2 * 1000) / 1000);
//                    }
//                    Intent intent = new Intent(MainActivity.this,KetquaPT.class);
//                    intent.putExtra("Ketqua",kq);
//                    startActivity(intent);
//                }catch (Exception ex)
//                {
//                    Intent intent = new Intent(MainActivity.this,KetquaPT.class);
//                    intent.putExtra("Ketqua","Chưa nhập hệ số");
//                    startActivity(intent);
//                }
//
//            }
//        });
//        NhapHS.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent = new Intent(MainActivity.this, NhaphesoActivity.class);
//                    intent.putExtra("hesoa", hesoa.getText().toString());
//                    intent.putExtra("hesob", hesob.getText().toString());
//                    intent.putExtra("hesoc", hesoc.getText().toString());
//                    startActivityForResult(intent, 1);
//                }catch (Exception ex)
//                {
//
//                }
//            }
//        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GiaiPTBac2_1Layout.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(getApplicationContext(),GiaiPTBac2_2Layout.class);
                    startActivity(intent);
                }
                catch (Exception ex)
                {

                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GiaiPTBac2_3Layout.class);
                startActivity(intent);
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    void Anhxa()
    {
        btnThoat = (Button) findViewById(R.id.buttondongud);
        btn1 = (Button) findViewById(R.id.buttononeLayout);
        btn2 = (Button) findViewById(R.id.buttonTwoLayout);
        btn3 = (Button) findViewById(R.id.buttonThreeLayout);
        //giaiPT = (Button) findViewById(R.id.buttonGiaiPT);
        //NhapHS = (Button) findViewById(R.id.buttonNhapHS);
        //tvketqua = (TextView) findViewById(R.id.textViewKetqua);
        //hesoa = (EditText) findViewById(R.id.editTextTextHesoa);
        //hesob = (EditText) findViewById(R.id.editTextTextHesob);
        //hesoc = (EditText) findViewById(R.id.editTextTextHesoc);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1)
        {
            if(resultCode==RESULT_OK)
            {
                //hesoa.setText(data.getStringExtra("hsa"));
                //hesob.setText(data.getStringExtra("hsb"));
                //hesoc.setText(data.getStringExtra("hsc"));
            }
        }
    }
}
