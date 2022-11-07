package Controller;



import Controller.ProvaController;

import javax.swing.JOptionPane;



public class TelaController {


	public Integer getOpcao() {
		return opcao;
	}

	private Integer opcao;

	public String apresentacao() {
		String nome = JOptionPane.showInputDialog(null, "Bem Vindo, Digite seu Nome:");
		return nome;
	}

	public void chamarComponentes(String nome) {
		String menuPrincipal =  "========//==============// ========== // ================\n"
				+"Bem Vindo, " + nome + "! \n "
				+ "========//==============// ========== // ================ \n"
				+"Selecione uma op��o para continuar: \n "
				+ "1 - Responder a prova \n "
				+ "2 - Finalizar SystemProvas \n ";
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menuPrincipal +" Insira uma op��o:"));
		switch(opcao) {
		case 1:
			
			ProvaController pCont = new ProvaController();
			JOptionPane.showMessageDialog(null,"Seu desempenho final � : "  + pCont.gerarProva() + "/5");
			
			break;
		case 2:
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Desculpe, Op��o invalida");
			break;
		}
		}while(opcao != 3);
 }


}


