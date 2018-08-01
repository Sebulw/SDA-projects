import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        String s1 = skaner.nextLine();
        String s2 = skaner.nextLine();
        String s3 = skaner.nextLine();
        String s4 = skaner.nextLine();

        List<String> userList = Arrays.asList(s1, s2, s3, s4);

        Collections.sort(userList, (str1, str2) -> str1.length() - str2.length());      // FUNKCJA LAMBDA

        userList.forEach(l -> System.out.println(l));

    }

}
