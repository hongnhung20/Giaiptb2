package com.example.phuongtrinhbac2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GiaiPTBac2_3Layout extends AppCompatActivity {
    Button btnGiaiPT3,btnThoat3,btnNhap;
    EditText edtHesoa3,edtHesob3,edtHesoc3;
    double a, b, c, x1, x2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giai_p_t_bac2_3_layout);
        Anhxa();
        btnGiaiPT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String kq="";
                try {
                    a = Double.parseDouble(edtHesoa3.getText().toString());
                    b = Double.parseDouble(edtHesob3.getText().toString());
                    c = Double.parseDouble(edtHesoc3.getText().toString());
                    double delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        kq="Vô nghiệm";
                    } else if (delta == 0) {
                        x1 = x2 = -b / (2 * a);
                        kq="X1 = X2 = " + x1;
                    } else {
                        delta = Math.sqrt(delta);
                        x1 = (-b + delta) / (2 * a);
                        x2 = (-b - delta) / (2 * a);
                        kq="X1 = " + (double) Math.round(x1 * 1000) / 1000 + " và X2 = " + (double) Math.round(x2 * 1000) / 1000;
                    }
                    Intent intent = new Intent(getApplicationContext(),KetquaPT.class);
                    intent.putExtra("Ketqua",kq);
                    startActivity(intent);
                }catch (Exception ex)
                {
                    Intent intent = new Intent(getApplicationContext(),KetquaPT.class);
                    intent.putExtra("Ketqua","Chưa nhập hệ số");
                    startActivity(intent);
                }

            }
        });
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), NhaphesoActivity.class);
                    intent.putExtra("hesoa", edtHesoa3.getText().toString());
                    intent.putExtra("hesob", edtHesob3.getText().toString());
                    intent.putExtra("hesoc", edtHesoc3.getText().toString());
                    startActivityForResult(intent, 1);
                }catch (Exception ex)
                {

                }
            }
        });
        btnThoat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void Anhxa()
    {
        btnGiaiPT3 = (Button) findViewById(R.id.buttonGiaiPT3);
        btnThoat3 = (Button) findViewById(R.id.buttondongud3);
        edtHesoa3 = (EditText) findViewById(R.id.editTextTextHesoa3);
        edtHesob3 = (EditText) findViewById(R.id.editTextTextHesob3);
        edtHesoc3 = (EditText) findViewById(R.id.editTextTextHesoc3);
        btnNhap = (Button) findViewById(R.id.buttonNhapHS3);
//        txtketqua2 = (TextView) findViewById(R.id.textViewketqua1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1)
        {
            if(resultCode==RESULT_OK)
            {
                edtHesoa3.setText(data.getStringExtra("hsa"));
                edtHesob3.setText(data.getStringExtra("hsb"));
                edtHesoc3.setText(data.getStringExtra("hsc"));
            }
        }
    }
}