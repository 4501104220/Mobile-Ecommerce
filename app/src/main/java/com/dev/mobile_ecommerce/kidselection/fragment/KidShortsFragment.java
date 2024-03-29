package com.dev.mobile_ecommerce.kidselection.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev.mobile_ecommerce.R;
import com.dev.mobile_ecommerce.utility.Data;
import com.dev.mobile_ecommerce.womenselection.fragment.DataAdapter;
import com.dev.mobile_ecommerce.womenselection.fragment.ShoesModel;

import java.util.ArrayList;


public class KidShortsFragment extends Fragment {
    RecyclerView recyclerView;
    public KidShortsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kid_shorts, container,
                false);
        recyclerView = view.findViewById(R.id.rv);
        initViews();
        return view;
    }

    private void initViews() {
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager =
                new GridLayoutManager(getContext(), 1);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<ShoesModel> androidVersions = prepareData();
        DataAdapter adapter = new DataAdapter(getContext(),
                androidVersions,"KidShortsFragment");
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<ShoesModel> prepareData() {

        ArrayList<ShoesModel> android_version = new ArrayList<>();
        for (int i = 0; i < Data.kidtshort_image.length; i++) {
            ShoesModel androidVersion = new ShoesModel();
            androidVersion.setName(Data.kidtshort_name[i]);
            androidVersion.setImage(Data.kidtshort_image[i]);
            androidVersion.setSubtitle(Data.kidtshort_subtitle[i]);
            androidVersion.setPrice(Data.kidtshort_price[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }

}
