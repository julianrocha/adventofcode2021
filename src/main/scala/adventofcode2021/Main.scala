package adventofcode2021
import adventofcode2021.solutions.{_}

object Main {
    def main(args: Array[String]): Unit = {
        val sol = Class.forName("adventofcode2021.solutions." + args.head).getDeclaredConstructor().newInstance().asInstanceOf[baseSolution]
        println(sol.run())
    }
}
