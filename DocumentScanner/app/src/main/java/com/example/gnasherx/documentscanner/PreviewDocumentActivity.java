package com.example.gnasherx.documentscanner;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import java.io.File;

public class PreviewDocumentActivity extends AppCompatActivity {

    private final String TAG = PreviewDocumentActivity.class.getName();
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_document);

        mImageView = findViewById(R.id.imageView);

        Intent intent = getIntent();
        File filePath = new File(intent.getStringExtra("filePath"));
        Log.d(TAG, "onCreate: =============================================: " + filePath);
        Bitmap bitmap = BitmapFactory.decodeFile(filePath.getAbsolutePath());
        mImageView.setImageBitmap(bitmap);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}

