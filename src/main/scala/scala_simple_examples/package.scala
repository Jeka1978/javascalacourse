/**
  * @author Evgeny Borisov
  */
package object scala_simple_examples {

  class Person(var age:Int=12,name:String,salaray:Int=1000){
    init
    var salary = age*10
    private def init = {
      println("person was created")
      printMyAge()
    }

    def printMyAge():Unit={
     println(age)
    }

    override def toString: String = {
      s"name=$name age=$age"
    }
  }

}
