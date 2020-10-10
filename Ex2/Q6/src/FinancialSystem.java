import java.util.ArrayList;
import java.util.Iterator;
/**
 * this class is for the whole company that can control all the things like store, production lines
 *
 *
 * @author Mohammadreza Hassanzadeh
 * @version 0.0
 * @since 2020-08-10
 */
public class FinancialSystem {
    // list of the production lines
    private ArrayList<ProductionLine> productionLine = new ArrayList<ProductionLine>();
    // an object of the store
    private Store store = new Store();

    /**
     * printing all production lines
     */
    public void printAllProductionLines(){
        for(ProductionLine prl: productionLine){
            prl.print();
        }
    }

    /**
     * this methode can add production line to the list of production lines
     * @param lineName the name of the production line
     * @param productName the name of the product
     * @param price the price of the product
     */
    public void addProductionLine(String lineName,String productName,int price){
        ProductionLine tmp = new ProductionLine();
        tmp.setName(lineName);
        tmp.setType(productName,price);
        productionLine.add(tmp);
    }

    /**
     * removing a roduction line from the list of the production line
     * @param lineName the name of he production line
     */
    public void removeProductionLine(String lineName){
        Iterator<ProductionLine> it = productionLine.iterator();
        while(it.hasNext()){
            if(it.next().getName().equals(lineName)){
                it.remove();
            }
        }
    }

    /**
     * printing the storage of the company
     */
    public void printAllStorageProducts(){
        ArrayList<Integer> quantity ;
        quantity = store.getAmounts();
        int counter = 0;
        for(Product pr : store.getProducts()){
            System.out.printf("ProductName: %s | Quantity: %d \n",pr.getName(),quantity.get(counter));
            counter++;
        }
    }

    /**
     * adding new product to the store from store class
     * @param productName the name of the product
     * @param price the price of the product
     * @param amount the amount of the product
     */
    public void addProductToStore(String productName,int price,int amount){
        store.addProduct(productName,price,amount);
    }

    /**
     * remove products from store using store class
     * @param productName the name of the product
     * @param amount the amount of the product that we want to remove
     */
    public void removeProductFromStore(String productName,int amount){
        store.RemoveProduct(productName,amount);
    }

    /**
     * printing the value of the store using store class
     */
    public void printValueOfStore(){
        store.CalcValue();
    }
}
