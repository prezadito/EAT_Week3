package classNmethodNobject;

public class UseCalculator {

    // cannot run program without a 'main' method
    public static void main(String[] args) {

        // class object = instance of Calculator class
        Calculator casio = new Calculator();

        casio.addition(8, 16);
        int kobe = casio.subtraction(16, 8);
        System.out.println(kobe);
        System.out.println(casio.subtraction(21, 12));

    }
}
