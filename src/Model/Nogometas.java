package Model;

public class Nogometas extends Sportas implements Comparable<Nogometas>{
    private int brGolova;

    public Nogometas(String ime, int brDresa, int brGolova) {
        super(ime, brDresa);
        this.brGolova = brGolova;
    }

    public int getBrGolova() {
        return brGolova;
    }

    public void setBrGolova(int brGolova) {
        this.brGolova = brGolova;
    }

    @Override
    public int compareTo(Nogometas o) {
        return Integer.compare(o.brGolova, this.brGolova);
    }

    @Override
    public String toString() {
        return "Sportas " + ime + " s brojem " + brDresa + " je zabio " + brGolova + " golova";
    }
}
