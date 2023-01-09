package conteudo.herancaMultipla.estabelecimento;

import conteudo.herancaMultipla.equipamentos.impressora.Deskjet;
import conteudo.herancaMultipla.equipamentos.impressora.Impressora;
import conteudo.herancaMultipla.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultifuncional();
        impressora.imprimir();
    }
}
