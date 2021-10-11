package zoologico;

import java.io.*;
import java.awt.Color;

public class Gaviao extends Ave implements Voo {
    public Gaviao(Color corDaPena) {
        setPena(corDaPena);
    }

    public void emitirSom() {
        System.out.println("O Gaviao emitiu um atiado!");
    }

    public void Voar(float altitude) {
        System.out.println("O Gaviao voou a "+altitude+" metros de altitude!");
    }
}