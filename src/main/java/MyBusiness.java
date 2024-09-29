class MyBusiness {

    fun addProduct(name: String, price: Double): String {
        // Simulates adding a product to the database
        return "Product $name added with price $$price"
    }

    fun calculateTotalPrice(prices: List<Double>): Double {
        return prices.sum()
    }

    fun findProductByName(name: String): String {
        // Simulates finding a product by name
        return "Product found: $name"
    }

    fun checkStockAvailability(productName: String, quantity: Int): String {
        // Simulates checking stock availability
        return if (quantity > 0) "$quantity of $productName is available." else "$productName is out of stock."
    }

    fun applyPromoCode(total: Double, promoCode: String): Double {
        return if (promoCode == "DISCOUNT10") {
            total * 0.9 // 10% discount
        } else {
            total
        }
    }

    fun generateInvoice(orderId: String, totalAmount: Double): String {
        return "Invoice for Order ID: $orderId with total amount: $$totalAmount"
    }

    fun processPayment(paymentMethod: String, amount: Double): String {
        // Simulates payment processing
        return "Payment of $$amount processed using $paymentMethod."
    }

    fun sendOrderConfirmation(email: String, orderId: String): String {
        return "Order confirmation sent to $email for Order ID: $orderId."
    }

    fun requestRefund(orderId: String): String {
        return "Refund requested for Order ID: $orderId."
    }

    fun getShippingDetails(orderId: String): String {
        return "Shipping details for Order ID: $orderId retrieved."
    }
}
