import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RefactoredTests {
    /*
    Assignment 1

    public void Writing_Sometext_Backwards( ) {
        StringBuilder b = new StringBuilder("Jag");
        AssertEquals("gaJ, b.reverse().toString());
    }

    - add missing annotation @Test
    - change the method name to be more descriptive and follow Java Code Conventions
    - change to lower case letter "a" at the beginning of assertEquals
    - add missing double quote at the end of string "jeH"

     */

    @Test
    public void testReverseString( ) {
        StringBuilder b = new StringBuilder("Jag");
        assertEquals("gaJ", b.reverse().toString());
    }

    /*
    Assignment 2

    @Test
    public String JustASimpleAssert( ) {
        String name = "My name";
        assertEquals("My name", name);
        return "String";
    }

    Return type must be void
    - change public String... to public void...
    - remove return statement

     */

    @Test
    public void JustASimpleAssert( ) {
        String name = "My name";
        assertEquals("My name", name);
    }

    /*
    Assignment 3

    @Test
    public void TryingDifferentThings() {
        String firstname = "first name";
        String lastname = "last name";
        int phonenumber = 0701111111;
        String streetaddress = "my cool street";
        assertEquals("first name", firstname);
        assertEquals("last name", lastname);
        assertEquals(0701111111, phonenumber);
        assertEquals("my cool street", streetaddress);
    }

    - split into different methods
    - change method names and variable names to camel case
    - change type of phone number from octal int to string

     */

    @Test
    public void testFirstName() {
        String firstName = "first name";
        assertEquals("first name", firstName);
    }

    @Test
    public void testLastName() {
        String lastName = "last name";
        assertEquals("last name", lastName);
    }

    @Test
    public void testPhoneNumber() {
        String phoneNumber = "0701111111";
        assertEquals("0701111111", phoneNumber);
    }

    @Test
    public void testStreetAddress() {
        String streetAddress = "my cool street";
        assertEquals("my cool street", streetAddress);
    }

    /*
    Assignment 4

    @Test
        public void TestingAsSimpleAsPossible() {
        System.out.println("Junit 5");
        }

    - pass is the absence of fail, not the presence of actual tests
    - ridiculously laboured rewriting...

     */

    @Test
    public void TestingAsSimpleAsPossible() {
        String jUnit = "JUnit 5";
        System.out.println(jUnit);
        assertEquals(7, jUnit.length());
    }

    /*
    Assignment 5

    public void GiveMeASimpleVerification() {
        assertEquals(100, 100);
    }

    - add missing annotation @Test

     */

    @Test
    public void GiveMeASimpleVerification() {
        assertEquals(100, 100);
    }

    /*
    Assignment 6

    @Test
        public void CheckingSame() {
        String s1 = new String("S1");
        String s2 = new String("S1");
        assertSame(s1, s2);
    }

    - the two string objects are not the same, even though their string content is
    - make s1 and s2 point to the string literal "S1" instead of new string objects

     */

    @Test
    public void CheckingSame() {
        String s1 = "S1";
        String s2 = "S1";
        assertSame(s1, s2);
    }

    /*
    Assignment 7

    @Test
    public void CheckingBytes() {
        byte smallByte1 = 100;
        byte smallByte2 = smallByte1;
        assertEquals(smallByte1, smallByte2);
    }

    - well, see for yourself below

     */

    @Test
    public void CheckingBytes() {
        byte smallByte1 = 100;
        byte smallByte2 = smallByte1;
        assertTrue(smallByte1 == smallByte2);
    }

    /*
    Assignment 9

    @Test
    public void CheckingTrue() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertTrue(obj1 == obj2);
    }

    - two new objects are not the same, even if they contain the same info
    - make obj2 point to obj1
     */

    @Test
    public void CheckingTrue() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        assertTrue(obj1 == obj2);
    }

    /*
    Assignment 10

    @Test
    public void CheckingFalse() {
        Object obj1 = new Object()
        Object obj2 = new Object();
        assertFalse(obj1 != obj2)
    }

    - start by adding missing semicolons
    - the two objects are not the same, so obj1 != obj2 is true
    - change the comparison operator to ==
     */

    @Test
    public void CheckingFalse() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertFalse(obj1 == obj2);
    }

    /*
    Assignment 11


     */
}
