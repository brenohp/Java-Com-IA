package edu.breno.smartv;

public class Usuario {
    public static void main(String[] args) {
        
        Smartv smartv = new Smartv();

        smartv.mudarCanal(13);

        smartv.aumentarVolume();
        smartv.aumentarVolume();
        smartv.diminuirVolume();

        System.out.println("TV Ligada: " + smartv.ligada);
        System.out.println("Canal atual: " + smartv.canal);
        System.out.println("Volume atual: " + smartv.volume);

        smartv.desligar ();
        System.out.println("novo status - Tv ligada: " + smartv.ligada);
    }
}
