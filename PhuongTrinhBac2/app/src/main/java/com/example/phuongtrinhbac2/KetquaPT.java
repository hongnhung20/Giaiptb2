package com.example.phuongtrinhbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KetquaPT extends AppCompatActivity {
    Button thoat;
    TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketqua_p_t);
        thoat = (Button) findViewById(R.id.buttonThoat);
        kq = (TextView) findViewById(R.id.textViewkq);
        Intent intent=getIntent();
        String A=intent.getStringExtra("Ketqua");
        kq.setText(A);
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}