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

public class FragmentItaly extends Fragment {
    public static FragmentItaly newInstance() {
        return new FragmentItaly();
    }

    private ImageView imageViewItaly;
    private ProgressBar progressBarItaly;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_italy,container,false);
        ScrollView scrollView = view.findViewById(R.id.scrollViewItaly);
        ViewCompat.setOnApplyWindowInsetsListener(scrollView, (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(bars.left,bars.top,bars.right,bars.bottom);
            return insets;
        });

        imageViewItaly = view.findViewById(R.id.imageViewItaly);
        progressBarItaly = view.findViewById(R.id.progressBarItaly);

        Picasso.get().load("https://www.worldatlas.com/r/w960-q80/upload/20/07/2a/shutterstock-152854481.jpg").into(imageViewItaly, new Callback() {
            @Override
            public void onSuccess() {
                progressBarItaly.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarItaly.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
