

public class Main {
    public static void main(String[] args) {

        int count = 15;

        for (int i = 1; i < count + 1; i++) {

            String line = "";

            if (i % 3 == 0) {
                line += "Fizz";
            }
            if (i % 5 == 0) {
                line += "Buzz";
            }
            if (line.isEmpty()) {
                line += Integer.toString(i);
            }
            System.out.println(line);

        }
    }
}