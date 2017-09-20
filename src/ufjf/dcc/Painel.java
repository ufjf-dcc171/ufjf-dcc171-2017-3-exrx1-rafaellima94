package ufjf.dcc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Painel extends JFrame{
    private final List<Dados> dados;
    private final JList<Dados> lstDados = new JList<>(new DefaultListModel<>());
    private final JLabel lblLat = new JLabel("Lat");
    private final JTextField txtLat = new JTextField(10);
    private final JLabel lblLong = new JLabel("Long");
    private final JTextField txtLong = new JTextField(10);
    private final JLabel lblData = new JLabel("Data");
    private final JTextField txtData = new JTextField(10);
    private final JLabel lblDesc = new JLabel("Descrição");
    private final JTextArea txtDesc = new JTextArea(5,10);
    private final JButton btnAdd = new JButton("Adicionar");
    private final JButton btnSave = new JButton("Salvar");
    private final JButton btnRemove = new JButton("Remover");
 
    public Painel(List<Dados> listaExemplo){
        super("Painel");
        this.dados = listaExemplo;
        lstDados.setModel(new DadosListModel(dados));
        add(new JScrollPane(lstDados), BorderLayout.WEST);
        
        JPanel painel1 = new JPanel(new GridLayout(4,2));
        painel1.add(lblLat);
        painel1.add(txtLat);
        painel1.add(lblLong);
        painel1.add(txtLong);
        painel1.add(lblData);
        painel1.add(txtData);
        painel1.add(lblDesc);
        painel1.add(txtDesc);
        add(painel1, BorderLayout.CENTER);
        
        JPanel painelAcao = new JPanel(new GridLayout(1,3));
        painelAcao.add(btnAdd);
        painelAcao.add(btnSave);
        painelAcao.add(btnRemove);
        add(painelAcao, BorderLayout.SOUTH);
        
        lstDados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        lstDados.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Dados dado = lstDados.getSelectedValue();
                if(dado != null){
                    txtLat.setText(dado.getLatitude());
                    txtLong.setText(dado.getLongitude());
                    txtData.setText(dado.getData());
                    txtDesc.setText(dado.getDescricao());
                }
            }
        });
        
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtLat.getText().isEmpty() && !txtLong.getText().isEmpty() && !txtData.getText().isEmpty() && !txtDesc.getText().isEmpty()){
                    try {
                        float isFloat1 = Float.parseFloat(txtLat.getText());
                        float isFloat2 = Float.parseFloat(txtLong.getText());
                    } catch (NumberFormatException exception) {
                        JOptionPane.showConfirmDialog(null, "Valor de latitude ou longitude invalido!", "Erro", JOptionPane.CANCEL_OPTION);
                    }
                    Dados dado = new Dados();
                    dados.remove(lstDados.getSelectedValue());
                    dado.setLatitude(txtLat.getText());
                    dado.setLongitude(txtLong.getText());
                    dado.setData(txtData.getText());
                    dado.setDescricao(txtDesc.getText());
                    dados.add(dado);
                    lstDados.clearSelection();
                    lstDados.updateUI();
                }
            }
        });
        
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtLat.getText().isEmpty() && !txtLong.getText().isEmpty() && !txtData.getText().isEmpty() && !txtDesc.getText().isEmpty()){
                    try {
                        float isFloat1 = Float.parseFloat(txtLat.getText());
                        float isFloat2 = Float.parseFloat(txtLong.getText());
                    } catch (NumberFormatException exception) {
                        JOptionPane.showConfirmDialog(null, "Valor de latitude ou longitude invalido!", "Erro", JOptionPane.CANCEL_OPTION);
                    }
                    Dados dado = new Dados();
                    dado.setLatitude(txtLat.getText());
                    dado.setLongitude(txtLong.getText());
                    dado.setData(txtData.getText());
                    dado.setDescricao(txtDesc.getText());
                    dados.add(dado);
                    lstDados.clearSelection();
                    lstDados.updateUI();
                }
            }
        });
        
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!lstDados.isSelectionEmpty()){
                    dados.remove(lstDados.getSelectedValue());
                    lstDados.clearSelection();
                    lstDados.updateUI();
                }
            }
        });
    }
}
