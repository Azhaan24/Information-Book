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

public class FragmentPetra extends Fragment {
    public static FragmentPetra newInstance() {
        return new FragmentPetra();
    }

    private ImageView imageViewPetra;
    private ProgressBar progressBarPetra;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_petra,container,false);

        imageViewPetra = view.findViewById(R.id.imageViewPetra);
        progressBarPetra = view.findViewById(R.id.progressBarPetra);

        Picasso.get().load("https://cdn.britannica.com/24/153524-050-BA9D084B/Al-Dayr-Petra-Jordan.jpg").into(imageViewPetra, new Callback() {
            @Override
            public void onSuccess() {
                progressBarPetra.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarPetra.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
