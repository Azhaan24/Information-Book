package com.project.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.project.informationbook.fragments.FragmentFrance;
import com.project.informationbook.fragments.FragmentGermany;
import com.project.informationbook.fragments.FragmentItaly;
import com.project.informationbook.fragments.FragmentRussia;
import com.project.informationbook.fragments.FragmentTurkiye;
import com.project.informationbook.fragments.FragmentUK;

public class ViewPagerAdapterCountry extends FragmentStateAdapter {
    public ViewPagerAdapterCountry(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager,lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = FragmentUK.newInstance();
                break;
            case 1:
                fragment = FragmentFrance.newInstance();
                break;
            case 2:
               fragment = FragmentItaly.newInstance();
                break;
            case 3:
                fragment = FragmentTurkiye.newInstance();
                break;
            case 4:
                fragment = FragmentGermany.newInstance();
                break;
            case 5:
                fragment = FragmentRussia.newInstance();
                break;
            default:
                return null;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
