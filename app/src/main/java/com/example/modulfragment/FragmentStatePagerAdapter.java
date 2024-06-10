package com.example.modulfragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public abstract class FragmentStatePagerAdapter {
    public FragmentStatePagerAdapter(FragmentManager fm) {
    }

    public abstract Fragment getItem(int position);

    public abstract int getCount();
}
