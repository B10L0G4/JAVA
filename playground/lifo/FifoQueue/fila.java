package FifoQueue;

public class fila<T> {
    private noDaFila<T> refNoDaFilaEntrada;

    public fila() {
        this.refNoDaFilaEntrada = null;
    } // definie o nó de entrada como nulo

    public void enqueue(T object){ // Emfileirar
        noDaFila novoNo = new noDaFila(object); // Cria um novo nó

        novoNo.setRefNoDaFila(refNoDaFilaEntrada); // O novo nó aponta para o nó que está na entrada da fila
        refNoDaFilaEntrada = novoNo; // O nó que está na entrada da fila passa a ser o novo nó
    }
    public T first(){ // retorna o primeiro nó da fila -- refactoring alterando a entrada do método para Object, assim não é necessário fazer um cast
        if (!this.isEmpty()){

            noDaFila primeiroNo = refNoDaFilaEntrada; // Cria um nó auxiliar que recebe o nó que está na entrada da fila
            while(true){//faz um loop infinito até chegar ao primeiro da fila
                if(primeiroNo.getRefNoDaFila() != null){//verifica se o nó auxiliar não é nulo
                    primeiroNo = primeiroNo.getRefNoDaFila();//se não for nulo, o nó auxiliar recebe o próximo nó

                }else {
                    break; // sai do loop
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }
    public T dequeue (){
        if (!this.isEmpty()){
            noDaFila primeiroNo = refNoDaFilaEntrada; // primeiroNo recebe o nó que está na entrada da fila
            noDaFila noAuxiliar = refNoDaFilaEntrada; // Cria um nó auxiliar que recebe o nó que está na entrada da fila
            while(true){//faz um loop infinito até chegar ao primeiro da fila
                if(primeiroNo.getRefNoDaFila() != null){//verifica se o nó auxiliar não é nulo
                    noAuxiliar = primeiroNo; // o nó auxiliar recebe o nó que está na entrada da fila
                    primeiroNo = primeiroNo.getRefNoDaFila();//se não for nulo, o nó auxiliar recebe o próximo nó
                }else{
                    noAuxiliar.setRefNoDaFila(null); // o nó auxiliar aponta para nulo
                    break; // sai do loop
                }
            }
            return (T)primeiroNo.getObject();
        }
        return null;
    }
    public boolean isEmpty(){
        return refNoDaFilaEntrada == null ? true : false;
    } // Verifica se a fila está vazia

    @Override
    public String toString() {
        String stringRetorno = "";//cria uma string vazia
        noDaFila noAuxiliar = refNoDaFilaEntrada; // cria um nó auxiliar que recebe o nó que está na entrada da fila
        if (refNoDaFilaEntrada != null){ // verifica se o nó que está na entrada da fila não é nulo
            while(true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->"; // adiciona na string o objeto que está no nó auxiliar
                if (noAuxiliar.getRefNoDaFila() != null){ // verifica se o nó auxiliar não é nulo
                    noAuxiliar = noAuxiliar.getRefNoDaFila(); // o nó auxiliar recebe o próximo nó
                }else{
                    stringRetorno += "null"; // se o nó auxiliar for nulo, a string recebe null
                    break; // sai do loop quando o nó auxiliar for nulo
                }
            }
        }else{
            stringRetorno = "null"; // se o nó que está na entrada da fila for nulo, a string recebe null
        }
        return stringRetorno; // retorna a string
    }
}
