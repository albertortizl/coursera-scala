package week1.generator

trait Tree
case class Inner(left:Tree, right: Tree) extends Tree
case class Leaf(x: Int) extends Tree

