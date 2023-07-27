package JAVA.treeBin;

import JAVA.treeBin.Model.Obj;

public class Main {
    public static void main(String[] args) {
        BinTree<Obj> myBinTree = new BinTree<>();

        myBinTree.insert(new Obj(13));
        myBinTree.insert(new Obj(10));
        myBinTree.insert(new Obj(25));
        myBinTree.insert(new Obj(2));
        myBinTree.insert(new Obj(12));
        myBinTree.insert(new Obj(20));
        myBinTree.insert(new Obj(31));
        myBinTree.insert(new Obj(29));

        myBinTree.DisplayInOrder();
        myBinTree.DisplayPreOrder();
        myBinTree.DisplayPostOrder();






    }
}
