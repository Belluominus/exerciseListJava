package main.model.entities;

public class Lodger {
    private String name;
    private String email;
    private Integer room;

    public Lodger(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRoom() {
        return room;
    }
    
}
