package solutions

import org.springframework.util.StringUtils

/**
  * @author Evgeny Borisov
  */
package object login {

  case class NewLogin(username: String, password: String, confirmation: String)

  object LoginService {
    def validate(login: NewLogin): Unit = {
      login match {
        case NewLogin("admin", _, _) => println("name can't be admin")
        case NewLogin(_, pass, _) if pass.startsWith("z") => println("password can't start with z")
        case NewLogin(name, pass, _) if pass.equals(name) => println(s"password $pass equals to name $name")
        case NewLogin(_, pass, _) if pass.forall(_.isDigit) => println("your password " + pass + " contains only digits")
        case NewLogin(_, pass, conf) if pass != conf => println(s"password $pass should be equals to $conf")
        case _ => println(s"your $login is accepted")
      }
    }
  }


}
