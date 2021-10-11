package zoologico;

public abstract class Animal {
    private int idade;
    private float tamanho;

    // Getters
    public int getIdade() {
        return idade;
    }

    public float getTamanho() {
        return tamanho;
    }

    // Setters
    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public void setTamanho(float novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public abstract void emitirSom();
    
}