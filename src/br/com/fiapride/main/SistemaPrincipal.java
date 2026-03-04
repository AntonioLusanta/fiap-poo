package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Console;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
    	
//        Passageiro passageiro1 = new Passageiro();
//        passageiro1.nome = "Ano Silvo";
//        passageiro1.saldo = 50.0;
//
          Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
          System.out.println("Regarga passageiro 1");
          passageiro1.adicionarSaldo(50.0);
    	
//        // Criando o segundo passageiro (Objeto 2)
          
//        Passageiro passageiro2 = new Passageiro();
//        passageiro2.nome = "Carlos Souza";
//        passageiro2.saldo = 12.50;
          
          Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
          System.out.println("Regarga passageiro 2");
          passageiro2.adicionarSaldo(12.5);
//
//        // Exibindo os dados no Console
//        System.out.println("--- Sistema FiapRide ---");
//        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
//        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
//        
//        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
//        System.out.print("O nome do passageiro1 muda, mas o passageiro2 se mantém o mesmo");
          
          System.out.println("--- Sistema FiapRide ---");
          System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
          System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
          
          System.out.println("Pagando viagem do passageiro 1");
          passageiro1.pagarViagem(20);
          System.out.println("Pagando viagem do passageiro 2");
          passageiro2.pagarViagem(20);

//    	  Console Xbox = new Console();
//    	  Xbox.fabricante = "Microsoft";
//    	  Xbox.geração = "One X";
//    	  Xbox.meioDeRodarJogo = "Digital";
    
    
    
    
    
    
    
    }
}