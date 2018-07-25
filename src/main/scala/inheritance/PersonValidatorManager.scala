package inheritance

/**
  * @author Evgeny Borisov
  */
object PersonValidatorManager {

  val validators = List(
    new PersonNameValidator,
    PersonAgeValidator)

  def printPersonValidation(person: Person):Unit={
    validators.foreach(validator=>validator.validate(person))
  }

}
