public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int num, int den) {
        this.numerator = num;
        this.denominator = den == 0 ? 1 : den;
    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction add(Fraction f) {
        int newNum = this.numerator * f.denominator + f.numerator * this.denominator;
        int newDen = this.denominator * f.denominator;
        Fraction result = new Fraction(newNum, newDen);
        result.reducer();
        return result;
    }

    public Fraction sub(Fraction f) {
        int newNum = this.numerator * f.denominator - f.numerator * this.denominator;
        int newDen = this.denominator * f.denominator;
        Fraction result = new Fraction(newNum, newDen);
        result.reducer();
        return result;
    }

    public Fraction mul(Fraction f) {
        int newNum = this.numerator * f.numerator;
        int newDen = this.denominator * f.denominator;
        Fraction result = new Fraction(newNum, newDen);
        result.reducer();
        return result;
    }

    public Fraction div(Fraction f) {
        int newNum = this.numerator * f.denominator;
        int newDen = this.denominator * f.numerator;
        Fraction result = new Fraction(newNum, newDen);
        result.reducer();
        return result;
    }

    public void reducer() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        if (gcd > 0) {
            numerator /= gcd;
            denominator /= gcd;
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public String toString() {
        return "Fraction[num=" + numerator + ", den=" + denominator + "]";
    }
}