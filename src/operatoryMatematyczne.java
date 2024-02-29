public class operatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber =4F;

        int dodawanie = firstNumber + secondNumber;
        int odejmowanie = firstNumber - secondNumber;
        int mnozenie = firstNumber * secondNumber;
        float division = thirdNumber/secondNumber;
        int mod = secondNumber%firstNumber; //modulo = reszta z dzielenia

        System.out.println("Wynik dodawania to: " + dodawanie);
        System.out.println("Wyniko  odejmowania to: " + odejmowanie);
        System.out.println("Wynik mnozenia to: " + mnozenie);
        System.out.println("Wynik dzielenia to: " + division);
        System.out.println("Wynik modulo to: " + mod);
    }
}
