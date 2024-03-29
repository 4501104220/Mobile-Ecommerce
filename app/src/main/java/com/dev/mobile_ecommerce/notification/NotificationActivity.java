package com.dev.mobile_ecommerce.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dev.mobile_ecommerce.R;
import com.dev.mobile_ecommerce.cart.CartAdapter;
import com.dev.mobile_ecommerce.utility.Data;
import com.dev.mobile_ecommerce.womenselection.fragment.ShoesModel;

import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }


}