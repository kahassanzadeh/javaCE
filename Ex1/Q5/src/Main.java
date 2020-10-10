import java.util.Scanner;

public class Main {
    static int atoi(String inputString){
        char[] mainString = inputString.toCharArray();
        int number = 0;
        boolean flagNegative = false;
        int Spaces = spaceReturner(inputString);
        for(int foo = 0;foo < inputString.length();foo++){
            if(foo > (inputString.length() - Spaces - 1)) {
                mainString[foo] = ' ';
            }
            else {
                mainString[foo] = mainString[Spaces + foo];
            }
        }
        for(int foo = 0;foo < mainString.length;foo++){
            if (Character.isDigit(mainString[foo])) {
                 number += (int)mainString[foo] - (int)'0';
                 number *= 10;
            }
            else if(foo == 0 && mainString[foo] == '-'){
                flagNegative = true;
            }
            else if(foo == 0 && mainString[foo] == '+'){
                flagNegative = false;
            }
            else{
                break;
            }
        }
        number /= 10;
        if(flagNegative){
            return number * (-1);
        }
        return number;
    }
    static int spaceReturner(String inputString){
        char[] mainString = inputString.toCharArray();
        int counter = 0;
        for(int i = 0;i < inputString.length();i++){
            if(mainString[i] == ' '){
                counter++;
            }
            else{
                break;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String inputString = input.nextLine();
        System.out.print(atoi(inputString));

    }
}
