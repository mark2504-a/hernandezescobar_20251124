/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graforecursivo;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GrafoRecursivo grafo = new GrafoRecursivo(4);
        
        grafo.insertarNodo('A'); //INDICE 0
        grafo.insertarNodo('B'); //INDICE 1
        grafo.insertarNodo('C'); //INDICE 2
        grafo.insertarNodo('D'); //INDICE 3
        
        grafo.conectar(0, 1); //ARISTA (A,B)
        grafo.conectar(0, 2); //ARISTA (A,C)
        grafo.conectar(1, 3); //ARISTA (B,D)
        grafo.conectar(2, 3); //ARISTA (C,D)
        
        System.out.println("Recorrido Depth First Search (DFS) desde el nodo A");
        
        grafo.dfs(0);
        //TEORICAMENTE EL RECORRIDO ES:
        //VISITA NODO A
        //LUEGO VISITA NODO B (SERÍA EL PRIMER ADTYACENTE DE A)
        //LUEGO VISITA D (QUE SERÍA EL ADYACENTE DE B)
        //LUEGO RETROCEDE (VUELVE A LA RAIZ) Y VISITA C (QUE SERÍA EL ADYACERNTE NO VISITADO DE A)
        
    }
    
}
