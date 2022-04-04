package main;

public class Main {

    public static void main(String[] args) {
        
        Pianeta saturno = new Pianeta ("Saturno", 200);

        Pianeta giove = new Pianeta ("giove", 200);

        Pianeta urano = new Pianeta ("Saturno", 200);

        SistemaSolare system = new SistemaSolare("Sole");

        system.appendi(saturno);
        system.appendi(giove);
        system.appendi(urano);

        system.visualizzaPianeti();

        system.rimuovi(saturno);

        system.visualizzaPianeti();

     }
    
}
