package com.softianstech.imageproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Lenovo on 11/9/2017.
 */

public class ViewFullImage extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_full_image);
        Intent intent = getIntent();
        int i = intent.getIntExtra(ImageListView.BITMAP_ID,0);

        imageView = (ImageView) findViewById(R.id.imageViewFull);
        imageView.setImageBitmap(GetAlImages.bitmaps[i]);

    }
}
