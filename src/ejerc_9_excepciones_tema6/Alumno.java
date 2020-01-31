/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_9_excepciones_tema6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ITP1DAM
 */
public class Alumno {

    static final int num_asignatura = 5;
    String nombre;
    ArrayList<Double> notas = new ArrayList<>(num_asignatura);

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public Alumno() {
        nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void pedirNotas() throws RangoException {
        for (int i = 0; i < num_asignatura; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Dime la nota " + i + " del alumno");
            double nota = teclado.nextDouble();

            if (nota > 10) {
                throw new RangoException("");
            } else {
                notas.add(nota);
            }
        }
    }

    public void modificarNota(int posicion, double nnota)
            throws RangoException, PosicionArrayException 
    {
        if (posicion > 5){
            throw new PosicionArrayException("");
        }
        if (nnota > 10){
            throw new RangoException("");
        }
        else{
            notas.add(posicion, nnota);
        }
    }

}
