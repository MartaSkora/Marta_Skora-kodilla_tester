import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUserNames() {
        //given
        List<String> expectedChemistGroupUserNames = new ArrayList<>();
        expectedChemistGroupUserNames.add("Walter White");
        expectedChemistGroupUserNames.add("Gale Boetticher");
        //when
        List<String> chemistGroupUserNames = UsersManager.filterChemistGroupUserNames();
        //then
        assertTrue(Arrays.equals(new List[]{expectedChemistGroupUserNames}, new List[]{chemistGroupUserNames}));
        assertEquals(2, chemistGroupUserNames.size());
        assertEquals(expectedChemistGroupUserNames.get(0), chemistGroupUserNames.get(0));
        assertEquals(expectedChemistGroupUserNames.get(1), chemistGroupUserNames.get(1));
    }

    @Test
    public void testGetUsersOverAge() {

        //given
        List<User> expectedUsersOver45 = new ArrayList<>();
        expectedUsersOver45.add(new User("Walter White", 50, 7, "Chemists"));
        expectedUsersOver45.add(new User("Gus Firing", 49, 0, "Board"));
        expectedUsersOver45.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        //when
        List<User> usersOver45 = UsersManager.getUsersOverAge(45);

        //then
        assertEquals(3, usersOver45.size());
        assertEquals(expectedUsersOver45.get(0), usersOver45.get(0));
    }

//    @Test
//    public void testGetUserNamesUnderAge() {
//        //given
//        List<String> expectedUsersNamesUnder30 = new ArrayList<>();
//        expectedUsersNamesUnder30.add("Jessie Pinkman");
//        //when
//        List<String> usersUnder30 = UsersManager.getUsersNamesUnderAge(30);
//        //then
//        assertEquals(1, usersUnder30.size());
//        assertEquals(expectedUsersNamesUnder30.get(0), usersUnder30.get(0));
//
//    }

}
