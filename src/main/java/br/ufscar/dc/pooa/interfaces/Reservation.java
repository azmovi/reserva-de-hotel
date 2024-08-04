package br.ufscar.dc.pooa.interfaces;

import java.util.Date;
import java.util.List;

public interface Reservation {
    boolean createReservation();
    Reservation getReservation();
    Reservation updateReservation(int id, String date, String time, String room, String user);
    Date utilTime();
}
