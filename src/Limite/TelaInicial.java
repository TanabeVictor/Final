package Limite;

import Controle.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaInicial extends javax.swing.JFrame{
    private ControleImoveis objACtrImovel = new ControleImoveis();
    private ControleCorretor objACtrCorretor = new ControleCorretor();
    private ControleVendas objACtrVendas = new ControleVendas();
    private ControlePagamento objACtrPagamento = new ControlePagamento();
    private DefaultTableModel model = new DefaultTableModel();
    private DefaultTableModel model2 = new DefaultTableModel();
    private DefaultTableModel model3 = new DefaultTableModel();
    String[] nomesColunas = {"Codigo", "Descrição", "Tipo", "Vendedor", "Data", "Preço"};
    String[] nomesColunas2 = {"Creci", "Nome", "Tipo", "Data de Admissão", "Salário", "Valor do Percentual"};
    String[] nomesColunas3 = {"Nome - Comprador", "Data", "Valor", "Valor Final", "Creci", "Codigo Imovel"};
   
    private String cod;
    private String prec;
    
    public TelaInicial() throws Exception {
        objACtrImovel.recuperImovel();
        initComponents();
        
        model.setColumnIdentifiers(nomesColunas);
        model2.setColumnIdentifiers(nomesColunas2);
        model3.setColumnIdentifiers(nomesColunas3);
       
        Table_Vendas_Ver.setModel(model3);
        Table_Imovel_Ver.setModel(model);
        Table_Corretor_Ver.setModel(model2);
        Table_Vendas.setModel(model);
        
        String info = objACtrImovel.getListaImovel();
        String[] split = info.split("\n");
        for (int i=0 ; i<30; i = i+6){
        model.addRow(new Object []{split[i],split[i+1],split[i+2],split[i+3],split[i+4],split[i+5]});}
        
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Field_Cod_Imovel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Field_Descricao_Imovel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Field_Data_Imovel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Field_Preco_Imovel = new javax.swing.JTextField();
        Button_Cad_Imovel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ComboBox_Tipo_Imovel = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Field_Prop_Imovel = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Field_Creci_Corretor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Field_Nome_Corretor = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Field_Data_Corretor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Field_Salario_Corretor = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Slider_Percentual_Corretor = new javax.swing.JSlider();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Button_Cad_Corretor = new javax.swing.JButton();
        ComboBox_Tipo_Corretor = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        nada = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Vendas = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        Field_Comprador_Vendas = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Field_Valor_Vendas = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Field_Data_Vendas = new javax.swing.JTextField();
        Button_Venda = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        Field_CodVenda_Vendas = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        Creci_Field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Preco_Field = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        Creci_FieldII = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        Valor_FieldII = new javax.swing.JTextField();
        Cad = new javax.swing.JButton();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Imovel_Ver = new javax.swing.JTable();
        Button_Editar_Ver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_Corretor_Ver = new javax.swing.JTable();
        Button_Editar_VerII = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table_Vendas_Ver = new javax.swing.JTable();
        Button_Editar_VerIII = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        Button_Gerar_VerIV = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        Panel_Relatorios = new javax.swing.JPanel();
        ComboBox_Relatorios = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        Button_Enviar_Relatorios = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        Relatorio_Area = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        Mes_Field = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Ano_Field = new javax.swing.JTextField();

        jLabel17.setText("jLabel17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Imóvel"));

        jLabel4.setText("Código :");

        Field_Cod_Imovel.setToolTipText("");

        jLabel5.setText(" Descrição :");

        jLabel6.setText("Data :");

        jLabel7.setText("Preço :");

        Button_Cad_Imovel.setText("Cadastrar");
        Button_Cad_Imovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Cad_ImovelActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo :");

        ComboBox_Tipo_Imovel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Apartamento", "Sala Comercial", "Lote", "Chácara", "Sítio", "Fazenda" }));
        ComboBox_Tipo_Imovel.setToolTipText("");

        jLabel3.setText("Proprietário :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Field_Descricao_Imovel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Field_Cod_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox_Tipo_Imovel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(151, 151, 151))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_Cad_Imovel)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(Field_Data_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Field_Preco_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Field_Prop_Imovel))))
                .addGap(153, 153, 153))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Field_Cod_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ComboBox_Tipo_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Field_Descricao_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Field_Data_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Field_Preco_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Field_Prop_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Button_Cad_Imovel)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        Button_Cad_Imovel.getAccessibleContext().setAccessibleName("buttonCadastro");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 156, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Cadastro de Imóvel", jPanel7);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Corretor"));

        jLabel9.setText("Creci :");

        jLabel10.setText("Nome :");

        jLabel11.setText("Data de Admissão :");

        jLabel12.setText("Salário :");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Field_Data_Corretor)
                    .addComponent(Field_Salario_Corretor, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                .addContainerGap(1111, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Field_Data_Corretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Field_Salario_Corretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Contratado", jPanel13);

        jLabel13.setText("Valor do Percentual :");

        Slider_Percentual_Corretor.setMaximum(3);
        Slider_Percentual_Corretor.setMinimum(1);
        Slider_Percentual_Corretor.setPaintLabels(true);
        Slider_Percentual_Corretor.setPaintTicks(true);
        Slider_Percentual_Corretor.setSnapToTicks(true);
        Slider_Percentual_Corretor.setToolTipText("");
        Slider_Percentual_Corretor.setValue(1);

        jLabel14.setText("1%");

        jLabel15.setText("3%");

        jLabel16.setText("2%");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel16)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel15))
                    .addComponent(Slider_Percentual_Corretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1114, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Slider_Percentual_Corretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Comissionado", jPanel14);

        jTabbedPane1.addTab("Tipo", jTabbedPane3);

        Button_Cad_Corretor.setText("Cadastrar");
        Button_Cad_Corretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Cad_CorretorActionPerformed(evt);
            }
        });

        ComboBox_Tipo_Corretor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratado", "Comissionado" }));

        jLabel22.setText("Tipo :");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Field_Creci_Corretor)
                                    .addComponent(Field_Nome_Corretor, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBox_Tipo_Corretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 188, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Cad_Corretor)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Field_Creci_Corretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_Tipo_Corretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Field_Nome_Corretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Cad_Corretor))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Cadastro de Corretor", jPanel9);

        nada.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Vendas"));

        Table_Vendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Table_Vendas);

        jLabel18.setText("Nome do Comprador :");

        jLabel19.setText("Valor Real da Venda :");

        Field_Valor_Vendas.setToolTipText("");

        jLabel20.setText("Data de Venda:");

        Button_Venda.setText("Vender");
        Button_Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_VendaActionPerformed(evt);
            }
        });

        jLabel21.setText("Código do Imóvel: ");

        jLabel24.setText("Creci do Vendedor:");

        jLabel1.setText("Preço Anunciado:");

        javax.swing.GroupLayout nadaLayout = new javax.swing.GroupLayout(nada);
        nada.setLayout(nadaLayout);
        nadaLayout.setHorizontalGroup(
            nadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nadaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(nadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nadaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(nadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nadaLayout.createSequentialGroup()
                                .addGroup(nadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Field_Comprador_Vendas)
                                    .addComponent(Field_Data_Vendas)
                                    .addComponent(Field_Valor_Vendas)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(nadaLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(834, 834, 834))
                            .addGroup(nadaLayout.createSequentialGroup()
                                .addGroup(nadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(Field_CodVenda_Vendas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(nadaLayout.createSequentialGroup()
                                .addGroup(nadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(nadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Creci_Field)
                                        .addComponent(Preco_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(nadaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Button_Venda)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        nadaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Creci_Field, Field_CodVenda_Vendas, Preco_Field});

        nadaLayout.setVerticalGroup(
            nadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nadaLayout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field_Comprador_Vendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field_Valor_Vendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field_Data_Vendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field_CodVenda_Vendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Creci_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preco_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Venda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Cadastro de Vendas", jPanel11);

        jLabel27.setText("Creci do Vendedor:");

        Creci_FieldII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Creci_FieldIIActionPerformed(evt);
            }
        });

        jLabel28.setText("Valor:");

        Cad.setText("Cadastrar");
        Cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cad)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Creci_FieldII)
                            .addComponent(Valor_FieldII, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(Creci_FieldII, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(Valor_FieldII, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Cad)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Cadastro de Pagamento", jPanel5);

        jTabbedPane6.addTab("Cadastrar", jTabbedPane7);
        jTabbedPane7.getAccessibleContext().setAccessibleName("tab1");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualizar Imóvel"));

        Table_Imovel_Ver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_Imovel_Ver.setToolTipText("");
        Table_Imovel_Ver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table_Imovel_Ver.setOpaque(false);
        jScrollPane1.setViewportView(Table_Imovel_Ver);

        Button_Editar_Ver.setText("Editar");
        Button_Editar_Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Editar_VerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_Editar_Ver, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Button_Editar_Ver)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        jTabbedPane8.addTab("Visualizar Imóveis", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualizar Corretor"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Table_Corretor_Ver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(Table_Corretor_Ver);

        Button_Editar_VerII.setText("Editar");
        Button_Editar_VerII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Editar_VerIIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Editar_VerII)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Editar_VerII))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.getAccessibleContext().setAccessibleName("");

        jTabbedPane8.addTab("Visualizar Corretores", jPanel3);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualizar Vendas"));

        Table_Vendas_Ver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(Table_Vendas_Ver);

        Button_Editar_VerIII.setText("Editar");
        Button_Editar_VerIII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Editar_VerIIIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Editar_VerIII)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(Button_Editar_VerIII)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane8.addTab("Visualizar Vendas", jPanel15);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualizar Pagamentos"));

        Button_Gerar_VerIV.setText("Visualizar I");
        Button_Gerar_VerIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Gerar_VerIVActionPerformed(evt);
            }
        });

        jButton1.setText("Visualizar II");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(Button_Gerar_VerIV, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Button_Gerar_VerIV)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane8.addTab("", jPanel17);

        jTabbedPane6.addTab("Visualizar", jTabbedPane8);
        jTabbedPane8.getAccessibleContext().setAccessibleName("Visualizar");

        Panel_Relatorios.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleção de Relatórios"));

        ComboBox_Relatorios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faturamento Total", "Lucro da Imobiliária", "Relação Encalhados", "Faturamento Corretor", "Valor Pago", "Corretor do Mês" }));

        jLabel23.setText("Selecione o Relatório Desejado:");

        Button_Enviar_Relatorios.setText("Enviar");
        Button_Enviar_Relatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Enviar_RelatoriosActionPerformed(evt);
            }
        });

        Relatorio_Area.setColumns(20);
        Relatorio_Area.setRows(5);
        jScrollPane6.setViewportView(Relatorio_Area);

        jLabel25.setText("Mês");

        jLabel26.setText("Ano");

        javax.swing.GroupLayout Panel_RelatoriosLayout = new javax.swing.GroupLayout(Panel_Relatorios);
        Panel_Relatorios.setLayout(Panel_RelatoriosLayout);
        Panel_RelatoriosLayout.setHorizontalGroup(
            Panel_RelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RelatoriosLayout.createSequentialGroup()
                .addGroup(Panel_RelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_RelatoriosLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox_Relatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mes_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ano_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_Enviar_Relatorios))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        Panel_RelatoriosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Ano_Field, Mes_Field});

        Panel_RelatoriosLayout.setVerticalGroup(
            Panel_RelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_RelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(ComboBox_Relatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Enviar_Relatorios)
                    .addComponent(jLabel25)
                    .addComponent(Mes_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(Ano_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(Panel_Relatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Relatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Relatórios", jPanel19);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 683, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jTabbedPane6.getAccessibleContext().setAccessibleName("tab2");
        jTabbedPane6.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
            
    private void Button_Cad_ImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Cad_ImovelActionPerformed
        int codigo=0;
        try {
            cod = Field_Cod_Imovel.getText();
            codigo = Integer.parseInt(cod);
            String tipo = (String) ComboBox_Tipo_Imovel.getSelectedItem();
            String descricao = Field_Descricao_Imovel.getText();
            String nomeVend = Field_Prop_Imovel.getText();
            String data = Field_Data_Imovel.getText();
            prec = Field_Preco_Imovel.getText();
            double preco = Double.parseDouble(prec);
            objACtrImovel.setImovel(codigo, tipo, descricao, nomeVend, data, preco);
            JOptionPane.showMessageDialog(null, "Imóvel Cadastrado!");}
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Erro na Inserção Imóvel");}
            
            Field_Cod_Imovel.setText("");
            Field_Descricao_Imovel.setText("");
            Field_Prop_Imovel.setText("");
            Field_Data_Imovel.setText("");
            Field_Preco_Imovel.setText("");
            String info = objACtrImovel.getImovel(codigo);
            String[] split = info.split("\n");
            
            model.addRow(split);  
    }//GEN-LAST:event_Button_Cad_ImovelActionPerformed

    private void Button_VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_VendaActionPerformed
            String nome = Field_Comprador_Vendas.getText();
            String valor = Field_Valor_Vendas.getText();
            double value = Double.parseDouble(valor);
            String data = Field_Data_Vendas.getText();
            cod = Field_CodVenda_Vendas.getText();
            int codigo = Integer.parseInt(cod);
            String prec = Preco_Field.getText();
            double preco = Double.parseDouble(prec);
            String creci = Creci_Field.getText();
            int crec = Integer.parseInt(creci);
            
            objACtrImovel.removeImovel(codigo);
            
            objACtrVendas.setVenda(nome, data, value, preco, crec, codigo);
            JOptionPane.showMessageDialog(null,"Imóvel Vendido!");
            Field_Comprador_Vendas.setText("");
            Field_Valor_Vendas.setText("");
            Field_Data_Vendas.setText("");
            Field_CodVenda_Vendas.setText("");
            Preco_Field.setText("");
            Creci_Field.setText("");
            
            String info = objACtrVendas.getListaVendidos();
            String[] split = info.split("\n");
            model3.addRow(split);
    }//GEN-LAST:event_Button_VendaActionPerformed

    private void Button_Cad_CorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Cad_CorretorActionPerformed
        String crec = Field_Creci_Corretor.getText();
        int creci = Integer.parseInt(crec);
        String nome = Field_Nome_Corretor.getText();
        String data = Field_Data_Corretor.getText();
        String sal = Field_Salario_Corretor.getText();
        double salario = Double.parseDouble(sal);
        int percentual = Slider_Percentual_Corretor.getValue();
        String tipo = (String) ComboBox_Tipo_Corretor.getSelectedItem();
        
        if(tipo.equals("Contratado")){
                objACtrCorretor.setCorretorContratado(salario, data, creci, nome);
        String info = objACtrCorretor.getContratado(creci);
        String[] split = info.split("\n");
        model2.addRow(split);}
        
        else if (tipo.equals("Comissionado")){
                objACtrCorretor.setCorretorComissionado(percentual, creci, nome);
            
        String info = objACtrCorretor.getComissionado(creci);
        String[] split = info.split("\n");
        model2.addRow(split);}
        
        JOptionPane.showMessageDialog(null, "Corretor Cadastrado!");
        Field_Creci_Corretor.setText("");
        Field_Nome_Corretor.setText("");
        Field_Data_Corretor.setText("");
        Field_Salario_Corretor.setText("");
        Slider_Percentual_Corretor.setValue(0);
    }//GEN-LAST:event_Button_Cad_CorretorActionPerformed

    private void Button_Enviar_RelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Enviar_RelatoriosActionPerformed
        String opcao = (String) ComboBox_Relatorios.getSelectedItem();
        String m = Mes_Field.getText();
        int mes = Integer.parseInt(m);
        String a = Ano_Field.getText();
        int ano = Integer.parseInt(a);
        Relatorio_Area.setText("");
        if(opcao.equals("Faturamento Total")){
        Relatorio_Area.setText("Faturamento da Imobiliária: "+objACtrVendas.getFaturamentoImobiliaria(mes, ano));}
        else if(opcao.equals("Lucro da Imobiliária")){Relatorio_Area.setText("Lucro Total da Imobiliária: "+objACtrVendas.getLucroImobiliaria(objACtrCorretor.retornaComissionado(), objACtrCorretor.retornaContratado(), mes, ano));}
        else if(opcao.equals("Relação Encalhados")){Relatorio_Area.setText(objACtrImovel.getImoveisEncalhados(mes, ano));}
        else if(opcao.equals("Corretor do Mês")){Relatorio_Area.setText(objACtrCorretor.getMelhorCorretor(objACtrVendas.retornaVenda(), mes, ano));}
        else if(opcao.equals("Lucro do corretor")){Relatorio_Area.setText(objACtrCorretor.getLucroVendedores(objACtrVendas.retornaVenda(), mes, ano));}
        else if(opcao.equals("Faturamento dos corretores")){Relatorio_Area.setText(objACtrCorretor.getFaturamentoVendedores(objACtrVendas.retornaVenda(), mes, ano));}
    }//GEN-LAST:event_Button_Enviar_RelatoriosActionPerformed

    private void Creci_FieldIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Creci_FieldIIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Creci_FieldIIActionPerformed

    private void CadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadActionPerformed
       String creci = Creci_FieldII.getText();
       int crec = Integer.parseInt(creci);
       String valor = Valor_FieldII.getText();
       
       double value = Double.parseDouble(valor);
       objACtrPagamento.adicionaPagamento(crec, value);
       Creci_FieldII.setText("");
       Valor_FieldII.setText("");
    }//GEN-LAST:event_CadActionPerformed

    private void Button_Gerar_VerIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Gerar_VerIVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Gerar_VerIVActionPerformed

    private void Button_Editar_VerIIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Editar_VerIIIActionPerformed
        Table_Vendas_Ver.getEditingRow();
    }//GEN-LAST:event_Button_Editar_VerIIIActionPerformed

    private void Button_Editar_VerIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Editar_VerIIActionPerformed
        Table_Corretor_Ver.getEditingRow();
    }//GEN-LAST:event_Button_Editar_VerIIActionPerformed

    private void Button_Editar_VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Editar_VerActionPerformed
        Table_Imovel_Ver.getEditingRow();
    }//GEN-LAST:event_Button_Editar_VerActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaInicial().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ano_Field;
    private javax.swing.JButton Button_Cad_Corretor;
    private javax.swing.JButton Button_Cad_Imovel;
    private javax.swing.JButton Button_Editar_Ver;
    private javax.swing.JButton Button_Editar_VerII;
    private javax.swing.JButton Button_Editar_VerIII;
    private javax.swing.JButton Button_Enviar_Relatorios;
    private javax.swing.JButton Button_Gerar_VerIV;
    private javax.swing.JButton Button_Venda;
    private javax.swing.JButton Cad;
    private javax.swing.JComboBox<String> ComboBox_Relatorios;
    private javax.swing.JComboBox<String> ComboBox_Tipo_Corretor;
    private javax.swing.JComboBox<String> ComboBox_Tipo_Imovel;
    private javax.swing.JTextField Creci_Field;
    private javax.swing.JTextField Creci_FieldII;
    private javax.swing.JTextField Field_CodVenda_Vendas;
    private javax.swing.JTextField Field_Cod_Imovel;
    private javax.swing.JTextField Field_Comprador_Vendas;
    private javax.swing.JTextField Field_Creci_Corretor;
    private javax.swing.JTextField Field_Data_Corretor;
    private javax.swing.JTextField Field_Data_Imovel;
    private javax.swing.JTextField Field_Data_Vendas;
    private javax.swing.JTextField Field_Descricao_Imovel;
    private javax.swing.JTextField Field_Nome_Corretor;
    private javax.swing.JTextField Field_Preco_Imovel;
    private javax.swing.JTextField Field_Prop_Imovel;
    private javax.swing.JTextField Field_Salario_Corretor;
    private javax.swing.JTextField Field_Valor_Vendas;
    private javax.swing.JTextField Mes_Field;
    private javax.swing.JPanel Panel_Relatorios;
    private javax.swing.JTextField Preco_Field;
    private javax.swing.JTextArea Relatorio_Area;
    private javax.swing.JSlider Slider_Percentual_Corretor;
    private javax.swing.JTable Table_Corretor_Ver;
    private javax.swing.JTable Table_Imovel_Ver;
    private javax.swing.JTable Table_Vendas;
    private javax.swing.JTable Table_Vendas_Ver;
    private javax.swing.JTextField Valor_FieldII;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JPanel nada;
    // End of variables declaration//GEN-END:variables
    
}
