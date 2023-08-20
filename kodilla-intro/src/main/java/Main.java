public class Main {
    public static void main(String[] args) {

         User albert = new User("Albert", 32);
        User bartosz = new User("Bartosz", 22);
        User czarek = new User("Czarek", 18);

        User[] users = {albert, bartosz, czarek};

        int sumAge = 0;
        for (int i = 0; i < users.length; i++) {
            sumAge = sumAge + users[i].age;
        }
        double averageAge = sumAge / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < averageAge) {
                System.out.println(users[i].name);
            }
        }
    }
}

