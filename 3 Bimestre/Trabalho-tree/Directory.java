import java.util.ArrayList;

public class Directory {

  private ArrayList<File> files;
  private String name;
  private int size;

  public ArrayList getFiles() {
    return files;
  }

  public void setFiles(ArrayList files) {
    this.files = files;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Directory(String name) {
    this.size = 1;
    this.name = name;
    this.files = new ArrayList<File>();
  }

  public void addFile(File file) {
    this.files.add(file);
    this.size += file.getSize();
  }

  public void removeFile(File file) {
    this.files.remove(file);
    this.size -= file.getSize();
  }

}
