package solutions.login

/**
  * @author Evgeny Borisov
  */
object Starter extends App{
  LoginService.validate(NewLogin("admin","12","12"))
  LoginService.validate(NewLogin("jeka","z","12"))
  LoginService.validate(NewLogin("jeka","jeka","12"))
  LoginService.validate(NewLogin("jeka","12344532","12"))
  LoginService.validate(NewLogin("jeka","abc","ABC"))
  LoginService.validate(NewLogin("jeka","abc","abc"))
}