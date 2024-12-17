import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] vetor = new int[100];
    List<Integer> numeros = new ArrayList<>();

    for (int i = 0; i < 500 ; i++) {
        numeros.add(i);
    }

    //Embaralho a lista
    Collections.shuffle(numeros, new Random());

    for (int i = 0; i < vetor.length ; i++) {
        vetor[i] = numeros.get(i);
    }

    //Arrays.sort(vetor);

    buscalinear(vetor,201);


}

public static boolean buscalinear(int[] vetor, int valor){

    for (int i = 0; i < vetor.length ; i++) {
        if (vetor[i] == valor){
            System.out.println("Valor encontrado na posição " + i);
            return true;
        }
    }
    System.out.println("Valor não encontrado");
    return false;
}