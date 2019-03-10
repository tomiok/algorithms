package trees;

public class InOrderTraversal {

  public static void main(final String[] args) {
    final TreeNode[] treeNode = {new TreeNode(2), new TreeNode(3)};
    final TreeFactory treeFactory = TreeFactory.create(1).setChildren(treeNode);
    final Tree tree = treeFactory.create();

    System.out.println(tree.toString());
  }
}
