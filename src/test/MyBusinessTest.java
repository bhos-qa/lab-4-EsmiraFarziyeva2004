import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MyBusinessTest {

    private val businessLogic = BusinessLogic()

    @Test
    fun testAddProduct() {
        assertEquals("Product Book added with price $15.0", businessLogic.addProduct("Book", 15.0))
    }

    @Test
    fun testCalculateTotalPrice() {
        assertEquals(100.0, businessLogic.calculateTotalPrice(listOf(30.0, 20.0, 50.0)))
    }

    @Test
    fun testFindProductByName() {
        assertEquals("Product found: Laptop", businessLogic.findProductByName("Laptop"))
    }

    @Test
    fun testCheckStockAvailability() {
        assertEquals("5 of Laptop is available.", businessLogic.checkStockAvailability("Laptop", 5))
        assertEquals("Laptop is out of stock.", businessLogic.checkStockAvailability("Laptop", 0))
    }

    @Test
    fun testProcessPayment() {
        assertEquals("Payment of $100.0 processed using Credit Card.", businessLogic.processPayment("Credit Card", 100.0))
    }
}
