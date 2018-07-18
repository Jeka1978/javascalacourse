/**
  * @author Evgeny Borisov
  */
package object inheritance {

  class Animal(val name:String)

  class Dog(val name2:String) extends Animal(name2)
}
