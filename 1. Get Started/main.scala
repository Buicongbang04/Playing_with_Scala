import scala.io.StdIn.readLine

object Main{
    def main(args: Array[String]): Unit = {
        println("Hello world!")
        println(msg)
        // input_temperature
        var doanh = People("Doanh", 22, 170.5)
        doanh.printInfo()
    }
}
def msg = "I was compiled with Scala :)"

// Asking for user input
def input_temperature = {
    println("Please enter the temperature in Celsius: ")
    val celsius = readLine().toDouble //import scala.io.StdIn.readLine
    val fahrenheit = celsius * 9/5 + 32
    println(s"Temperature in Fahrenheit: ${fahrenheit} degrees")
    println(s"Temperature in Celsius: ${celsius} degrees")
}

// Define a class
class People(name: String, age: Int, height: Double){
    def printInfo(): Unit = {
        println(s"Name: ${name}")
        println(s"Age: ${age}")
        println(s"Height: ${height} cm")
    }
}