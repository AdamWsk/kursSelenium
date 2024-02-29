public class operatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        // && = oraz, gdy wszystkie warunki sa true
        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && thirdValue);
        // || = lub gdy ktorykolwiek warunek to true
        System.out.println(firstValue || secondValue);
        System.out.println(fourthValue || secondValue);
        // ! = negacja
        System.out.println(!firstValue);
        System.out.println(!(firstValue && thirdValue));

    }
}
