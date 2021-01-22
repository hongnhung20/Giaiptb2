package com.example.phuongtrinhbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GiaiPTBac2_2Layout extends AppCompatActivity {
    Button btnGiaiPT2,btnThoat2;
    EditText edtHesoa2,edtHesob2,edtHesoc2;
    double a, b, c, x1, x2;
 //   TextView txtketqua2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giai_p_t_bac2_2_layout);
        Anhxa();
        btnGiaiPT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String kq = "";

                    a = Double.parseDouble(edtHesoa2.getText().toString());
                    b = Double.parseDouble(edtHesob2.getText().toString());
                    c = Double.parseDouble(edtHesoc2.getText().toString());
                    double delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        kq = "Vô nghiệm";
                        //                      txtketqua1.setText("Vô nghiệm");
                    } else if (delta == 0) {
                        x1 = x2 = -b / (2 * a);
                        kq = "X1 = X2 = " + x1;
                        //                      txtketqua1.setText("X1 = X2 = " + x1);
                    } else {
                        delta = Math.sqrt(delta);
                        x1 = (-b + delta) / (2 * a);
                        x2 = (-b - delta) / (2 * a);
                        kq = "X1 = " + (double) Math.round(x1 * 1000) / 1000 + " và X2 = " + (double) Math.round(x2 * 1000) / 1000;
                        //                       txtketqua1.setText("X1 = " + (double) Math.round(x1 * 1000) / 1000 + " và X2 = " + (double) Math.round(x2 * 1000) / 1000);
                    }
                    Intent intent = new Intent(getApplicationContext(), KetquaPT.class);
                    intent.putExtra("Ketqua",kq);
                    startActivity(intent);
                }catch (Exception ex1)
                {
                    Intent intent = new Intent(getApplicationContext(),KetquaPT.class);
                    intent.putExtra("Ketqua","Chưa nhập hệ số");
                    startActivity(intent);
                }
            }
        });
        btnThoat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void Anhxa()
    {
        btnGiaiPT2 = (Button) findViewById(R.id.buttonGiaiPT2);
        btnThoat2 = (Button) findViewById(R.id.buttondongud2);
        edtHesoa2 = (EditText) findViewById(R.id.editTextTextHesoa2);
        edtHesob2 = (EditText) findViewById(R.id.editTextTextHesob2);
        edtHesoc2 = (EditText) findViewById(R.id.editTextTextHesoc2);
//        txtketqua2 = (TextView) findViewById(R.id.textViewketqua1);
    }
}