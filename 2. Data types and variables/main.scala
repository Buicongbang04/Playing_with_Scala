

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

      // Scope in Scala
      val obj = PropertyExample()
      obj.display()
      println(obj.quantity)
      // println(obj.price) // This line will give an error because the price is private.

      //Array and for loop
      var myList = Array(1.9, 2.9, 3.4, 3.5)
      
      // Print all the array elements
      for ( x <- myList ) {
         println( x )
      }

      // Summing all elements
      var total = 0.0;
      
      for ( i <- 0 to (myList.length - 1)) {
         total += myList(i);
      }
      println("Total is " + total);

      // Finding the largest element
      var max = myList(0);
      
      for ( i <- 1 to (myList.length - 1) ) {
         if (myList(i) > max) max = myList(i);
      }
      
      println("Max is " + max);
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