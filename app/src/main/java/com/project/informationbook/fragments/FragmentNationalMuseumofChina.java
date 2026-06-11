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

public class FragmentNationalMuseumofChina extends Fragment {
    public static FragmentNationalMuseumofChina newInstance() {
        return new FragmentNationalMuseumofChina();
    }

    private ImageView imageViewMuseumofChina;
    private ProgressBar progressBarMuseumofChina;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_museumofchina,container,false);

        imageViewMuseumofChina = view.findViewById(R.id.imageViewMuseumofChina);
        progressBarMuseumofChina = view.findViewById(R.id.progressBarMuseumofChina);

        Picasso.get().load("https://ak-d.tripcdn.com/images/0102y12000hxkc5n61AF4_W_1440_810_Q80.webp?proc=source%2ftrip").into(imageViewMuseumofChina, new Callback() {
            @Override
            public void onSuccess() {
                progressBarMuseumofChina.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarMuseumofChina.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
