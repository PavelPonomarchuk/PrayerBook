package com.example.prayerbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contentsList;
    private ContentsAdapter contentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contentsList = findViewById(R.id.rv_contents);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        contentsList.setLayoutManager(layoutManager);
        contentsList.setHasFixedSize(true);
        contentsAdapter = new ContentsAdapter(16, this);
        contentsList.setAdapter(contentsAdapter);
    }
}
