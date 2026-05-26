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

public class FragmentVaticanMuseums extends Fragment {
    public static FragmentVaticanMuseums newInstance() {
        return new FragmentVaticanMuseums();
    }

    private ImageView imageViewVaticanMuseums;
    private ProgressBar progressBarVaticanMuseums;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vaticanmuseum,container,false);

        imageViewVaticanMuseums = view.findViewById(R.id.imageViewVaticanMuseums);
        progressBarVaticanMuseums = view.findViewById(R.id.progressBarVaticanMuseums);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Museums_in_the_Vatican_City.jpg/960px-Museums_in_the_Vatican_City.jpg").into(imageViewVaticanMuseums, new Callback() {
            @Override
            public void onSuccess() {
                progressBarVaticanMuseums.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarVaticanMuseums.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
