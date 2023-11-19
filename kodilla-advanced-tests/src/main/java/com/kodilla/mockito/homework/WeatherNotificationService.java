package com.kodilla.mockito.homework;

import java.util.*;
import java.util.stream.Collectors;

public class WeatherNotificationService {

    private Map<Location, Set<User>> subscriptions = new HashMap<>();

    public WeatherNotificationService(ArrayList<Location> locations) {
        for(Location l : locations) {
            subscriptions.put(l, new HashSet<>());
        }
    }

    public void addUser(Location location, User user) {
        Set<User> usersForGivenLocation = subscriptions.getOrDefault(location, new HashSet<>());
        usersForGivenLocation.add(user);
        subscriptions.put(location, usersForGivenLocation);
    }

    public void sendGlobalAlertToAllUsers(Alert alert) {
        List<User> allUsers = subscriptions.values().stream().flatMap(Collection::stream).distinct().toList();

        if(allUsers != null) {
            for(User user : allUsers) {
                user.receive(alert);
            }
        }
    }

    public void sendAlertToRelevantUsers(Location location, Alert alert) {
        Set<User> relevantUsers = subscriptions.get(location);
        if (relevantUsers != null) {
            for(User user : relevantUsers) {
                user.receive(alert);
            }
        }
    }

    public void removeGivenLocation(Location location) {
        if(subscriptions.get(location) != null)
            subscriptions.remove(location);
    }

    public void removeOneOfSubscribedLocation(Location location, User user) {
        Set<User> relevantUsers = subscriptions.get(location);
        if (relevantUsers != null) {
            relevantUsers.remove(user);
        }
    }

    public void removeAllOfSubscribedLocation(User user) {
        for(Map.Entry<Location, Set<User>> entry : subscriptions.entrySet()) {
                entry.getValue().remove(user);
        }

    }
}
