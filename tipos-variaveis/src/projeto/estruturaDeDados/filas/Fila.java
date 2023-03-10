package projeto.estruturaDeDados.filas;

public class Fila<T>{

    private No<T> refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;

    }
    public T first(){
        if (!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return(T) primeiroNo.getObject();
        }
        return null;
    }
    public T deQueue(){
        if (!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No auxilarNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    auxilarNo = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    auxilarNo.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }



    public boolean isEmpty(){
        return refNoEntradaFila == null ? true:false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila!= null){
            while(true){
                stringRetorno += "[no{objeto="+noAuxiliar.getObject()+"}]--->";
                
                if(noAuxiliar.getRefNo()!= null){
                noAuxiliar = noAuxiliar.getRefNo();
                }
                else{
                    stringRetorno+="null";
                    break;
                }
            }

        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }



}
