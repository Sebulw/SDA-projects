import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        /*List<Samochod> auta = Arrays.asList(
                new Samochod("Mazda RX8", 125, 16900,186000),
                new Samochod("Fiat Punto", 69, 28900, 31500),
                new Samochod("Ford Mustang", 320, 59999, 94000));

        *//*for(Samochod a : auta){
            if(a.mocKM>100){
                if(a.przebieg < 200000){
                    if(a.cena<30000){
                        System.out.println(a.nazwa.toUpperCase());
                    }
                }
            }
        }*//*                 // PONIŻSZA WERSJA JEST LEPSZA ALE DZIAŁAJĄ TAK SAMO

        auta.stream()
                .filter(a -> a.mocKM >100)
                .filter(a -> a.przebieg <200000)
                .filter(a -> a.cena < 30000)
                .map(a -> a.nazwa.toUpperCase())
                .forEach(System.out::println);*/

//--------------------------- WYSZUKIWARKA KOMPUTERÓW ---------------------------------
        List<Komputer> komputery = Arrays.asList(
                new Komputer("MSI GT75", 4100, 2200, 2700, 5399,
                        8, 4),
                new Komputer("HP", 3300, 2800, 2300, 4999,
                        6, 6),
                new Komputer("Dell", 2700, 2000, 2000, 3399,
                        4, 2),
                new Komputer("Lenovo Z520", 4200, 3000, 3300, 6200,
                        16, 8));


        System.out.println("Podaj minimalne taktowanie procesora: ");
        double cpuScan = skaner.nextDouble();
        System.out.println("Podaj minimalne taktowanie procesora graficznego:");
        double gpuScan = skaner.nextDouble();
        System.out.println("Podaj minimalne taktowanie pamięci ram:");
        double ramScan1 = skaner.nextDouble();
        System.out.println("Podaj maksymalną cenę komputera");
        double priceScan = skaner.nextDouble();
        System.out.println("Podaj minimalną ilość pamięci ram w gigabajtach:");
        int ramScan2 = skaner.nextInt();
        System.out.println("Podaj minimalną ilość pamięci ram karty graficznej w gigabajtach:");
        int gpuRamScan = skaner.nextInt();


        komputery.stream()
                .filter(a -> a.taktowanieCpu >= cpuScan)
                .filter(a -> a.taktowanieGpu >= gpuScan)
                .filter(a -> a.taktowanieRam >= ramScan1)
                .filter(a -> a.cena <= priceScan)
                .filter(a -> a.pamiecRam >= ramScan2)
                .filter(a -> a.gpuRam >= gpuRamScan)
                .map(a -> a.marka)
                .forEach(System.out::println);




    }

}
