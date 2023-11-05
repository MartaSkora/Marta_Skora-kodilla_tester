import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {
    @Test
    public void shouldReturnAveragePostsForUsersAbove40() {
        double result = ForumStats.averagePostsForUsersAbove40();
        assertEquals(2.25, result, 0.01);
    }

    @Test
    public void shouldReturnAveragePostsForUsersUnder40() {
        double result = ForumStats.averagePostsForUsersUnder40();
        assertEquals(2382, result, 0.01);
    }
}
