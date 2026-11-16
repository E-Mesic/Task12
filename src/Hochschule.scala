@main def main(): Unit =
  println("=== Hochschule Data Model ===")

  // File Management - Amar
  // Printing individual instances through accessing their specific fields
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

  // Printing the tuple (Course, Room) booking understandably
  println("\n=== Hochschule Booking Tuple ===")
  val booking = HochschuleRegistry.courseBooking
  println(s"Booked Course: ${booking._1.title}")
  println(s"Booked Room:   ${booking._2.roomNumber}")
  println(s"Pair:          (${booking._1.title}, ${booking._2.roomNumber})")

    // Course Registry
  val mathematics = Course("Mathematik", 5)

  val registry = new CourseRegistry(Map.empty)

  val registry1 = registry.enroll(HochschuleRegistry.student, HochschuleRegistry.course)
  val registry2 = registry1.enroll(HochschuleRegistry.student2, HochschuleRegistry.course)
  val registry3 = registry2.enroll(HochschuleRegistry.student, mathematics)

  println("\n=== Course Registry ===")

  println("Students in Programmiertechnik:")
  registry3.studentsIn(HochschuleRegistry.course).foreach(student => println(student.name))

  println("\nStudents in both courses:")
  registry3.inBoth(HochschuleRegistry.course, mathematics).foreach(student => println(student.name))

