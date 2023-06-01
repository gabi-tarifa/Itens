public abstract class Itens {
    private static long idBase = 0L;
    private long id;
    private String nome;
    private double preco;

    Itens (long idBase, long id, String nome, double preco) {
        Itens.idBase = idBase;
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public static long getIdBase(){
        return idBase;
    }
    public long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setIdBase(long idBase){
        Itens.idBase = idBase;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}
