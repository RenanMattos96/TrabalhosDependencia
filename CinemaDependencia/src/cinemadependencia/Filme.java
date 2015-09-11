/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinemadependencia;

/**
 *
 * @author Renan Mattos
 */
public class Filme {
    String nome;
    Integer duracao;
    Integer classificacao;
    String genero;
    String atores;
    
    void atribuirNome(String valor) 
    {
        nome = valor;
    }
    
    void atribuirDuracao(Integer valor)
    {
        duracao = valor;
    }
    
    void atribuirClassificacao(Integer valor)
    {
        classificacao = valor;
    }
    
     void atribuirGenero(String valor) 
    {
        genero = valor;
    }
     
     void atribuirAtores(String valor) 
    {
        atores = valor;
    }
     
     String retornarNome()
     {
         return nome;
     }
     
     Integer retornarDuracao()
     {
         return duracao;
     }
     Integer retornarClassificacao()
     {
         return classificacao;
     }
     String retornarGenero()
     {
         return genero;
     }
     String retornarAtores()
     {
         return atores;
     }
     Boolean verificaClassificacao(Integer idade){
         if (idade>= classificacao){
             return true;
         }
         else{
             return false;
         }
     }
     String retornaTipoFilme(){
        if(duracao<60)
        {
            return "Curta";
        }
        else
        {
            return "Longa";
        }
}
}
