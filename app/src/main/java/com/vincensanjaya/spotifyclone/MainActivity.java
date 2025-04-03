package com.vincensanjaya.spotifyclone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView lvAlbum;
    private ArrayList<Album> daftarAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAlbum = findViewById(R.id.lv_album);
        daftarAlbum = new ArrayList<>();

        Album album1 = new Album("Album 1");
        album1.tambahLagu(new Song("Lagu 1"));
        album1.tambahLagu(new Song("Lagu 2"));

        Album album2 = new Album("Album 2");
        album2.tambahLagu(new Song("Lagu 3"));
        album2.tambahLagu(new Song("Lagu 4"));

        daftarAlbum.add(album1);
        daftarAlbum.add(album2);

        AlbumAdapter adapter = new AlbumAdapter(this, daftarAlbum);
        lvAlbum.setAdapter(adapter);
        lvAlbum.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Album album = daftarAlbum.get(position);
        Intent intent = new Intent(this, LaguActivity.class);
        intent.putExtra("album", album);
        startActivity(intent);
    }
}