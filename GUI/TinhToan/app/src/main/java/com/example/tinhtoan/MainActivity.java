package com.example.tinhtoan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edt_a, edt_b;
    TextView txt_kq;
    Button btn_tong;
    Button btn_hieu;
    Button btn_tich;
    Button btn_thuong;
    Button btn_ucln;
    Button btn_thoat;
    private void int1Control (){
        edt_a=findViewById(R.id.edt_a);
        edt_b=findViewById(R.id.edt_b);
        txt_kq=findViewById(R.id.txt_kq);
        btn_tong=findViewById(R.id.btn_tong);
        btn_tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                int x = Integer.parseInt(edt_a.getText().toString());
                int y = Integer.parseInt(edt_b.getText().toString());
                int result = x + y;
                txt_kq.setText(String.valueOf(result));
            }
        });
    }
    private void int2Control(){
        edt_a=findViewById(R.id.edt_a);
        edt_b=findViewById(R.id.edt_b);
        txt_kq=findViewById(R.id.txt_kq);
        btn_hieu=findViewById(R.id.btn_hieu);
        btn_hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                int x = Integer.parseInt(edt_a.getText().toString());
                int y = Integer.parseInt(edt_b.getText().toString());
                int result = x - y;
                txt_kq.setText(String.valueOf(result));
            }
        });
    }
    private void int3Control(){
        edt_a=findViewById(R.id.edt_a);
        edt_b=findViewById(R.id.edt_b);
        txt_kq=findViewById(R.id.txt_kq);
        btn_tich=findViewById(R.id.btn_tich);
        btn_tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                int x = Integer.parseInt(edt_a.getText().toString());
                int y = Integer.parseInt(edt_b.getText().toString());
                int result = x * y;
                txt_kq.setText(String.valueOf(result));
            }
        });
    }
    private void int4Control(){
        edt_a=findViewById(R.id.edt_a);
        edt_b=findViewById(R.id.edt_b);
        txt_kq=findViewById(R.id.txt_kq);
        btn_thuong=findViewById(R.id.btn_thuong);
        btn_thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = Integer.parseInt(edt_a.getText().toString());
                float y = Integer.parseInt(edt_b.getText().toString());
                float result = x / y;
                txt_kq.setText(String.valueOf(result));
            }
        });
    }
    private void int5Control(){
        edt_a=findViewById(R.id.edt_a);
        edt_b=findViewById(R.id.edt_b);
        txt_kq=findViewById(R.id.txt_kq);
        btn_ucln=findViewById(R.id.btn_ucln);
        btn_ucln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v5) {
                int x = Integer.parseInt(edt_a.getText().toString());
                int y = Integer.parseInt(edt_b.getText().toString());
                int result = findGCD(x, y);
                txt_kq.setText(String.valueOf(result));
            }
        });
    }
    private int findGCD(int a, int b) {
        // Thuật toán Euclid để tìm ƯCLN
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private void int6Control(){
        btn_thoat=findViewById(R.id.btn_thoat);
        btn_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v6) {
                finish();
            }
        });
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int1Control();
        int2Control();
        int3Control();
        int4Control();
        int5Control();
        int6Control();
    }
}
