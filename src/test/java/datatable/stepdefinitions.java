package datatable;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class stepdefinitions {

    private BookStore store;
    private List<Book> foundBooks;

    @Before
    public void setUp() {
        store = new BookStore();
        foundBooks = new ArrayList<>();
    }

    @Given("I have the following books in the store")
    public void i_have_the_following_books_in_the_store(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);

        for (List<String> columns : rows) {
            store.addBook(new Book(columns.get(0), columns.get(1)));
        }
    }
    @When("I search for books by author Erik Larson")
    public void i_search_for_books_by_author_erik_larson() {
        foundBooks = store.booksByAuthor("Erik Larson");
    }
    @Then("I find {int} books")
    public void i_find_books(Integer int1) {
        if (foundBooks.size() == int1) System.out.println("Test passed");
    }


//    @Given("^I have the following books in the store by map$")
//    public void haveBooksInTheStoreByMap(DataTable table) {
//
//        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
//
//        for (Map<String, String> columns : rows) {
//            store.addBook(new Book(columns.get("title"), columns.get("author")));
//        }
//    }
}
