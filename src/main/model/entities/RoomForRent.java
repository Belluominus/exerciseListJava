package main.model.entities;

public class RoomForRent {
    private Integer room;
    private Boolean isVacant;
    private Lodger lodger;

    public RoomForRent(int room){
        this.room = room;
        this.isVacant = true;
    }
    public Integer getRoom() {
        return this.room;
    }
    
    public boolean getIsVacant() {
        return this.isVacant;
    }

    public void rentRoom(Lodger lodger) {
        this.isVacant = false;
        this.lodger = lodger;
    } 

    public String toString() {
        return lodger.getName() + ", " + lodger.getEmail();
    }
}
