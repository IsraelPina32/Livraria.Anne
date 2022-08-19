import java.util.Scanner;

public class App {
    public class ProjetinhoLivraria {


        public static void main(String[] args) {
            Livro P = new Livro();
       
            P.settitulo("Anne de Green Gables");
            P.setnumpags(250);
            P.setano(1901);
            P.setpreco(35);
    
            System.out.println("\nTitulo seu Livro: " + P.gettitulo() + "\nNumero de paginas: " + P.getnumpags() + "\nO Ano do lançamento: " + P.getano() + "\nO Preço desse livro: " + P.getpreco() + ".");
            
            Livro S = new Livro();
            S.settitulo("Anne De Windy Poplays");
            S.setnumpags(350);
            S.setano(1936);
            S.setpreco(45);
            System.out.println("\nTitulo do seu Segundo Livro: " + S.gettitulo() + "\nNumero de paginas: " + S.getnumpags() + "\nO Ano do lançamento: " + S.getano() + "\nO Preço desse livro: " + S.getpreco() + ".");
    
            try (Scanner ler = new Scanner(System.in)){
                System.out.println("\n Digite o nome do novo Livro ");
                String nome = ler.nextLine();
                System.out.println("\n Digite o novo numero de paginas do seu livro ");
                int A1 = ler.nextInt();
                P.settitulo(nome);
                System.out.println("\n Digite o novo ano do seu livro ");
                int A2 = ler.nextInt();
                System.out.println("\n Digite o preço do seu livro");
                double A3 = ler.nextDouble();
    
                S.settitulo(nome);
                S.setnumpags(A1);
                S.setano(A2);
                S.setpreco(A3);
    
            System.out.println("\nTitulo: " + S.gettitulo() + "\n NumerosdePags: " + S.getnumpags()+ "\n O Ano: " + S.getano() + "\n O Preço: " + S.getpreco( ) + ".");
            
            }
        
        
        }  
     }
    }

