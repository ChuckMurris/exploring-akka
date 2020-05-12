import akka.actor.ActorSystem
import akka.stream.scaladsl.Source

object FirstStream extends App {
  implicit val system = ActorSystem("QuickStart")
  implicit val ec = system.dispatcher
  Source(1 to 100).runForeach(i => println(i)).onComplete(_ => system.terminate())
}
