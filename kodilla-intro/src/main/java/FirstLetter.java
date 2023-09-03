import java.util.Scanner;
public class FirstLetter {
    public static void main (String[] args) {

        System.out.println("Choose one of the following letters: B, R, G, W, O");
        Scanner scanner = new Scanner (System.in);
        String firstLetter = scanner.next().toUpperCase();

        switch (firstLetter) {
            case "B" -> System.out.println("Black");
            case "R" -> System.out.println("Red");
            case "G" -> System.out.println("Green");
            case "W" -> System.out.println("White");
            case "O" -> System.out.println("Orange");
            default -> System.out.println("Try again");
        }
        
        
        
}
}
