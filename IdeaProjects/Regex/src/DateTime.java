import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {

        ZonedDateTime dataCzas = ZonedDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy MM dd");
        String tekst = dataCzas.format(f);                          //Błąd na slajdzie - możliwa różnica wersji JAVY
        System.out.print(tekst);


        tekst = "2018 05 03";
        f = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate data = LocalDate.parse(tekst, f);
        System.out.println();
    }

}
