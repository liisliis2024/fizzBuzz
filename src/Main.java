//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int number = 100;

        for (int i = 1; i < number+1; i++) {

//            3 & 5 fizzBuzz
            if (i % 3 == 0 && i % 5 == 0 ) {
                System.out.println("FizzBuzz");
            }
//            3 == fizz
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
//            5 == buzz
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}