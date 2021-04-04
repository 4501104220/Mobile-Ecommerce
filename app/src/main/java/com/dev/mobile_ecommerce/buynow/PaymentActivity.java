package com.dev.mobile_ecommerce.buynow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.mobile_ecommerce.MainActivity;
import com.dev.mobile_ecommerce.R;
import com.dev.mobile_ecommerce.checkout.CheckoutActivity;
import com.dev.mobile_ecommerce.thanks.ThanksActivity;
import com.dev.mobile_ecommerce.wishlist.WishlistActivity;

import org.w3c.dom.Text;

public class PaymentActivity extends AppCompatActivity {
    ImageView back;
    TextView paynow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        back = findViewById(R.id.back);
        paynow = findViewById(R.id.paynow);

        paynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PaymentActivity.this, ThanksActivity.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
