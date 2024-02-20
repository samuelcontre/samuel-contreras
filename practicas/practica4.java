//Diseña una librería en java que me permita operar un trinomio cuadrado perfecto

public class practica4 {
    private double a;
    private double b;

    public practica4(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calcularValor(double x) {
        return Math.pow(a*x + b, 2);
    }

    public String expandir() {
        double a2 = Math.pow(a, 2);
        double ab2 = 2*a*b;
        double b2 = Math.pow(b, 2);
        return a2 + "x^2 + " + ab2 + "x + " + b2;
    }
}
