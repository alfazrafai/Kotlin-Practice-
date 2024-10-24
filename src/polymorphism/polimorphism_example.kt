package polymorphism

fun main() {
  val rect: Shape = Rectangle()
    rect.draw()
  val array = arrayOf(Rectangle(),Circle(),Square())
  for(shape in array){
      println(shape.draw())
  }

}

open class Shape() {

    open fun draw() {
        println("Drawing a Shape")
    }
}

class Rectangle : Shape() {

    override fun draw() {
        println("Drawing a Rectangle")
    }
}

class Circle : Shape() {

    override fun draw() {
        println("Drawing a Circle")
    }
}

class Square : Shape() {

    override fun draw() {
        println("Drawing a Square")
    }
}

