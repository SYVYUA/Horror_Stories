package com.scare_book.for_gift;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.scare_book.R;
import com.scare_book.duration.ListDuration;



public class Gift extends AppCompatActivity{

    FloatingActionButton bax1,bax2,bax3,bax4,bax5,moneyBut;
    boolean isFABOpen;
    Intent intent = null;


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
                    bax1.setEnabled(true);
                    bax1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            intent = new Intent(Gift.this, ListDuration.class);
                            startActivity(intent);
                            closeFABMenu();
                        }
                    });
                }else{
                    closeFABMenu();
                    bax1.setEnabled(false);
                    bax2.setEnabled(false);
                    bax3.setEnabled(false);
                    bax4.setEnabled(false);
                    bax5.setEnabled(false);

                }
            }

        });

    }

    private void showFABMenu(){
        isFABOpen = true;
        //позиції щодо головної кнопки
        bax1.animate().translationX(-getResources().getDimension(R.dimen.standard_110));
        bax3.animate().translationX(-getResources().getDimension(R.dimen.standard_55));
        bax3.animate().translationY(-getResources().getDimension(R.dimen.standard_55));
        bax5.animate().translationY(-getResources().getDimension(R.dimen.standard_110));
        bax4.animate().translationX(+getResources().getDimension(R.dimen.standard_55));
        bax4.animate().translationY(-getResources().getDimension(R.dimen.standard_55));
        bax2.animate().translationX(+getResources().getDimension(R.dimen.standard_110));
    }


    private void closeFABMenu(){
        isFABOpen=false;
        //ховається все в одну
        bax1.animate().translationX(0);
        bax2.animate().translationX(0);
        bax3.animate().translationX(0).translationY(0);
        bax4.animate().translationX(0).translationY(0);
        bax5.animate().translationY(0);

    }
}
