public class Loops {

    public static void main(String[] args) {

        String[] names = new String[3];

        names[0] = "Zygfryd";
        names[1] = "Gwidon";
        names[2] = "Florentyna";

        int numberOfElements = names.length;

        for (int i = 0; i < numberOfElements; i++) {
            System.out.println(names[i]);
        }
    }
}

