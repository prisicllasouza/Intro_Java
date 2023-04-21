
//1- Pacote
package intro;

// 2- Referências as Bibliotecas

// 3- Classe
public class Medidas {
    //3.1 - Atributos - Características

    //3.2 - Métodos e funções
    public static void main(String[] args){
        calculoAreaCurto();
        calculoAreaComprido();
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

}
