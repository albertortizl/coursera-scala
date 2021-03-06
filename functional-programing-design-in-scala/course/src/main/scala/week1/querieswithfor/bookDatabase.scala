package week1.querieswithfor

/**
  * Created by aortiz on 6/02/17.
  */

case class Book(title: String, authors: List[String])

object BookDatabase {
  val books: List[Book] = List(
    Book(
      title = "Structure and Interpretation of Computer Programs",
      authors = List("Abelson, Harald", "Sussman, Gerald J.")
    ),
    Book(
      title = "Introduction to Functional Programming",
      authors = List("Bird, Richard", "Wadler, Phil")
    ),
    Book(
      title = "Effective Java",
      authors = List("Bloch, Joshua")
    ),
    Book(
      title = "Java Puzzlers",
      authors = List("Bloch, Joshua", "Gafter, Neal")
    ),
    Book(
      title = "Programming in Scala",
      authors = List("Odersky, Martin", "Spoon, Lex", "Venners, Bill"))
  )
}

