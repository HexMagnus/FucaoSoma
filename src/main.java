import java.util.Scanner;

public class main {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Declaração Scanner para sc

        System.out.println("Qual é o valor de x?Sendo que 0 não pode ser somado a ele mesmo!"); 
        
        int x = sc.nextInt();

        System.out.println("O valor atribuido é " + x); 

        //Variavel de número inteiro valor x, imprme e passa para o proximo int.
        int soma=0;

        System.out.println("O valor será somado ao " + x);
        System.out.println("Se desejar o resultado pressione a tecla 0 Zero a qualquer momento");

        //Int soma recebe valor 0
        while (x !=0){
        //Enquanto x ou soma for diferente de 0
            soma = soma + x;
        //O valor soma = soma + o valor de x atribuido no console   

            x = sc.nextInt();

        //Valor x atribuido e devidamente tratado imprime na tela o resultado

         System.out.println(soma);   

        }
        sc.close();

    }
        
    }

