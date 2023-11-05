package com.kodilla.stream.homework;

import com.kodilla.stream.UsersManager;

public class ForumStats {

    public static double averagePostsForUsersAbove40() {

        double avgPostsForUsersAbove40 = UsersManager.getUsersOverAge(40)
                .stream()
                .mapToDouble(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();

        return avgPostsForUsersAbove40;
    }

    public static double averagePostsForUsersUnder40() {

        double avgPostsForUsersUnder40 = UsersManager.getUsersUnderAge(40)
                .stream()
                .mapToDouble(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();

        return avgPostsForUsersUnder40;
    }

    public static void main(String[] args) {
        System.out.println("The average number of posts for users whose age is over 40: " + averagePostsForUsersAbove40());
        System.out.println("The average number of posts for users whose age is under 40: " + averagePostsForUsersUnder40());
    }

}
