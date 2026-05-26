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

public class FragmentTrump extends Fragment {
    public static FragmentTrump newInstance() {
        return new FragmentTrump();
    }

    private ImageView imageViewTrump;
    private ProgressBar progressBarTrump;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trump,container,false);

        imageViewTrump = view.findViewById(R.id.imageViewTrump);
        progressBarTrump = view.findViewById(R.id.progressBarTrump);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/Official_Presidential_Portrait_of_President_Donald_J._Trump_%282025%29_%28cropped%29%282%29.jpg/960px-Official_Presidential_Portrait_of_President_Donald_J._Trump_%282025%29_%28cropped%29%282%29.jpg").into(imageViewTrump, new Callback() {
            @Override
            public void onSuccess() {
                progressBarTrump.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarTrump.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
