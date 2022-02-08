package es.alonso;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int notas=0 , i ,numerico = 0, aprobao = 0, suspenso = 0, media = 0;
	Scanner entrada = new Scanner(System.in);
System.out.println("cntas ntas quieres introducit??");
numerico = entrada.nextInt();

    for ( i = 1 ;i <= numerico ; i++) {
            do {
                System.out.print("Nota " + i + ":");
                notas = entrada.nextInt();
            } while ( notas > 10 || numerico < 0 );

            if (notas >= 5){
                aprobao++;
            } else {
                suspenso++;
            }
            media  = media+notas;
        }
    System.out.println("Aprobados: " +aprobao );
    System.out.println("Suspensos: " +suspenso );
    System.out.println("Media: " +media/numerico );
    }

}