import org.apache.spark.sql._
import org.apache.spark._
object SparkApp {
  def main(args: Array[String]): Unit = {
    sessionSpark()
  }
def sessionSpark(): Unit={

  val ss = SparkSession.builder()
    .master("local[*]")
    .appName(name="Ma premiere application")
    // .enableHiveSupport()
    .getOrCreate()

  val rddl = ss.sparkContext.parallelize(Seq("Ma premiere application Spark, je suis un etudiant a l'inphb"))
  rddl.foreach(l=>println(l))

  //dataframe
  val df_1=ss.read
    .format("csv")
    .option("inferSchema","true")
    .option("header","true")
    .option("delimiter",";")
    .csv("C:\\Users\\Atto Jean Luc\\Desktop\\Nouvennau dossier")
    df_1.show(18)
    df_1.printSchema()
    df_1.createOrReplaceTempView("orders")
   ss.sql("SELECT*FROM orders WHERE city='NEWTON'").show()
  ss.sql("SELECT*FROM orders WHERE city='NEWTON'").explain()
}

}
