package bigolinNaval;
import javax.swing.*;
import java.awt.*;


public class batalhaNaval {

	public static void main(String[] args) {
    int[][] tabuleiro = {
    		{0,1,0,0,0,0},
    		{0,0,0,0,1,0},
    		{1,0,0,0,0,0},
    		{0,0,0,1,0,0},
    		{0,0,0,0,0,0},
    		{1,0,0,0,1,0}
   };
    String [] mensagem = {
    		"agua! tente novamente",
    		"fogo! voce acertou um navio",
            "voce ja clicou aq"
    };		
    
    int [] naviosRestantes = {6};
    
    JFrame janela = new JFrame("mini batalha naval");
    janela.setSize(400,400);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setLayout(new GridLayout (6,6));
	
    JButton [][] botoes = new JButton[6][6];
    
    for (int l=0;l <6; l++) {
    	for (int c = 0; c <6; c++) {
    		botoes[l][c] = new JButton ("~");
    		botoes[l][c].setFont(new Font("Arial", Font.BOLD, 24));
    		
    		int linha = l;
    		int coluna = c;
    	
    	botoes[l][c].addActionListener(e -> {
    		
    		if(!botoes[linha][coluna].getText() .equals("~")) {
    		    JOptionPane.showMessageDialog(janela, mensagem[2]);
    		
    		}
    		else if (tabuleiro[linha][coluna]==1) {
    			botoes[linha][coluna].setText("X");
    			botoes[linha][coluna].setBackground(Color.GREEN);
    			naviosRestantes[0]--;
    			
    			JOptionPane.showMessageDialog(janela,mensagem[1]);
            }
    	else {
			botoes[linha][coluna].setText("O");
			botoes[linha][coluna].setBackground(Color.LIGHT_GRAY);
            
			JOptionPane.showMessageDialog(janela, mensagem [0]);
    	}
    	if (naviosRestantes[0]==0) {
    		JOptionPane.showMessageDialog(janela, "parabens voce ganhou");
            System.exit(0);    
    	}
    		
    		});
    	
     janela.add(botoes[l][c]);
    	
    	
    	}
    	
    }
    janela.setVisible(true);
	}
	
	
	
	
    
    
	}


