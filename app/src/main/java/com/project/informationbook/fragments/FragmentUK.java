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

public class FragmentUK extends Fragment {
    public static FragmentUK newInstance() {
        return new FragmentUK();
    }

    private ImageView imageViewUK;
    private ProgressBar progressBarUK;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_uk,container,false);

        imageViewUK = view.findViewById(R.id.imageViewUK);
        progressBarUK= view.findViewById(R.id.progressBarUK);

        Picasso.get().load("https://mcdn.wallpapersafari.com/medium/88/54/IMQf5C.png").into(imageViewUK, new Callback() {
            @Override
            public void onSuccess() {
                progressBarUK.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarUK.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
