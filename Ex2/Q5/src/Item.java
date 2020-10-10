/**
 * this class created for adding some items for the supermarket
 * the user can add some products and prices and the name of the product
 * the amount of discount and the amount of the product
 *
 *
 * @author Mohammadreza Hassanzadeh
 * @version 0.0
 * @since 2020-08-10
 */


public class Item {
    //name of the product
    private String name;

    //producer of the product
    private String producer;

    //price of the product
    private int price;

    //the discount that the user want to apply to this product
    private float discount;

    //the amount of the product
    private int amount;

    /**
     * It's a constructor for this class
     *
     * @param name getting the name of the product
     * @param price getting the price of the product
     * @param producer getting the name of the producer
     */
    public Item(String name,int price,String producer){
        this.name = name;
        this.price = price;
        this.producer = producer;
        amount = 0;
        discount = 0;
    }

    /**
     * adding the amount of the product
     *
     * @param amount number that user wants to increase the amount of product
     */
    public void increment(int amount){
        this.amount += amount;
    }

    /**
     * decreasing the amount of the product
     * @param amount number that user wants to decrease the amount of product
     */
    public void decrement(int amount){
        this.amount -= amount;
    }

    /**
     * setting a discount for the product
     * @param discount enter the discount by percentage
     */
    public void setDiscount(int discount){
        this.discount = discount;
    }

    /**
     * applying the discount to the price
     * @return discounted number
     */
    public int applyDiscount(){
        return (int)((float)(price) - ((discount / 100) * (float)(price)));
    }

    /**
     * printing the information of a product
     */
    public void print(){
        System.out.printf("Name : %s \n",name);
        System.out.printf("Producer : %s \n",producer);
        System.out.printf("Initial price : %s \n",price );
        System.out.printf("Discounted price : %s \n",applyDiscount());
        System.out.printf("Amount : %s \n",amount);
        System.out.println("***********************************");
    }
}
