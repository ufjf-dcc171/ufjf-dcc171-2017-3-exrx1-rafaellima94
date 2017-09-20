package ufjf.dcc;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class ExercicioExtra {
    public static void main(String[] args) {
        Painel painel = new Painel(getListaExemplo());
        painel.setSize(600, 400);
        painel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setLocationRelativeTo(null);
        painel.setVisible(true);
    }
    
    private static List<Dados> getListaExemplo(){
        Dados dado1 = new Dados("123","123","01/01/2001","Descricao 1");
        Dados dado2 = new Dados("234","234","02/02/2002","Descricao 2");
        Dados dado3 = new Dados("345","345","03/03/2003","Descricao 3");
        
        List<Dados> listaExemplo = new ArrayList<>();
        listaExemplo.add(dado1);
        listaExemplo.add(dado2);
        listaExemplo.add(dado3);
        
        return listaExemplo;
    }
}
