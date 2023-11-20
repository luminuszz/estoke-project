package domain;

import core.SystemUi;

public class Estoque {

    private final Peca[] estoque;
    private final SystemUi systemUi;

    public Estoque( SystemUi systemUi) {
        int maxEstoque = 5;
        this.systemUi = systemUi;
        this.estoque = new Peca[maxEstoque];
    }



   public  void addEstoque(Peca produto, int position) {

        if(this.estoque[position] != null) {
            this.systemUi.displayMessage("Já existe um produto na posição selecioanda");

            return;
        }

        if(position > 4) {
            this.systemUi.displayMessage("Apenas 4 produtos no estoque");
            return;
        }

       this.estoque[position] = produto;

   }

    private void mostrarProdutosNoEstoque() {
        for (int i = 0; i < this.estoque.length; i++) {
            this.systemUi.displayMessage(i  + " - " + this.estoque[i].getDescription()  + ", Estoque: " + this.estoque[i].getQuantity() );
        }
    }



    /**
     * Verifica se o valor esta dentro do range do índice do estoque
     ** @param input Valor a ser recebido pelo metódo
     * @return Retorna o valor como boolean
     */
    private boolean verificaInput(int input) {
        return input < this.estoque.length;
    }

   public void iniciarSistema()  {
        int input;

       this.systemUi.displayMessage("Iniciando sistema");
        do {
            this.systemUi.displayMessage("Selecione as opções de 0 a 5");
            this.mostrarProdutosNoEstoque();

            this.systemUi.displayMessage("5 - Finalizar sistema");

            input = this.systemUi.getIntInput();

            if(this.verificaInput(input)) {
                Peca produto = this.estoque[input];
                produto.venda();
                produto.verificarEstoque();

            }else if(input == 5) {

                this.systemUi.displayMessage("Finalizando Sistema");

            } else {
                this.systemUi.displayMessage("Informe um valor valido");
            }
        }while (input !=5);

   }


}
