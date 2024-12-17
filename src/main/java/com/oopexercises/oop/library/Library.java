package com.oopexercises.oop.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    final ArrayList<Rent> rents;

    public Library() {
        rents = new ArrayList<>();
    }

    public boolean addRent(Rent rent) {

        return rents.add(rent);
    }

    public boolean removeRent(Rent rent) {
        return rents.remove(rent);
    }

    public List<Rent> getExpired(LocalDate now) {
        List<Rent> expired = new ArrayList<>();
        for (Rent rent : rents) {
            if (rent.isExpired(now)) {
                expired.add(rent);
            }
        }
        return expired;
    }
}

