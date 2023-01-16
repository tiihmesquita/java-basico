package projeto.estruturaDeDados.filas;

public class No<T>{
    
    private T object;
    private No<T> refNo;

    public No(T object){
        this.object = object;
        this.refNo = null;
    }
    public No(){
        
    }
    @Override
    public String toString() {
        return "No [object=" + object + "]";
    }
    public Object getObject() {
        return object;
    }
    public void setObject(T object) {
        this.object = object;
    }
    public No getRefNo() {
        return refNo;
    }
    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    


}
