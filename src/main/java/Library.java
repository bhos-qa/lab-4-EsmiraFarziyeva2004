import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books;
    private List<String> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Method 1: Add a book
    public void addBook(String bookTitle) {
        if (!books.contains(bookTitle)) {
            books.add(bookTitle);
        }
    }

    // Method 2: Remove a book
    public void removeBook(String bookTitle) {
        books.remove(bookTitle);
    }

    // Method 3: List all books
    public List<String> listBooks() {
        return new ArrayList<>(books);
    }

    // Method 4: Add a member
    public void addMember(String memberName) {
        if (!members.contains(memberName)) {
            members.add(memberName);
        }
    }

    // Method 5: Remove a member
    public void removeMember(String memberName) {
        members.remove(memberName);
    }

    // Method 6: Check if a book is available
    public boolean isBookAvailable(String bookTitle) {
        return books.contains(bookTitle);
    }

    // Method 7: Check if a member exists
    public boolean isMemberExists(String memberName) {
        return members.contains(memberName);
    }

    // Method 8: Clear all books
    public void clearBooks() {
        books.clear();
    }

    // Method 9: Clear all members
    public void clearMembers() {
        members.clear();
    }

    // Method 10: Get member count
    public int getMemberCount() {
        return members.size();
    }
}
