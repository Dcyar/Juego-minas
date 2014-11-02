
package juego;
import java.util.Random;
/**
 * @author JhOn
 */
public class Tablero {
    public Tablero(int cantX, int cantY, int posX, int posY){
        int tabla[][] = new int[cantX][cantY];
        Random alt = new Random();
        
        for(int a = 0; a < cantX; a++){
            for(int b = 0; b < cantY; b++){
                tabla[a][b] = alt.nextInt(2);
                //System.out.println(a+ " " + b);
            }
        }
        for(int a = 0; a < cantX; a++){
            for(int b = 0; b < cantY; b++){
                System.out.print(tabla[a][b]);
            }
            System.out.println();
        }
        System.out.println();
        if(tabla[posX][posY] == 0)
            System.out.println("Ganaste :)");
        else
            System.out.println("Perdiste :(");
    }
}