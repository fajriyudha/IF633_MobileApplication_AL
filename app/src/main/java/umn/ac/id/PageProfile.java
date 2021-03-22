package umn.ac.id;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PageProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Profile Saya");
    }
}