package zoologico;

import java.io.*;
import java.awt.Color;

public class Morcego extends Mamifero implements Voo {
    public Morcego(Color corDoPelo) {
        setPelo(corDoPelo);
    }

    public void emitirSom() {
        System.out.println("O Morcego emitiu um farfalho!");
    }

    public void Voar(float altitude) {
        System.out.println("O Morcego voou a "+altitude+" metros de altitude!");
    }
}