package com.vincensanjaya.spotifyclone;

import java.io.Serializable;

public class Song  implements Serializable {
    private String judulLagu;

    public Song(String judulLagu) {
        this.judulLagu = judulLagu;
    }

    public String getJudulLagu() {
        return judulLagu;
    }
}
