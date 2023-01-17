package projeto.estruturaDeDados.listasCirculares;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> calda;
    private int tamanhoLista;


    

    public ListaCircular() {
        this.calda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if(this.tamanhoLista==0){
            this.cabeca = novoNo;
            this.calda = this.cabeca;
            this.cabeca.setNoProximo(calda);
        }
        else{
            novoNo.setNoProximo(this.calda);
            this.cabeca.setNoProximo(novoNo);
            this.calda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index){
        if(index >= this.tamanhoLista){
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista");
        }
        else{
            No<T> noAuxiliar=this.calda;
            if(index == 0){
                this.calda = this.calda.getNoProximo();
                this.cabeca.setNoProximo(this.calda);
            }
            else{
                if(index == 1){
                    this.calda.setNoProximo(this.calda.getNoProximo().getNoProximo() );
                }
                else{
                    for(int i = 0; i< index-1;i++){
                        noAuxiliar = noAuxiliar.getNoProximo();
                    }
                    noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
                }
            }
        }
        this.tamanhoLista--;
    }


    public T get(int index){

        return this.getNo(index).getConteudo();
    }


    private No<T> getNo(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("A lista está vazia");

        }
        if(index == 0){
            return this.calda;
        }

        No<T> noAuxiliar = this.calda;
        for(int i=0;(i<index)&&(noAuxiliar !=null);i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;


    }




    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true:false;
    }


    public int size(){

        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.calda;

        for(int i=0;i<this.size();i++){
            strRetorno += "[No{conteudo="+noAuxiliar.getConteudo()+"}]-->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno+= this.size() != 0 ?"(Retorna ao inicio)":"[]";

        return strRetorno;
    }
    

}
