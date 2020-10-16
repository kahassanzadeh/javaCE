/**
 * this class is used for room's information
 * we can check in this class if a room is reserved or not
 *
 * @author Mohammadreza Hassanzadeh
 * @since 2020 Oct 16
 * @version 1.0
 */

public class Room {
    //the room number
    private int number;
    public enum View{
        SEA,
        FOREST,
        BUILDING
    }
    //the room View
    private View view;
    public enum Type{
        Single,
        Double,
        Triple,
        Quad,
        Queen,
        King
    }
    //the room type
    private Type type;
    //saving the room's reserved date
    private Date date = new Date();
    //price for a day
    private int price;

    /**
     * printing the rooms information
     */

    public void printInfo(){
        System.out.println("Room Number : " + number );
        System.out.println("View Mode : " + view.toString());
        System.out.println("Type : " + type.toString());
        date.printDate();
        System.out.println("Price : " + price);
        System.out.println("************************************");
    }

    /**
     * this method will reserve a day with getting a date
     * @param date the date that we want to reserve
     */
    public void reserve(Date date){
        this.date = date;
    }

    /**
     * this method will get a date and will check if this room wasn't reserved before
     * @param date the date that we want to reserve this room
     * @return returning a boolean weather we could reserve this room in this date or not
     */
    public boolean isReserved(Date date){
        if(this.date.getStartDate() == null){
            return false;
        }
       else if(this.date.calculateDifferentInStartDay(date) < 0 ){
           return true;
       }
       else if(this.date.calculateDifferentInFinishDay(date) > 0 ){
           return true;
       }
       else{
           return false;
       }
    }

    /**
     * calculating the price in check-out process
     * @return returning an integer : the price that the guest should pay
     */
    public int pricing(){
        return price * date.getDaysToStay();
    }

    /**
     * getting the view of the room
     * @return Room.View enum
     */
    public View getView(){
        return view;
    }

    /**
     * getting the type of the room
     * @return Room.Type enum
     */
    public Type getType(){
        return type;
    }

    /**
     * getting the room's number
     * @return integer that is room's number
     */
    public int getNumber() {
        return number;
    }

    /**
     * seeting the room's number
     * @param number room number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * setting a price for this room for each day
     * @param price integer of price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * setting the type of the room
     * @param type Room.Type enum
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * setting the view of the room
     * @param view Room.View enum
     */
    public void setView(View view) {
        this.view = view;
    }

    /**
     * getting the price of the price of the room for each day
     * @return Integer price
     */
    public int getPrice() {
        return price;
    }
}
