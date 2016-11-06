//### activator
//download activator

//start activator
//./bin/activator

//start activator ui
//./bin/activator ui

//create project folder "my-scala-project". Create a build.sbt into them, and put the necessary configurations
//start activator into the "my-scala-project-folder", calling the activator full path

///home/dsantos/activator-dist-1.3.12/bin/activator

//create plugins.sbt and put plugins dependencies

///home/dsantos/activator-dist-1.3.12/bin/activator

//start a eclipse project typing "sclipse into" REPL
//several dependencies will be downloaded

//download the sclipse scala
//start Eclipse IDE and import scala project

//start the scala REPL
//typing  "console"

//### Spark example
//1 to 20
//res0.groupBy(number => number % 3)
//
////paste mode
//:paste
//
//import org.apache.spark.SparkConf
//import org.apache.spark.SparkContext
//import org.apache.spark.SQLContext
//import org.apache.spark.ml.feature.NGram
//
////ctrl + d
//
//val conf = new SparkConf().setAppName("my-scala-project").setMaster("local[2]")
//val sc = new SparkContext(conf)
//val sqlContext = new SQLContext(sc)
//
//:paste
//val wordDataFrame = sqlContext.createDataFrame(Seq(
//    (0, Array("Hi", "I", "want", "to". "learn", "data", "science")),
//    (1, Array("I", "want", "to", "use", "Scala")),
//    (2, Array("This", "is", "easy", "and", "fun")),
//)).toDF("label", "words")
//
////ctrl + d
//val ngram = new NGram().setInputCol("words").setOutputCol("ngrams")
//val ngramDataFrame ngram.transform(wordDataFrame)
//ngramDataFrame.take(3).map(line => line.getAs[Strem[String]]("ngrams").toList).foreach(println)
//