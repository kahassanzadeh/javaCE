import java.util.ArrayList;
import java.util.Scanner;

/**
 * this program was developed for saving a hotel's room and managing some stuff like reservations and check-in process
 * this program will make a list for reserved guests and whenever they arrive with check-in process we can add them to hotel's guests that exist in the hotel
 * we can reserve a room that exists in the hotel with guest command
 * at last when we want to do the check-out process we can use "check out" command then the money that the guests should pay will shown
 *
 * @author Mohammadreza Hassanzadeh
 * @since 2020 Oct 16
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String userInput;
        Hotel hotel = new Hotel();
        ArrayList<Guest> reservedGuestList = new ArrayList<Guest>();
        do{
            System.out.println("**************************************************************");
            System.out.print("1.Please type \"guest\" for adding a Guest and reserve a new room \n" +
                    "2.Please type \"room\" for adding Room of the hotel \n" +
                    "3.If a guest has arrived type \"check in\" \n" +
                    "4.If a guest is leaving and you want to free the room and delete the guest's info from hotels list type \"check out\" \n" +
                    "5.If you want the rooms information type \"room list\" \n" +
                    "6.If you want to Quit please type\"exit\" \n");
            userInput = input.nextLine();
            /**
             * this section will get the guests info and reserve them a hotel room
             */
            if(userInput.equals("guest")){
                Guest tempGuest = new Guest();
                System.out.print("1- please enter the guest's name : ");
                tempGuest.setName(input.nextLine());
                System.out.println("[SEA ,FOREST ,BUILDING]");
                System.out.print("2- please enter one kind of the Room view from above list : ");
                String tempView = input.nextLine().toUpperCase();
                System.out.println("[Single ,Double ,Triple ,Quad ,Queen ,King]");
                System.out.print("3- please enter one kind of the Room type from above list : ");
                String tempType = input.nextLine();
                tempType = tempType.substring(0,1).toUpperCase() + tempType.substring(1).toLowerCase();
                Date tempDate = new Date();
                System.out.print("4- please enter the start day like this pattern yyyymmdd : ");
                tempDate.setStartDay(input.nextLine());
                System.out.print("5- please enter the finish day like this pattern yyyymmdd : ");
                tempDate.setFinishDay(input.nextLine());
                tempDate.setDaysToStay(tempDate.getFinishDay());
                hotel.reserve(tempGuest,tempDate,Room.Type.valueOf(tempType),Room.View.valueOf(tempView));
                if(tempGuest.getCanReserve()){
                    reservedGuestList.add(tempGuest);
                }
                else {
                    System.out.println("Can't reserve this room with this date or type and view \n" +
                            "please check the information and try another time");
                }

            }
            /**
             * we can add rooms to the hotel with command "room"
             * with entering the room info
             */
            else if(userInput.equals("room")){
                Room temp = new Room();
                System.out.print("1- please enter the Room number : ");
                temp.setNumber(Integer.parseInt(input.next()));
                input.nextLine();
                System.out.println("[SEA ,FOREST ,BUILDING]");
                System.out.print("2- please enter one kind of the Room view from above list : ");
                String tmp = input.nextLine().toUpperCase();
                temp.setView(Room.View.valueOf(tmp));
                System.out.println("[Single ,Double ,Triple ,Quad ,Queen ,King]");
                System.out.print("3- please enter one kind of the Room type from above list: ");
                tmp = input.nextLine();
                tmp = tmp.substring(0,1).toUpperCase() + tmp.substring(1).toLowerCase();
                temp.setType(Room.Type.valueOf(tmp));
                //tmp = input.nextLine();
                System.out.print("4- please enter the Room's price for a day : ");
                temp.setPrice(input.nextInt());
                if(hotel.addRoom(temp)){
                    System.out.println("The information of this room has been successfully updated");
                }
                else{
                    System.out.println("This room has been successfully added to hotel's room list");
                }
                input.nextLine();

            }
            /**
             * this section will add the guest to hotel's guest list
             */
            else if(userInput.equals("check in")){
                System.out.println("please enter the guest's name that has arrived :");
                String name = input.nextLine();
                for(Guest gt: reservedGuestList){
                    if(gt.getName().equals(name)){
                        hotel.checkIn(gt);
                        break;
                    }
                }
            }
            /**
             * this section will delete the guest from hotel's guests list and showing the money that he or she should pay
             */
            else if(userInput.equals("check out")){
                System.out.println("please enter the guest's name that is leaving :");
                String name = input.nextLine();
                int price = 0;
                for(Guest gt: reservedGuestList){
                    if(gt.getName().equals(name)){
                        price = hotel.checkOut(gt);
                        break;
                    }
                }
                if(price == 0){
                    System.out.println("Not Found");
                }
                System.out.println("The price of the Hotel Room is : " + price) ;
            }
            /**
             * we can see the hotel's room list with this section using "room list" command
             */
            else if(userInput.equals("room list")){
                hotel.roomList();
            }
        }while (!userInput.equals("exit"));
    }
}
