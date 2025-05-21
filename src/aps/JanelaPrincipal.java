
package aps;

import controller.CSVProcessor;
import controller.FirebaseService;
import java.net.HttpURLConnection;
import java.net.URL;
import model.Especie;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class JanelaPrincipal extends javax.swing.JPanel {

    public JanelaPrincipal() {
        initComponents();
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {},
        new String [] {
            "Fauna/Flora", "Grupo", "Familia", "Especie_(simplificado)",
            "Nome_Comum", "Categoria_Ameaca", "Bioma",
            "Principais_Ameacas", "Estados_Ocorrencia"
        }
    ));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConectar = new javax.swing.JButton();
        btnSincronizarDados = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        lblFaunaFlora = new javax.swing.JLabel();
        cmbFaunaFlora = new javax.swing.JComboBox<>();
        lblGrupo = new javax.swing.JLabel();
        cmbGrupo = new javax.swing.JComboBox<>();
        lblFamilia = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        cmbFamilia = new javax.swing.JComboBox<>();
        lblEspecie = new javax.swing.JLabel();
        lblBioma = new javax.swing.JLabel();
        txtBioma = new javax.swing.JTextField();
        lblCategoriaAmeaca = new javax.swing.JLabel();
        txtCategoriaAmeaca = new javax.swing.JTextField();
        lblPrincipaisAmeacas = new javax.swing.JLabel();
        txtPrincipaisAmeacas = new javax.swing.JTextField();
        lblNomeComum = new javax.swing.JLabel();
        txtNomeComum = new javax.swing.JTextField();
        lblEstadosOcorrencia = new javax.swing.JLabel();
        txtEstadosOcorrencia = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));

        btnConectar.setBackground(new java.awt.Color(204, 204, 255));
        btnConectar.setForeground(new java.awt.Color(0, 0, 0));
        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        btnSincronizarDados.setBackground(new java.awt.Color(204, 204, 255));
        btnSincronizarDados.setForeground(new java.awt.Color(0, 0, 0));
        btnSincronizarDados.setText("Sincronizar Dados");
        btnSincronizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSincronizarDadosActionPerformed(evt);
            }
        });

        btnFechar.setBackground(new java.awt.Color(204, 204, 255));
        btnFechar.setForeground(new java.awt.Color(0, 0, 0));
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        lblFaunaFlora.setForeground(new java.awt.Color(0, 0, 0));
        lblFaunaFlora.setText("Fauna/Flora");

        cmbFaunaFlora.setBackground(new java.awt.Color(255, 255, 255));
        cmbFaunaFlora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um:", "Fauna", "Flora" }));

        lblGrupo.setForeground(new java.awt.Color(0, 0, 0));
        lblGrupo.setText("Grupo");

        cmbGrupo.setBackground(new java.awt.Color(255, 255, 255));
        cmbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um: ", "Angiospermas", "Aves", "Invertebrados Terrestres ", "Peixes Marinhos", "Anfíbios", "Pteridófitas", "Invertebrados Aquáticos", "Peixes Continentais", "Mamíferos", "Répteis", "Briófitas" }));

        lblFamilia.setForeground(new java.awt.Color(0, 0, 0));
        lblFamilia.setText("Familia");

        txtEspecie.setBackground(new java.awt.Color(255, 255, 255));

        cmbFamilia.setBackground(new java.awt.Color(255, 255, 255));
        cmbFamilia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um:", "Salicaceae", "Cracidae", "Malvaceae", "Santalaceae", "Myrtaceae", "Coenagrionidae", "Plantaginaceae", "Hypogastruridae", "Plantaginaceae", "Achiridae", "Orchidaceae", "Asteraceae", "Furnariidae", "Eriocaulaceae", "Nymphalidae", "Orchidaceae", "Baetidae", "Eleutherodactylidae", "Bignoniaceae" }));

        lblEspecie.setForeground(new java.awt.Color(0, 0, 0));
        lblEspecie.setText("Especie ");

        lblBioma.setForeground(new java.awt.Color(0, 0, 0));
        lblBioma.setText("Bioma ");

        txtBioma.setBackground(new java.awt.Color(255, 255, 255));

        lblCategoriaAmeaca.setForeground(new java.awt.Color(0, 0, 0));
        lblCategoriaAmeaca.setText("Categoria de Ameaça ");

        txtCategoriaAmeaca.setBackground(new java.awt.Color(255, 255, 255));

        lblPrincipaisAmeacas.setForeground(new java.awt.Color(0, 0, 0));
        lblPrincipaisAmeacas.setText("Principais Ameaças");

        txtPrincipaisAmeacas.setBackground(new java.awt.Color(255, 255, 255));

        lblNomeComum.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeComum.setText("Nome Comum ");

        txtNomeComum.setBackground(new java.awt.Color(255, 255, 255));

        lblEstadosOcorrencia.setForeground(new java.awt.Color(0, 0, 0));
        lblEstadosOcorrencia.setText("Estados de Ocorrência");

        txtEstadosOcorrencia.setBackground(new java.awt.Color(255, 255, 255));

        btnLimpar.setBackground(new java.awt.Color(204, 204, 255));
        btnLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(204, 204, 255));
        btnPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblTabela.setBackground(new java.awt.Color(255, 255, 255));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fauna/Flora", "Grupo", "Familia", "Especie_(simplificado)", "Nome_Comum ", "Categoria_Ameaca", "Bioma", "Principais_Ameacas", "Estados_Ocorrencia"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSincronizarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFaunaFlora)
                                    .addComponent(cmbFaunaFlora, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCategoriaAmeaca))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblGrupo)
                                        .addGap(149, 149, 149)
                                        .addComponent(lblFamilia))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(lblPrincipaisAmeacas))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCategoriaAmeaca, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrincipaisAmeacas, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNomeComum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                .addComponent(txtEspecie, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblNomeComum)
                            .addComponent(lblEspecie))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBioma)
                            .addComponent(lblEstadosOcorrencia)
                            .addComponent(txtBioma)
                            .addComponent(txtEstadosOcorrencia, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSincronizarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFaunaFlora)
                            .addComponent(lblGrupo)
                            .addComponent(lblFamilia)
                            .addComponent(lblEspecie)
                            .addComponent(lblBioma))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFaunaFlora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoriaAmeaca)
                            .addComponent(lblPrincipaisAmeacas)
                            .addComponent(lblNomeComum)
                            .addComponent(lblEstadosOcorrencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategoriaAmeaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrincipaisAmeacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeComum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstadosOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
         try {
        URL url = new URL("https://aps2025-4d8ab-default-rtdb.firebaseio.com/.json");
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");

        int resposta = conexao.getResponseCode();

        if (resposta == 200) {
            JOptionPane.showMessageDialog(this, "✅ Conexão com o Firebase estabelecida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "❌ Erro ao conectar. Código: " + resposta);
        }

        conexao.disconnect();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "❌ Erro ao conectar ao Firebase:\n" + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnSincronizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSincronizarDadosActionPerformed
        List<Especie> lista = CSVProcessor.carregarEspeciesDoCSV();

    if (lista == null || lista.isEmpty()) {
        JOptionPane.showMessageDialog(this, "❌ Nenhum dado carregado do arquivo CSV.");
        return;
    }

    FirebaseService.enviarParaFirebase(lista); // <- ENVIA PARA O FIREBASE

    JOptionPane.showMessageDialog(this, "✅ Dados enviados ao Firebase com sucesso!");
    }//GEN-LAST:event_btnSincronizarDadosActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?", "Fechar", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // Limpar JTextFields
        txtEspecie.setText("");
        txtNomeComum.setText("");
        txtBioma.setText("");
        txtPrincipaisAmeacas.setText("");
        txtEstadosOcorrencia.setText("");
        txtCategoriaAmeaca.setText("");

        // Resetar ComboBoxes (voltar para o primeiro item)
        cmbFaunaFlora.setSelectedIndex(0);
        cmbGrupo.setSelectedIndex(0);
        cmbFamilia.setSelectedIndex(0);
        

        // Limpar a tabela
        DefaultTableModel modelo = (DefaultTableModel) tblTabela.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
                                        
         String faunaFlora = cmbFaunaFlora.getSelectedItem().toString().trim().toLowerCase();
    String grupo = cmbGrupo.getSelectedItem().toString().trim().toLowerCase();
    String familia = cmbFamilia.getSelectedItem().toString().trim().toLowerCase();
    String especie = txtEspecie.getText().trim().toLowerCase();
    String nomeComum = txtNomeComum.getText().trim().toLowerCase();
    String categoria = txtCategoriaAmeaca.getText().trim().toLowerCase();
    String bioma = txtBioma.getText().trim().toLowerCase();
    String ameacas = txtPrincipaisAmeacas.getText().trim().toLowerCase();
    String estados = txtEstadosOcorrencia.getText().trim().toLowerCase();

    List<Especie> lista = FirebaseService.buscarEspeciesDoFirebase();

    if (lista == null || lista.isEmpty()) {
        JOptionPane.showMessageDialog(this, "⚠️ Nenhum dado encontrado no Firebase.");
        return;
    }

    DefaultTableModel modelo = (DefaultTableModel) tblTabela.getModel();
    modelo.setRowCount(0); // limpa a tabela

    for (Especie e : lista) {
        if ((!faunaFlora.equals("selecione um:") && !e.getFaunaFlora().toLowerCase().contains(faunaFlora)) ||
            (!grupo.equals("selecione um:") && !e.getGrupo().toLowerCase().contains(grupo)) ||
            (!familia.equals("selecione um:") && !e.getFamilia().toLowerCase().contains(familia)) ||
            (!especie.isEmpty() && !e.getEspecieSimplificado().toLowerCase().contains(especie)) ||
            (!nomeComum.isEmpty() && !e.getNomeComum().toLowerCase().contains(nomeComum)) ||
            (!categoria.isEmpty() && !e.getCategoriaAmeaca().toLowerCase().contains(categoria)) ||
            (!bioma.isEmpty() && !e.getBioma().toLowerCase().contains(bioma)) ||
            (!ameacas.isEmpty() && !e.getPrincipaisAmeacas().toLowerCase().contains(ameacas)) ||
            (!estados.isEmpty() && !e.getEstadosOcorrencia().toLowerCase().contains(estados))) {
            continue;
        }

        modelo.addRow(new Object[]{
            e.getFaunaFlora(),
            e.getGrupo(),
            e.getFamilia(),
            e.getEspecieSimplificado(),
            e.getNomeComum(),
            e.getCategoriaAmeaca(),
            e.getBioma(),
            e.getPrincipaisAmeacas(),
            e.getEstadosOcorrencia()
        });
    }

    JOptionPane.showMessageDialog(this, "✅ Dados carregados com sucesso!");
    }//GEN-LAST:event_btnPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSincronizarDados;
    private javax.swing.JComboBox<String> cmbFamilia;
    private javax.swing.JComboBox<String> cmbFaunaFlora;
    private javax.swing.JComboBox<String> cmbGrupo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBioma;
    private javax.swing.JLabel lblCategoriaAmeaca;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblEstadosOcorrencia;
    private javax.swing.JLabel lblFamilia;
    private javax.swing.JLabel lblFaunaFlora;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblNomeComum;
    private javax.swing.JLabel lblPrincipaisAmeacas;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtBioma;
    private javax.swing.JTextField txtCategoriaAmeaca;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtEstadosOcorrencia;
    private javax.swing.JTextField txtNomeComum;
    private javax.swing.JTextField txtPrincipaisAmeacas;
    // End of variables declaration//GEN-END:variables
}
