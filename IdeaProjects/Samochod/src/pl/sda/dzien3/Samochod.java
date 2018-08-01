package pl.sda.dzien3;

public class Samochod {

    private String marka;
    private int wysokosc = 150;
    private int szerokosc = 180;
    private int dlugosc = 300;
    private String kolor;
    int swiatla;
    int predkosc;
    String [][] zawartosc = new String[10][10];
    private double spalanie;
    private double temperatura;
    int przyspiesz;
    int zwolnij;
    private double tempMax = 30.0;
    private double tempMin = 15.0;
    private double tempAktualna;

    public Samochod(String marka, String kolor, int wysokosc, int szerokosc, int dlugosc) {
        this.kolor = kolor;
        this.marka = marka;
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;

        System.out.println(this.kolor+" samochód marki "+this.marka+" o wymiarach "+this.szerokosc+"cm"+" szerokości, "+this.dlugosc+"cm długości i wysokości "+this.wysokosc+"cm zjechał z linii produkcyjnej.");
    }

    public Samochod() {                 //konstruktor domyślny bez parametrów - musi być public(zawsze)
        this.kolor = "Biały";           //należy podać na sztywno parametry
        this.marka = "Citroen";
        this.wysokosc = 140;
        this.szerokosc = 185;
        this.dlugosc = 350;

        System.out.println(this.kolor+" samochód marki "+this.marka+" o wymiarach "+this.szerokosc+"cm"+" szerokości, "+this.dlugosc+"cm długości i wysokości "+this.wysokosc+"cm zjechał z linii produkcyjnej.");
    }

    private void setTemp(double temperatura){
        if(temperatura > tempMax)
            tempAktualna = tempMax;
        else if(temperatura < tempMin)
            tempAktualna = tempMin;
        else tempAktualna = temperatura;
    }
    public void dodaj1(){
        setTemp((int) this.tempAktualna+1);
    }
    public void odejmij1(){
        setTemp((int) this.tempAktualna-1);
    }

    public double getTemp() {
        return tempAktualna;
    }
/*    public void setTemp(double t) {
        if(t>15 && t<30)
            temperatura = t;
        else
            System.out.println("Paaaanie to się nie da");
    }*/

    public double showCombusion() {
        return spalanie;
    }
    public void currentCombusion(double s) {
        if(s>5 && s<50)
            spalanie = s;
        else
            System.out.println("Jedź Pan do warsztatu bo to niemożliwe!");
    }

    public int showSpeed() {
        return predkosc;
    }
    public void currentSpeed(int p) {
        if (p>50 && p<160)
            predkosc = p;
        else if (p<50)
            System.out.println("Przyspiesz trochę!");
        else
            System.out.println("Gdzie się tak spieszysz?!");
    }
    public int turnOnLights() {
        return swiatla;
    }
    public void lightsState(int L) {
        if (L < 1)
            swiatla = L;
    }


    //ZADANIE
    //Geteer i setter poprawnie nazwane
    //Zabezpieczyć setter przed niepoprawnymi wartościami
    //Dwa przykładowe obiekty
    //W Main napisać przykład poprawnego zastosowania i niepoprawnego (komunikat)

    //ZADANIE 2
    //Stworzyć konstruktor przyjmujący parametry do ustawienia na początku
    //Konstruktor ma wypisać komunikat o obiekcie, który stworzył
    //Pola ustawiane przez konstruktor powinny być private
    //W Main stworzyć przynajmniej 2 obiekty tego typu

    /*boolean wlacz;
    public void start{wlacz = true};
    public void start{wlacz = false};

    boolean jedzDoPrzodu;
    public void jedzProdz{jedzDoPrzodu = true};
    public void jedzPrzod{jedzDoPrzodu = false};

    boolean jedzDoTylu;
    public void jedzTyl{jedzDoTylu = true};
    public void jedzTyl{jedzDoTylu = false};

    boolean skrecLewo;
    public void lewoskret{skrecLewo = true};
    public void lewoskret{skrecLewo = false};

    boolean skrecPrawo;
    public void prawoskret{skrecPrawo = true};
    public void prawoskret{skrecPrawo = true};

    boolean drzwiOtwarte;
    public void oTwieranieDrzwi{drzwiOtwarte = true};
    public void otwieranieDrzwi{drzwiOtwarte = false};

    boolean drzwiZamkniete;
    public void zamykanieDrzwi{drzwiZamkniete = true};
    public void zamykanieDrzwi{drzwiZamkniete = false};

    boolean radioWlaczone;
    public void radioOn{radioWlaczone = true};
    public void radioOn{radioWlaczone = false};

    boolean radioWylaczone;
    public void radioOff{radioWylaczone = true};
    public void radioOff{radioWylaczone = false};

    boolean swiatlaWlaczone;
    public void lightsOn{swiatlaWlaczone = true};
    public void lightsOn{swiatlaWlaczone = false};

    boolean swiatlaWylaczone;
    public void lightsOff{swiatlaWylaczone = true};
    public void lightsOff{swiatlaWylaczone = false};
*/

}
