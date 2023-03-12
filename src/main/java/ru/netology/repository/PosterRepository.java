package ru.netology.repository;

import ru.netology.domain.Posters;

public class PosterRepository {

    private Posters[] postersLine = new Posters[0];
    private int limit;


    public PosterRepository() {
    }

    public void save(Posters poster) {
        Posters[] tmp = new Posters[postersLine.length + 1];
        for (int i = 0; i < postersLine.length; i++) {
            tmp[i] = postersLine[i];
        }
        tmp[tmp.length - 1] = poster;
         postersLine = tmp;
    }

    public Posters[] removeById(int id) {
        Posters[] tmp = new Posters[postersLine.length - 1];
        int copyToIndex = 0;
        for (Posters poster : postersLine) {
            if (poster.getId() != id) {
                tmp[copyToIndex] = poster;
                copyToIndex++;
            }
        }
        postersLine = tmp;
        return postersLine;
    }

    public Posters[] findById(int id) {
        Posters[] tmp = new Posters[1];
        int copyToIndex = 0;
        for (Posters poster : postersLine) {
            if(poster.getId() ==id){
            tmp[copyToIndex] = poster;
        }
    }
    postersLine = tmp;
        return postersLine;
    }
    public Posters[] removeAll() {
        Posters[] postersLine = new Posters [0];
        return postersLine;
    }

    public Posters[] findAll() {
        return postersLine;
    }
}
