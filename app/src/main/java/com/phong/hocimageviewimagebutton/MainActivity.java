package com.phong.hocimageviewimagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void XuLyDoiHinh(View view) {
        ImageView imgHinh=(ImageView) findViewById(R.id.imgHinh);
        if (imgHinh.getTag()==null || imgHinh.getTag().equals("h1"))
        {
            imgHinh.setImageResource(R.drawable.phongpowerlift);
            imgHinh.setTag("h2");
        }
        else
        {
            imgHinh.setImageResource(R.drawable.phong);
            imgHinh.setTag("h1");
        }
    }

    public void XuLyDongPhanMem(View view) {
        finish();
    }
}
