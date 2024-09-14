package com.example.pixel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCreateSprite = findViewById(R.id.btnCreateSprite);
        Button btnOpenSprite = findViewById(R.id.btnOpenSprite);

        btnCreateSprite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open sprite creation activity
                Intent intent = new Intent(MainActivity.this, SpriteEditorActivity.class);
                startActivity(intent);
            }
        });

        btnOpenSprite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement file picker or recent projects
            }
        });
    }
}
