package Trees;

public class MyTree {

    TNode root;
    public MyTree() {}

    void insert(int data) {
        TNode node = new TNode(data);
        if (isEmpty()){
            root = node;
        } else {
         TNode current = root;
         if (data > root.value){

         }
        }
    }

    boolean isEmpty() {
        return root == null;
    }


}
