package Sandbox;

<<<<<<< HEAD
import java.util.Scanner
//something new
=======
import java.util.Scanner;
//some comments

>>>>>>> 5bc8890effb04da79244b3dd22d888ed9bc547dd
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String s = "";
        while (scanner.hasNext()) {
            s = scanner.nextLine();
            try {
                int a = Integer.parseInt(s);
                if (a != 0) {
                    System.out.println(a * 10);
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                e.getClass().getSimpleName();
                String[] str = e.getClass().toString().split("\\.");
                System.out.println(str[str.length -1]);
            }
        }
    }
}

