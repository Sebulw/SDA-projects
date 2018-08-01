import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataCzasZadanie2 {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj datę w formacie yyyy-MM-dd");
        String dateTime = skaner.next();
        DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateTime, currentDate);

    }

}
