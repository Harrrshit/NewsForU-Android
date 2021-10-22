package com.example.newsforu;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int tab_count;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tab_count = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Homecontainer();

            case 1:
                return new Sportscontainer();

            case 2:
                return new Healthcontainer();

            case 3:
                return new Sciencefragment();

            case 4:
                return new Entertainmentcontainer();

            case 5:
                return new Techcontainer();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return tab_count;
    }
}
