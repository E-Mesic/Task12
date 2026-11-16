/**
 * A registry that stores students enrolled in each course.
 *
 * @param enrollments a Map containing courses and their enrolled students
 * @example
 *   val registry = new CourseRegistry(Map.empty)
 */
class CourseRegistry(enrollments: Map[Course, Set[Student]]):

  /**
   * Adds a student to a course and returns a new registry.
   *
   * @param student the student to enroll
   * @param course the course the student wants to join
   * @return a new registry containing the additional enrollment
   * @example
   *   val updated = registry.enroll(HochschuleRegistry.student, HochschuleRegistry.course)
   */
  def enroll(student: Student, course: Course): CourseRegistry =
    val currentStudents = enrollments.getOrElse(course, Set.empty)
    val updatedStudents = currentStudents + student
    val updatedEnrollments = enrollments + (course -> updatedStudents)
    new CourseRegistry(updatedEnrollments)

  /**
   * Returns all students enrolled in a specific course.
   *
   * @param course the course whose students should be returned
   * @return a Set containing the enrolled students, or an empty Set
   * @example
   *   registry.studentsIn(HochschuleRegistry.course)
   */
  def studentsIn(course: Course): Set[Student] =
    enrollments.getOrElse(course, Set.empty)

  /**
   * Returns the students enrolled in both specified courses.
   *
   * @param c1 the first course
   * @param c2 the second course
   * @return a Set containing students enrolled in both courses
   * @example
   *   registry.inBoth(course1, course2)
   */
  def inBoth(c1: Course, c2: Course): Set[Student] =
    studentsIn(c1).intersect(studentsIn(c2))
