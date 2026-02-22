import com.sun.security.jgss.GSSUtil;

public class Produtos {
    private String nome;
    private double preco;
    private int qtd;


    public Produtos(String a, double b, int c){

        this.nome = a;
        this.preco = b;
        this.qtd = c;


    }

public void Mostrar(){
    System.out.println("Nome do produto: " + nome);
    System.out.println("Preço: " + preco);
    System.out.println("Quantidade: " + qtd);
}


public void vender(int quantidade){
    if(quantidade <= qtd) {
    qtd -= quantidade;
        System.out.println("Venda realizada!");
        System.out.println("Restam:  " + qtd + " no estoque!");

}else{
        System.out.println("Sem estoque no momento!");
    }
}

public void repor(int quantidade){
qtd += quantidade;
    System.out.println("Estoque atualizado!");
}

public String getNome(){
        return nome;
}
public double getPreco(){
        return preco;
}
public int getQtd(){
        return qtd;
}
}
