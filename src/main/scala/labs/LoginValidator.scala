package labs

/**
  * @author Evgeny Borisov
  */
object LoginValidator {
  def validate(login: NewLogin): Unit = {

    login match {
      case NewLogin("admin", _, _) => println("name can't be admin")
      case NewLogin(_, pass, _) if pass.startsWith("z") => println("password can't start with z")
      case NewLogin(name, pass, _) if pass == name => println(s"$name is the same with password $pass")
      case NewLogin(_, pass, _) if pass.forall(l => l.isDigit) => println(s"your password $pass contains only digits")
      case NewLogin(_, pass, conf) if conf != pass => println("password must equal confiramtion")
      case _ => println("accepted")
    }
  }

  def main(args: Array[String]): Unit = {
    val login = NewLogin("jeka", "blabla", "blabla")
    LoginValidator.validate(login)
  }
}
