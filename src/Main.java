import core.SystemUi;
import domain.*;
import infra.TerminalSystemUi;

public class Main {
    public static void main(String[] args) {

        SystemUi terminalSystemUi = new TerminalSystemUi();


        Estoque estoque = new Estoque(terminalSystemUi);

        estoque.addEstoque(new Acessorio("Brinco", 10, 20 , 5, terminalSystemUi), 0);
        estoque.addEstoque(new RoupaTamanhoUnico("Camisa da Thais Carla", 10, 20 , 5, terminalSystemUi), 1);
        estoque.addEstoque(new RoupaPMG("Camisa Lacoste", 10, 20 , 5, terminalSystemUi), 2);
        estoque.addEstoque(new RoupaPMG("Camisa Bahia", 10, 20 , 5, terminalSystemUi), 3);
        estoque.addEstoque(new Acessorio("Pulseira", 10, 20 , 5, terminalSystemUi), 4);



        estoque.inciarSistema();

    }
}