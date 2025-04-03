package com.vincensanjaya.spotifyclone;

import java.io.Serializable;
import java.util.ArrayList;

public class Album implements Serializable {
    private String namaAlbum;
    private ArrayList<Song> daftarLagu;

    public Album(String namaAlbum) {
        this.namaAlbum = namaAlbum;
        this.daftarLagu = new ArrayList<>();
    }

    public String getNamaAlbum() {
        return namaAlbum;
    }

    public void tambahLagu(Song lagu) {
        daftarLagu.add(lagu);
    }

    public ArrayList<Song> getDaftarLagu() {
        return daftarLagu;
    }
}