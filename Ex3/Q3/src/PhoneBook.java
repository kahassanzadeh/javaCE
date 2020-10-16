import java.util.HashMap;
import java.util.Iterator;

/**
 * this class is for creating contacts
 * and managing them
 *
 *
 * @author Mohammadreza Hassanzadeh
 * @since Oct 13 2020
 * @version 1.0
 */
public class PhoneBook {
    //map using to make a list with names of the contacts and and their information
    private HashMap<String,Info> contacts = new HashMap<String,Info>();
    /**
     * this method will add a new contact to the contacts list
     * if the contact existed before the new information will replace
     *
     * @param name name of the contact
     * @param info infrmation of the contact class Info
     * @return returns true if the contact was existed and returns false if this name is a new name
     */
    public boolean addContact(String name,Info info){
        for (String nm: contacts.keySet()) {
            if(nm.equals(name)){
                contacts.replace(nm,info);
                return true;
            }
        }
        contacts.put(name,info);
        return false;
    }

    /**
     * this method will search in contacts list ans returns the information of that contact
     * @param name name of the person
     * @return Info object of the conatact
     */
    public Info findContact(String name){
        for (String nm: contacts.keySet()) {
            if(nm.equals(name)){
                return contacts.get(nm);
            }
        }
        return null;
    }

    /**
     * this method will remove a contact by getting the name of that contact
     * @param name name of the contact that we want to remove
     * @return returns true if the contact is successfully removed
     */
    public boolean deleteContact(String name){
        Iterator<String> it = contacts.keySet().iterator();
        while(it.hasNext()){
            if(it.next().equals(name)){
                it.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * this method will get the group name and returns the contacts that added to the group
     * @param group the group name
     * @return hashmap of the group contacts
     */
    public HashMap<String,Info> findContacts(String group){
        HashMap<String,Info> tmpReturn = new HashMap<String,Info>();
        for(String tmpName : contacts.keySet()){
            for(String str:contacts.get(tmpName).getGroups()){
                if(str.equals(group)){
                    tmpReturn.put(tmpName,contacts.get(tmpName));
                }
            }
        }
        return tmpReturn;
    }

    /**
     * this method will print all the contacts in a structured shape
     */
    public void printContacts(){
        for(String str: contacts.keySet()){
            System.out.println("Name : " + str);
            contacts.get(str).printInfo();
        }
    }

    /**
     * this method will print the contacts info that has the same group with the input
     * @param group group name
     */
    public void printContacts(String group){
        HashMap<String, Info> tmp = findContacts(group);
        for(String str: tmp.keySet()){
            System.out.println("Name : " + str);
            contacts.get(str).printInfo();
        }
    }

    /**
     * returning the contacts map
     * @return
     */
    public HashMap<String, Info> getContacts() {
        return contacts;
    }

    /**
     * setter for contacts hashmap
     * @param contacts hashmap of contacts
     */
    public void setContacts(HashMap<String, Info> contacts) {
        this.contacts = contacts;
    }
}
