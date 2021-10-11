package zoologico;

import java.io.*;
import java.awt.Color;

public class Leao extends Mamifero {
    public Leao(Color corDoPelo) {
        setPelo(corDoPelo);
    }

    public void emitirSom() {
        System.out.println("O Leao emitiu um rugido!");
    }
}