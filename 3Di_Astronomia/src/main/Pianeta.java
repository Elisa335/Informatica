package main;

public class Pianeta {
    
    private String nome;
    private double raggio;
    private double massa;
    private double distanzaStella;

    public String getNome() {
        return nome;
    }
    
    public Pianeta(String nome, double distanza) {
        
        this.nome = nome;
        this.distanzaStella = distanza;
    }

    @Override
    public String toString() {
        
        return nome + ": " + distanzaStella;
    }
    
    
    
}
