package poo;

// Atributos
public class Numero {
    private double x;
    private double y;
    
// Construtor
    public Numero(double x, double y) {
        this.x = x;
        this.y = y;
    }

// Getters and setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

// Métodos de operações
    public double soma() {
        return (double) this.x + this.y;
    }

    public double subtracao() {
        return (double) this.x - this.y;
    }

    public double multiplicacao() {
        return (double) this.x * this.y;
    }

    public double divisao() {
        return (double) this.x / this.y;
    }
    public double potencia() {
        return (double) Math.pow(this.x,this.y);
    }
}