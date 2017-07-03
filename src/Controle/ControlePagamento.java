package Controle;

import Entidades.Comissionado;
import Entidades.Corretor;
import Entidades.Pagamento;
import Entidades.Venda;
import java.util.Vector;

public class ControlePagamento {

    private Vector listaPagamento = new Vector();
    private ControleVendas ctrVendas;
    private Pagamento p;
    private double total = 0;
    private Comissionado comis;

    public Comissionado procuraComissao(int creci) {
        Comissionado c = null;

        return c;
    }

    public void procuraVenda(Corretor c, int mes) {

        if (c.getClass().getName() == "Comissionado") {
            for (int i = 0; i < ctrVendas.getVector().size(); i++) {
                Venda venda = (Venda) ctrVendas.getVector().elementAt(i);
                if (Integer.parseInt(venda.getDataVenda().substring(3, 5)) == mes && venda.getNroCreci() == c.getCreci()) {
                    //   total += venda.getValorReal() * ()
                }
            }
        } else if (c.getClass().getName() == "Contratado") {
            for (int i = 0; i < ctrVendas.getVector().size(); i++) {
                Venda venda = (Venda) ctrVendas.getVector().elementAt(i);
                if (Integer.parseInt(venda.getDataVenda().substring(3, 5)) == mes && venda.getNroCreci() == c.getCreci()) {
                    total += venda.getValorReal() * (0.01);
                }
            }
        }
    }

    public void adicionaPagamento() {
        listaPagamento.add(p);
    }
}
