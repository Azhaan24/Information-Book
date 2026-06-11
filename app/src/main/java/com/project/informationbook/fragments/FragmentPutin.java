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

public class FragmentPutin extends Fragment {
    public static FragmentPutin newInstance() {
        return new FragmentPutin();
    }

    private ImageView imageViewPutin;
    private ProgressBar progressBarPutin;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_putin,container,false);

        imageViewPutin = view.findViewById(R.id.imageViewPutin);
        progressBarPutin = view.findViewById(R.id.progressBarPutin);

        Picasso.get().load("https://media.cnn.com/api/v1/images/stellar/prod/2025-12-02t171119z-389173798-rc2h8iaahpg9-rtrmadp-3-ukraine-crisis-putin-witkoff.JPG?c=original&q=w_860,c_fill/f_avif").into(imageViewPutin, new Callback() {
            @Override
            public void onSuccess() {
                progressBarPutin.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarPutin.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
