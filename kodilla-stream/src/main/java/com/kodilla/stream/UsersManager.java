package com.kodilla.stream;

//public class UsersManager {
//    public static void main(String[] args) {
//        processUsersStream();
//    }
//
//    private static void processUsersStream() {
//        UsersRepository.getUsersList()
//                .stream()
//                .filter(user -> user.getGroup().equals("Chemists")) // [1]
//                .map(UsersManager::getUserName)
//                .forEach(username -> System.out.println(username));
//    }
//
//    public static String getUserName(User user) {
//        return user.getUsername();
//    }
//}


import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUserNames();
            System.out.println(chemistGroupUsernames);
    }

    public static List<String> filterChemistGroupUserNames() {
            List<String> usernames = UsersRepository.getUsersList()   // [1]
                    .stream()
                    .filter(user -> user.getGroup().equals("Chemists"))
                    .map(UsersManager::getUserName)
                    .collect(Collectors.toList());                      // [2]

           return usernames;
        }

    public static String getUserName(User user) {

        return user.getUsername();
    }

    public static List<User> getUsersOverAge(int age) {
        List<User> usersOverAge = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= age)
                .collect(Collectors.toList());

        return usersOverAge;
    }

    public static List<User> getUsersUnderAge(int age) {
        List<User> usersUnderAge = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < age)
                .collect(Collectors.toList());

        return usersUnderAge;
    }






}
