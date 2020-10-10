import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> lst = new ArrayList<Integer>();
        String numbers = input.nextLine();
        for (String field : numbers.split(" ")) {
            lst.add(Integer.parseInt(field));
        }
        Shape shape = new Shape();
        if(lst.get(0) == 0){
            shape.drawSquare(lst.get(1));
            System.out.print(shape.getCountOfStars());
        }
        else if(lst.get(0) == 1){
            shape.drawRectangle(lst.get(1),lst.get(2));
            System.out.print(shape.getCountOfStars());
        }
        else if(lst.get(0) == 2){
            shape.drawTriangle(lst.get(1));
            System.out.print(shape.getCountOfStars());
        }
        else if(lst.get(0) == 3){
            shape.drawCross(lst.get(1),lst.get(2));
            System.out.print(shape.getCountOfStars());
        }
    }
}
