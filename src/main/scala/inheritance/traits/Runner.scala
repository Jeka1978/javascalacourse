package inheritance.traits

/**
  * @author Evgeny Borisov
  */
trait Runner {
  init()

  private def init(): Unit = {
    run()
    println("Runner was created")
    doX()
  }


  def doX(): Unit = {
    println("working...")
  }

  def run():Unit={
    println("Running")
  }
}
