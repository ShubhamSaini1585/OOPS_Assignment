trait  Ordered{
  def check(p: Person)
}
class Person(val name: String, val age: Int) extends Ordered {
  def check(p: Person) {

    if(this.name.equals(p.name))
      println("true")
    else
      println("false")
  }
  def checks(p: Person) {

    if(this.age.equals(p.age))
      println("true")
    else
      println("false")
  }
}
object OOps {

  def main(args: Array[String]) {

    var p1 = new Person("Shubham", 19)
    var p2 = new Person("Saini", 19)
    //  println(p1.name)
    p1.check(p2)
    p1.checks(p2)
  }
}