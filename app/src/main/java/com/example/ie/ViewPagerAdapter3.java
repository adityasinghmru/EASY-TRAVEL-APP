package com.example.ie;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter3 extends FragmentPagerAdapter {
    int tabcount;
    public ViewPagerAdapter3(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

        tabcount=behavior;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return new hp1_fragment();

            case 1:
                return new hp2_fragment();

            default:
                return null;



        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
