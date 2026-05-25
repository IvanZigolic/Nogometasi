package Model;

public class Sportas {
    public String ime;
    public int brDresa;

    public Sportas(String ime, int brDresa) {
        this.ime = ime;
        this.brDresa = brDresa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrDresa() {
        return brDresa;
    }

    public void setBrDresa(int brDresa) {
        this.brDresa = brDresa;
    }
    public String toString() {
    return ime + " - " + brDresa;
    }
}
