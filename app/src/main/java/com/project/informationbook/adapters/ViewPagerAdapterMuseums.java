package com.project.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.project.informationbook.fragments.FragmentBritishMuseum;
import com.project.informationbook.fragments.FragmentLouvre;
import com.project.informationbook.fragments.FragmentMetropolitanMuseum;
import com.project.informationbook.fragments.FragmentNationalMuseumofChina;
import com.project.informationbook.fragments.FragmentVaticanMuseums;

public class ViewPagerAdapterMuseums extends FragmentStateAdapter {
    public ViewPagerAdapterMuseums(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager,lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = FragmentLouvre.newInstance();
                break;
            case 1:
                fragment = FragmentNationalMuseumofChina.newInstance();
                break;
            case 2:
                fragment = FragmentVaticanMuseums.newInstance();
                break;
            case 3:
                fragment = FragmentBritishMuseum.newInstance();
                break;
            case 4:
                fragment = FragmentMetropolitanMuseum.newInstance();
                break;
            default:
                return null;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
