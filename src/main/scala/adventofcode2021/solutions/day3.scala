package adventofcode2021.solutions

class day3() extends baseSolution {

  override def runPart1(input: String): String = {
	var gammaRate = 0
	var epsilonRate = 0
	var lines = input
		.split("\n")
	
	val numLines = lines.length
	
	var res = lines
		.map(
			_.toList
			.map(_.asDigit)
		)
		.reduce((num1, num2) => {
			num1.zip(num2).map(x => x._1 + x._2)
		})
		.map(x => if(x > numLines/2) 1 else 0)
		.mkString

	gammaRate = Integer.parseInt(res, 2)
	
	println(res)
	println(gammaRate)
	
	epsilonRate = ~gammaRate & 4095
	(gammaRate * epsilonRate).toString()
  }

  override def runPart2(input: String): String = ???

	
}