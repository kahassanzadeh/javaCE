public class Main {

    public static void main(String[] args) {
        Item chocolate = new Item("chocolate",10000,"Farmand");
        Item snack = new Item("snack",5000,"Chakelz");
        chocolate.increment(5);
        snack.increment(3);
        chocolate.setDiscount(30);
        chocolate.decrement(2);
        chocolate.print();
        snack.print();
    }
}
