package com.example.prayerbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowTextActivity extends AppCompatActivity {
    private TextView prayerText;
    private Button buttonToContents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_text);

        prayerText = findViewById(R.id.tv_prayer_text);
        buttonToContents = findViewById(R.id.b_to_contents);

        //если передавать текст не строкой, а по id, то будут отображаться теги

        Intent intentThatStartedThisActivity = getIntent();

        final Intent intentToContents = new Intent(this, MainActivity.class);

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            String textEntered = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);
            prayerText.setText(textEntered);
        }

        buttonToContents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentToContents);
            }
        });
    }
}
