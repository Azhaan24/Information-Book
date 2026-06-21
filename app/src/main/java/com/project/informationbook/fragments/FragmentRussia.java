package com.project.informationbook.fragments;

import static android.view.View.INVISIBLE;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.project.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentRussia extends Fragment {
    public static FragmentRussia newInstance() {
        return new FragmentRussia();
    }

    private ImageView imageViewRussia;
    private ProgressBar progressBarRussia;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rus,container,false);
        ScrollView scrollView = view.findViewById(R.id.scrollViewRussia);
        ViewCompat.setOnApplyWindowInsetsListener(scrollView, (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(bars.left,bars.top,bars.right,bars.bottom);
            return insets;
        });

        imageViewRussia = view.findViewById(R.id.imageViewRussia);
        progressBarRussia = view.findViewById(R.id.progressBarRussia);

        Picasso.get().load("https://www.advantour.com/russia/images/symbolics/russia-flag.jpg").into(imageViewRussia, new Callback() {
            @Override
            public void onSuccess() {
                progressBarRussia.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarRussia.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
