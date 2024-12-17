import java.util.*;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] vetor = criarVetor(100, 500);

        int resultado = BinarySearch(vetor, 100);
        System.out.println("Índice do valor procurado: " + resultado);
    }

    public static int[] criarVetor(int tamanhoVetor, int limite) {
        int[] vetor = new int[tamanhoVetor];
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < limite; i++) {
            numeros.add(i);
        }

        // Embaralhar a lista
        Collections.shuffle(numeros, new Random());

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = numeros.get(i);
        }

        return vetor;
    }

    public static int BinarySearch(int[] array, int valorProcurado) {
        Arrays.sort(array);

        int FirstIndex = 0;
        int LastIndex = array.length - 1;

        while (FirstIndex <= LastIndex) {
            int MidIndex = (FirstIndex + LastIndex) / 2; // Pega o valor do meio do array
            if (array[MidIndex] == valorProcurado) {
                return MidIndex; // Valor achado no meio
            }

            // Se o valor procurado for menor que o meio, busca na metade esquerda
            if (array[MidIndex] > valorProcurado) {
                LastIndex = MidIndex - 1;
            }
            // Se o valor procurado for maior que o meio, busca na metade direita
            else {
                FirstIndex = MidIndex + 1;
            }
        }
        return -1;
    }
}
