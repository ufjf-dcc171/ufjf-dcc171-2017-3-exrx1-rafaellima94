package ufjf.dcc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Painel extends JFrame{
    private final JList<Dados> lstDados;
    private final JLabel lblLat = new JLabel("Lat");
    private final JTextField txtLat = new JTextField(10);
    private final JLabel lblLong = new JLabel("Long");
    private final JTextField txtLong = new JTextField(10);
    private final JLabel lblData = new JLabel("Data");
    private final JTextArea txtData = new JTextArea(5,10);
    private final JLabel lblDesc = new JLabel("Descrição");
    private final JTextField txtDesc = new JTextField(10);
    private final JButton btnAdd = new JButton("Adicionar");
    private final JButton btnSave = new JButton("Salvar");
    private final JButton btnRemove = new JButton("Remover");
 
    public Painel(){
        super("Painel");
        lstDados = 
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
        
        JPanel painel2 = new JPanel(new GridLayout(2,2));
        painel2.add(btnAdd);
        painel2.add(btnSave);
        painel2.add(btnRemove);
        add(painel2, BorderLayout.SOUTH);
        
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        });
        
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
