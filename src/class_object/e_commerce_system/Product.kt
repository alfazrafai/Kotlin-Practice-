package class_object.e_commerce_system

class Product(var name: String, var price: Double, var quantity: Int, var category: String) {

    fun applyDiscount(discount: Double){
        var discountAmount = price * (discount/100)
        price -= discountAmount
        println("Price of Product $name after Discont is $price")
    }

    fun isInStoke(): Boolean{
        return quantity > 0
    }

    fun displayInfo(){
        println("Product name $name Price is $price, Quantity is $quantity Category is $category")
    }
}