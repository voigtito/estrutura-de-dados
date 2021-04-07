import java.util.*;

class AgeComparator implements Comparator<Student> {
  public int compare(Student student1, Student student2) {
    if (student1.age == student2.age)
      return 0;
    else if (student1.age > student2.age)
      return 1;
    else
      return -1;
  }
}