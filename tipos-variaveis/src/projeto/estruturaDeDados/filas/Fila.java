package projeto.estruturaDeDados.filas;

public class Fila {
    private No refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;

    }
    public No first(){
        if (!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
        }
        return null;
    }
    public No deQueue(){
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
            return primeiroNo;
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
