package adventofcode2021.solutions

class day1() extends baseSolution {

  override def runPart1(input: String): String = {
    var increaseCount = 0
    val res = input
      .split("\n")
      .map(_.toInt)
      .reduceLeft((x1, x2) => {
        if(x1 < x2){
          increaseCount+=1
        }
        x2
      })
    increaseCount.toString()
  }

  def runPart2(input: String): String = {
    var increaseCount = 0
    val res = input
      .split("\n")
      .map(_.toInt)
      .sliding(3,1)
      .map(_.sum)
      .reduceLeft((x1, x2) => {
        if(x1 < x2){
          increaseCount+=1
        }
        x2
      })
    increaseCount.toString()
  }
}