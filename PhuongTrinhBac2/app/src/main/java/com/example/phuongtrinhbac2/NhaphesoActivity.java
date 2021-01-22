package com.example.phuongtrinhbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NhaphesoActivity extends AppCompatActivity {
    Button Nhap;
    EditText soa,sob,soc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhapheso);
        Nhap = (Button) findViewById(R.id.buttonNhap);
        soa = (EditText) findViewById(R.id.editTextTextHsa);
        sob = (EditText) findViewById(R.id.editTextTextHsb);
        soc = (EditText) findViewById(R.id.editTextTextHsc);
        Intent intent = getIntent();
        soa.setText(intent.getStringExtra("hesoa"));
        sob.setText(intent.getStringExtra("hesob"));
        soc.setText(intent.getStringExtra("hesoc"));
        Nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ResultIntent = new Intent();
                ResultIntent.putExtra("hsa",soa.getText().toString());
                ResultIntent.putExtra("hsb",sob.getText().toString());
                ResultIntent.putExtra("hsc",soc.getText().toString());
                setResult(RESULT_OK,ResultIntent);
                finish();
            }
        });
    }
}