import java.util.ArrayList;

// Complexidade de O(1) para os métodos dentro desta classe.
public class PriorityQueue<K, V> {
  ArrayList<Entry<K,V>> lista = new ArrayList<>();
  public int size(){
    return lista.size();
  }
  public Entry<K,V> min(){
    return lista.get(0);
  }
  public boolean isEmpty(){
    return lista.isEmpty();
  }
  public Entry<K,V> insert(Entry<K,V> element){
    lista.add(element);
    return element;
  }
  public Entry<K,V> removeMin(){
    Entry<K,V> min = min();
    lista.remove(min);
    return min;
  }
}