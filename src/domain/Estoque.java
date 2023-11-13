package domain;

import core.SystemUi;

public class Estoque {

    private final Peca[] estoque;
    private final SystemUi systemUi;

    private final int maxEstoque;

    public Estoque( SystemUi systemUi) {
        this.maxEstoque = 5;
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



    private boolean verificarInput(int input) {
       return input <= this.maxEstoque;
    }


   public void inciarSistema()  {

        int input;

        do {
            this.systemUi.displayMessage("Sistema de estoque");

            this.mostrarProdutosNoEstoque();
            this.systemUi.displayMessage("5 - Sair do sistema");


            input = this.systemUi.getIntInput();

            if(this.verificarInput(input)) {
                Peca produto = this.estoque[input];
                produto.venda();
                produto.verificarEstoque();

            } else {
                systemUi.displayMessage("Informe uma tecla valida de 0 a 5");
            }

        }while (input != 5);

   }


}
