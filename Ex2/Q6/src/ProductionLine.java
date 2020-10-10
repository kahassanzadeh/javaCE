/**
 * this class is created for defining a production line in the company
 * this class can store production line's name and the type of a product that this production line can create
 *
 * @author Mohammadreza Hassanzadeh
 * @version 0.0
 * @since 2020-08-10
 */


public class ProductionLine {
    // the name of the production line
    private String name;

    // product that this production line is creating
    private Product type ;

    /**
     * printing the name of the production line and the product's name
     */
    public void print(){
        System.out.printf("Name: %s | Product: %s \n",name,type.getName());
    }

    /**
     * getting the name of the production line
     * @return name of the production line
     */
    public String getName(){
        return name;
    }

    /**
     * setting a new product for this production line
     * @param name name of the new product
     * @param price price of the new product
     */
    public void setType(String name,int price){
        this.type = new Product(name,price);
    }

    /**
     * setting a new name for production line
     * @param name new name of the production line
     */
    public void setName(String name){
        this.name = name;
    }

}
