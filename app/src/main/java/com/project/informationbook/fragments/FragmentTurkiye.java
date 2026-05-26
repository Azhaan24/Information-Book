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

public class FragmentTurkiye extends Fragment {
    public static FragmentTurkiye newInstance() {
        return new FragmentTurkiye();
    }

    private ImageView imageViewTurkey;
    private ProgressBar progressBarTurkey;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_turk,container,false);

        imageViewTurkey = view.findViewById(R.id.imageViewTurk);
        progressBarTurkey = view.findViewById(R.id.progressBarTurk);

        Picasso.get().load("https://images.unsplash.com/photo-1675669562515-e957c9ff436d?q=80&w=1074&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D").into(imageViewTurkey, new Callback() {
            @Override
            public void onSuccess() {
                progressBarTurkey.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarTurkey.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
