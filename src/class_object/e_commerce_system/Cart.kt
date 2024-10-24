package class_object.e_commerce_system

class Cart {

    private val products = mutableListOf<Product>()

    fun addProduct(product: Product){
            if (product.isInStoke()){
                products.add(product)
                println("Product ${product.name} is added into cart")
            } else{
                println("Product ${product.name} is not available")
            }
    }

    fun removeProduct(product: Product){
         if(product.isInStoke()){
             products.remove(product)
             println("Product ${product.name} is removed from cart")
         } else {
             println("Product ${product.name} os not in the cart")
         }
    }

    fun calculateTotal(): Double{
        var total = 0.0
         for(product in products){
             total += product.price
             println(total)
         }
        return total
    }

    fun showCartDetails(){
        print("Cart Details")
        for(product in products) {
            product.displayInfo()
        }
        println("Total price: $${calculateTotal()}")
    }
}