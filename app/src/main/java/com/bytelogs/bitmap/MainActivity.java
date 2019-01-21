package com.bytelogs.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bytelogs.bitcompressorlibrary.Compressor;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView iv_image;
    Button button;
    Bitmap icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_image = findViewById(R.id.image);
        iv_image.setImageResource(R.drawable.sampleimage);
        button = findViewById(R.id.button);
        icon = BitmapFactory.decodeResource(getResources(),R.drawable.sampleimage);
        button.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                scaleItDown(icon);
                break;
        }


    }
    public void scaleItDown(Bitmap bitmap){
        Compressor compressor = new Compressor();
        Bitmap scaledBitmap = compressor.scaleBitmapToHalf(bitmap);
        if(bitmap !=null){
            iv_image.setImageBitmap(scaledBitmap);
        }
    }
}
