package adventofcode2021
import adventofcode2021.solutions.{_}
import scala.io.Source

object Main {
    def main(args: Array[String]): Unit = {
        if (args.length != 2){
            println("Must pass dayX partX!")
            return
        }
        val day = args(0)   // ex: day1
        val part = args(1)  // ex" part1
        val inputLines = Source.fromFile("src/resources/" + day + part + ".txt").mkString
        val sol = Class.forName("adventofcode2021.solutions." + day).getDeclaredConstructor().newInstance().asInstanceOf[baseSolution]
        if (part.equals("part1")){
            println(sol.runPart1(inputLines))
        } else if (part.equals("part2")){
            println(sol.runPart2(inputLines))
        }
    }
}
