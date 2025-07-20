// ComplexTest2.java
class Complex {
    private double r, i;

    Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    Complex(Complex c) {
        this(c.r, c.i);
    }

    public void add(Complex c) {
        r += c.r;
        i += c.i;
    }

    public void minus(Complex c) {
        r -= c.r;
        i -= c.i;
    }

    public void multiple(Complex c) {
        double newr = ((this.r * c.r) - (this.i * c.i));
        double newi = ((this.r * c.i) + (this.i * c.r));
        this.r = newr;
        this.i = newi;
    }

    public void divide(Complex c) {
        if (this.r == 0 & this.i == 0) {
            throw new ArithmeticException("Division by 0 is not allowed!");
        }
        double c2d2 = Math.pow(this.r, 2) + Math.pow(this.i, 2);
        double newr = (this.r * c.r + this.i * c.i) / c2d2;
        double newi = (this.i * c.r - this.r * c.i) / c2d2;
        this.r = newr;
        this.i = newi;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setI(double i) {
        this.i = i;
    }

    public void print() {
        System.out.println(r + " + " + i + "i");
    }
}

public class ComplexTest {
    public static void main(String[] args) {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex c = new Complex(a);
        c.add(b);
        c.print();
        c.setR(1.0);
        c.setI(2.0);
        c.minus(b);
        c.print();
        c.setR(1.0);
        c.setI(2.0);
        c.multiple(b);
        c.print();
        c.setR(1.0);
        c.setI(2.0);
        c.divide(b);
        c.print();
    }
}