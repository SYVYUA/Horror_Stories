package com.scare_book;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.scare_book.duration.ListDuration;
import com.scare_book.for_gift.Gift;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleMenu circleMenu = findViewById(R.id.cirlemenu);
        circleMenu.setMainMenu(Color.parseColor("#e69900"),R.drawable.add,R.drawable.cancel)
                .addSubMenu(Color.parseColor("#990033"),R.drawable.chrome)
                .addSubMenu(Color.parseColor("#deff97"),R.drawable.drive)
                .addSubMenu(Color.parseColor("#837373"),R.drawable.glasess)
                .addSubMenu(Color.parseColor("#ffc0cb"),R.drawable.google_plus)
                .addSubMenu(Color.parseColor("#666666"),R.drawable.play_market)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int i) {
                        Intent intent = null;
                        if(i == 0){
                        intent = new Intent(MainActivity.this, ListDuration.class);
                        startActivity(intent);
                        } else if (i == 1){
                        intent = new Intent(MainActivity.this, Gift.class);
                        startActivity(intent);
                        }
                    }
                });

    }
}
