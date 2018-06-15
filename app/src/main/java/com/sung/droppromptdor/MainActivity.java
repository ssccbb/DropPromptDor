package com.sung.droppromptdor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button reset = findViewById(R.id.reset);
        final DropPromptDotView dropDot = findViewById(R.id.drop_dot);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dropDot.reset();
            }
        });
    }
}
