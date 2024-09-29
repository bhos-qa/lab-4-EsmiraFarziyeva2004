import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        library.addBook("1984");
        assertTrue(library.listBooks().contains("1984"), "Book should be added to the library");
    }

    @Test
    public void testRemoveBook() {
        library.addBook("1984");
        library.removeBook("1984");
        assertFalse(library.listBooks().contains("1984"), "Book should be removed from the library");
    }

    @Test
    public void testListBooks() {
        library.addBook("1984");
        library.addBook("Brave New World");
        List<String> books = library.listBooks();
        assertEquals(2, books.size(), "There should be 2 books in the library");
        assertTrue(books.contains("1984"), "List should contain '1984'");
        assertTrue(books.contains("Brave New World"), "List should contain 'Brave New World'");
    }

    @Test
    public void testAddMember() {
        library.addMember("Alice");
        assertTrue(library.isMemberExists("Alice"), "Member should be added to the library");
    }

    @Test
    public void testIsBookAvailable() {
        library.addBook("1984");
        assertTrue(library.isBookAvailable("1984"), "Book should be available in the library");
        assertFalse(library.isBookAvailable("Non-Existent Book"), "Non-existent book should not be available");
    }
}
