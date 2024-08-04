package br.ufscar.dc.pooa.domain.reservation;

import br.ufscar.dc.pooa.interfaces.Reservation;

import java.util.Date;
import java.util.List;

public class Canceled implements Reservation {
    private final int id;
    private final String date;
    private final String time;
    private final String room;
    private final String user;

    private static  Canceled instance = null;

    private Canceled(int id, String date, String time, String room, String user) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.room = room;
        this.user = user;
    }

    public static Canceled getInstance(int id, String date, String time, String room, String user) {
        if (instance == null) {
            return new Canceled(id, date, time, room, user);
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
        return instance;
    }

    public Reservation updateReservation(int id, String date, String time, String room, String user) {
        return Reserved.getInstance(id, date, time, room, user);
    }
    

    @Override
    public Date utilTime() {
        return null;
    }
}
