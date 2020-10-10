import java.util.Scanner;

public class Main {

    static String checkRoot(String str1, String str2){
        char[] str1Ch = str1.toCharArray();
        char[] str2Ch = str2.toCharArray();
        if(str1.length() != str2.length()){
            return "NO";
        }
        for(int foo = 0;foo < str1.length();foo++){
            for(int bar = 0;bar < str1.length();bar++){
                if(str1Ch[foo] == str2Ch[bar]){
                    str1Ch[foo] = '\0';
                    str2Ch[bar] = '\0';
                    break;
                }
            }
            if(str1Ch[foo] != '\0'){
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        System.out.print(checkRoot(str1,str2));
    }
}
