# FiapRide

## Sobre o projeto

O projeto consiste em 4 arquivos principais:
- SistemaPrincipal.java;
- Passageiro.java;
- SistemaConsole.java;
- Console.java;

Sendo os dois primeiros utilizados para estudo em sala e os dois últimos para praticar os ensinamentos e orientações em sala.

---
**Classe escolhida:** Console

O objeto Console foi escolhido por um gosto pessoal e presente no dia-a-dia tanto meu quanto de outros jogadores de todas as idades, muitas vezes utilizado para lazer, entretenimento para streaming, em torneios competitivos em e-sports, entre outros.

### Atributos
- Fabricante: Empresa responsável pela criação e fabricação do console, como "Microsoft";
- geracao: O nome do console em si, como "Xbox Classic".
- tipoMidia: O modo como o console simula o jogo, Digital ou Físico.
- armazenamentoGB: O quanto de espaço interno o console possui.
- assinaturaAtiva: Assinatura usada para determinados jogos que necessitam ativá-la para jogar.

### Métodos implementados
- adicionarArmazenamento: Acrescenta espaço de armazenamento no console para instalar mais jogos
- baixarJogo: Instala um jogo no console, diminuindo o armazenamento (inicialmente definivo apenas com número)
---
### Funcionamento dos métodos

#### 1. adicionarArmazenamento()

A regra de negócio inicial para este método é validar se o usuário tenta adicionar gigas (espaço) negativos no console, para evitar esta tentativa utilizei um laço **IF**:
```sh
public void adicionarArmazenamento(double gigas){
    if (gigas <= 0){
        System.out.println("xxx--- Não é possível adicionar armazenamento negativo!");
        return;
    }
```
Caso os gigas adicionados forem maior 0, a função segue normalmente:
```sh
    this.armazenamentoGB += gigas;
    System.out.println("vvv--- Armazenamento acrescentado: " + gigas + " GigaBytes. Armazenamento atual: " + this.armazenamentoGB);
}
```

#### 2. baixarJogo()

Este método é utilizado para instalar os jogos, utilizamos números do tipo double para enquadrar jogos de armazenamento inteiros ou "quebrados". Assim como em adicionarArmazenamento(), validamos de os gigas do jogo que queremos instalar é menor ou igual a zero, se for, o processo é interrompido:
 ```sh
public void baixarJogo(double gigas){
    if (gigas <= 0){
    System.out.println("xxx--- Não foi adicionado nenhum jogo");
    return;
```
Porém o armazenamento possui um limite, então existe uma segunda validação onde que se a capacidade por excedida, o sistema do console não deixará você continuar a instalar o jogo:
```sh
    } else if (gigas > this.armazenamentoGB) {
        System.out.println("xxx--- Capacidade de armazenamento excedida, acrescente espaço de armazenamento");
        return;
    }
```
Caso a instalação atenda às validações, a função é usada com sucesso:
```sh
    this.armazenamentoGB -= gigas;
    System.out.println("vvv--- Download de jogo completo. Divirta-se! Armazenamento atual: " + this.armazenamentoGB);
}
```