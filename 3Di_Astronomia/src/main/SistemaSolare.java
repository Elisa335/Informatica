package main;

import java.util.ArrayList;

public class SistemaSolare {
    
    private String nomeStella;
    private double massaStella;
    
                  // generics
    private ArrayList<Pianeta> pianeti;

    public SistemaSolare(String nomeStella) {
        
        this.nomeStella = nomeStella;
        pianeti = new ArrayList<>();
    }
    
    /**
     * Aggiunge un nuovo pianeta in coda alla lista
     * @param nuovo nuovo pianeta da aggiungere
     */
    public void appendi(Pianeta nuovo) {
        
        pianeti.add(nuovo);
    }
    
    /**
     * Aggiunge un nuovo pianeta in una posizione specifica
     * @param nuovo nuovo pianeta da aggiungere
     * @param posizione posizione in cui inserire il pianeta [0-size]
     * @return vero se il pianeta è stato inserito, falso se la posizione indicata è non valida
     */
    public boolean inserisci(Pianeta nuovo, int posizione) {
        
        // controllo la validità dell'indice
        if (posizione < 0 || posizione > pianeti.size())
            return false;
        
        pianeti.add(posizione, nuovo);
        return true;
    }
    
    /**
     * Cerca nella lista se il pianeta è presente
     * @param p pianeta da cercare
     * @return esito della ricerca
     */
    public boolean contiene(Pianeta p) {
        
        //return trovaPosizione(p) != -1;
        
        return pianeti.contains(p);
    }
    
    /**
     * Cerca se nella lista è presente un pianeta, dato il suo nome
     * @param nomePianeta nome del pianeta da cercare
     * @return esito della ricerca
     */
    public boolean contiene(String nomePianeta) {
        
        /*for (int i=0; i < pianeti.size(); i++) {
            
            Pianeta p = pianeti.get(i);
            //...
        }*/
        
        for (Pianeta p : pianeti) {
            
            if (p.getNome().equals(nomePianeta))
                return true;
        }
        
        return false;
    }
    
    /**
     * Cerca un pianeta nella lista e restituisce la posizione
     * @param p pianeta da cercare
     * @return posizione della lista, -1 se non presente
     */
    public int trovaPosizione(Pianeta p) {
        
        return pianeti.indexOf(p);
    }
    
    /**
     * Recupera un pianeta nella lista data la sua posizione
     * @param indice posizione del pianeta da leggere
     * @return pianeta cercato, null se non presente
     */
    public Pianeta leggiPianeta(int indice) {
        
        if (indice < 0 || indice >= pianeti.size())
            return null;
        
        return pianeti.get(indice);
    }
    
    /**
     * Sostituisce un pianeta data la sua posizione
     * @param indice posizione del pianeta da modificare
     * @param nuovo nuovo pianeta da inserire
     * @return vero se la posizione è valida, falso altrimenti
     */
    public boolean sostituisci(int indice, Pianeta nuovo) {
        
        if (leggiPianeta(indice) == null)
            return false;
        
        pianeti.set(indice, nuovo);
        return true;
    }
    
    /**
     * Rimuove un pianeta dalla lista, data la sua posizione
     * @param indice posizione del pianeta da rimuovere
     * @return pianeta rimosso, null se non presente
     */
    public Pianeta rimuovi(int indice) {
        
        if (indice < 0 || indice >= pianeti.size())
            return null;
        
        return pianeti.remove(indice);
    }
    
    /**
     * Rimuove tutti i riferimenti di pianeta dalla lista
     * @param p pianeta da rimuovere
     * @return vero se è presente, falso altrimenti
     */
    public boolean rimuovi(Pianeta p) {
        
        return false;
    }
    
    /**
     * Stampa a schermo la lista, a patto di avere un toString sul Pianeta
     */
    public void visualizzaPianeti() {
        
        System.out.println(pianeti);  
    }
}
