@main def main(): Unit =
  println("=== Hochschule Data Model ===")
  // Hochschule management - Development
  // Printing individual instances with accessing their specific fields
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
      // Create an empty course registry
    val registry = new CourseRegistry(Map.empty)

    // Enroll students in courses
    val registry1 = registry.enroll("Amar", Course.Programming)
    val registry2 = registry1.enroll("Eldar", Course.Programming)
    val registry3 = registry2.enroll("Amar", Course.Mathematics)

    // Print all students in Programming
    println(registry3.studentsIn(Course.Programming))

    // Print students enrolled in both courses
    println(registry3.inBoth(Course.Programming, Course.Mathematics))
