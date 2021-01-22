package com.example.phuongtrinhbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GiaiPTBac2_1Layout extends AppCompatActivity {
    Button btnGiaiPT1,btnThoat1;
    EditText edtHesoa1,edtHesob1,edtHesoc1;
    double a, b, c, x1, x2;
    TextView txtketqua1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giai_p_t_bac2_1_layout);
        Anhxa();
        btnThoat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnGiaiPT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kq="";
                try {
                    a = Double.parseDouble(edtHesoa1.getText().toString());
                    b = Double.parseDouble(edtHesob1.getText().toString());
                    c = Double.parseDouble(edtHesoc1.getText().toString());
                    double delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        kq = "Vô nghiệm";
                        txtketqua1.setText("Vô nghiệm");
                    } else if (delta == 0) {
                        x1 = x2 = -b / (2 * a);
                        kq = "X1 = X2 = " + x1;
                        txtketqua1.setText("X1 = X2 = " + x1);
                    } else {
                        delta = Math.sqrt(delta);
                        x1 = (-b + delta) / (2 * a);
                        x2 = (-b - delta) / (2 * a);
                        kq = "X1 = " + (double) Math.round(x1 * 1000) / 1000 + " và X2 = " + (double) Math.round(x2 * 1000) / 1000;
                        txtketqua1.setText("X1 = " + (double) Math.round(x1 * 1000) / 1000 + " và X2 = " + (double) Math.round(x2 * 1000) / 1000);
                    }
                }catch (Exception ex)
                {

                }
            }
        });


    }
    public void Anhxa()
    {
        btnGiaiPT1 = (Button) findViewById(R.id.buttonGiaiPT1);
        btnThoat1 = (Button) findViewById(R.id.buttondongud1);
        edtHesoa1 = (EditText) findViewById(R.id.editTextTextHesoa1);
        edtHesob1 = (EditText) findViewById(R.id.editTextTextHesob1);
        edtHesoc1 = (EditText) findViewById(R.id.editTextTextHesoc1);
        txtketqua1 = (TextView) findViewById(R.id.textViewketqua1);
    }

}