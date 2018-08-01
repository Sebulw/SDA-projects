package pl.sda.Dzien4;

public class Talerz extends Naczynie {
    double szerokosc;

    public Talerz(double a, double b) { // talerz dziedziczy glebokosc od naczynia i ma własną szerokość oraz zmieniony wzór na pojemność
        glebokosc = a;
        szerokosc = b;
    }

    public double pojemnosc() {         // jeżeli wartość zwracana nie została by zmieniona to talerz odziedziczy ją po naczyniu
        return glebokosc*szerokosc/2;
    }
}
