public class practica3 {
    // Definición de una variable estática
    static double numero = 16.0;

    // Definición de un método estático
    static double calcularRaizCuadrada(double num) {
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        double raizCuadrada = calcularRaizCuadrada(numero);
        System.out.println("La raíz cuadrada de " + numero + " es " + raizCuadrada);
    }
}
