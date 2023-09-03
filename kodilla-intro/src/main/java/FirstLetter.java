import java.util.Scanner;
public class FirstLetter {
    public static void main (String[] args) {

        System.out.println("Choose one of the following letters: B, R, G, W, O");
        Scanner scanner = new Scanner (System.in);
        String firstLetter = scanner.next().toUpperCase();

        switch(firstLetter) {
            case "B":
                System.out.println("Black");
                break;
            case "R":
                System.out.println("Red");
                break;
            case "G":
                System.out.println("Green");
                break;
            case "W":
                System.out.println("White");
                break;
            case "O":
                System.out.println("Orange");
                break;
            default:
                System.out.println("Try again");
        }
        
        
        
}
}
