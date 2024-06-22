package edu.breno.segundasemana;
public class MinhaClasse {

    public static void main (String [] args) {
        String primeiroNome = "Breno";
        String segundoNome = "Henrique";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "resultado do nome completo "+ primeiroNome.concat(" ").concat(segundoNome);


    }


}