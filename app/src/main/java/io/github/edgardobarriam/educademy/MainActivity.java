package io.github.edgardobarriam.educademy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initActivity();
    }

    private void initActivity() {
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }
}
