import java.util.Iterator;

public class TreeService {

  public static int size(Tree<Directory> structure, Position<Directory> directory) {

    int size = directory.getElement().getSize();
    Iterator<Position<Directory>> iterator = structure.children(directory);

    while (iterator.hasNext()) {
      Position<Directory> child = iterator.next();
      size += size(structure, child);
    }

    return size;
  }
}
