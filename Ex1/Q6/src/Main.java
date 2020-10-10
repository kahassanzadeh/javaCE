import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        char[] mainString = inputString.toCharArray();
        int counter = 0;
        for(int i = 0 ; i < inputString.length() ; i++){
            counter = 0;
            for(int j = i + 1; j < inputString.length() ; j++){
                if(mainString[i] == mainString[j]){
                    counter += 1;
                    mainString[j] = '-';
                }
            }
            if(counter > 0 && mainString[i] != '-'){
                System.out.println(mainString[i]);
            }
        }
    }
}
