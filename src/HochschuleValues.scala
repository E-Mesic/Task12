enum DegreeProgram:
  case AngewandteInformatik, WirtschaftsInformatik

case class Professor(name: String, department: String)
case class Student(name: String, matriculationNumber: Int, program: DegreeProgram)
case class Course(title: String, ects: Int)
case class Room(building: String, roomNumber: String)
// normal class initialises objects immutable
// case class