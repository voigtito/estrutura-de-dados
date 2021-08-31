import java.util.Iterator;

public class Tree<E> {

  private int size;
  private Position<E> root;

  public Position<E> root() throws Exception {
    return root;
  }

  public Position<E> parent(Position<E> position) throws Exception {
    if (isRoot(position)) {
      throw new Exception("Root does not have a parent.");
    }
    return position.getParent();
  }

  public Iterator<Position<E>> children(Position<E> position) throws Exception {
    checkIsPositionValid(position);
    return position.getChildren();
  }

  public boolean isInternal(Position<E> position) throws Exception {
    return !isExternal(position);
  }

  public boolean isExternal(Position<E> position) throws Exception {
    checkIsPositionValid(position);
    return position.size() == 0;
  }

  public boolean isRoot(Position<E> position) throws Exception {
    checkIsPositionValid(position);
    return root == position;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public Iterator<Position<E>> positions() {
    return null;
  }

  public E replace(Position<E> position, E element) throws Exception {
    checkIsPositionValid(position);
    E old = position.getElement();
    position.setElement(element);
    return old;
  }

  public Position<E> addRoot(E element) throws Exception {
    if (!isEmpty()) {
      throw new Exception("The tree is not empty.");
    }
    root = new Position<>(element);
    size++;
    return root;
  }

  public Position<E> addChild(Position<E> parent, E element) throws Exception {
    checkIsPositionValid(parent);
    size++;
    return parent.addChild(element);
  }

  private void checkIsPositionValid(Position<E> position) throws Exception {
    if (position == null) {
      throw new Exception("The position is invalid.");
    }
  }

}
