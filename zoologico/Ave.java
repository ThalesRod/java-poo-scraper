package zoologico;

import java.io.*;
import java.awt.Color;

public abstract class Ave extends Animal {
    private Color pena;

    // Getters
    public Color getPena() {
        return pena;
    }

    // Setters
    public void setPena(Color novaPena) {
        this.pena = novaPena;
    }

    public void botarOvo() {
        System.out.println("Uma ave de cor ("+pena.getRed()+","+pena.getGreen()+","+pena.getBlue()+") botou um ovo!");
    }
}