package ru.netology.repository;

import ru.netology.domain.Posters;

public class PostersManager {
    private PosterRepository repo;

    private int limit;

    public PostersManager(PosterRepository repo) {
        this.repo = repo;
        this.limit = 10;
    }

    public PostersManager(int limit, PosterRepository repo) {
        this.limit = limit;
        this.repo = repo;
    }

    public void add(Posters poster) {
        repo.save(poster);
    }

    public Posters[] findAll() {
        Posters[] all = repo.findAll();
        return all;
    }

    public Posters[] findLast() {
        int reversedLength;
        Posters[] all = repo.findAll();
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
