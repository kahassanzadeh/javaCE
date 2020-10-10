

public class Main {
    public static void main(String[] args) {
        FinancialSystem tmp = new FinancialSystem();
        tmp.addProductionLine("tolidi chtooz","pofak",2500);
        tmp.addProductionLine("tolidi nakh","nakh",45000);
        tmp.addProductToStore("mahi",25000,45);
        tmp.addProductToStore("mahi",25000,20);
        tmp.addProductToStore("mast",5000,35);
        tmp.addProductToStore("hendoneh",45000,10);
        tmp.removeProductionLine("tolide chitooz");
        tmp.removeProductFromStore("mast",40);
        tmp.printAllStorageProducts();
        tmp.printAllProductionLines();
        tmp.printValueOfStore();

        }
    }
