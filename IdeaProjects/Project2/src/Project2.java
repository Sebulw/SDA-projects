import sun.security.krb5.JavaxSecurityAuthKerberosAccess;

import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        int liczba = skaner.nextInt();
        int i = 0;

        while (i<=liczba) {
            if (i==liczba){
                System.out.print(i);
            }
            else {
                System.out.print(i+",");
            }
            ++i;
        }
    }
}
