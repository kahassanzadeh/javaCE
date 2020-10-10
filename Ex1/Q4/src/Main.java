import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = "";
        if(number % 3 == 0){
            result += "Pthree";
        }
        if(number % 5 == 0){
            result += "Pfive";
        }
        if(number % 7 == 0){
            result += "Pseven";
        }
        if(result != ""){
            System.out.println(result);
        }
        else{
            System.out.println(number);
        }

    }
}
