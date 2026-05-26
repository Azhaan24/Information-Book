package com.project.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.project.informationbook.fragments.FragmentFrance;
import com.project.informationbook.fragments.FragmentGermany;
import com.project.informationbook.fragments.FragmentItaly;
import com.project.informationbook.fragments.FragmentPutin;
import com.project.informationbook.fragments.FragmentRussia;
import com.project.informationbook.fragments.FragmentTrump;
import com.project.informationbook.fragments.FragmentTurkiye;
import com.project.informationbook.fragments.FragmentUK;

public class ViewPagerAdapterLeaders extends FragmentStateAdapter {
    public ViewPagerAdapterLeaders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager,lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = FragmentTrump.newInstance();
                break;
            case 1:
                fragment = FragmentPutin.newInstance();
                break;
            default:
                return null;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
