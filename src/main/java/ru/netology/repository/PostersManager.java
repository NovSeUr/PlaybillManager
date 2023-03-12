package ru.netology.repository;

import ru.netology.domain.Posters;

public class PostersManager {
    private Posters[] postersLine = new Posters[0];
    private int limit;

    public PostersManager() {
        this.limit = 10;
    }

    public PostersManager(int limit) {
        this.limit = limit;
    }

    public void add(Posters poster) {
        Posters[] tmp = new Posters[postersLine.length + 1];
        for (int i = 0; i < postersLine.length; i++) {
            tmp[i] = postersLine[i];
        }
        tmp[tmp.length - 1] = poster;
        postersLine = tmp;
    }

    public Posters[] findAll() {
        return postersLine;
    }

    public Posters[] findLast() {
        int reversedLength;
        Posters[] all = findAll();
        if (all.length < limit) {
            reversedLength = all.length;
        } else {
            reversedLength = limit;
        }
        Posters[] reversed = new Posters[reversedLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }
}
