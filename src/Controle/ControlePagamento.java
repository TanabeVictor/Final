package Controle;

import Entidades.Comissionado;
import Entidades.Corretor;
import Entidades.Pagamento;
import Entidades.Venda;
import java.util.Vector;

public class ControlePagamento {

    private Vector listaPagamento = new Vector();
    private ControleVendas ctrVendas;
    private ControleCorretor ctrComissionado;
    private Pagamento p;
    private double total;

    public int procuraComissao(int creci) {
        int c = 0;
        for (int i = 0; i < ctrComissionado.getVectorComissionado().size(); i++) {
        }
        return c;
    }

    public void procuraVenda(Corretor c, int mes) {
        total = 0;
        for (int i = 0; i < ctrVendas.getVector().size(); i++) {
            Venda venda = (Venda) ctrVendas.getVector().elementAt(i);
            if (Integer.parseInt(venda.getDataVenda().substring(3, 5)) == mes && venda.getNroCreci() == c.getCreci()) {
                if (c.getClass().getName() == "Comissionado") {
                    total += venda.getValorReal() * procuraComissao(c.getCreci()) * (0.01);
                } else if (c.getClass().getName() == "Contratado") {
                    total += venda.getValorReal() * (0.01);
                }
            }
        }
        //adicionaPagamento();

    }

    public void adicionaPagamento(int creci) {
        listaPagamento.add(new Pagamento(creci, creci));
    }
}
