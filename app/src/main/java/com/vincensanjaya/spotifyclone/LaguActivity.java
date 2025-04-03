package com.vincensanjaya.spotifyclone;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class LaguActivity extends AppCompatActivity {
    private ListView lvLagu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu);

        lvLagu = findViewById(R.id.lv_lagu);

        Album album = (Album) getIntent().getSerializableExtra("album");
        ArrayList<Song> daftarLagu = album.getDaftarLagu();

        SongAdapter adapter = new SongAdapter(this, daftarLagu);
        lvLagu.setAdapter(adapter);
    }
}
