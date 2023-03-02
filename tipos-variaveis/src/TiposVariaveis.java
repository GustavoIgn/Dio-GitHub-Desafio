public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        /*exemplos de variaveis (Tipos Primitivos)

        byte idade = 43;
        short ano = 2023;
        int cep = 33344555;
        long cpf = 12121232323L;
        float pi = 3.1415F;
        double salario = 1350.75;
        boolean a = true;
        char sexo = 'M';

        */

        short numeroCurto = 2;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.print(numeroCurto2); //para funcionar, modifico o tipo de uma das variaveis, ou faço um cast.
    }
}
