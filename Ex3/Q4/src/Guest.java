/**
 * this class will store a guest information and his or her room information
 *
 * @author Mohammadreza Hassanzadeh
 * @since 2020 Oct 16
 * @version 1.0
 */



public class Guest {
    // name of the guest
    private String name;

    //the room that he or she wants to reserve
    private Room room;

    //storing if he or she could reserve a room with the features that he or she wants
    private boolean canReserve = false;

    /**
     * setting a name for the guest
     * @param name String name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * booking a hotel room for the guest
     * @param room room
     */
    public void bookHotel(Room room){
        this.room = room;
        this.canReserve = true;
    }

    /**
     * getting the guest's name
     * @return guest's name
     */
    public String getName() {
        return name;
    }

    /**
     * getting the room
     * @return room obj.
     */
    public Room getRoom() {
        return room;
    }

    /**
     * getting if he or she could reserve
     * @return boolean
     */
    public boolean getCanReserve(){
        return canReserve;
    }
}
