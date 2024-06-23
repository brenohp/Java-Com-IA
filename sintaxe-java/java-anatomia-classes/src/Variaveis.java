public class Variaveis {
    public static void main(String[] args) {
        
        double salarioMinimo = 2500;
        float pi = 3.14F;
        long cpf = 19245652516L;
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;

        numero = 2;

        System.out.println(salarioMinimo + pi + cpf + numeroCurto2 + numero);
    }
}
