package Controle;

import Entidades.*;
import java.util.Vector;
import javax.swing.JOptionPane;

public class ControlePagamento {

    private Vector listaPagamento = new Vector();
    private ControleVendas ctrVendas;
    private ControleCorretor ctrComissionado;
    private Pagamento p;
    private double total;

    public double procuraComissao(int creci) {
        try {
            for (int i = 0; i < ctrComissionado.getVectorComissionado().size(); i++) {
                Comissionado comis = (Comissionado) ctrComissionado.getVectorComissionado().elementAt(i);
                if (comis.getCreci() == creci) {
                    return comis.getPercentual();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return 0;
    }

    public void procuraVenda(Corretor c, int mes) {
        total = 0;
        Venda venda = null;
        for (int i = 0; i < ctrVendas.getVector().size(); i++) {
            venda = (Venda) ctrVendas.getVector().elementAt(i);
            try {
                if (Integer.parseInt(venda.getDataVenda().substring(3, 5)) == mes && venda.getNroCreci() == c.getCreci()) {
                    if (c.getClass().getName() == "Comissionado") {
                        total += venda.getValorReal() * procuraComissao(c.getCreci());
                    } else if (c.getClass().getName() == "Contratado") {
                        total += venda.getValorReal() * (0.01);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        adicionaPagamento(venda.getNroCreci(), total);

    }

    public void adicionaPagamento(int creci, double valor) {
        listaPagamento.add(new Pagamento(creci, valor));
    }
}
