package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Console;

public class SistemaConsole {

    public static void main(String[] args) {

        Console meuConsole = new Console("Microsoft", "Xbox One X", "Digital", 480, true);
//        meuConsole.fabricante = "Microsoft";
//        meuConsole.geracao = "One X";
//        meuConsole.tipoMidia = "Digital";

        Console profConsole = new Console("Nintendo", "Switch", "Digital", 240, false);
//        profConsole.fabricante = "Nintendo";
//        profConsole.geracao = "Switch";
//        profConsole.tipoMidia = "Digital";

        System.out.println("Meu console é da " + meuConsole.fabricante + ", a geração é " + meuConsole.geracao + ". O tipo de jogo que ele roda é " + meuConsole.tipoMidia);
        meuConsole.adicionarArmazenamento(480);
        meuConsole.baixarJogo(300);
        meuConsole.baixarJogo(0.5);
        meuConsole.baixarJogo(500);
        meuConsole.baixarJogo(140);
        meuConsole.baixarJogo(-109);
        meuConsole.baixarJogo(-10);

        System.out.println("O console do Professor é da " + profConsole.fabricante + ", a geração é " + profConsole.geracao + ". O tipo de jogo de ele roda é " + profConsole.tipoMidia);






    }
}