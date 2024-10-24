package class_object.e_commerce_system

class Order(private val cart: Cart) {

    fun placeOrder(){
        val total = cart.calculateTotal()
        if(total > 0){
            println("Your order is placed Total ammount is $total")
        } else {
            println("Your cart is empty Add product to cart to place order")
        }
    }

    fun generateInvoice(){
        println("Invoice")
        cart.showCartDetails()
        println("Thank you for your purches")
    }
}