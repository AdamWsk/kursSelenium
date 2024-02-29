public class Petle {
    public static void main(String[] args) {

        int number = 60;
        // i to specjalna zmienna sterujaca
        for (int i = 0; i < 100; i = i+2) {
            System.out.println(i);
        }

        for (int i = 0; i<number; i++) {
            if (i % 5 == 0)
                System.out.println(i);
        }

        for (int j = 0; j <number; j++) {
            System.out.println("bede robił prace domowe");
        }
    }
}

