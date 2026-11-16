/**
 * A registry that stores the students enrolled in each course.
 *
 * @param enrollments a Map containing courses and their enrolled students
 * @example
 *   val registry = CourseRegistry(Map.empty)
 */
class CourseRegistry(enrollments: Map[Course, Set[String]]):

  /**
   * Adds a student to a course and returns a new registry.
   *
   * @param student the name of the student
   * @param course the course the student wants to join
   * @return a new registry containing the additional enrollment
   * @example
   *   val updated = registry.enroll("Amar", Course.Programming)
   */
  def enroll(student: String, course: Course): CourseRegistry =
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
   *   registry.studentsIn(Course.Programming)
   */
  def studentsIn(course: Course): Set[String] =
    enrollments.getOrElse(course, Set.empty)

  /**
   * Returns the students enrolled in both specified courses.
   *
   * @param c1 the first course
   * @param c2 the second course
   * @return a Set containing students enrolled in both courses
   * @example
   *   registry.inBoth(Course.Programming, Course.Mathematics)
   */
  def inBoth(c1: Course, c2: Course): Set[String] =
    studentsIn(c1).intersect(studentsIn(c2))
