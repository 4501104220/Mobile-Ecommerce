package com.dev.mobile_ecommerce.menselection.fragment;

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
import com.dev.mobile_ecommerce.dev.mobile_ecommerce.fragment.DataAdapter;
import com.dev.mobile_ecommerce.dev.mobile_ecommerce.fragment.ShoesModel;

import java.util.ArrayList;


public class WalletFragment extends Fragment {
    RecyclerView recyclerView;
    public WalletFragment() {
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
        View view = inflater.inflate(R.layout.fragment_wallet, container,
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
                androidVersions,"WalletFragment");
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<ShoesModel> prepareData() {

        ArrayList<ShoesModel> android_version = new ArrayList<>();
        for (int i = 0; i < Data.wallet_image.length; i++) {
            ShoesModel androidVersion = new ShoesModel();
            androidVersion.setName(Data.wallet_name[i]);
            androidVersion.setImage(Data.wallet_image[i]);
            androidVersion.setSubtitle(Data.wallet_subtitle[i]);
            androidVersion.setPrice(Data.wallet_price[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }

}
