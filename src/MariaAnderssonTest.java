import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MariaAnderssonTest {
    static String firstName;
    static String lastName;
    static int age;

    @BeforeAll
    public static void initMaria() {
        firstName = "Maria";
        lastName = "Andersson";
        age = 47;
    }

    @DisplayName("First name")
    @Test
    public void testFirstName() {
        assertEquals("Maria", firstName, "First name not Maria");
    }

    @DisplayName("Last name")
    @Test
    public void testLastName() {
        assertEquals("Andersson", lastName, "Last name not Andersson");
    }

    @DisplayName("Age")
    @Test
    public void testAge() {
        assertEquals(47, age, "Age not 47");
    }
}
