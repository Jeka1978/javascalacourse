package case_classes

/**
  * @author Evgeny Borisov
  */
object Main {


  def main(args: Array[String]): Unit = {
    var jeka = Student("Jeka", 39)
    jeka = jeka.copy(age = 40)
    println(jeka)
  }


}
