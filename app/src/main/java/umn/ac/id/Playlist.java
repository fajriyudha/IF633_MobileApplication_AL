package umn.ac.id;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static umn.ac.id.MainActivity.song;

public class Playlist extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaylistAdapter playlistAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);
        getSupportActionBar().setTitle("Music Player");
        showMenuDialog();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        if(!(song.size() < 1)){
            playlistAdapter = new PlaylistAdapter(this, song);
            recyclerView.setAdapter(playlistAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int menu_id = item.getItemId();
        if(menu_id == R.id.keProfile){
            Intent intentKeProfile = new Intent(Playlist.this, PageProfile.class);
            startActivity(intentKeProfile);
            finish();
            return true;
        }else if(menu_id == R.id.keLogout){
            Intent intentKeLogout = new Intent(Playlist.this, MainActivity.class);
            startActivity(intentKeLogout);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void showMenuDialog(){
        new AlertDialog.Builder(this)
                .setTitle("Selamat Datang")
                .setMessage("Fajri Yudha Pradana - 00000025854")
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss()).create().show();
    }
}
