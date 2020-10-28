public class CountAllNumbers {

    public int sumAll(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number + sumAll(number - 1);
        }
    }

    public static void main(String[] args) {
        CountAllNumbers countAllNumbers = new CountAllNumbers();
        int result = countAllNumbers.sumAll(4);

        System.out.println("Sum = " + result);
    }

}
