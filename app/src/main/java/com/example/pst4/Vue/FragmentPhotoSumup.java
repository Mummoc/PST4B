package com.example.pst4.Vue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.pst4.CarPictureAdapter;
import com.example.pst4.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentPhotoSumup extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_sumup, container, false);
        GridView gridView = view.findViewById(R.id.grid_view);

        gridView.setAdapter(new CarPictureAdapter(getContext()));
        return view;
    }


}