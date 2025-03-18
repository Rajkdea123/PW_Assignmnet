package com.example.pw;


import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {
    TextView Dashboard, Pitara, Maths, Science, English, More;
    ConstraintLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.setStatusBarColor(getResources().getColor(R.color.transparent));
        }
        drawerLayout = findViewById(R.id.main);
        Dashboard = findViewById(R.id.dashboard);
        Pitara = findViewById(R.id.Pitara);
        Maths = findViewById(R.id.Maths);
        Science = findViewById(R.id.Science);
        English = findViewById(R.id.English);
        More = findViewById(R.id.More);
        Dashboard.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MainActivity.class));
        });

        Pitara.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Pitara.class));
        });

        Maths.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Maths.class));
        });
        Science.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Science.class));
        });
        English.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, English.class));
        });
        More.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, More.class));
        });

    }
    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        finish();
    }
}