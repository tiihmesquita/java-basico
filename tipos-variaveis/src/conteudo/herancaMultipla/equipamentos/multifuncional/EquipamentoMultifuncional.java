package conteudo.herancaMultipla.equipamentos.multifuncional;

import conteudo.herancaMultipla.equipamentos.copiadora.Copiadora;
import conteudo.herancaMultipla.equipamentos.digitalizadora.Digitalizadora;
import conteudo.herancaMultipla.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
    
    public void copiar(){
        System.out.println("Copiando via equipamento multifuncional");
    }
    public void digitalizar(){
        System.out.println("Digitalizando via equipamento multifuncional");
    }
    public void imprimir(){
        System.out.println("Imprimindo via equipamento multifuncional");
    }

}
