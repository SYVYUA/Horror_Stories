package com.scare_book.for_gift;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.scare_book.R;

public class Gift extends AppCompatActivity{
    FloatingActionButton bax1,bax2,bax3,bax4,bax5,moneyBut;
    boolean isFABOpen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift);

        moneyBut = findViewById(R.id.moneybutt);
        bax1 = findViewById(R.id.bax1);
        bax2 = findViewById(R.id.bax2);
        bax3 = findViewById(R.id.bax3);
        bax4 = findViewById(R.id.bax4);
        bax5 = findViewById(R.id.bax5);

        moneyBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isFABOpen){
                    showFABMenu();
                }else{
                    closeFABMenu();
                }
            }

        });

    }

    private void showFABMenu(){
        isFABOpen = true;
        bax1.animate().translationY(-getResources().getDimension(R.dimen.standard_55));
        bax2.animate().translationY(-getResources().getDimension(R.dimen.standard_105));
        bax3.animate().translationY(-getResources().getDimension(R.dimen.standard_155));
        //bax4.animate().translationY(-getResources().getDimension(R.dimen.standard_165));
        //bax5.animate().translationY(-getResources().getDimension(R.dimen.standard_175));
    }


    private void closeFABMenu(){
        isFABOpen=false;
        bax1.animate().translationY(0);
        bax2.animate().translationY(0);
        bax3.animate().translationY(0);
        bax4.animate().translationY(0);
        bax5.animate().translationY(0);

    }
}
