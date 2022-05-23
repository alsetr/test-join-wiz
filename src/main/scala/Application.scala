import Join.{joinPersonWithSalaryByInt, joinPersonWithSalaryByString}
import joinwiz.testkit._

object Application extends App {


  val persons = Seq(Person("Ivan", 1, "1"))
  val salaries = Seq(Salary(1, 100500, "1"))
  println(joinPersonWithSalaryByInt(persons, salaries))

  println(joinPersonWithSalaryByString(persons, salaries))
}
