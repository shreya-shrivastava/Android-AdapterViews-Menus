package com.example.shreyashrivastavaproject2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.view.View.OnClickListener;

public class ShowImage extends AppCompatActivity {

    ImageView imageView;
    String website = "";
    @Override
    protected void onCreate(Bundle savedInstance){

        super.onCreate(savedInstance);
        setContentView(R.layout.activity_show_image);
        imageView = findViewById(R.id.imageView);

        final Bundle bundle = getIntent().getExtras();

         if(bundle!= null){
            imageView.setImageResource(bundle.getInt("image"));
            imageView.setClickable(true);
            imageView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                   website= bundle.getString("website");
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(website));
                    startActivity(intent);

                }
            });
        }}
    }