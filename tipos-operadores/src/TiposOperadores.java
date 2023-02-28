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
    System.out.println("O resultado de cada operação é: " + soma + ", " + subtracao + ", " + multiplicacao + ", " + divisao + ", " + resultado + ".\n");

    /*Operador Unário, aplicados com outro operador aritmético.
    (+) Operador unário de valor positivo – números são positivos sem este explicitamente;
    (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
    (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
    (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
    (!) Operador unário lógico de negação – nega o valor de uma expressão booleana.*/
        int número = 6;
    System.out.println(- número + ". \n");
        número ++;
    System.out.print(número + ". \n");    



    }
}
