package case_classes

/**
  * @author Evgeny Borisov
  */
case class Student(
                    name: String, age: Int) {
  override def toString: String = s"name = $name"
}
