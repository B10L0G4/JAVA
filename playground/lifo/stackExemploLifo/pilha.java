package stackExemploLifo;

public class pilha {
    private noDapilha refEntradaPilha; // top of stack

    public pilha() {
        this.refEntradaPilha = null;
    }
    public void push(noDapilha noVoNoDapilha){ //coloca um item no topo da pilha
        noDapilha refAuxiliar = refEntradaPilha; // referencia auxiliar para o topo da pilha
        refEntradaPilha = noVoNoDapilha; // o topo da pilha recebe o novo nó
        refEntradaPilha.setReNew(refAuxiliar); // o novo nó aponta para o antigo topo da pilha
    }
    public noDapilha pop(){ // remove o item do topo da pilha
        if (!isEmpty()){ // se a pilha estiver vazia
            noDapilha noPoped = refEntradaPilha; // cria uma referencia para o topo da pilha
            refEntradaPilha = refEntradaPilha.getReNew(); // o topo da pilha recebe o nó abaixo dele
            return noPoped;// retorna o nó que foi removido
        }
        return null;
    }
    public noDapilha top(){ // retorna o item do topo da pilha
        return refEntradaPilha; // retorna o topo da pilha
    }

    public boolean isEmpty(){
        return refEntradaPilha == null ? true : false; // stack is empty
    }

    @Override
    public String toString(){ // retorna a pilha
        String stringRetorno = "----------------\n"; // cria uma string para retornar a pilha
        stringRetorno += "     Stack\n"; // cria uma string para retornar a pilha
        stringRetorno += "----------------\n"; // cria uma string para retornar a pilha

        noDapilha noAuxiliar = refEntradaPilha; // cria uma referencia para o topo da pilha

        while(true){
            if(noAuxiliar != null){ // se o topo da pilha não for nulo
                stringRetorno += "[Nó {data = " + noAuxiliar.getData() + "}]\n"; // cria uma string para retornar a pilha
                noAuxiliar = noAuxiliar.getReNew(); // o topo da pilha recebe o nó abaixo dele
            }else{
                break; // para o loop
            }
        }

        stringRetorno += "================\n";  // cria uma string para retornar a pilha
        return stringRetorno; // retorna a pilha
    }
}
