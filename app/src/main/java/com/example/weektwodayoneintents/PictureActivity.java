package com.example.weektwodayoneintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PictureActivity extends AppCompatActivity {

    Button btnCamera;
    ImageView ivPhoto;
    private static final int pic_id = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        btnCamera = findViewById(R.id.btnCamera);
        ivPhoto = findViewById(R.id.ivPhoto);

//        getActionBar().setHomeButtonEnabled(true);
//        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onClick(View view) {

        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, pic_id);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == pic_id) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            ivPhoto.setImageBitmap(photo);
        }
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case android.R.id.home:
//
//                // app icon in action bar clicked; goto parent activity.
//                this.finish();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
}
