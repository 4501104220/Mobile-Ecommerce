package com.dev.mobile_ecommerce.thanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dev.mobile_ecommerce.MainActivity;
import com.dev.mobile_ecommerce.R;

public class ThanksActivity extends AppCompatActivity {

    TextView home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);
        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThanksActivity.this, MainActivity.class));
                    finish();
            }
        });
    }
}
