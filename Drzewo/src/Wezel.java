import java.util.ArrayList;

public class Wezel {

    String dane;
    ArrayList<Wezel> dzieci = new ArrayList<>();

    Wezel(String wartosc) {
        dane = wartosc;
    }

    public boolean czyLisc() {
        return false;
    }


}
