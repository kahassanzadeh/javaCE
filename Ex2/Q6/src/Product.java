/**
 * this class created for the products that this company creates
 * in this class we can define the products name and its price
 *
 * @author Mohammadreza Hassanzadeh
 * @version 0.0
 * @since 2020-08-10
 */


public class Product {
    //the name of the product
    public String name;

    //the price of the product
    public int price;

    /**
     * constructor of the class adding the name of the product and its price
     * @param name the name of the product
     * @param price the price of the product
     */
    public Product(String name,int price){
        this.name = name;
        this.price = price;
    }

    /**
     * getting the name of the product
     * @return name of the product
     */
    public String getName(){
        return name;
    }

    /**
     * getting the price of the product
     * @return price of the product
     */
    public int getPrice(){
        return price;
    }

}
