package com.scare_book.history;




import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.scare_book.R;

public class HistoryDur01 extends AppCompatActivity implements View.OnClickListener {

    public static int a;
    //TextView nameHist1,nameHist2,nameHist3,nameHist4,nameHist5,nameHist6,nameHist7,nameHist8,nameHist9,nameHist10,nameHist11,nameHist12;
    Intent intent = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_dur01);

        /*nameHist1 = findViewById(R.id.name_hist1);
        nameHist1.setOnClickListener(this);
        nameHist2 = findViewById(R.id.name_hist2);
        nameHist2.setOnClickListener(this);
        nameHist3 = findViewById(R.id.name_hist3);
        nameHist3.setOnClickListener(this);
        nameHist4 = findViewById(R.id.name_hist4);
        nameHist4.setOnClickListener(this);
        nameHist5 = findViewById(R.id.name_hist5);
        nameHist5.setOnClickListener(this);
        nameHist6 = findViewById(R.id.name_hist6);
        nameHist6.setOnClickListener(this);
        nameHist7 = findViewById(R.id.name_hist7);
        nameHist7.setOnClickListener(this);
        nameHist8 = findViewById(R.id.name_hist8);
        nameHist8.setOnClickListener(this);
        nameHist9 = findViewById(R.id.name_hist9);
        nameHist9.setOnClickListener(this);
        nameHist10 = findViewById(R.id.name_hist10);
        nameHist10.setOnClickListener(this);
        nameHist11 = findViewById(R.id.name_hist11);
        nameHist11.setOnClickListener(this);
        nameHist12 = findViewById(R.id.name_hist12);
        nameHist12.setOnClickListener(this);*/
        LinearLayout group = findViewById(R.id.but_container);
        View v;
        for(int i = 0; i < group.getChildCount(); i++) {
            v = group.getChildAt(i);
            if(v instanceof TextView) v.setOnClickListener(this);
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.name_hist1:
                a = 1;
                intent = new Intent(HistoryDur01.this, HistoryShow.class);
                startActivity(intent);
            break;
            case R.id.name_hist2:
                a = 2;
                intent = new Intent(HistoryDur01.this, HistoryShow.class);
                startActivity(intent);
                break;
            case R.id.name_hist3:
                a = 3;
               intent = new Intent(HistoryDur01.this, HistoryShow.class);
                startActivity(intent);
                break;
            case R.id.name_hist4:
                a = 4;
                intent = new Intent(HistoryDur01.this, HistoryShow.class);
                startActivity(intent);
                break;
            case R.id.name_hist5:
                a = 5;
                intent = new Intent(HistoryDur01.this, HistoryShow.class);
                startActivity(intent);
                break;
            case R.id.name_hist6:
                a = 6;
                intent = new Intent(HistoryDur01.this, HistoryShow.class);
                startActivity(intent);
                break;
            case R.id.name_hist7:
                a = 7;
                intent = new Intent(HistoryDur01.this, HistoryShow.class);
                startActivity(intent);
                break;
            case R.id.name_hist8:
                a = 8;
                intent = new Intent(HistoryDur01.this, HistoryShow.class);
                startActivity(intent);
                break;
            case R.id.name_hist9:
                a = 9;
                intent = new Intent(HistoryDur01.this, HistoryShow.class);
                startActivity(intent);
                break;
            case R.id.name_hist10:
                a = 10;
               intent = new Intent(HistoryDur01.this, HistoryShow.class);
                startActivity(intent);
                break;
            case R.id.name_hist11:
                a = 11;
                intent = new Intent(HistoryDur01.this, HistoryShow.class);
                startActivity(intent);
                break;
            case R.id.name_hist12:
                a = 12;
                intent = new Intent(HistoryDur01.this, HistoryShow.class);
                startActivity(intent);
                break;

        }
    }
}