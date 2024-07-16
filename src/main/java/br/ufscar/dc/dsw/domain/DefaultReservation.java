package br.ufscar.dc.dsw.domain;

import java.util.Date;
import java.util.List;
import br.ufscar.dc.dsw.interfaces.Reservation;

public class DefaultReservation implements Reservation {
    private int reserveId;
    private int clientId;
    private int roomId;
    private Date checkIn;
    private Date checkOut;

    @Override
    public int createReservation() {
        // Implementação
        return 0;
    }

    @Override
    public Reservation getReservation() {
        // Implementação
        return null;
    }

    @Override
    public boolean updateReservation() {
        // Implementação
        return false;
    }

    @Override
    public boolean deleteReservation() {
        // Implementação
        return false;
    }

    @Override
    public List<Reservation> getReservations() {
        // Implementação
        return null;
    }

    @Override
    public Date utilTime() {
        // Implementação
        return null;
    }

    // Getters e Setters

    public int getReserveId() {
        return reserveId;
    }

    public void setReserveId(int reserveId) {
        this.reserveId = reserveId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
}
