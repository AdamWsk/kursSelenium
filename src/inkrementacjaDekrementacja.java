public class inkrementacjaDekrementacja {
    public static void main(String[] args) {

        //postinkrementacja
        int a = 0;
        System.out.println("Wartość a: " + a);
        int b = a++;  // przypisz do b wartosc a i potem zwieksz a o 1

        System.out.println("Wartosc b: " + b);
        System.out.println("Wartosc a: " + a);
        //preinkrementacja
        int c = ++a;
        System.out.println("Wartość c: " + c);
        System.out.println("Wartość a: " + a);

        //dekrementacja
        int d = 0;
        System.out.println("Wartość d: " + d); //0
        int e = d--;  // e = 0 natomiast d = -1

        System.out.println("Wartosc e: " + e);
        System.out.println("Wartosc d: " + d);
        //predekrementacja
        int f = --d;
        System.out.println("Wartość f: " + f); /// f= -2
        System.out.println("Wartość d: " + d); // d = -2
    }
}
