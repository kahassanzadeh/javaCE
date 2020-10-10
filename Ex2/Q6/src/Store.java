import java.util.ArrayList;
import java.util.Iterator;

/**
 * this class is created for storing the list of products that exist in the store
 * we can adding a new product or removing a product and calculating the value in the store
 *
 * @author Mohammadreza Hassanzadeh
 * @version 0.0
 * @since 2020-08-10
 */

public class Store {
    // list of products that exist in the store
    private ArrayList<Product> products = new ArrayList<Product>();

    // this list is for the amounts of a product
    private ArrayList<Integer> amounts = new ArrayList<Integer>();

    /**
     * this method can add a new product to the products list or add the amount of the product
     * if the product was defined it will increase the amount of the product
     * @param name name of the product
     * @param price adding the price of the product
     * @param amount the amount of the product
     */
    public void addProduct(String name,int price,int amount){
        boolean flag = false;
        int counter = 0;
        for (Product product : products) {
            if (name.equals(product.getName())) {
                amounts.set(counter, amounts.get(counter) + amount);
                flag = true;
            }
            counter++;
        }
        if(!flag){
            products.add(new Product(name,price));
            amounts.add(amount);
        }
    }

    /**
     * this method can decreasing the amount of a product
     * if the product's amount is 0 or less than that, the product will be removed from the lists
     * @param name getting the name of the product
     * @param amount getting the amount that we want to decrease
     */
    public void RemoveProduct(String name,int amount){
        int counter = 0;
        Iterator<Product> it = products.iterator();
        while(it.hasNext()){
            if (name.equals(it.next().getName())) {
                amounts.set(counter, amounts.get(counter) - amount);
                if(amounts.get(counter) <= 0){
                    it.remove();
                    amounts.remove(counter);
                }
            }
            counter++;
        }
    }

    /**
     * this method calculates the value of the store
     */
    public void CalcValue(){
        int sum = 0;
        int counter = 0;
        for(Product pr: products){
            sum += pr.getPrice() * amounts.get(counter);
            counter++;
        }
        System.out.println(sum);
    }

    /**
     * getting the list of the products
     * @return arraylist of products
     */
    public ArrayList<Product> getProducts(){
        return  products;
    }

    /**
     * getting the list of amounts of the products
     * @return arraylist of the amounts
     */
    public ArrayList<Integer> getAmounts(){
        return amounts;
    }
}
