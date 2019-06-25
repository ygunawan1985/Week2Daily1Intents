package com.example.weektwodayoneintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Picture;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPictureActivity, btnPersonActivity, btnPersonResultActivity, btnMediaPlayerActivity, btnWebViewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPictureActivity = findViewById(R.id.btnPictureActivity);
        btnPersonActivity = findViewById(R.id.btnPersonActivity);
        btnPersonResultActivity = findViewById(R.id.btnPersonResultActivity);
        //btnMediaPlayerActivity = findViewById(R.id.btnMediaPlayerActivity);
        btnWebViewActivity = findViewById(R.id.btnWebViewActivity);

    }

    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnPictureActivity:
                Intent pictureActivityIntent = new Intent(this, PictureActivity.class);
                startActivity(pictureActivityIntent);
                break;

            case R.id.btnPersonActivity:
                Intent personActivityIntent = new Intent(this, PersonActivity.class);
                startActivity(personActivityIntent);
                break;

            case R.id.btnPersonResultActivity:
                Intent personResultActivityIntent = new Intent(this, PersonResultActivity.class);
                startActivity(personResultActivityIntent);
                break;

//            case R.id.btnMediaPlayerActivity:
//                Intent mediaPlayerActivityIntent = new Intent(this, MediaPlayerActivity.class);
//                startActivity(mediaPlayerActivityIntent);
//                break;

            case R.id.btnWebViewActivity:
                Intent webViewActivityIntent = new Intent(this, WebViewActivity.class);
                startActivity(webViewActivityIntent);
                break;
        }
    }
}
