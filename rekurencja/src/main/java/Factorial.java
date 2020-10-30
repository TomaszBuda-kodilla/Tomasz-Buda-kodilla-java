public class Factorial {
    public int factorial(int number){
        if (number <= 1){
            return 1;
        }else if (number < 0){
            System.out.println("Wrong number");
            return 0;
        }else {
            return number*factorial(number-1);
        }
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int result = factorial.factorial(10);

        System.out.println("Result: " + result);
    }
}
