package Model;

public class Nogometas extends Sportas implements Comparable<Nogometas>{
    private int brGolova;
    private int brAsistencija;
    public Nogometas(String ime, int brDresa, int brGolova, int brAsistencija) {
        super(ime, brDresa);
        this.brGolova = brGolova;
        this.brAsistencija = brAsistencija;
    }

    public int getBrGolova() {
        return brGolova;
    }

    public void setBrGolova(int brGolova) {
        this.brGolova = brGolova;
    }

    public int getBrAsistencija() {
        return brAsistencija;
    }

    public void setBrAsistencija(int brAsistencija) {
        this.brAsistencija = brAsistencija;
    }

    @Override
    public int compareTo(Nogometas o) {
        return Integer.compare(o.brGolova, this.brGolova);
    }

    @Override
    public String toString() {
        return "Sportas " + ime + " s brojem " + brDresa + " je zabio " + brGolova + " golova.";
    }

    public void Asistencije(){
    System.out.println("Sportas " + ime + " s brojem " + brDresa + " je asistirao " + brAsistencija + " golova.");
    }

}
