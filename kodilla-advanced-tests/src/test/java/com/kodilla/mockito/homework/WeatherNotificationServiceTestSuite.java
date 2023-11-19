package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

class WeatherNotificationServiceTestSuite {

    @Test
    public void subscribedUserShouldReceiveAlertForGivenLocation() {

        ArrayList<Location> locations = new ArrayList<>();
        Location locationWithAlert = Mockito.mock(Location.class);
        Location locationWithoutAlert = Mockito.mock(Location.class);
        locations.add(locationWithAlert);
        locations.add(locationWithoutAlert);
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService(locations);

        User signedToLocationUser = Mockito.mock(User.class);

        Alert alert = Mockito.mock(Alert.class);
        weatherNotificationService.addUser(locationWithAlert, signedToLocationUser);

        weatherNotificationService.sendAlertToRelevantUsers(locationWithAlert, alert);

        Mockito.verify(signedToLocationUser, Mockito.times(1)).receive(alert);

    }

    @Test
    public void shouldRemoveGivenLocation(){

        ArrayList<Location> locations = new ArrayList<>();

        Location newLocation = Mockito.mock(Location.class);
        Location locationToBeDeleted = Mockito.mock(Location.class);
        locations.add(newLocation);
        locations.add(locationToBeDeleted);
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService(locations);

        User user = Mockito.mock(User.class);
        Alert alert = Mockito.mock(Alert.class);

        weatherNotificationService.addUser(newLocation, user);
        weatherNotificationService.addUser(locationToBeDeleted, user);

        weatherNotificationService.sendAlertToRelevantUsers(newLocation, alert);
        weatherNotificationService.sendAlertToRelevantUsers(locationToBeDeleted, alert);

        Mockito.verify(user, Mockito.times(2)).receive(alert);

        weatherNotificationService.removeGivenLocation(locationToBeDeleted);

        weatherNotificationService.sendAlertToRelevantUsers(newLocation, alert);
        weatherNotificationService.sendAlertToRelevantUsers(locationToBeDeleted, alert);

        Mockito.verify(user, Mockito.times(3)).receive(alert);

    }

    @Test
    public void shouldSendGlobalAlertToAllUsers(){

        ArrayList<Location> locations = new ArrayList<>();
        Location locationA = Mockito.mock(Location.class);
        Location locationB = Mockito.mock(Location.class);
        locations.add(locationA);
        locations.add(locationB);

        Alert alert = Mockito.mock(Alert.class);

        User multipleLocationsUser = Mockito.mock(User.class);
        User otherUser = Mockito.mock(User.class);

        WeatherNotificationService weatherNotificationService = new WeatherNotificationService(locations);
        weatherNotificationService.addUser(locationA, multipleLocationsUser);
        weatherNotificationService.addUser(locationB, multipleLocationsUser);
        weatherNotificationService.addUser(locationA, otherUser);

        weatherNotificationService.sendGlobalAlertToAllUsers(alert);
        Mockito.verify(multipleLocationsUser, Mockito.times(1)).receive(alert);
        Mockito.verify(otherUser, Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldSendAlertToRelevantUsers() {
        ArrayList<Location> locations = new ArrayList<>();
        Location locationWithAlert = Mockito.mock(Location.class);
        Location locationWithoutAlert = Mockito.mock(Location.class);
        locations.add(locationWithAlert);
        locations.add(locationWithoutAlert);
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService(locations);

        User signedToLocationUser1 = Mockito.mock(User.class);
        User signedToLocationUser2 = Mockito.mock(User.class);
        User signedToLocationUser3 = Mockito.mock(User.class);
        User notSignedToLocationUser = Mockito.mock(User.class);
        Alert alert = Mockito.mock(Alert.class);
        weatherNotificationService.addUser(locationWithAlert, signedToLocationUser1);
        weatherNotificationService.addUser(locationWithAlert, signedToLocationUser2);
        weatherNotificationService.addUser(locationWithAlert, signedToLocationUser3);
        weatherNotificationService.addUser(locationWithoutAlert, notSignedToLocationUser);

        weatherNotificationService.sendAlertToRelevantUsers(locationWithAlert, alert);
        Mockito.verify(notSignedToLocationUser, Mockito.never()).receive(alert);
        Mockito.verify(signedToLocationUser1, Mockito.times(1)).receive(alert);
        Mockito.verify(signedToLocationUser2, Mockito.times(1)).receive(alert);
        Mockito.verify(signedToLocationUser3, Mockito.times(1)).receive(alert);

    }

    @Test
    public void shouldUnsubscribeUser() {
        ArrayList<Location> locations = new ArrayList<>();
        Location locationA = Mockito.mock(Location.class);
        Location locationB = Mockito.mock(Location.class);
        locations.add(locationA);
        locations.add(locationB);

        Alert alert = Mockito.mock(Alert.class);

        User multipleLocationsUser = Mockito.mock(User.class);

        WeatherNotificationService weatherNotificationService = new WeatherNotificationService(locations);
        weatherNotificationService.addUser(locationA, multipleLocationsUser);
        weatherNotificationService.addUser(locationB, multipleLocationsUser);

        weatherNotificationService.sendAlertToRelevantUsers(locationA, alert);
        weatherNotificationService.sendAlertToRelevantUsers(locationB, alert);
        Mockito.verify(multipleLocationsUser, Mockito.times(2)).receive(alert);

        weatherNotificationService.removeAllOfSubscribedLocation(multipleLocationsUser);
        weatherNotificationService.sendAlertToRelevantUsers(locationA, alert);
        weatherNotificationService.sendAlertToRelevantUsers(locationB, alert);
        Mockito.verify(multipleLocationsUser, Mockito.times(2)).receive(alert);
    }

    @Test
    public void shouldRemoveOneOfSubscribedLocation() {

        ArrayList<Location> locations = new ArrayList<>();
        Location locationA = Mockito.mock(Location.class);
        Location locationB = Mockito.mock(Location.class);
        locations.add(locationA);
        locations.add(locationB);

        Alert alert = Mockito.mock(Alert.class);

        User multipleLocationsUser = Mockito.mock(User.class);

        WeatherNotificationService weatherNotificationService = new WeatherNotificationService(locations);
        weatherNotificationService.addUser(locationA, multipleLocationsUser);
        weatherNotificationService.addUser(locationB, multipleLocationsUser);

        weatherNotificationService.sendAlertToRelevantUsers(locationA, alert);
        weatherNotificationService.sendAlertToRelevantUsers(locationB, alert);
        Mockito.verify(multipleLocationsUser, Mockito.times(2)).receive(alert);

        weatherNotificationService.removeOneOfSubscribedLocation(locationA, multipleLocationsUser);
        weatherNotificationService.sendAlertToRelevantUsers(locationA, alert);
        weatherNotificationService.sendAlertToRelevantUsers(locationB, alert);
        Mockito.verify(multipleLocationsUser, Mockito.times(3)).receive(alert);

    }


}