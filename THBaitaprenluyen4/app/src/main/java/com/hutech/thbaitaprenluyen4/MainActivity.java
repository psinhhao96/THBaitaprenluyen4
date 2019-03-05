package com.hutech.thbaitaprenluyen4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNamDuong;
    TextView txtNamAm;
    Button btnChuyenDoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyChuyenDuongQuaAm();
            }
        });
    }

    private void xuLyChuyenDuongQuaAm() {
        String []arrCan = {"Canh","Tân","Nhâm","Quý","Ất","Giáp", "Bính","Đinh","Mậu", "Kỷ"};
        String []arrChi = {"Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mẹo", "Thìn", "Tỵ", "Ngọ", "Mùi"};
        int namDuong = Integer.parseInt(edtNamDuong.getText().toString());
        String can = arrCan[namDuong%10];
        String chi = arrChi[namDuong%12];
        txtNamAm.setText(can + "" + chi);
    }

    private void addControls() {
        edtNamDuong = findViewById(R.id.edtNamDL);
        txtNamAm = findViewById(R.id.txtChuyenDoi);
        btnChuyenDoi = findViewById(R.id.btnChuyenDoi);
    }

    public void event(){
        
    }
}
