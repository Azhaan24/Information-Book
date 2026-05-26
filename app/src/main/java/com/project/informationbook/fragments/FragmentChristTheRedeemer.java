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

public class FragmentChristTheRedeemer extends Fragment {
    public static FragmentChristTheRedeemer newInstance() {
        return new FragmentChristTheRedeemer();
    }

    private ImageView imageViewChristTheRedeemer;
    private ProgressBar progressBarChristTheRedeemer;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_christtheredeemer,container,false);

        imageViewChristTheRedeemer = view.findViewById(R.id.imageViewChristtheRedeemer);
        progressBarChristTheRedeemer = view.findViewById(R.id.progressBarChristrtheRedeemer);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Christ_the_Redeemer_-_Cristo_Redentor.jpg/500px-Christ_the_Redeemer_-_Cristo_Redentor.jpg").into(imageViewChristTheRedeemer, new Callback() {
            @Override
            public void onSuccess() {
                progressBarChristTheRedeemer.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarChristTheRedeemer.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
