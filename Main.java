public class Main {
    public static void main(String[] args) {
        
        //Objeto Cliente

        Cliente cliente = new Cliente("Moises Rafael", "1234567890", "(11) 99999-9999", "Rua minha casa");

        
        //Exibindo os dados passados no objeto
        System.out.print("-----------------------------------------" + "\n");
        System.out.println("Nome Cliente: " + cliente.getNome());
        System.out.println("CPF Cliente: " + cliente.getCpf());
        System.out.println("Telefone Cliente: " + cliente.getTelefone());
        System.out.println("Endereco Cliente: " + cliente.getEndereco() + "\n");
        
        //Funcao de atualizar endereco
        cliente.atualizarEndereco("Rua 145");
        
        cliente.fazerPedido(cliente);

    }
}