package zoologico;

import java.io.*;
import java.awt.Color;

public class Avestruz extends Ave {
    public Avestruz(Color corDaPena) {
        setPena(corDaPena);
    }

    public void emitirSom() {
        System.out.println("O Avestruz emitiu um grasnido!");
    }
}