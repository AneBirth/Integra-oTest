package Controller;

import SystemProvas1.Pergunta;

import javax.swing.*;
import java.util.List;

public class PerguntaController {

	public List<Boolean> lerPerguntas(List<Pergunta> perguntas, List<Boolean> respostas) {

		String respostaDoUsuario;
		Boolean respostaCerta;

		for (Pergunta p : perguntas) {
			respostaDoUsuario = JOptionPane.showInputDialog(null, p + " \n Resposta: ");

			if (respostaDoUsuario.toUpperCase().equals(p.getGabarito())) {
				JOptionPane.showMessageDialog(null, "Resposta Certa");
				respostaCerta = true;
			} else {
				JOptionPane.showMessageDialog(null, "Resposta Errada, a resposta certa � letra:" + p.getGabarito());
				respostaCerta = false;
			}

			respostas.add(respostaCerta);
		}
		return respostas;
	}
}
