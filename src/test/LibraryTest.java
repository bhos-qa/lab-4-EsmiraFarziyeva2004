import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    // Test for constructor (uncovered code)
    @Test
    public void testLibraryConstructor() {
        assertTrue(library.listBooks().isEmpty(), "Books list should be empty on initialization");
        assertTrue(library.getMemberCount() == 0, "Members count should be zero on initialization");
    }

    // Test for addBook method (covering the code)
    @Test
    public void testAddBook() {
        library.addBook("The Great Gatsby");
        assertTrue(library.listBooks().contains("The Great Gatsby"), "The book should be added to the list");
    }

    // Test for adding the same book again (covering duplicate prevention)
    @Test
    public void testAddDuplicateBook() {
        library.addBook("1984");
        library.addBook("1984"); // Attempt to add the same book again
        assertEquals(1, library.listBooks().size(), "The book list should contain only one copy of '1984'");
    }

    // Test for removeBook method
    @Test
    public void testRemoveBook() {
        library.addBook("1984");
        library.removeBook("1984");
        assertFalse(library.listBooks().contains("1984"), "The book should be removed from the list");
    }

    // Test for listBooks method
    @Test
    public void testListBooks() {
        library.addBook("To Kill a Mockingbird");
        library.addBook("Brave New World");
        assertEquals(2, library.listBooks().size(), "There should be 2 books in the list");
    }

    // Test for addMember method
    @Test
    public void testAddMember() {
        library.addMember("Alice");
        assertTrue(library.isMemberExists("Alice"), "The member should be added to the list");
    }

    // Test for getMemberCount method
    @Test
    public void testGetMemberCount() {
        library.addMember("Bob");
        library.addMember("Charlie");
        assertEquals(2, library.getMemberCount(), "There should be 2 members in the library");
    }
}
