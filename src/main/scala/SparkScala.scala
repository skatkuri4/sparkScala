package com.test.spark
import org.apache.spark.sql.SparkSession
object SparkScala {
  case class Person(name: String, age: Int)
  def main(args: Array[String]): Unit =
  {
//    System.setProperty("hadoop.home.dir","/Users/surenderkatkuri/")
    val spark = SparkSession.builder().appName("SparkScala").master("yarn-client").getOrCreate()
    //val df = spark.read.format("csv").option("sep"," ").option("inferSchema","true").load("hdfs://dsrqqa/user/idmaerqt/oozie_test/input/person.txt").as("Person")
    val df = spark.read.text("hdfs://dsrqqa/user/idmaerqt/oozie_test/input/person.txt")
    df.write.save("hdfs://dsrqqa/user/idmaerqt/oozie_test/output")

  }

}
