package com.example.androidhormwork77;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class OnBoardActivity extends AppCompatActivity {

    private ViewPAger boardPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);

        // fill list board

        List<OnBoardActivity> mList = new ArrayList<>();
        mList.add(new OnBoardModel("Smart Wallet", "Managing your money can be the easiest thing eou do all day",R.drawable.img1));
        mList.add(new OnBoardModel("Effortless Budgeting", "Customize your budget categories and stay on top of your spending 24/7.",R.drawable.img3));
        mList.add(new OnBoardModel("Automatic Savings", "Set your savings goal and let Empower figure out how out how to get eoub there",R.drawable.imga3));


        // setup viewpager
        boardPager = findViewById(R.id.vp_onboard);
        viewPagerAdapter = new ViewPagerAdapter(this,mList);

    }
}