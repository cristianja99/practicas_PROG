/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_9_excepciones_tema6;

/**
 *
 * @author ITP1DAM
 */
public class RangoException extends Exception
{

    public RangoException(String message) {
        super("Error. Nota no valida.");
    }
    
}
