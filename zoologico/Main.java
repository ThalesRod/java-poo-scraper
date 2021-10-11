package zoologico;

import java.util.Scanner;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {

        Gaviao g = null;
        Avestruz a = null;
        Leao l = null;
        Morcego m = null;

        Color[] cores = {Color.red, Color.green, Color.blue, Color.white, Color.black};
        int animalCod;
        Scanner console = new Scanner(System.in);

        System.out.println("Ola, insira os dados dos 4 animais do zoologico.\n");

        boolean aindaTemAnimalParaEditar = true;
        while(aindaTemAnimalParaEditar) {
            System.out.println("Qual animal deseja inserir/editar?");
            System.out.println("[1] Gaviao | [2] Avestruz | [3] Leao | [4] Morcego | [5] Nenhum");
            animalCod = console.nextInt();

            switch(animalCod - 1) {
                case 0:
                    System.out.println("Cor: [1] Vermelho | [2] Azul | [3] Verde | [4] Branco | [5] Preto");
                    g = new Gaviao(cores[console.nextInt() - 1]);
                    System.out.print("Idade: ");
                    g.setIdade(console.nextInt());
                    System.out.print("Tamanho: ");
                    g.setTamanho(console.nextFloat());
                    break;
                case 1:
                    System.out.println("Cor: [1] Vermelho | [2] Azul | [3] Verde | [4] Branco | [5] Preto");
                    a = new Avestruz(cores[console.nextInt() - 1]);
                    System.out.print("Idade: ");
                    a.setIdade(console.nextInt());
                    System.out.print("Tamanho: ");
                    a.setTamanho(console.nextFloat());
                    break;
                case 2:
                    System.out.println("Cor: [1] Vermelho | [2] Azul | [3] Verde | [4] Branco | [5] Preto");
                    l = new Leao(cores[console.nextInt() - 1]);
                    System.out.print("Idade: ");
                    l.setIdade(console.nextInt());
                    System.out.print("Tamanho: ");
                    l.setTamanho(console.nextFloat());
                    break;
                case 3:
                    System.out.println("Cor: [1] Vermelho | [2] Azul | [3] Verde | [4] Branco | [5] Preto");
                    m = new Morcego(cores[console.nextInt() - 1]);
                    System.out.print("Idade: ");
                    m.setIdade(console.nextInt());
                    System.out.print("Tamanho: ");
                    m.setTamanho(console.nextFloat());
                    break;
                default:
                    // Nenhum
                    aindaTemAnimalParaEditar = false;
            }        
        }

        System.out.println("\n====================================================\n");

        if (g != null) {
            System.out.println("=> Gaviao:");
            System.out.println("Cor: ("+g.getPena().getRed()+","+g.getPena().getGreen()+","+g.getPena().getBlue()+")");
            System.out.println("Idade: " + g.getIdade());
            System.out.println("Tamanho: " + g.getTamanho());
            g.emitirSom();
            g.botarOvo();
            g.Voar((float) 10.5);
            System.out.println();
        }

        if (a != null) {
            System.out.println("=> Avestruz:");
            System.out.println("Cor: ("+a.getPena().getRed()+","+a.getPena().getGreen()+","+a.getPena().getBlue()+")");
            System.out.println("Idade: " + a.getIdade());
            System.out.println("Tamanho: " + a.getTamanho());
            a.emitirSom();
            a.botarOvo();
            System.out.println();
        }

        if (l != null) {
            System.out.println("=> Leao:");
            System.out.println("Cor: ("+l.getPelo().getRed()+","+l.getPelo().getGreen()+","+l.getPelo().getBlue()+")");
            System.out.println("Idade: " + l.getIdade());
            System.out.println("Tamanho: " + l.getTamanho());
            l.emitirSom();
            l.amamentar();
            System.out.println();
        }

        if (m != null) {
            System.out.println("=> Morcego:");
            System.out.println("Cor: ("+m.getPelo().getRed()+","+m.getPelo().getGreen()+","+m.getPelo().getBlue()+")");
            System.out.println("Idade: " + m.getIdade());
            System.out.println("Tamanho: " + m.getTamanho());
            m.emitirSom();
            m.amamentar();
            m.Voar((float) 4.6);
            System.out.println();
        }

	}
}
