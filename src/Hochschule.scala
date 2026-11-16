@main def main(): Unit =
  println("=== Hochschule Data Model ===")

  // Printing individual instances by accessing their specific fields
  val p = HochschuleRegistry.prof
  println(s"Professor: ${p.name} (${p.department})")
  //shortcut for println(s"Student: ${HochschuleRegistry.student.name}")
  val s = HochschuleRegistry.student
  println(s"Student: ${s.name}, ID: ${s.matriculationNumber}, Program: ${s.program}")

  val s2 = HochschuleRegistry.student2
  println(s"Student 2: ${s2.name}, ID: ${s2.matriculationNumber}, Program: ${s2.program}")

  val c = HochschuleRegistry.course
  println(s"Course:    ${c.title}, ECTS: ${c.ects}")

  val r = HochschuleRegistry.room
  println(s"Room:      ${r.building}, Room Nr: ${r.roomNumber}")

  // Printing the tuple (Course, Room) booking cleanly
  println("\n=== Booking Tuple ===")
  val booking = HochschuleRegistry.courseBooking
  println(s"Booked Course: ${booking._1.title}")
  println(s"Booked Room:   ${booking._2.roomNumber}")
  println(s"Pair:          (${booking._1.title}, ${booking._2.roomNumber})")