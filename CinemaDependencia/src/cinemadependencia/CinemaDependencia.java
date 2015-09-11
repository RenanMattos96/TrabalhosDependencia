/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinemadependencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Renan Mattos
 */
public class CinemaDependencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Filme f = new Filme();
     
        f.atribuirNome(JOptionPane.showInputDialog("Nome:"));
        f.atribuirDuracao(Integer.parseInt(JOptionPane.showInputDialog("Duração:")));
        f.atribuirClassificacao(Integer.parseInt((JOptionPane.showInputDialog("Classificação:"))));
        f.atribuirGenero(JOptionPane.showInputDialog("Gênero:"));
        f.atribuirAtores(JOptionPane.showInputDialog("Atores:"));
        
        JOptionPane.showMessageDialog(null, "\n Nome:"+f.retornarNome()+"\n Atores:"+f.retornarAtores()+"\n Duração:"+f.retornarDuracao()+"\n Classificação:"+f.retornarClassificacao()+"\n Gênero:"+f.retornarGenero()+"\n"+f.retornaTipoFilme()+"Metragem");
        
        Integer idade;
        
        idade = (Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade pra saber se pode ver o filme:")));
        if (f.verificaClassificacao(idade)== true){
            JOptionPane.showMessageDialog(null, "Pode ver");
        }
        else{
            JOptionPane.showMessageDialog(null, "Nao pode ver");
        }
        
        Ator ator = new Ator();
        ator.atribuirNome(JOptionPane.showInputDialog("Nome:"));
        ator.atribuirDatanascimento(JOptionPane.showInputDialog("Data de Nascimento:"));
        ator.atribuirCache(Float.parseFloat(JOptionPane.showInputDialog("Cache:")));        
        ator.atribuirTotalFilmes(Integer.parseInt(JOptionPane.showInputDialog("Total de filmes:")));
        ator.atribuirTotalFilmesAno(Integer.parseInt(JOptionPane.showInputDialog("Total de filmes ano passado:")));
        String ganhou = (JOptionPane.showInputDialog("Ganhou o Oscar (S/N)"));
        if (ganhou.equals("s")){
            ator.atribuirVencedorOscar(true);
        }
        else{
            ator.atribuirVencedorOscar(false);
        }
        
        if(ator.retornarVencedorOscar()==true){
            ganhou = "sim";
        }
        else{
            ganhou = "não";
        }
        JOptionPane.showMessageDialog(null, "\n Ator:"+ator.retornarNome()+"\n Data de Nascimento:"+ator.retornarDataNascimento()+"\n Cache:"+ator.retornarCache()+"\n Total de Filmes:"+ator.retornarTotalFilmes()+"\n Total de filmes ano passado:"+ator.retornarTotalFilmesAno()+"\n Ganhou o Oscar ?"+ganhou+"\n Ganhos do ano"+ator.retornarGanhosAtor());
    }
    
}
