package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProteinTrackerApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protein_tracker_app);

        Button btnsetting = (Button) findViewById(R.id.btnsetting);
        btnsetting.setOnClickListener(settingButtonListener);
        SharedPreferences prefs = ProteinTrackerApp.this.getSharedPreferences("prefs_file", MODE_PRIVATE);

        String statusLogin = prefs.getString("isLogin", null);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(myBtnLoginClick);

        if (statusLogin != null) {
            btnLogin.setText("Logout");
        } else {
            btnLogin.setText("Login");
        }
    }

    private View.OnClickListener myBtnLoginClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SharedPreferences prefs = ProteinTrackerApp.this.getSharedPreferences("prefs_file", MODE_PRIVATE);

            String statusLogin = prefs.getString("isLogin", null);
            SharedPreferences.Editor edit = prefs.edit();

            Button btnLogin = (Button) findViewById(R.id.btnLogin);
            if (statusLogin != null) {
                edit.putString("isLogin", null);
                btnLogin.setText("Login");
            } else {
                edit.putString("isLogin", "Admin");
                btnLogin.setText("Logout");
            }
            edit.commit();
        }
    };

    private View.OnClickListener settingButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(ProteinTrackerApp.this, SettingsActivity.class);
            startActivity(intent);
        }
    };
}