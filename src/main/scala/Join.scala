import joinwiz.ComputationEngine
import joinwiz.syntax._

object Join {

  def joinPersonWithSalaryByInt[F[_]: ComputationEngine](
    persons: F[Person],
    salaries: F[Salary]): F[(Person, Salary)] = {

    persons.innerJoin(salaries)(intJoinCondition)
  }

  val intJoinCondition: JOIN_CONDITION[Person, Salary] = (p,s) => p(_.id) =:= s(_.id)

  def joinPersonWithSalaryByString[F[_]: ComputationEngine](
    persons: F[Person],
    salaries: F[Salary]): F[(Person, Salary)] = {

    persons.innerJoin(salaries)((p,s) => p(_.idString) =:= s(_.idString))
  }

}
