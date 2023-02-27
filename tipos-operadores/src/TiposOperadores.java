public class TiposOperadores {
    public static void main(String[] args) throws Exception {
    //Operador de atribuição "="
        String nome = "Gustavo";
        int idade = 18;
        char sexo = 'M';
        
    //Operador aritmético "+, -, *, /"
        double soma = 5.4 + 4.5;
        int subtracao = 22 - 12;
        int multiplicacao = 5 * 2;
        float divisao = 25 / 4F;
        int resultado = (10 * 7) + (20 / 2);



    System.out.println("\nMe chamo " + nome + ", tenho " + idade + " anos.\n");
    System.out.print("O resultado de cada operação é: " + soma + ", " + subtracao + ", " + multiplicacao + ", " + divisao + ", " + resultado + ".");

    }
}
