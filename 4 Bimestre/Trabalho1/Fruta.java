public class Fruta implements Entry<Integer,String>{

  private String value;
  private Integer key;

  public Fruta(Integer key, String value){
    this.key = key;
    this.value = value;
  }
  
  @Override
  public String getValue() { return value; }
  @Override
  public Integer getKey() { return key; }
  @Override
  public String toString() {
    return "Fruta: key=" + key + " value=" + value;
  }
}