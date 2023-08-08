public class SimpleArray {
    public static void main(String[] args) {

        String[] books = new String[5];

        books[0] = "Ireland";
        books[1] = "Big Little Lies";
        books[2] = "Harry Potter";
        books[3] = "Masa";
        books[4] = "Wladaj";

        String book = books[3];

        System.out.println(book);

        int numberOfElements = books.length;

        System.out.println("Moja tablica zawiera" + numberOfElements +"elementów");
    }
}
