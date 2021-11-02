public class Menu {
    
    public static void main(String[] args) {
        Fjalp2.getTerminal().limparTela();

        Fjalp2.getTerminal().setCor(CorFonte.VERMELHO, CorFundo.PRETO);
        Fjalp2.getTerminal().caixa(20, 48, 41, 21);

        Fjalp2.getTerminal().setPosicaoCursor(25, 45);
        Fjalp2.getTerminal().caixa(25, 40, 39, 26);
        Fjalp2.getTerminal().setPosicaoCursor(26, 40);
        Fjalp2.getTerminal().escreva(" PLAY ");
        Fjalp2.getTerminal().caixa(28, 42, 40, 27);
        Fjalp2.getTerminal().setPosicaoCursor(29, 41);
        Fjalp2.getTerminal().escreva(" Niveis ");

    }
}
