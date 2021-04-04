package com.dev.mobile_ecommerce.womenselection.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.mobile_ecommerce.R;
import com.dev.mobile_ecommerce.utility.Data;

import java.util.ArrayList;

public class TosTunicsFragment extends Fragment {
    RecyclerView recyclerView;
    public TosTunicsFragment() {
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
        View view = inflater.inflate(R.layout.fragment_tos_tunics, container,
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
                androidVersions,"TosTunicsFragment");
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<ShoesModel> prepareData() {

        ArrayList<ShoesModel> android_version = new ArrayList<>();
        for (int i = 0; i < Data.tos_image.length; i++) {
            ShoesModel androidVersion = new ShoesModel();
            androidVersion.setName(Data.tos_name[i]);
            androidVersion.setImage(Data.tos_image[i]);
            androidVersion.setSubtitle(Data.tos_subtitle[i]);
            androidVersion.setPrice(Data.tos_price[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }

}
