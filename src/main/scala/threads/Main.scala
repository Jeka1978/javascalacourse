package threads

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {

    val t1 = new Thread(new Runnable {
      override def run(): Unit = printA()
    })
    val t2 = new Thread(new Runnable {
      override def run(): Unit = printB()
    })

    t2.setDaemon(true)
    t1.start()

    t2.start()



  }

  def printA() = {
    for(x<- 1 to 10){
      println("AAAAAAAAAAAAA")
      Thread.sleep(700)
    }


  }

  def printB() = {
    while(true){
      println("BBBBBBBBB")
      Thread.sleep(300)
    }

  }
}
