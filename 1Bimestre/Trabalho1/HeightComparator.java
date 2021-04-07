import java.util.*;

class HeightComparator implements Comparator<Student> {
  public int compare(Student s1, Student s2) {
    if (s1.height == s2.height)
      return 0;
    else if (s1.height > s2.height)
      return 1;
    else
      return -1;
  }
}