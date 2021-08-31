import java.util.ArrayList;

class Main {

  public static void main(String[] args) {

    Directory c = new Directory("c");
    Tree<Directory> tree = new Tree<>();
    Position<Directory> root = tree.addRoot(c);

    // Creating folders.
    Directory downloads = new Directory("downloads");
    Directory windows = new Directory("windows");
    Directory documents = new Directory("documents");
    Directory videos = new Directory("videos");
    Directory photos = new Directory("fotos");

    // Creating the files.
    // It could be a input from files as ArrayList with the data to be generic.
    new File("por-do-sol.mp4", 1000000000, videos);
    new File("explorer.exe", 30000, windows);
    new File("foto1.png", 231000, photos);
    new File("foto2.png", 341000, photos);

    // new File("novo-arquivo.mp4", 3000000000, videos);
    // new File("explorer-two.exe", 10000, windows);
    // new File("foto3.png", 531000, photos);
    // new File("foto4.png", 141000, photos);

    // Adding childs for each folder in the tree.
    Position<Directory> childDownloads = tree.addChild(tree.root(), downloads);
    Position<Directory> childWindows = tree.addChild(tree.root(), windows);
    Position<Directory> childDoc = tree.addChild(tree.root(), documents);
    Position<Directory> childVideos = tree.addChild(childDoc, videos);
    Position<Directory> childPhotos = tree.addChild(childDoc, photos);
    
    System.out.println("Tamanho de Downloads-> " + TreeService.size(tree, childDownloads) + " Bs");
    System.out.println("Tamanho de Windows-> " + TreeService.size(tree, childWindows) + " Bs");
    System.out.println("Tamanho de Documents-> " + TreeService.size(tree, childDoc) + " Bs");
    System.out.println("Tamanho de Videos-> " + TreeService.size(tree, childVideos) + " Bs");
    System.out.println("Tamanho de Photos-> " + TreeService.size(tree, childPhotos) + " Bs");
    System.out.println("Tamanho de c:-> " + TreeService.size(tree, root) + " Bs");
  }
}