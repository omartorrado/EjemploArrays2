/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoarrayobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class Equipo {

    //Creamos una lista de objetos tipo Jugador con espacio para 3 objetos Jugador
    Jugador[] jugadores = new Jugador[3];
    //Aki creamos un array e inicializamos directamente los objetos que lo componen
    Jugador[] jug = {new Jugador("aa", 1), new Jugador("bb", 2), new Jugador("cc", 3)};

    public String pedirNombre() {
        return JOptionPane.showInputDialog("Nombre: ");
    }

    public int pedirDorsal() {
        return Integer.parseInt(JOptionPane.showInputDialog("Dorsal: "));
    }

    public void crearArray() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(pedirNombre(), pedirDorsal());
        }
    }

    public void visualizar(){
        //for each
        for(Jugador jug:jugadores)
            JOptionPane.showMessageDialog(null,jug);
        //tamen se pode facer
        for(int i=0;i<jugadores.length;i++)
            System.out.println(jugadores[i]);
    }
}
