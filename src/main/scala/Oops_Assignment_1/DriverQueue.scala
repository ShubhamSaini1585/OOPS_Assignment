package Oops_Assignment_1

import scala.collection.mutable.ListBuffer
object DriverQueue extends App{

  val list = ListBuffer(2, 7, 3, 8, 9, 42, 32, 17, 5)
  println(list)

  var doubledList = new DoubleQueue(list)  //Doubled the elements in the queue.
  println(list)

  var squareQueue = new SquareQueue(list)   //Squaring the elements in queue.
  println(list)

  squareQueue.dequeue(list)
  println(list)

  squareQueue.enqueue(list)
  println(list)
}