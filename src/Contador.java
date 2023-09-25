import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
           System.out.println("O segundo parametro deve ser mairo que o primeio");
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        }else{
            int contagem = parametroDois - parametroUm;
            for(int i = 0 ; i<= contagem ; i++){
                System.out.println("Contagem eh " + i);
                //realizar o for para imprimir os números com base na variável contagem
            }


        }


    }
}