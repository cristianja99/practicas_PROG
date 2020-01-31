/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_9_excepciones_tema6;

import java.util.Scanner;

/**
 *
 * @author ITP1DAM
 */
public class Ejerc_9_Excepciones_Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Scanner teclado2 = new Scanner (System.in);
        Alumno cristian = new Alumno("cristian");
        
        try
        {
           cristian.pedirNotas(); 
        }
        catch(RangoException error){
            System.out.println(error.getMessage());
        }
        
        System.out.println("PROBANDO METODO MODIFICAR NOTAS");
        System.out.println("Dime la nota: ");
        double nota = teclado.nextDouble();
        System.out.println("Dime la posicion en la que quieres poner la nota");
        int posicion = teclado2.nextInt();
        
        
        try
        {
            cristian.modificarNota(posicion, nota );
        }
        catch(RangoException | PosicionArrayException error){
            System.out.println(error.getMessage());
        }
    }
    
}
