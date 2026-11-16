object HochschuleRegistry: //singleton (object) used for database (es existiert nur 1)
  // updated instances
  val prof: Professor = Professor("Dr. Prof. Marko Boger", "Programmiertechnik")
  val student: Student = Student("Amar Mesic", 319323, DegreeProgram.AngewandteInformatik)
  val student2: Student = Student("Eldar Mesic", 319322, DegreeProgram.WirtschaftsInformatik)
  val course: Course = Course("Programmiertechnik", 6)
  val room: Room = Room("Gebäude G", "G240")

  // tuple representing a booking: (Course, Room) (from 2 classes course and room (look at HochschuleValues.scala))
  val courseBooking: (Course, Room) = (course, room)