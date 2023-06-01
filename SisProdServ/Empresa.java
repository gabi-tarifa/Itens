import java.util.ArrayList;
import java.util.List;
public class Empresa {
    private List<Itens> itens = new ArrayList<>();

    Empresa(){
    }
    public List<Itens> getItens(){
        return itens;
    }
    public void setItens(List<Itens> itens){
        this.itens = itens;
    }
    public void addItem(List<Itens>itens){
        itens.add(itens);
    }
    public void listarItens(){
        for (Itens listaItens : itens) {
            System.out.printf(listaItens + "; ");
        }
    }
}
