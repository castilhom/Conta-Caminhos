package robo;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author Milena Castilho
 */
public class Robo extends RecursiveTask<Integer> {

    private int m;
    private int n;
    private int flag;
    private Integer caminhos;

    public Robo(int ponto1, int ponto2, int flag) {
        this.m = ponto1;
        this.n = ponto2;
        this.flag = flag;
        caminhos = 0;
    }

    public int contarCaminhos(int m, int n) {
        if (n == 0 || m == 0) {
            return 1;
        }
        return (contarCaminhos(n - 1, m) + contarCaminhos(n, m - 1));
    }

    @Override
    protected Integer compute() {
        if (flag == -1) {
            Robo r1 = new Robo(m - 1, n, 0);
            Robo r2 = new Robo(m, n - 1, 0);
            r1.fork();
            r2.fork();
            caminhos = r1.join();
            caminhos += r2.join();
        } else if (flag == 0) {
            caminhos = contarCaminhos(m, n);

        }
        return caminhos;
    }
}
