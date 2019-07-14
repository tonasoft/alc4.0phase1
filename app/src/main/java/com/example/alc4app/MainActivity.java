package com.example.alc4app;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ALC 4.0 App"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(false); // for add back arrow in

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);

    }

    public void goToAboutAlc(View view) {
        Intent intent = new Intent(this, aboutalc.class);
        startActivity(intent);
    }

    public void goToMyProfile(View view) {
        Intent intent = new Intent(this, myprofile.class);
        startActivity(intent);
    }
}
