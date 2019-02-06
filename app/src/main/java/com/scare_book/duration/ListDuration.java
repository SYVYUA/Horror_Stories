package com.scare_book.duration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.scare_book.R;
import com.scare_book.history.HistoryDur01;

public class ListDuration extends AppCompatActivity implements View.OnClickListener {

    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_duration);
        Button but_dur_0_1 = findViewById(R.id.button0_1);
        but_dur_0_1.setOnClickListener(this);
        Button but_dur_1_3 = findViewById(R.id.button1_3);
        Button but_dur_3_6 = findViewById(R.id.button3_6);
        Button but_dur_6_9 = findViewById(R.id.button6_9);
        Button but_dur_9_15 = findViewById(R.id.button9_15);
        Button but_dur_15_20 = findViewById(R.id.button15_20);
        Button but_dur_20_30 = findViewById(R.id.button20_30);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button0_1:
                intent = new Intent(ListDuration.this, HistoryDur01.class);
                startActivity(intent);
                break;
            case R.id.button1_3:
                intent = new Intent(ListDuration.this, HistoryDur01.class);
                startActivity(intent);
                break;
            case R.id.button3_6:
                intent = new Intent(ListDuration.this, HistoryDur01.class);
                startActivity(intent);
                break;
            case R.id.button6_9:
                intent = new Intent(ListDuration.this, HistoryDur01.class);
                startActivity(intent);
                break;
            case R.id.button9_15:
                intent = new Intent(ListDuration.this, HistoryDur01.class);
                startActivity(intent);
                break;
            case R.id.button15_20:
                intent = new Intent(ListDuration.this, HistoryDur01.class);
                startActivity(intent);
                break;
            case R.id.button20_30:
                intent = new Intent(ListDuration.this, HistoryDur01.class);
                startActivity(intent);
                break;
        }
    }
}
