/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

/**
 *
 * @author Alunos
 */
public class Conecta {
     public static void carregaDriver(){
       try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver carregado com sucesso!");
       }
       catch(Exception ex){
            System.out.println("Driver não pôde ser carregado!");
       }
}
    
}
