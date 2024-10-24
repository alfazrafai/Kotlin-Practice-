package class_object.e_commerce_system

fun main(){
    val product1 = Product("Mobile",15000.5,5,"Electrics")
    val product2 = Product("Book Kotlin",500.5,3,"Books")
    val product3 = Product("Jeans Shirt",1200.5,0,"Clothes")
    val product4 = Product("Laptop",20000.5,6,"Electrics")

    var cart = Cart()

    product1.applyDiscount(10.2)

    cart.removeProduct(product2)
    cart.addProduct(product3)
    cart.addProduct(product4)
    cart.addProduct(product1)

    cart.showCartDetails()

    val order = Order(cart)
    order.placeOrder()

    order.generateInvoice()
}