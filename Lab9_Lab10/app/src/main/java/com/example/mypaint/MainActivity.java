package com.example.mypaint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MyCanvas myCanvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myCanvas = new MyCanvas(this, null);
        setContentView(myCanvas);
    }
}
