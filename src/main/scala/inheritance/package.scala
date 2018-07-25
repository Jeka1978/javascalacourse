/**
  * @author Evgeny Borisov
  */
package object inheritance {

  case class Person(name: String, age: Int)

  trait PersonValidator {
    def validate(person: Person): String
  }

  class PersonNameValidator extends PersonValidator {
    override def validate(person: Person): String = {
      var str = ""
      if (person.name == null || person.name.isEmpty) {
        str = "name is not initialized"
      }
      str
    }
  }
  object PersonAgeValidator extends PersonValidator{
    override def validate(person: Person): String = {
      if(person.age<0) "age can't be negative"
      else ""
    }
  }

}