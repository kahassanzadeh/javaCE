import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * This is a phonebook maker.
 * you can make a phone book by these commands
 * you can save its full name, email, phone number and classify into groups
 * contacts -a <contact name>  ----> adding a new contact to the list
 * contacts -r <contact name>  ----> removing a contact from the list
 * show -g <group name> ----> showing a specific group
 * show -c <contact name> ----> showing the information of a contact member
 * show ----> showing the whole contact members with their information
 * exit ----> terminating the program
 *
 * @author Mohammadreza Hassanzadeh
 * @since Oct 13 2020
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp;
        String inputString = "tmp" ;
        String[] inputStringArray = inputString.split("\\s+");
        String name;
        PhoneBook ph = new PhoneBook();
        while(!inputStringArray[0].equals("exit")){
            Info info = new Info();
            HashSet<String> tmp = new HashSet<String>();
            inputString = input.nextLine();
            inputStringArray = inputString.split("\\s+");
            if(inputStringArray[0].equals("contacts") && inputStringArray[1].equals("-a")){
                name = inputStringArray[2];
                System.out.print("please enter work info: \n");
                info.setWorkInfo(input.nextLine());
                int counter = 1;
                do {
                    System.out.print("please enter group " + counter + " or enter to finish \n");
                    temp = input.nextLine();
                    if(!temp.equals("")){
                        tmp.add(temp);
                        counter++;
                    }
                    else{
                        break;
                    }
                }while(true);
                info.setGroups(tmp);
                counter = 1;
                tmp = new HashSet<String>();
                do {
                    System.out.print("please enter email " + counter + " or enter to finish \n");
                    temp = input.nextLine();
                    if(!temp.equals("")){
                        tmp.add(temp);
                        counter++;
                    }
                    else{
                        break;
                    }
                }while(true);
                info.setEmails(tmp);
                counter = 1;
                tmp = new HashSet<String>();
                do {
                    System.out.print("please enter phone number " + counter + " or enter to finish \n");
                    temp = input.nextLine();
                    if(temp.length() == 12){
                        tmp.add(temp);
                        counter++;
                    }
                    else if(!temp.equals("")){
                        System.out.println("invalid phone number");
                    }
                    else{
                        break;
                    }

                }while(true);
                info.setPhones(tmp);
                ph.addContact(name,info);
                System.out.println("Contact saved \n");
            }
            else if(inputStringArray[0].equals("contacts") && inputStringArray[1].equals("-r")){
                temp = inputStringArray[2];
                if(ph.deleteContact(temp)){
                    System.out.println("OK");
                }
                else{
                    System.out.println("Not Found");
                }

            }
            else if(inputStringArray[0].equals("show") ){

                if(inputStringArray.length == 1){
                    ph.printContacts();
                }
                else if(inputStringArray[1].equals("-c")){
                    temp = inputStringArray[2];
                    if(ph.findContact(temp) != null){
                        ph.findContact(temp).printInfo();
                    }
                    else{
                        System.out.println("Not found");
                    }
                }

                else if(inputStringArray[1].equals("-g")){
                    ph.printContacts(inputStringArray[2]);
                }


            }

        }
    }
}
