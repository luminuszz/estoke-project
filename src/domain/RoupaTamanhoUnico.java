package domain;

import core.SystemUi;

public class RoupaTamanhoUnico extends  Peca {

    public RoupaTamanhoUnico(String description, int quantity, int maxQuantity, int minQuantity, SystemUi systemUi) {
        super(description, quantity, maxQuantity, minQuantity, systemUi);
    }

    @Override
    public void venda() {
        this.quantity -=1;

    }
}
