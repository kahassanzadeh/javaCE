import java.util.HashSet;
/**
 * this class is for saving the information of a contact
 * we will save the worksinfo ,groups ,emails and phones
 *
 *
 *
 * @author Mohammadreza Hassanzadeh
 * @since Oct 13 2020
 * @version 1.0
 */
public class Info {

    //String for storing the work information
    private String workInfo;
    //Hashset for storing the groups
    private HashSet<String> groups;

    //Hashset of the emails
    private HashSet<String> emails;

    //hashset of the phones
    private HashSet<String> phones;


    /**
     * printing the information of a contact in a structured shape
     */
    public void printInfo(){
        int counter = 1;
        for (String ph: phones ) {
            System.out.print("Phone Number " + counter + " : " + ph +"\n");
            counter++;
        }
        counter = 1;
        for (String ph: emails ) {
            System.out.print("Emails " + counter + " : " + ph +"\n");
            counter++;
        }
        counter = 1;
        for (String ph: groups ) {
            System.out.print("Groups " + counter + " : " + ph +"\n");
            counter++;
        }
        counter = 1;
        System.out.println("Work : " + workInfo + " \n");

    }

    /**
     * getting the group list
     * @return hashset of group
     */
    public HashSet<String> getGroups(){
        return groups;
    }

    /**
     * getting the emails list
     * @return hashset of emails
     */
    public HashSet<String> getEmails() {
        return emails;
    }

    /**
     * getting the phones list of a person
     * @return hash set of phones
     */
    public HashSet<String> getPhones() {
        return phones;
    }

    /**
     * getting the work information
     * @return String of work information
     */
    public String getWorkInfo() {
        return workInfo;
    }

    /**
     * setting a new email hashset
     * @param emails hashset of emails
     */
    public void setEmails(HashSet<String> emails) {
        this.emails = emails;
    }
    /**
     * setting a new groups hashset
     * @param groups hashset of groups
     */
    public void setGroups(HashSet<String> groups) {
        this.groups = groups;
    }
    /**
     * setting a new phones hashset
     * @param phones hashset of phones
     */
    public void setPhones(HashSet<String> phones) {
        this.phones = phones;
    }
    /**
     * setting a new workInfo hashset
     * @param workInfo hashset of workInfo
     */
    public void setWorkInfo(String workInfo) {
        this.workInfo = workInfo;
    }

}
