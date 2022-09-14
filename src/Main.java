import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Operadores booleanos e estrturas condicionais
//        String nome = "Walter";
//        System.out.println("Hello " + nome);
//        boolean fimDeSemana = true;
//        boolean fazendoSol = true;


//        int nota = 55;
//        String graduacao;
//
//        if(nota >= 80) {
//            graduacao = "A";
//            System.out.println("Média A");
//        } else if (nota < 80 && nota >=70) {
//            graduacao = "B";
//            System.out.println("Média B");
//        } else if (nota < 70 && nota >=60) {
//            System.out.println("Média C");
//            graduacao = "C";}
//        else if (nota < 60 && nota >=0) {
//            System.out.println("Média D");
//            graduacao = "D";
//        } else {
//            graduacao ="";
//        }
//
//        switch (graduacao){
//            case "A":
//            case "B":
//                System.out.println("Aluno Aprovado");
//                break;
//            case "C":
//            case "D":
//                System.out.println("Aluno Reprovado");
//                break;
//            default:
//                System.out.println("Nota inválida");
//        }
//  Laços numéricos

//        for(int i = 1; i<= 10;i++){
//            System.out.println(i);
//        }
// Criando uma tabuada utilizando o laço for
//        for(int i = 1; i<= 10;i++){
//            for(int j = 1; j<= 10;j++){
//                System.out.println(j + " x " + i + " = " + j * i);
//            }
//        }
        // Vetores

//        int [] numeros = new int[5];
//        numeros[0]= 1;
//        numeros[1]= 2;
//        numeros[2]= 3;
//        numeros[3]= 4;
//        numeros[4]= 5;
//
//        for (int i = 0;i < numeros.length; i++){
//            System.out.println(numeros[i]);
//        }
        // Outras formas de montar e exibir os vetores
//        String[] letras = {"A", "B", "D", "J", "H"};
//
//        for (int i = 0;i < letras.length; i++){
//            System.out.println(letras[i]);
//        }
//
//        System.out.println(Arrays.toString(letras));

        //Exibindo o maior,menor e a média:
        int[] numeros = {4,5,42,7,87};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            media +=numeros[i];
        }

        System.out.println("Maior: "+ maior);
        System.out.println("Menor: "+ menor);
        System.out.println("Media: "+ media/ numeros.length);





    }
}