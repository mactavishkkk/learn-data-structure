import classes.tree.Tree;

public class BinaryTree {

  public static void main(String[] args) {
    Tree tree = new Tree();

    tree.insere(10, "A");
    tree.insere(5, "B");
    tree.insere(15, "C");
    tree.insere(2, "D");
    tree.insere(7, "E");
    tree.insere(12, "F");
    tree.insere(6, "G");
    tree.insere(8, "H");

    tree.imprimeElementosArvore();
    System.out.println("\nAltura: " + tree.alturaArvore());
  }
}
