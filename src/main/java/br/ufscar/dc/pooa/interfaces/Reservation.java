package br.ufscar.dc.pooa.interfaces;

import java.util.Date;
import java.util.List;

public interface Reservation {
    int createReservation();
    Reservation getReservation();
    boolean updateReservation();
    boolean deleteReservation();
    List<Reservation> getReservations();
    Date utilTime();
}
