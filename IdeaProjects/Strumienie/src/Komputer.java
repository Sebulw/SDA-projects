public class Komputer {
    public final String marka;
    public final double taktowanieCpu;
    public final double taktowanieGpu;
    public final double taktowanieRam;
    public final double cena;
    public final int pamiecRam;
    public final int gpuRam;

    public Komputer(String marka, double taktowanieCpu, double taktowanieGpu, double taktowanieRam, double cena,
                    int pamiecRam, int gpuRam) {
        this.marka = marka;
        this.taktowanieCpu = taktowanieCpu;
        this.taktowanieGpu = taktowanieGpu;
        this.taktowanieRam = taktowanieRam;
        this.cena = cena;
        this.pamiecRam = pamiecRam;
        this.gpuRam = gpuRam;
    }

}
