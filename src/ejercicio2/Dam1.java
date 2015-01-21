package ejercicio2;

/**
 *
 * @author oquintansocampo
 */
public class Dam1 {

    public static final int TAM = 5;
    int[] notas = new int[5];

    public void notas() {

        for (int i = 0; i < TAM; i++) {
            double random = Math.random() * 10 + 1;
            int valor = (int) random;
            notas[i] = valor;
            System.out.println("Nota " + (i + 1) + "-->" + notas[i]);
        }
    }

    public void visualizarApS() {
        int ap = 0, sp = 0;
        for (int i = 0; i < TAM; i++) {
            if (notas[i] >= 5) {
                System.out.println("Nota " + (i + 1) + "-->" + notas[i] + " APROBADO");
                ap++;
            } else {
                System.out.println("Nota " + (i + 1) + "-->" + notas[i] + " SUSPENSO");
                sp++;
            }
        }
        System.out.println("Aprobados: " + ap + "\nSuspensos: " + sp);
    }

    public void nMedia() {
        int ac = 0;
        for (int i = 0; i < TAM; i++) {
            ac += notas[i];
        }
        System.out.println("Nota Media: " + (ac / TAM));
    }

    public void nMax() {
        int nM = 0;
        for (int i = 0; i < TAM; i++) {
            if (notas[i] > nM) {
                nM = notas[i];
            }
        }
        System.out.println("Nota mas alta: " + nM);
    }
}
