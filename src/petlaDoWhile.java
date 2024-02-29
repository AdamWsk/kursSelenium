public class petlaDoWhile {
    public static void main(String[] args) {
        int number = 22;
        do {
            System.out.println("Moja wartosc to  " + number + "  i jest mniejsza od 20");
            number++;
        }
        while (number <20);

        // najpierw kod potem sprawdzenie, zadziala1 raz nawet gdy warunek nei jest spelniony, dotyczy pierwszego razu
    }
}
