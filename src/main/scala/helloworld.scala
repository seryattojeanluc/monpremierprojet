import Personne._
import scala.collection.immutable._

object helloworld {

def main(args:Array[String]):Unit={
  //val text:String="Hello worrld, mon premier programme en scala"
   // println("Hello world, mon premier programme en scala")
  val maliste = List("atto","jean","luc","michel","andi","erver","bibi")
   val n= maliste.map(l=>(l.length))
  n.foreach(l=>println(l))
  val m = maliste.filter(l=>(l.length>3)).foreach(l=>println(l))
  //tuple
 // val montuple=("10",Personne("juvenal","JVC",15,Some(10,2),true))
  //Map
  val monMap:Map[String, String]=Map(
    "cc"->"cocody",
  "yy"->"Yop",
  "abd"->"abidjan"
  )

  //tableau


  }

}



