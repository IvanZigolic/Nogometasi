import Model.Nogometas;
import Model.Sportas;

import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ArrayList<Nogometas> sportasi = new ArrayList<>();
    Nogometas ng1 = new Nogometas("Marko Maric", 19, 3);
    Nogometas ng2 = new Nogometas("Luka Modric", 10, 20);
    Nogometas ng3 = new Nogometas("Leo Cosic", 3, 0);
    Nogometas ng4 = new Nogometas("Ivan Perisic", 7, 25);

    sportasi.add(ng1);
    sportasi.add(ng2);
    sportasi.add(ng3);
    sportasi.add(ng4);
    for(Nogometas n : sportasi){
    System.out.println(n.toString());
    }
        System.out.println("Nakon sortiranja");
        Collections.sort(sportasi);
        for(Nogometas n : sportasi){
            System.out.println(n.toString());
        }
    }
}