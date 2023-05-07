
//1- Pacote
package intro;

// 2- Referências as Bibliotecas

import java.util.Scanner;

// 3- Classe
public class Medidas {
    //3.1 - Atributos - Características

    //3.2 - Métodos e funções
    public static void main(String[] args) {
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou um software

        // Utilizar a classe Scanner do Java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("O P Ç Õ E S");
        System.out.println("c - Calcular Area Modo Curto");
        System.out.println("d - Contar ate Dez");
        System.out.println("o - Calcular Area Modo Comprido");
        System.out.println("i - If Simples");
        System.out.println("r - Contagem regressiva de 10 a 0");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();
        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        //String opcao = "curto";

        switch (opcao) {
            case "C":
            case "c":
                System.out.println("Você escolheu o método calculoAreaCurto");
                calculoAreaCurto();
                break;
            case "D":
            case "d":
                System.out.println("Você escolheu o método contarAteDez");
                contarAteDez();
                break;
            case "I":
            case "i":
                System.out.println("Você escolheu o método ifSimples");
                ifSimples();
                break;
            case "O":
            case "o":
                System.out.println("Você escolheu o método calculoAreaComprido");
                calculoAreaComprido();
                break;
            case "R":
            case "r":
                System.out.println("Você escolheu o método contagemRegressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu um outro valor que não tem ação associada");
                break;
        }


    }


    public static void ifSimples() {
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou um software
        // if = se
        // else = senão

        String modo = "curto";

        if (modo == "curto") {
            calculoAreaCurto();
        } else {
            calculoAreaComprido();
        }

    }

    private static void calculoAreaCurto() {
        System.out.println("Cálculo de áreas Curto");

        //Cálculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura = 5;
        int comprimento = 8;


        System.out.println("Para a largura de " + largura + "m e comprimento de " + comprimento + "m a área é de " + largura * comprimento + " m²");
    }

    private static void calculoAreaComprido() {
        System.out.println("Cálculo de áreas comprido");

        //Cálculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 3;
        resultado = largura * comprimento;

        System.out.println("Para a largura de " + largura + "m e comprimento de " + comprimento + "m a área é de " + resultado + " m²");

    }

    public static void contarAteDez() {

        // Loops ou Repetições
        // for = repetição incondicional
        System.out.println("Contagem Crescente");

        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);
        }
    }

    public static void contagemRegressiva() {
        System.out.println("Contagem Regressiva");

        for (int numero = 10; numero > -1; numero--) {
            System.out.println(numero);
        }
    }
}

