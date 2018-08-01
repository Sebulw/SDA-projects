package pl.sda.dzien3;

public class main {
    public static void main(String[] args) {

        Samochod mojSamochod = new Samochod("Mazda", "Niebieski", 150, 180, 300);

        Samochod drugiSamochod = new Samochod("Audi", "Czarny", 165, 200, 290);

        Samochod somsiadaZlodzieja = new Samochod("Złodziejska", "Złodziejski", 145, 190, 315);

        Samochod trzeciSamochod = new Samochod();

//        System.out.println("Kolor mojego samochodu jest "+mojSamochod.kolor);
//        nie można pobrać koloru ponieważ "kolor" jest prywatny. Potrzebny jest osobny GETTER

//        mojSamochod.setTemp(15.6);
        System.out.println("Temperatura w moim samochodzie: "+mojSamochod.getTemp());

//        drugiSamochod.setTemp(21.0);
        System.out.println("Temperatura w drugim samochodzi: "+drugiSamochod.getTemp());

//        drugiSamochod.setTemp(8.0);

        mojSamochod.currentCombusion(9.6);
        System.out.println("Aktualne spalanie w moim samochodzi: "+mojSamochod.showCombusion());

        drugiSamochod.currentCombusion(12.5);
        System.out.println("Aktualne spalanie w drugim samochodzie: "+drugiSamochod.showCombusion());

        drugiSamochod.currentCombusion(2.0);

        mojSamochod.currentSpeed(80);
        System.out.println("Aktualna prędkość: "+mojSamochod.showSpeed());

        drugiSamochod.currentSpeed(30);

        drugiSamochod.currentSpeed(200);

        mojSamochod.dodaj1();
        mojSamochod.dodaj1();
        mojSamochod.dodaj1();
        System.out.println("Temperatura w moim samochodzie: "+mojSamochod.getTemp());
    }
}
