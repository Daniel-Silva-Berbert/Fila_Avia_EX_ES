import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Fila<String> o1 = new Fila<>();
        Fila<String> n3 = new Fila<>();
        Fila<String> s2 = new Fila<>();
        Fila<String> l4 = new Fila<>();
        Fila<String> saida = new Fila<>();

        String op = "";
        op = in.nextLine();
        while (!op.equals("0")) {
            if(op.equals("-1")){
                while(true){
                    op = in.nextLine();
                    if(op.equals("-4") || op.equals("-2") || op.equals("-3") || op.equals("0"))
                        break;
                    o1.enfileirar(op);
                }
            }
            if(op.equals("-2")){
                while(true){
                    op = in.nextLine();
                    if(op.equals("-4") || op.equals("-1") || op.equals("-3") || op.equals("0"))
                        break;
                    s2.enfileirar(op);
                }
            }
            if(op.equals("-3")){
                while(true){
                    op = in.nextLine();
                    if(op.equals("-4") || op.equals("-2") || op.equals("-1") || op.equals("0"))
                        break;
                    n3.enfileirar(op);
                }
            }
            if(op.equals("-4")){
                while(true){
                    op = in.nextLine();
                    if(op.equals("-1") || op.equals("-2") || op.equals("-3") || op.equals("0"))
                        break;
                    l4.enfileirar(op);
                }
            }
        }
        int tamanhoG = o1.getTamanho() + n3.getTamanho() + s2.getTamanho() + l4.getTamanho();
        while(saida.getTamanho() != tamanhoG){
            if(o1.getTamanho() != 0)
                saida.enfileirar(o1.desenfileirar());
            if(n3.getTamanho() != 0)
                saida.enfileirar(n3.desenfileirar());
            if(s2.getTamanho() != 0)
                saida.enfileirar(s2.desenfileirar());
            if(l4.getTamanho() != 0)
                saida.enfileirar(l4.desenfileirar());
        }
        while(saida.getTamanho() != 0){
            System.out.print(saida.desenfileirar() + " ");
        }
        in.close();
    }
}
