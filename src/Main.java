import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int opcao = 0;
        ArrayList<Produtos> produto =new ArrayList<>();

        produto.add(new Produtos("Xiaomi Redmi Note 12s", 1399.10, 15));
        produto.add(new Produtos("Xiaomi Redmi Note 13 Pro", 1699.10, 12));
        produto.add(new Produtos("Xiaomi Redmi Note 14s", 1899.10, 19));


          while(opcao != 7 ){

              System.out.println("\n ========= CELULARES =========");
              System.out.println("1. Ver produtos no estoque: ");
              System.out.println("2. Vender produto");
              System.out.println("3. Repor estoque");
              System.out.println("4. Adicionar produto novo");
              System.out.println("5. Ver valor do estoque");
              System.out.println("6. Procurar produto no estoque");
              System.out.println("7. Sair");

            opcao = scanner.nextInt();
              scanner.nextLine();

              if(opcao == 1){
                for(int i  = 0; i < produto.size(); i++){
                    System.out.println("ID: " + i);

                    produto.get(i).Mostrar();
                }
              }else if(opcao == 2){
                  System.out.println("Digite a ID do produto: ");
                  int ID = scanner.nextInt();
                    scanner.nextLine();
                if(ID < 0 || ID >= produto.size()){
                    System.out.println("ID inválida!");
                    continue;

                }
                  System.out.println("Quantos deseja vender?");
                int qtd = scanner.nextInt();
                produto.get(ID).vender((qtd));

              }else if(opcao == 3){
                  System.out.println("Digite a ID do produto: ");
                  int ID = scanner.nextInt();

                    if(ID < 0 || ID >= produto.size()){
                        System.out.println("ID inválida!");
                        continue;



                    }
                  System.out.println("Digite a quantidade para repor: ");
                    int QTD =scanner.nextInt();
                    scanner.nextLine();

                    produto.get(ID).repor(QTD);


              }else if(opcao == 4){
                  System.out.println("Digite o nome do produto: ");
                  String nome = scanner.nextLine();
                  System.out.println("Digite o preço: ");
                  double preco = scanner.nextDouble();
                  System.out.println("Digite a quantidade: ");
                  int QTD = scanner.nextInt();
                  scanner.nextLine();
                  produto.add(new Produtos(nome, preco, QTD));
              }else if(opcao == 5){
                double totalEstoque = 0;

                for(int i = 0; i < produto.size();i++){
                    Produtos p = produto.get(i);


                    double valorProduto = p.getPreco() * p.getQtd();

                totalEstoque += p.getPreco() * p.getQtd();

                    System.out.println(p.getNome() + "; " + " " + "R$ " + valorProduto );

                }
                  System.out.println(totalEstoque);
              }else if(opcao == 6){

                  System.out.println("Digite o nome do produto desejado: ");
                    String nomeBusca = scanner.nextLine();
                    boolean encontrado = false;
                    for(int i = 0; i< produto.size(); i++){
                    Produtos p = produto.get(i);

                    if(p.getNome().toLowerCase().contains(nomeBusca.toLowerCase().trim())){
                        System.out.println("Produto encontrado: ");
                        p.Mostrar();
                        encontrado = true;


                    }
                    if(!encontrado){
                        System.out.println("Nenhum produto encontrado!");
                    }

                    }
              }
          }

        }
    }
