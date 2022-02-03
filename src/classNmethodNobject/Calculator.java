package classNmethodNobject;

// class = blueprint or plan
public class Calculator {

    // non-return method (holds value) - not equivalent to anything
    public void addition(int a, int b) {
        // a and b are local variables
        int total = a + b;
        System.out.println(total);
    }

    // return method (ejects value) - must specify which data type it will eject; equivalent to a value
    public int subtraction(int a, int b) {
        int total = a - b;
        return total;
    }
}
