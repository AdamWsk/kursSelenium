import java.sql.SQLOutput;

public class TypyObiektowe {

    public static void main(String[] args) {
        //liczby stalorzecinkowe
        Byte liczba1 = 127; // 1 bajt - zakres od -128 do 127
        Short liczba2 = 32689; // 2 bajty - zakres od -32 768 do 32 767
        Integer liczba3 = 32768999; // 4 bajty - zakres od -2 147 483 648 do 2 147 483 647
        Long liczba4 = 4444444444L; //- 8 bajtów - zakres od -2^63 do (2^63)-1 (posiadają przyrostek L , lub l)

        //liczby zmiennoprzecinkowe
        Float liczba5 = 4.99993F; // 4 bajty, max 6 liczb po przecinku
        Double liczba6 =  3.99999999999999999D; // 8 bajtow - do 15 po przecinku

        //wartosci logiczne
        Boolean prawda = true;
        Boolean falsz = false;

        //pojedynczy znak
        Character letter = 'A';

        // ciagi znakow
        String hello = "Hello debilu";

        System.out.println(hello.charAt(0));
    }

}
