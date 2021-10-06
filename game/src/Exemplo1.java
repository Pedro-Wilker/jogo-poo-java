/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itakenami
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fjalp2.getTerminal().limparTela();
        
        Fjalp2.getTerminal().setCor(CorFonte.VERDE, CorFundo.PRETO);
        Fjalp2.getTerminal().caixa(8, 28, 21, 4);
        
        Fjalp2.getTerminal().setPosicaoCursor(10, 30);
        Fjalp2.getTerminal().escreva("   DISH DASHERS\n");
        Fjalp2.getTerminal().setPosicaoCursor(11, 30);
        Fjalp2.getTerminal().escreva("Digite 1 para jogar");
        
        Fjalp2.getTerminal().leiaTecla();
        
    }
     
    
}
