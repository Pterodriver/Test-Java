package Sandbox;

import java.util.Scanner;
//some comments

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

