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
    (+) De valor positivo – números são positivos sem este explicitamente;
    (-) De valor negativo – nega um número ou expressão aritmética;
    (++) De incremento de valor – incrementa o valor em 1 unidade;
    (--) De decremento de valor – decrementa o valor em 1 unidade;
    (!) Lógico de negação – nega o valor de uma expressão booleana.*/
        int número = 6;
    System.out.println(- número + ". \n");
        número ++;
    System.out.println(número + ". \n");    

    //Operador tenário "?" ":"
        int a, b;
            a = 5;
            b = 6;
    String result = (a==b) ? "verdadeiro." : "falso.\n";
    System.out.println(result);

    /*Operador Relacionais.
    == Quando desejamos verificar se uma variável é IGUAL A outra.
    != Quando desejamos verificar se uma variável é DIFERENTE da outra.
    > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
    >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
    < Quando desejamos verificar se uma variável é MENOR QUE outra.
    <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.*/
        double numero1 = 4 + 4.1;
        double numero2 = 8.1;

    if(numero1 > numero2)
        System.out.println("Numero 1 maior que numero 2.\n");

    if(numero1 < numero2)
        System.out.println("Numero 1 menor que numero 2.\n");

    if(numero1 >= numero2)
        System.out.println("Numero 1 maior ou igual que numero 2.\n");

    if(numero1 <= numero2)
        System.out.println("Numero 1 menor ou igual que numero 2.\n");

    if(numero1 != numero2)
	    System.out.println("Numero 1 é diferente de numero 2\n");
    
    /*Operadores lógicos.
    && Operador Lógico "E"
    || Operador Lógico "OU"*/
        boolean condicao1=true;
        boolean condicao2=false;
      
    //"Se Condicao1 e Condicao2 forem verdadeiras, executar código" 
    if(condicao1 && condicao2)
        System.out.print("Os dois valores são verdadeiros.\n");;
    
    //"Se condicao1 OU condicao2 for verdadeira, executar código."
    if(condicao1 || condicao2)
        System.out.println("Um dos valores é verdadeiro.\n");

    if(condicao1 && (8 >= 3))
        System.out.print("Neste caso, os dois valores são verdadeiros.\n");;

    }
}
