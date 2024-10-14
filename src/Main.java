

public class Main {
    public static void main(String[] args) {

        int count = 15;

        for (int i = 1; i < count + 1; i++) {

            boolean divisibleByFive = i % 5 == 0;
            boolean divisibleByThree = i % 3 == 0;

            String line = "";

            if (divisibleByThree) {
                line += "Fizz";
            }
            if (divisibleByFive) {
                line += "Buzz";
            }
            if (line.isEmpty()) {
                line += Integer.toString(i);
            }
            System.out.println(line);

        }
    }
}