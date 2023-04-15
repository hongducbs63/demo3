package com.example.demo3bottom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.demo3bottom.adapter.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private BottomNavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        navigationView =findViewById(R.id.navigation);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),3);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:navigationView.getMenu().findItem(R.id.mDanhSach).setChecked(true);
                    break;
                    case 1: navigationView.getMenu().findItem(R.id.mThongtin).setChecked(true);
                    break;
                    case 2: navigationView.getMenu().findItem(R.id.mTimkiem).setChecked(true);
                    break;

                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mDanhSach:viewPager.setCurrentItem(0);
                        break;
                    case R.id.mThongtin: viewPager.setCurrentItem(1);
                    break;
                    case R.id.mTimkiem: viewPager.setCurrentItem(2);
                    break;
                }

                return true;
            }
        });
    }
}