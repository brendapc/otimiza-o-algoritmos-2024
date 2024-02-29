import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Moedas {
    static List<Integer> moedasDisponiveis = new ArrayList<>(Arrays.asList(100, 50, 25, 10, 5, 1));

    public static List<Integer> menorTroco(int valor) {
        List<Integer> troco = new ArrayList<>();

        int i = 0;
        while (valor > 0) {
            if (valor >= moedasDisponiveis.get(i)) {
                troco.add(moedasDisponiveis.get(i));
                valor -= moedasDisponiveis.get(i);
            } else {
                i++;
            }
        }
        return troco;        
    }
}

