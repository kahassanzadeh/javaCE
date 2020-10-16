
/**
 * this class will creat a Date time object and we can sore dates like yyyymmdd and doing some calculations
 * like calculating the differences between the start day and the finish day or we can compare 2 different days
 *
 * @author Mohammadreza Hassanzadeh
 * @since 2020 Oct 16
 * @version 1.0
 */

public class Date {
    //subtract of the start day and finish day
    private int daysToStay;

    //the start date that a guest wants to stay in the hotel
    private String start;

    //the finish day that a guest wants to leave the hotel
    private String finish;

    /**
     * setting a new start dat
     * @param start start day yyyymmdd format
     */
    public void setStartDay(String start){
        this.start = start;
    }

    /**
     * getting the start day
     * @return returning yyyymmdd format
     */
    public String getStartDate(){
        return start;
    }

    /**
     * setting a new finish day
     * @param finish yyyymmdd format
     */
    public void setFinishDay(String finish) {
        this.finish = finish;
    }

    /**
     * getting the finish day
     * @return returning yyyymmdd format
     */
    public String getFinishDay() {
        return finish;
    }

    /**
     * this method will calculate how many days the guest wants to stay in the hotel
     * @param finish giving the finish date to the method
     */
    public void setDaysToStay(String finish) {
        int y = Integer.parseInt(finish.substring(0,4)) - Integer.parseInt(start.substring(0,4));
        int m = Integer.parseInt(finish.substring(4,6)) - Integer.parseInt(start.substring(4,6));
        int d = Integer.parseInt(finish.substring(6,8)) - Integer.parseInt(start.substring(6,8));
        daysToStay = (y * 365) + (m * 30) + d;
    }

    /**
     * getting the number of days that the guest wants to stay
     * @return integer of days
     */
    public int getDaysToStay() {
        return daysToStay;
    }

    /**
     * this method will print a date information
     */
    public void printDate(){
        System.out.println("Start Date : " + start);
        System.out.println("Finish Date : " + finish);
        System.out.println("Days to Stay : " + daysToStay);
    }

    /**
     * this method will calculate the number of interference between the start day og this.date and the finish date of another date
     * @param date1 another date
     * @return number of interference
     */
    public int calculateDifferentInStartDay(Date date1){
        return Integer.parseInt(start) - Integer.parseInt(date1.getFinishDay());
    }
    /**
     * this method will calculate the number of interference between the finish day og this.date and the start date of another date
     * @param date1 another date
     * @return number of interference
     */
    public int calculateDifferentInFinishDay(Date date1){
        return Integer.parseInt(finish) - Integer.parseInt(date1.getStartDate());
    }
}
