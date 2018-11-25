package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter
{
    public CategoryAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch(position)
        {
            case 0:
                fragment = new ColorsFragment();
                break;

            case 1:
                fragment = new FamilyFragment();
                break;

            case 2:
                fragment = new NumbersFragment();
                break;

            case 3:
                fragment = new PhrasesFragment();
                break;

            default:
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
