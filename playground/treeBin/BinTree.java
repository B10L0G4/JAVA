package JAVA.treeBin;

public class BinTree <T extends Comparable<T>>{
    private NoBinTree<T> root;
    public BinTree() {
        this.root = null;
    }

    public void insert(T conteudo){
        NoBinTree<T> newKnot = new NoBinTree<>(conteudo);
        root = insert(root, newKnot);
    }
    private NoBinTree<T> insert(NoBinTree<T> actual, NoBinTree<T> newknot){
        if (actual == null){
            return newknot;
        } else if (newknot.getConteudo().compareTo(actual.getConteudo()) < 0) {
            actual.setNoEsq(insert(actual.getNoEsq(), newknot));
        }else {
            actual.setNoDir(insert(actual.getNoDir(), newknot));
        }
        return actual;
    }

    public void DisplayInOrder() {
        System.out.print("\n Show Order ");
        DisplayInOrder(this.root);

    }

    private void DisplayInOrder(NoBinTree<T> actual) {
        if (actual != null){
            DisplayInOrder(actual.getNoEsq());
            DisplayInOrder(actual.getNoDir());
            System.out.print(actual.getConteudo() + ", ");

        }
    }

    public void DisplayPostOrder(){
        System.out.print("\n Show Post Order ");
        DisplayPostOrder(this.root);
    }

    private void DisplayPostOrder(NoBinTree<T> actual) {
        if (actual != null) {
            DisplayPostOrder(actual.getNoEsq());
            System.out.print(actual.getConteudo() + ", ");
            DisplayPostOrder(actual.getNoDir());
        }
    }

    public void DisplayPreOrder(){
        System.out.print("\n Show Pre Order ");
        DisplayPreOrder(this.root);
    }

    private void DisplayPreOrder( NoBinTree<T> actual){
        if (actual != null) {
            System.out.print(actual.getConteudo() + ", ");
            DisplayPreOrder(actual.getNoEsq());
            DisplayPreOrder(actual.getNoDir());
        }
    }

    public void remove(T conteudo){
        try {
            NoBinTree<T> actual = this.root;
            NoBinTree<T> dad = null;
            NoBinTree<T> son = null;
            NoBinTree<T> temp = null;

            while (actual != null && actual.getConteudo().equals(conteudo)){
                dad = actual;
                if (conteudo.compareTo(actual.getConteudo())< 0){
                    actual = actual.getNoEsq();
                }else{
                    actual = actual.getNoDir();
                }
            }
            if (actual == null){
                System.out.println("Conteudo nao encontrado.Bloco Try");
            }
            if (dad == null){
                if (actual.getNoDir() == null){
                    this.root = actual.getNoEsq();
                }else if(actual.getNoEsq() == null){
                    this.root = actual.getNoDir();
                }else {
                    for (temp = actual, son = actual.getNoEsq();
                         son.getNoDir() != null;
                         temp = son, son =son.getNoEsq()
                    ){
                        if (son!= actual.getNoEsq()){
                            temp.setNoDir(son.getNoEsq());
                            son.setNoEsq(root.getNoEsq());
                        }
                        son.setNoDir(root.getNoDir());
                        root = son;
                    }
                }

            }else if (actual.getNoDir() == null){
                if (dad.getNoEsq() == actual){
                    dad.setNoEsq(actual.getNoEsq());
                }else{
                    dad.setNoDir(actual.getNoEsq());
                }

            }else if (actual.getNoEsq() == null) {
                if (dad.getNoEsq() == actual){
                    dad.setNoEsq(actual.getNoDir());
                }else {
                    dad.setNoDir(actual.getNoDir());
                }

            }else {
                for (
                        temp = actual, son= actual.getNoEsq();
                        son.getNoDir() != null;
                        temp = son, son = son.getNoDir()
                ){
                    if (son != actual.getNoEsq()){
                        temp.setNoDir(son.getNoEsq());
                        temp.setNoEsq(son.getNoEsq());
                    }
                    son.setNoDir(actual.getNoDir());
                    if (dad.getNoEsq() == actual){
                        dad.setNoEsq(son);
                    }else {
                        dad.setNoDir(son);
                    }
                }
            }

        }catch (NullPointerException erro){
            System.out.println("Conteudo não encontrado . Bloco Catch");
        }
    }
}
