package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ForumStats {

    public static double averagePostsForUsersAbove40() {

        double avgPostsForUsersAbove40 = UsersManager.getUsersOverAge(40)
                .stream()
                .mapToDouble(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();

        return avgPostsForUsersAbove40;
    }

    public static void main(String[] args) {
        double averageAbove40 = averagePostsForUsersAbove40();
        System.out.println("The average number of posts for users whose age is over 40: " + averageAbove40);
    }

}
