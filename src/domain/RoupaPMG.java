package domain;

import core.SystemUi;
import domain.dto.Tamanho;

import java.util.Objects;
import java.util.Random;


public class RoupaPMG  extends  Peca {


    int quantidadeP,quantidadeM,quantidadeG;


    public RoupaPMG(String description, int quantity, int maxQuantity, int minQuantity,SystemUi systemUi) {
        super(description, quantity, maxQuantity, minQuantity, systemUi);

        this.quantidadeP = quantity;
        this.quantidadeM = quantity;
        this.quantidadeG = quantity;

    }


    private void mostraTamanhos() {
        this.systemUi.displayMessage("Selecione o tamanho");

        this.systemUi.displayMessage("P " + "Quantidade: "  + this.quantidadeP);
        this.systemUi.displayMessage("M " + "Quantidade: "  + this.quantidadeM);
        this.systemUi.displayMessage("G " + "Quantidade: "  + this.quantidadeG);

    }


    @Override
    public void reposicaoEstoque() {
        if(this.quantidadeM <= this.minQuantity) {
            this.quantidadeM = this.maxQuantity;
        }

        if(this.quantidadeG <= this.minQuantity) {
            this.quantidadeG = this.maxQuantity;
        }

        if(this.quantidadeP <= this.minQuantity) {
            this.quantidadeP = this.maxQuantity;
        }
    }

    @Override
    public void venda() {

        this.mostraTamanhos();

        String  opcao = this.systemUi.getStringInput();

            switch (opcao) {
                case "M":
                    this.quantidadeM -=1;
                    break;

                case "P":
                    this.quantidadeP -=1;
                    break;
                case "G":
                    this.quantidadeG -=1;
                    break;
                default:
                    this.systemUi.displayMessage("Informe um tamanho valido");
            }



    }


}
