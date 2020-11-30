package questao1;

import java.util.HashMap;
import java.util.Scanner;

public class ContagemPalavras {
    
    public static void contarQntPalavras(){
        String frase;
        
        System.out.print("digite uma frase: ");
        Scanner scanner = new Scanner(System.in);
        
        frase = scanner.nextLine();
        scanner.close();
        
        String[] ListaPalavras = frase.split(" ");

        HashMap<String, Integer> contagemPalavras = new HashMap<>();

        for (String palavra : ListaPalavras){
            boolean resultado = contagemPalavras.containsKey(palavra);
            if (resultado == false){
                contagemPalavras.put(palavra, 1);
            }
            else{
                contagemPalavras.put(palavra, contagemPalavras.get(palavra)+1);
            }
        }

        for (String palavra : contagemPalavras.keySet()){
            System.out.println("palavra: " + palavra + " / qnt: " + contagemPalavras.get(palavra));
        }

    }

    public static void main(String[] args) {
        contarQntPalavras();
    }
}
