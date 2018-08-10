import java.util.logging.Logger

import akka.actor.{Actor, ActorSystem, PoisonPill, Props}
import utils.LoggerFactory

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class HelloActor extends Actor {
  def receive = {
    case "hello" =>

      println("I have executed")
    2

    case _       =>
      println("in defaulttttttttttttt")
      5
  }
}



object TestPoisonPill extends App {

  LoggerFactory.debug("Debug message")
  LoggerFactory.error("Error Message")
  LoggerFactory.info("Info message")
  LoggerFactory.warn("warning message")

    val system = ActorSystem("HelloSystem")
    // default Actor constructor
    val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")



    helloActor ! "hello"

    val x: Future[Unit] = Future{
      Thread.sleep(10000)
    }
    x.map{ y =>
      println("ïn mapppppppppppppp")
      helloActor ! PoisonPill
      system.terminate()
      helloActor ! "hello"
    }

}
