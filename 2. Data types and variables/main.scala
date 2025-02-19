

object Day_2 {
   def main(args: Array[String]) : Unit = {
      // var myVar :Int = 10
      // val myVal :String = "Hello Scala with datatype declaration."
      // var myVar1 = 20
      // val myVal1 = "Hello Scala new without datatype declaration."
         
      // println(myVar)
      // println(myVal)
      // println(myVar1)
      // println(myVal1)


      val obj = PropertyExample()
      obj.display()
      println(obj.quantity)
      // println(obj.price) // This line will give an error because the price is private.
   }
}

class PropertyExample {
   var quantity = 15
   private var price = 50

   def display() : Unit = {
      println("Quantity: " + quantity)
   }

   def displayPrice() : Unit = {
      println("Price: " + price)
   }
}