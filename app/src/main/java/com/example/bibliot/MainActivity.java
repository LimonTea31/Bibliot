package com.example.bibliot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button Save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Save = findViewById(R.id.btnSave);
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                void saveText() {
                    sPref = getPreferences(MODE_PRIVATE);
                    Editor ed = sPref.edit();
                    ed.putString(SAVED_TEXT, etText.getText().toString());
                    ed.commit();
                    Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
