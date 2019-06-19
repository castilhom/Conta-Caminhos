package robo;

/**
 *
 * @author Milena Castilho
 */
public class Main {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        Robo robo1 = new Robo(10,20, -1);
        long decorrido = System.currentTimeMillis();
        System.out.println("tempo = " + (decorrido - inicio));
        System.out.println("Número de Caminhos = " + robo1.compute());
       
    }

}
