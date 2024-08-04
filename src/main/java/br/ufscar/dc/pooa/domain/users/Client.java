package br.ufscar.dc.pooa.domain.users;

import br.ufscar.dc.pooa.interfaces.Reservation;

import java.util.List;

import java.util.ArrayList;

public class Client extends DefaultUser {
    private int Id;
    private Reservation reservation;

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

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }


    public int getId() {
        return Id;
    }


}
