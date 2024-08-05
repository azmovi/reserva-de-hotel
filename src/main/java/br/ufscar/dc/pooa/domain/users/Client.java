package br.ufscar.dc.pooa.domain.users;

import br.ufscar.dc.pooa.interfaces.ReservationState;


import java.util.List;

import java.util.ArrayList;

public class Client extends DefaultUser {
    private int Id;
    private ReservationState reservation;

    private List<Member> members;

    public Client() {
        this.members = new ArrayList<>();
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public void addMember(Member member) {
        this.members.add(member);
    }

    public void removeMember(Member member) {
        this.members.remove(member);
    }

    public void setId(int id) {
        Id = id;
    }

    public ReservationState getReservation() {
        return reservation;
    }

    public void setReservation(ReservationState reservation) {
        this.reservation = reservation;
    }

    public void UpdateReservation() {
        this.reservation.updateReservation();

    }


    public int getId() {
        return Id;
    }


}
