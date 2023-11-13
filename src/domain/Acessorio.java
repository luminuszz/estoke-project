package domain;

import core.SystemUi;

public class Acessorio extends Peca {

    public Acessorio(String description, int quantity, int maxQuantity, int minQuantity, SystemUi systemUi) {
        super(description, quantity, maxQuantity, minQuantity, systemUi);
    }

    public void venda() {

        this.systemUi.displayMessage("Informe a quantidade");

        int quantidadeDesejada = this.systemUi.getIntInput();


        if(quantidadeDesejada <= this.quantity) {
            this.quantity -= quantidadeDesejada;
        }else {
            systemUi.displayMessage("Quantidade desejada maior que o estoque");
        }





    }


}
