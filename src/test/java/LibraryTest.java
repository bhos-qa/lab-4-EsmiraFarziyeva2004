import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    // Test for addBook method
    @Test
    void testAddBook() {
        library.addBook("1984");
        assertTrue(library.listBooks().contains("1984"), "Book should be added to the library");
        
        // Try adding the same book again
        library.addBook("1984");
        assertEquals(1, library.listBooks().size(), "Duplicate book should not be added");
    }

    // Test for removeBook method
    @Test
    void testRemoveBook() {
        library.addBook("1984");
        library.removeBook("1984");
        assertFalse(library.listBooks().contains("1984"), "Book should be removed from the library");
        
        // Try removing a book that does not exist
        library.removeBook("Brave New World"); // No exception should be thrown
        assertEquals(0, library.listBooks().size(), "Library should still be empty");
    }

    // Test for listBooks method
    @Test
    void testListBooks() {
        library.addBook("1984");
        library.addBook("Brave New World");
        
        List<String> books = library.listBooks();
        assertEquals(2, books.size(), "Library should contain 2 books");
        assertTrue(books.contains("1984"), "Book '1984' should be listed");
        assertTrue(books.contains("Brave New World"), "Book 'Brave New World' should be listed");
    }

    // Test for addMember method
    @Test
    void testAddMember() {
        library.addMember("Alice");
        assertTrue(library.isMemberExists("Alice"), "Member 'Alice' should be added");
        
        // Try adding the same member again
        library.addMember("Alice");
        assertEquals(1, library.getMemberCount(), "Duplicate member should not be added");
    }

    // Test for removeMember method
    @Test
    void testRemoveMember() {
        library.addMember("Alice");
        library.removeMember("Alice");
        assertFalse(library.isMemberExists("Alice"), "Member 'Alice' should be removed");
        
        // Try removing a member that does not exist
        library.removeMember("Bob"); // No exception should be thrown
        assertEquals(0, library.getMemberCount(), "Library should still have 0 members");
    }
}
