package zoologico;

import java.io.*;
import java.awt.Color;

public abstract class Mamifero extends Animal {
    private Color pelo;

    // Getters
    public Color getPelo() {
        return pelo;
    }

    // Setters
    public void setPelo(Color novoPelo) {
        this.pelo = novoPelo;
    }

    public void amamentar() {
        System.out.println("Um mamimero de cor ("+pelo.getRed()+","+pelo.getGreen()+","+pelo.getBlue()+") amamentou!");
    }
}