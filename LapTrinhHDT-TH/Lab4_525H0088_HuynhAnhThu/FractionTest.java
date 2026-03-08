public class FractionTest {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 4);
        Fraction f3 = new Fraction(f1);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());

        Fraction sum = f1.add(f2);
        System.out.println(sum.toString());

        Fraction difference = f1.sub(f2);
        System.out.println(difference.toString());

        Fraction product = f1.mul(f2);
        System.out.println(product.toString());

        Fraction quotient = f1.div(f2);
        System.out.println(quotient.toString());

        Fraction unreduced = new Fraction(10, 25);
        System.out.println(unreduced.toString());
        unreduced.reducer();
        System.out.println(unreduced.toString());
    }
}