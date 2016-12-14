package com.zk.androidlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zk.androidlearn.scroll.MyViewDragHelperActivity;
import com.zk.androidlearn.scroll.ScrollActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, MyViewDragHelperActivity.class));
    }
}
