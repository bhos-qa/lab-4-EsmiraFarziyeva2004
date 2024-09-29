import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    // Test for addBook method
    @Test
    public void testAddBook() {
        library.addBook("The Great Gatsby");
        assertTrue(library.listBooks().contains("The Great Gatsby"));
    }

    // Test for removeBook method
    @Test
    public void testRemoveBook() {
        library.addBook("1984");
        library.removeBook("1984");
        assertFalse(library.listBooks().contains("1984"));
    }

    // Test for listBooks method
    @Test
    public void testListBooks() {
        library.addBook("To Kill a Mockingbird");
        library.addBook("Brave New World");
        assertEquals(2, library.listBooks().size());
    }

    // Test for addMember method
    @Test
    public void testAddMember() {
        library.addMember("Alice");
        assertTrue(library.isMemberExists("Alice"));
    }

    // Test for getMemberCount method
    @Test
    public void testGetMemberCount() {
        library.addMember("Bob");
        library.addMember("Charlie");
        assertEquals(2, library.getMemberCount());
    }
}
