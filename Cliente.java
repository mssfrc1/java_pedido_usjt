import java.util.Scanner;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;

    public Cliente(String nome, String cpf, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    //Getters e Setters, usados para definir e receber os atributos da classe
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //atualiza o atributo endereco com base no parâmetro
    public void atualizarEndereco(String endereco) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja atualizar o seu endereco? (S/N): ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.print("Digite o novo endereço: " + "\n");
            String novoEndereco = scanner.nextLine();
            this.endereco = novoEndereco;
            System.out.println("Endereço atualizado para: " + this.endereco + "\n");
            System.out.print("-----------------------------------------" + "\n");
        } else {
            System.out.println("O endereço permanece o mesmo: " + this.endereco + "\n");
            System.out.print("-----------------------------------------" + "\n");
        }

    }

    //solicita os itens do pedido e retorna eles junto com os dados do cliente
    public void fazerPedido(Cliente cliente) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do lanche: ");
        String lanche = scanner.nextLine();

        System.out.print("Digite o nome da bebida: ");
        String bebida = scanner.nextLine();

        System.out.print("Digite o nome da sobremesa: ");
        String sobremesa = scanner.nextLine();

        System.out.print("-----------------------------------------" + "\n");
        System.out.println("Detalhes do Pedido:" + "\n");
        System.out.println("Nome Cliente: " + this.nome);
        System.out.println("CPF Cliente: " + this.cpf);
        System.out.println("Telefone Cliente: " + this.telefone);
        System.out.println("Endereco Cliente: " + this.endereco + "\n");
        System.out.print("-----------------------------------------" + "\n");

        System.out.println("Lanche pedido: " + lanche);
        System.out.println("Bebida: " + bebida);
        System.out.println("Sobremesa: " + sobremesa);

    }
}