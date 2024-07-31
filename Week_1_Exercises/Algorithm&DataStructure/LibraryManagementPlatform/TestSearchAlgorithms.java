import java.util.Arrays;
public class TestSearchAlgorithms {
    public static void main(String[] args) {
        // Create some Book instances
        Book[] books = {
            new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("B002", "1984", "George Orwell"),
            new Book("B003", "To Kill a Mockingbird", "Harper Lee"),
            new Book("B004", "The Catcher in the Rye", "J.D. Salinger")
        };

        // Perform Linear Search
        String titleToFind = "1984";
        Book foundBookLinear = SearchAlgorithms.linearSearch(books, titleToFind);
        System.out.println("Linear Search Result:");
        System.out.println(foundBookLinear != null ? foundBookLinear : "Book not found.");

        // Perform Binary Search (First sort the array by title)
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
        Book foundBookBinary = SearchAlgorithms.binarySearch(books, titleToFind);
        System.out.println("\nBinary Search Result:");
        System.out.println(foundBookBinary != null ? foundBookBinary : "Book not found.");
    }
}
