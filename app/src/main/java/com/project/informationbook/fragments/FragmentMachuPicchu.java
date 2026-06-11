package com.project.informationbook.fragments;

import static android.view.View.INVISIBLE;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.project.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentMachuPicchu extends Fragment {
    public static FragmentMachuPicchu newInstance() {
        return new FragmentMachuPicchu();
    }

    private ImageView imageViewMachuPicchu;
    private ProgressBar progressBarMachuPicchu;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_machupicchu,container,false);

        imageViewMachuPicchu = view.findViewById(R.id.imageViewMachuPicchu);
        progressBarMachuPicchu = view.findViewById(R.id.progressBarMachuPicchu);

        Picasso.get().load("https://cdn.mos.cms.futurecdn.net/WFJBpzs4J5x3uvbeKdnm3i-1280-80.jpg.webp").into(imageViewMachuPicchu, new Callback() {
            @Override
            public void onSuccess() {
                progressBarMachuPicchu.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarMachuPicchu.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
