package com.egypteam.desenvolvendo.aulas.aula0003;

import com.egypteam.desenvolvendo.aulas.aula0003.geometria.Quadrado;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringWriter;

public class Main {
    
    public static void main(String[] args) {

        String str = "Olá, ";
		String snome = "Pedro";
		
        //String frase = str + snome + "!";
        // String frase = "";
        // frase = frase.concat(str);
        // frase = frase.concat(snome);
        // frase = frase.concat("!");

        StringWriter sw = new StringWriter();
        sw.append(str);
        sw.append(snome);
        sw.append("!");
        String frase = sw.toString();

		char ch = str.charAt(2);

		int i = frase.indexOf("Pedro");

		System.out.println(frase);
		System.out.println(ch);
		System.out.println(i);

		String s1 = "aaaa";
		String s2 = "aaaa";

		int comp = s1.compareTo(s2);

        System.out.println(comp);

    }

    public static void main1(String[] args) {

        try {

            Quadrado quadrado = new Quadrado();
        
            if (args.length > 0) {
                int l = Integer.parseInt(args[0]);
                quadrado.setLado(l);
            } else {
                System.out.print("Entre com o lado: ");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String line = br.readLine();
                int l = Integer.parseInt(line);
                br.close();
                quadrado.setLado(l);
            }
    
            quadrado.pintaQuadrado();
            String s = String.format("Área do quadrado: %d", quadrado.getArea());
            System.out.println(s);

        } catch (IOException ioex) {

            System.out.println("Erro: " + ioex.getMessage());

        }
        

    }

}
