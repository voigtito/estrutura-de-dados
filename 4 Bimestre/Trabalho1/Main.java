public class Main {
  
  public static void main(String[] args) {

    PriorityQueue<Integer, String> Frutas = new PriorityQueue<>();

    Fruta One = new Fruta(2, "Maça");
    Frutas.insert(One);

    Fruta Two = new Fruta(1, "Banana");
    Frutas.insert(Two);

    Fruta Three = new Fruta(2, "Pera");
    Frutas.insert(Three);

    Fruta Four = new Fruta(3, "Uva");
    Frutas.insert(Four);

    Fruta Five = new Fruta(1, "Tomate");
    Frutas.insert(Five);
    
    System.out.println(Frutas.removeMin());
    System.out.println(Frutas.isEmpty());
    System.out.println(Frutas.min());
    System.out.println(Frutas.size());
  }
}