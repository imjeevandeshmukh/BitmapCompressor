package com.bytelogs.bitcompressorlibrary;

import android.graphics.Bitmap;

public class Compressor {


    public   Bitmap scaleBitmapToHalf(Bitmap image) {

            int width = image.getWidth();
            int height = image.getHeight();
            int halfWidth = width/2;
            int halfHeight = height/2;
            image = Bitmap.createScaledBitmap(image, halfWidth, halfHeight, true);
            return image;
    }
}
