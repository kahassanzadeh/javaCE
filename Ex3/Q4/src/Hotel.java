import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * this class will store the hotel's guests and rooms information
 * we can add a room to this hotel and managing them
 *
 * @author Mohammadreza Hassanzadeh
 * @since 2020 Oct 16
 * @version 1.0
 */
public class Hotel {
    //array list of the hotel's room
    private ArrayList<Room> rooms = new ArrayList<Room>();

    //array list of the guest's room
    private  ArrayList<Guest> guests = new ArrayList<Guest>();

    /**
     * printing all room's information
     */
    public void roomList(){
        for(Room rm: rooms){
            rm.printInfo();
        }
    }

    /**
     * getting the array list of rooms
     * @return rooms of the hotel
     */
    public ArrayList<Room> getRoomList(){
        return rooms;
    }

    /**
     * getting the array list of guests
     * @return array list of guests
     */
    public ArrayList<Guest> getGuestList() {
        return guests;
    }

    /**
     * this method will reserve a room for a guest but won't add the guest to the hotel's guests list
     * @param guest guest info that wants to reserve
     * @param date the date that wants to reserve Date
     * @param type the type that wants to reserve Room.Type
     * @param view the view that wants to reserve Room.View
     */
    public void reserve(Guest guest,Date date,Room.Type type,Room.View view){
        for(Room rm: rooms){
            if(!rm.isReserved(date) && type == rm.getType() && view == rm.getView()){
                rm.reserve(date);
                guest.bookHotel(rm);
                break;
            }
        }

    }

    /**
     * this method will add the guest to the hotel's guests list and showing the room number that he reserved
     * @param guest guest info
     */
    public void checkIn(Guest guest){
        this.guests.add(guest);
        System.out.println("Your room number is: " + guest.getRoom().getNumber());
    }

    /**
     * this method will remove a guest from the guests list and returning the price that he or she should pay
     * @param guest guest info
     * @return total price of staying in the hotel
     */
    public int checkOut(Guest guest){
        Iterator<Guest> it = guests.iterator();
        int price = 0;
        while(it.hasNext()){
            if(it.next().getName().equals(guest.getName())){
                price = guest.getRoom().pricing();
                it.remove();
            }
        }
        return price;
    }

    /**
     * adding a room to the hotel's rooms list and will check if the room number was entered before, this method will update the information of that room
     * if the room was exits and updated the room, this method will return true and if the room doesn't exists before ,it will return false
     * @param room room's information that we want to add
     * @return returning if this room was existed or not
     */
    public boolean addRoom(Room room){
        for (Room rm:rooms) {
            if(rm.getNumber() == room.getNumber()){
                rm.setPrice(room.getPrice());
                rm.setType(room.getType());
                rm.setView(room.getView());
                return true;
            }
        }
        rooms.add(room);
        return false;
    }
}
