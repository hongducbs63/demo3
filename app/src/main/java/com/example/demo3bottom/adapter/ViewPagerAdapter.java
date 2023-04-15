package com.example.demo3bottom.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.demo3bottom.fragment.FragmentInfo;
import com.example.demo3bottom.fragment.FragmentList;
import com.example.demo3bottom.fragment.FragmentSearch;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    int pageNum =3;
    public ViewPagerAdapter(@NonNull FragmentManager fm,int bihavior) {
        super(fm,bihavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new FragmentList();
            case 1:return new FragmentInfo();
            case 2:return new FragmentSearch();
            default: return new FragmentList();
        }
    }

    @Override
    public int getCount() {
        return pageNum;
    }
}
