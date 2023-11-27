package domain;

import core.SystemUi;

public abstract class Peca {

    protected String description;
    protected int quantity;
    protected int maxQuantity;
    protected int minQuantity;

    protected  SystemUi systemUi;

    public Peca(String description, int quantity, int maxQuantity, int minQuantity, SystemUi systemUi) {
        this.description = description;
        this.maxQuantity = maxQuantity;
        this.minQuantity = minQuantity;
        this.quantity = quantity;
        this.systemUi = systemUi;
    }


    public abstract void venda();


    public abstract String getRelatorio();


    public void reposicaoEstoque() {
            this.quantity = this.maxQuantity;
            this.systemUi.displayMessage("Log -> Quantidade atual " + this.quantity);
    }


    protected void verificarEstoque() {
        if(this.quantity <= this.minQuantity) {
            this.systemUi.displayMessage("O estoque do produto " + this.description + " Atingiu o minimo permetido, fazendo reposicao...");
            this.reposicaoEstoque();
        }

    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
    }

}
