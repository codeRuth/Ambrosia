package com.coderuth.ambrosia.ambrosia;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;

import com.coderuth.ambrosia.ambrosia.fragment.HomeFragment;
import com.coderuth.ambrosia.ambrosia.fragment.ProfileFragment;
import com.coderuth.ambrosia.ambrosia.fragment.SettingsFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private static int TAB_COUNT = 3;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return HomeFragment.newInstance();
            case 1:
                return ProfileFragment.newInstance();
            case 2:
                return SettingsFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return HomeFragment.TITLE;
            case 1:
                return ProfileFragment.TITLE;
            case 2:
                return SettingsFragment.TITLE;
        }
        return super.getPageTitle(position);
    }
}