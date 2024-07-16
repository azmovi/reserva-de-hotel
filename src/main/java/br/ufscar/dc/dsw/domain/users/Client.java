package br.ufscar.dc.dsw.domain.users;

import java.util.List;

import java.util.ArrayList;

public class Client extends DefaultUser {
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

    // Outros métodos e lógica específicos do cliente podem ser adicionados aqui
}
