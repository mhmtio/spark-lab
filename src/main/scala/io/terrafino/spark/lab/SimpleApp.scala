package io.terrafino.spark.lab

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import io.terrafino.logging.Logger

object SimpleApp extends Logger {
  def main(args: Array[String]) {
    logger.info("Start.")
    val conf = new SparkConf().setMaster("local[4]").setAppName("Simple Application")
    val sc = new SparkContext(conf)
    logger.info("End.")
  }
}