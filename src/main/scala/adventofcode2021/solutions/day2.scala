package adventofcode2021.solutions

class day2 extends baseSolution {

	override def runPart1(input: String): String = {
		var horizontal = 0
		var vertical = 0
		val res = input
			.split("\n")
			.map(_.split(" ").toList)
			.foreach(operation => {
				operation match {
					case "forward" :: x :: Nil => horizontal+= x.toInt
					case "down" :: x :: Nil => vertical += x.toInt
					case "up" :: x :: Nil => vertical -= x.toInt
					case _ => 
				}
			})
		(horizontal * vertical).toString()
	}

	override def runPart2(input: String): String = {
		var horizontal = 0
		var vertical = 0
		var aim = 0
		val res = input
			.split("\n")
			.map(_.split(" ").toList)
			.foreach(operation => {
				operation match {
					case "forward" :: x :: Nil => {
						horizontal+= x.toInt
						vertical += x.toInt * aim
					}
					case "down" :: x :: Nil => aim += x.toInt
					case "up" :: x :: Nil => aim -= x.toInt
					case _ => 
				}
			})
		(horizontal * vertical).toString()
  }


}