package com.scare_book.history;




import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.scare_book.R;

public class HistoryDur01 extends AppCompatActivity implements View.OnClickListener {

    public static int a;
    TextView nameHist, viewHist;
    LinearLayout scrollHist;
    private ScrollView mScrollContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_dur01);

        scrollHist = findViewById(R.id.scroll_hist);
        nameHist = findViewById(R.id.name_hist);
        nameHist.setOnClickListener(this);

        viewHist = findViewById(R.id.view_hist);


        mScrollContainer = findViewById(R.id.scroll_container);



    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.name_hist:
                a = 1;
                Intent intent = new Intent(HistoryDur01.this, HistoryShow.class);

                startActivity(intent);


            break;
        }
    }
}