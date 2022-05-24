package exerciciossala;

import java.util.Scanner;

public class d2504e002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);//puxando impressaão
        
        int n;//ldeclarando variavel
        
        System.out.print("Voce é idoso ou pessoa com deficiencia ou gestante?\n 1 - (SIM)\n 2 - (NAO)\n");//imprimindo
        n = ler.nextInt();//lendo
        if(n == 1){//condição para aprovar ou reprovar 
            System.out.println("Você pode estacionar nessa vaga"); //imprimindo 
        }else{
            System.out.println("Você nao pode estacionar aqui!");
        }
}
}
