import java.util.*;
import java.io.*;

class Main {

  public static int[] bubbleSort(int[] array) {
    int n = array.length;
    int temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (array[j - 1] > array[j]) {
          temp = array[j - 1];
          array[j - 1] = array[j];
          array[j] = temp;
        }
      }
    }
    return array;
  }

  public static int[] selectionSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int min = array[i];
      int minId = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < min) {
          min = array[j];
          minId = j;
        }
      }
      int temp = array[i];
      array[i] = min;
      array[minId] = temp;
    }
    return array;
  }

  public static int[] insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int current = array[i];
      int j = i - 1;
      while (j >= 0 && current < array[j]) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = current;
    }
    return array;
  }
  public static void main(String args[]) {

    ArrayList<Student> classStudents = new ArrayList<Student>();
    classStudents.add(new Student(1.76, "Gustavo", 23));
    classStudents.add(new Student(1.82, "Joaquim", 27));
    classStudents.add(new Student(1.60, "Daniel", 21));

    System.out.println("Ordenando pelo nome");
    Collections.sort(classStudents, new NameComparator());
    for (Student student : classStudents) {
      System.out.println(student.height + " " + student.name + " " + student.age);
    }

    System.out.println("Ordenando pela idade");
    Collections.sort(classStudents, new AgeComparator());
    for (Student student : classStudents) {
      System.out.println(student.height + " " + student.name + " " + student.age);
    }

    System.out.println("Ordendando pela altura");
    Collections.sort(classStudents, new HeightComparator());
    for (Student student : classStudents) {
      System.out.println(student.height + " " + student.name + " " + student.age);
    }

    int [] arr = {1, 5, 8, 2, 10, 4, 6, 19, 4};
    System.out.println("BubbleSort:");
    System.out.println(Arrays.toString(bubbleSort(arr)));

    int [] arr2 = {1, 5, 8, 2, 10, 4, 6, 19, 4};
    System.out.println("insertionSort:");
    System.out.println(Arrays.toString(insertionSort(arr2)));

    int [] arr3 = {1, 5, 8, 2, 10, 4, 6, 19, 4};
    System.out.println("selectionSort:");
    System.out.println(Arrays.toString(selectionSort(arr3)));
  }
}