package br.com.alura.principaisAPIsEBibliotecas.teste;

import java.io.*;
import java.util.Scanner;
public class SystemIOTeste {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));
//        Scanner entrada = new Scanner(is);
        InputStream inIS = System.in;
        Scanner entrada = new Scanner(System.in);
        PrintStream saida = new PrintStream(new FileOutputStream("copia.txt"));
        while (entrada.hasNextLine()) {
            saida.println(entrada.nextLine());
        }
        saida.close();
        entrada.close();
    }
	
//		   System.out.println("Digite sua mensagem:");
////	        String linha = br.readLine(); // primeira linha
//
//	        while (entradaIS != null) {
////	            System.out.println(linha);
////	            linha = br.readLine();
////	            entradaIS.nextLine();
//	            String linha = entradaIS.nextLine();
//	            bw.write(linha);
//	            bw.newLine(); 
//	        }
//	        entradaIS.close();
//	        br.close();
//	        bw.close();
//	}
}
