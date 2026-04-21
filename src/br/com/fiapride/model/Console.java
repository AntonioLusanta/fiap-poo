package br.com.fiapride.model;

public class Console {

    public String fabricante;
    public String geracao;
    public String tipoMidia;
    public double armazenamentoGB;
    public boolean assinaturaAtiva;

    public Console(String fabricante, String geracao, String tipoMidia, double armazenamentoGB, boolean assinaturaAtiva){
        this.fabricante = fabricante;
        this.geracao = geracao;
        this.tipoMidia = tipoMidia;
        this.armazenamentoGB = armazenamentoGB;
        this.assinaturaAtiva = assinaturaAtiva;
    }

    public void adicionarArmazenamento(double gigas){

        if (gigas <= 0){
            System.out.println("xxx--- Não é possível adicionar armazenamento negativo!");
            return;
        }
        this.armazenamentoGB += gigas;
        System.out.println("vvv--- Armazenamento acrescentado: " + gigas + " GigaBytes. Armazenamento atual: " + this.armazenamentoGB);
    }

    public void baixarJogo(double gigas){
        if (gigas <= 0){
            System.out.println("xxx--- Não foi adicionado nenhum jogo");
            return;
        } else if (gigas > this.armazenamentoGB) {
            System.out.println("xxx--- Capacidade de armazenamento excedida, acrescente espaço de armazenamento");
            return;
        }
        this.armazenamentoGB -= gigas;
        System.out.println("vvv--- Download de jogo completo. Divirta-se! Armazenamento atual: " + this.armazenamentoGB);
    }
}
