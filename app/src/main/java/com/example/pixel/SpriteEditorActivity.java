package com.example.pixel;

import android.view.*; 
import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.View;
import androidx.appcompat.app.AppCompatActivity;

public class SpriteEditorActivity extends AppCompatActivity {

    private View drawingCanvas;
    private SeekBar colorRed, colorGreen, colorBlue;
    private int currentColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprite_editor);

        drawingCanvas = findViewById(R.id.drawingCanvas);
        colorRed = findViewById(R.id.colorRed);
        colorGreen = findViewById(R.id.colorGreen);
        colorBlue = findViewById(R.id.colorBlue);

        colorRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateColor();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        colorGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateColor();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        colorBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateColor();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        // Initialize drawingCanvas with default settings and listeners
    }

    private void updateColor() {
        int red = colorRed.getProgress();
        int green = colorGreen.getProgress();
        int blue = colorBlue.getProgress();
        currentColor = Color.rgb(red, green, blue);

        // Update drawingCanvas or other UI components with the new color
    }
}
