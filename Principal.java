package aula02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String nomeVinho, tipoVinho;
		double precoVinho = 0;
		int safraVinho;
		boolean promocao;
		
		//chamando o objeto meuVinho2;
		Vinho meuVinho2 = new Vinho();
		
		
		String opcoes [] = {"Cadastrar vinho", "Verificar pre�o", "Mostrar vinho", "Sair"};
		
		//declara��o da variavel de entrada e saida do menu
		boolean saida = false;
		
		//atribui��o da variavel para a caixa de peguntas ficar no loopin
		while(saida == false) {
			
		
		int cont = JOptionPane.showOptionDialog(null, "In�cio do cadastro do cadastro ", "MENU", 0, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);
		
		
		
		//casos
		switch(cont) {
		
		case 0:
			nomeVinho = JOptionPane.showInputDialog(null, "Digite o nome do vinho: ", "Vinho", JOptionPane.QUESTION_MESSAGE);
			tipoVinho = JOptionPane.showInputDialog(null, "Digite o tipo do vinho: ", "Vinho", JOptionPane.QUESTION_MESSAGE);
			precoVinho = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o pre�o do vinho: ", "Vinho", JOptionPane.QUESTION_MESSAGE));
			safraVinho = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a safra do vinho: ", "Vinho", JOptionPane.QUESTION_MESSAGE));	
			
		meuVinho2 = new Vinho(nomeVinho, tipoVinho, precoVinho, safraVinho);	
		break;
		
		
		case 1:
			//parte da verifica��o do valor
			promocao = meuVinho2.verificarPreco(precoVinho);
			meuVinho2 = new Vinho();
			if(promocao == true) {
				JOptionPane.showMessageDialog(null, "Produto em oferta","Vinho", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Produto com valor normal", "Vinho", JOptionPane.INFORMATION_MESSAGE);
			}	
			
		break;
		
		
		case 2:
			//parte dos dados do vinho impressos na pagina
			//meuVinho2 = new Vinho();
			JOptionPane.showMessageDialog(null,meuVinho2.mostrarVinho(),"Vinho",JOptionPane.INFORMATION_MESSAGE);
			break;
			
			
		case 3:
			//op��o para o menu sair do loopin
		saida = true;	
		
		break;	
		}
		
		
		
		
		
		}
	}
	
	
}
