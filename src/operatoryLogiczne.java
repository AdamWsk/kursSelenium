public class operatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        // && = oraz
        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && thirdValue);
        // || = lub
        System.out.println(firstValue || secondValue);
        System.out.println(fourthValue || secondValue);
        // ! = negacja

        System.out.println(!firstValue);
        System.out.println(!(firstValue && thirdValue));

    }
}
