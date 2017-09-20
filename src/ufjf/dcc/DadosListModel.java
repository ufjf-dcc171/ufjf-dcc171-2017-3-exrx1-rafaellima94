package ufjf.dcc;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class DadosListModel implements ListModel<Dados> {

    private final List<Dados> dados;
    private final List<ListDataListener> dataListeners;

    public DadosListModel(List<Dados> dados) {
        this.dados = dados;
        this.dataListeners =  new ArrayList<>();
    }

    @Override
    public int getSize() {
        return dados.size();
    }

    @Override
    public Dados getElementAt(int index) {
        return dados.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        this.dataListeners.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        this.dataListeners.remove(l);
    }
}