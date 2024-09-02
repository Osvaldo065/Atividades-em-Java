/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paineldebordo;

/**
 *
 * @author 
 */
public class Carro extends Modelo implements Garagem, Proprietario{
 
    
    
  
    void abrir(){
        this.porta = true;
    }
    
     void ligar(){
           if(this.porta == true){
            System.out.println("Cuidado porta do Carro Aberta!!!");
            System.out.println("Dando partida no carro...");
            this.ligado = true;
            
        } else{
            this.ligado = true;
            System.out.println("Dando partida no carro...");
            
        
        }
    }
    
      void fechar(){
          this.porta = false;
    }
    
     void desligar(){
           if(this.porta == true){
            System.out.println("Cuiadado porta do Carro Aberta!!!");
            System.out.println("Desligando o carro...");
            this.ligado = false;
           
        } else{
            this.ligado = false;
            System.out.println("Desligando o carro...");
            
        
        }
    }
     void status(){
         System.out.println("Carro " + this.modelo + " de Cor " + this.cor + " Porta esta aberta? " + this.porta + " e esta ligado? " + this.ligado + " ");
     }
     
}