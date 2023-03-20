package com.egypteam.desenvolvendo.aulas.aula0002;

import com.egypteam.desenvolvendo.aulas.aula0002.geometria.Quadrado;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {

        try {

            int l = 0;
        
            if (args.length > 0) {
                l = Integer.parseInt(args[0]);
            } else {
                System.out.print("Entre com o lado: ");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String line = br.readLine();
                l = Integer.parseInt(line);
                br.close();
            }
            
            Quadrado quadrado = new Quadrado(l);
    
            quadrado.pintaQuadrado();

        } catch (IOException ioex) {

            System.out.println("Erro: " + ioex.getMessage());

        }
        

    }

}
