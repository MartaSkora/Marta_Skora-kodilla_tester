
import com.kodilla.optional.homework.Application;
import com.kodilla.optional.homework.Student;
import com.kodilla.optional.homework.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void shouldReturnTeacherName() {
        Student student = new Student("Adrianna", new Teacher("Mrs Smith"));
        String teacherName = Application.getTeacherName(student);
        assertEquals("Mrs Smith", teacherName);
    }
    @Test
    public void shouldReturnDefaultName() {
        Student student = new Student("Chad", null);
        String teacherName = Application.getTeacherName(student);
        assertEquals("<undefined>", teacherName);
    }

}
