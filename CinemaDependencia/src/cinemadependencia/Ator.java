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
public class Ator {
    String nome;
    String datanascimento;
    Float cache;
    Boolean vencedorOscar;
    Integer totalFilmes;
    Integer totalFilmesAno;
    
    void atribuirNome(String valor){
        nome = valor;
    }
    void atribuirDatanascimento(String valor){
        datanascimento = valor;
    }
    void atribuirCache(Float valor){
        cache = valor;
    }
    void atribuirVencedorOscar(Boolean valor){
        vencedorOscar = valor;
    }
    void atribuirTotalFilmes(Integer valor){
        totalFilmes = valor;
    }
    void atribuirTotalFilmesAno(Integer valor){
        totalFilmesAno = valor;
    }
    
    String retornarNome(){
     return nome;
    }
    String retornarDataNascimento(){
     return datanascimento;
    }
    Float retornarCache(){
    return cache;
    }
    Boolean retornarVencedorOscar(){
    return vencedorOscar;
    }
    Integer retornarTotalFilmes(){
    return totalFilmes;
    }
    Integer retornarTotalFilmesAno(){
    return totalFilmesAno;
    }
    Float retornarGanhosAtor(){
    return cache*totalFilmesAno;
    }
    
}
