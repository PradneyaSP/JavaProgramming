public class E_Fraction {
    static class Fraction {
        int num;
        int den;

        public Fraction(int num, int den) {
            this.num = num;
            this.den = den;
        }

        private int GCD(int num1, int num2) {
            if (num1 == 0) return num2;
            return GCD(num2 % num1, num1);
        }

        public void simplify() {
            int commonDivisor;
            if (num < den) {
                commonDivisor = GCD(num, den);
            } else {
                commonDivisor = GCD(den, num);
            }
            num = num / commonDivisor;
            den = den / commonDivisor;
        }
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        return new Fraction(f1.num * f2.den + f1.den * f2.num, f1.den * f2.den);
    }

    public static Fraction sub(Fraction f1, Fraction f2) {
        return new Fraction(f1.num * f2.den - f1.den * f2.num, f1.den * f2.den);
    }

    public static Fraction mul(Fraction f1, Fraction f2) {
        return new Fraction(f1.num * f2.num, f1.den * f2.den);
    }

    public static Fraction div(Fraction f1, Fraction f2) {
        return new Fraction(f1.num * f2.den, f1.den * f2.num);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(21, 15);
        Fraction f2 = new Fraction(10, 3);
        f1.simplify();
        f2.simplify();

        Fraction f3_add = add(f1, f2);
        f3_add.simplify();
        System.out.println("Addition: " + f3_add.num + "/" + f3_add.den);

        Fraction f4_sub = sub(f1, f2);
        f4_sub.simplify();
        System.out.println("Subtraction: " + f4_sub.num + "/" + f4_sub.den);

        Fraction f5_mul = mul(f1, f2);
        f5_mul.simplify();
        System.out.println("Multiplication: " + f5_mul.num + "/" + f5_mul.den);

        Fraction f6_div = div(f1, f2);
        f6_div.simplify();
        System.out.println("Division: " + f6_div.num + "/" + f6_div.den);
    }
}
