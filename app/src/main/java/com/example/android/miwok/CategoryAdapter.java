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

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;

        switch (position)
        {
            case 0:
                title = "Colors";
                break;

            case 1:
                title = "Family";
                break;

            case 2:
                title = "Numbers";
                break;

            case 3:
                title = "Phrases";
                break;

            default:
                break;
        }

        return title;
    }
}
