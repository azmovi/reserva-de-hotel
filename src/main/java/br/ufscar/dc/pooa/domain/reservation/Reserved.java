package br.ufscar.dc.pooa.domain.reservation;

import br.ufscar.dc.pooa.interfaces.Reservation;

import java.util.Date;
import java.util.List;

public class Reserved implements Reservation {
    private int id;
    private String date;
    private String time;
    private String room;
    private String user;

    private static Reserved instance = null;

    private Reserved(int id, String date, String time, String room, String user) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.room = room;
        this.user = user;
    }

    public static Reserved getInstance(int id, String date, String time, String room, String user) {
        if (instance == null) {
            return new Reserved(id, date, time, room, user);
        }
        return instance;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getRoom() {
        return room;
    }

    public String getUser() {
        return user;
    }

    @Override
    public boolean createReservation() {
        return false;
    }

    @Override
    public Reservation getReservation() {
        return null;
    }

    @Override
    public Reservation updateReservation(int id, String date, String time, String room, String user) {
        return Canceled.getInstance(id, date, time, room, user);
    }


    @Override
    public Date utilTime() {
        return null;
    }
}
