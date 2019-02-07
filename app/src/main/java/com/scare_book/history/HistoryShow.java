package com.scare_book.history;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ScrollView;
import android.widget.TextView;

import com.scare_book.R;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;
import static com.scare_book.history.HistoryDur01.a;

public class HistoryShow extends AppCompatActivity {
    TextView showHist;
    ScrollView scroll;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_history_show);
        scroll = findViewById(R.id.scroll_hist);
        showHist = findViewById(R.id.view_hist);
        //выравнивение
        showHist.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);

        switch (a){
            case 1:
                showHist.setText(R.string.hist_1);
                break;
            case 2:
                showHist.setText(R.string.hist_2);
                break;
            case 3:
                showHist.setText(R.string.hist_3);
                break;
            case 4:
                showHist.setText(R.string.hist_4);
                break;
            case 5:
                showHist.setText(R.string.hist_5);
                break;
            case 6:
                showHist.setText(R.string.hist_6);
                break;
            case 7:
                showHist.setText(R.string.hist_7);
                break;
            case 8:
                showHist.setText(R.string.hist_8);
                break;
            case 9:
                showHist.setText(R.string.hist_9);
                break;
            case 10:
                showHist.setText(R.string.hist_10);
                break;
            case 11:
                showHist.setText(R.string.hist_11);
                break;
            case 12:
                showHist.setText(R.string.hist_12);
                break;
        }




        }
    }
