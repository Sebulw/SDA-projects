public class KoszNaOwoce<O extends Owoc> {

    private O owoc;

    public KoszNaOwoce(O fruit) {
        this.owoc = fruit;
        System.out.println("Jestem koszem na: "+this.owoc);
    }

    public O getOwoc() {
        return owoc;
    }

}
