public class PolynomApp {
    public static void main(String[] args)
    {
        Polynom p = new Polynom(3, 4, 0, 0);
        System.out.println(p);
        System.out.println(p.getDegree());
        System.out.println(p.calculateValue(4));
    }
}
