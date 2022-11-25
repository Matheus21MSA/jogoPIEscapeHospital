import java.util.Scanner;
class Main {
  static int menusaida = 0, a = 0;
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {
    while (menusaida != 4) {
    Biblioteca.menu();
    menusaida = entrada.nextInt();
      switch (menusaida) {
        case 1:
          Biblioteca.intro();
          break;
        case 2:
          Biblioteca.fase0_1();
          System.out.println("Qual caminho deseja seguir?");
          System.out.println("1 - Deseja seguir a sombra?");
          System.out.println("2 - Deseja seguir a direção oposta?");
          a = entrada.nextInt();
          if(a == 1){
            BibliotecaL.fase0_2();
          }else{
            BibliotecaK.fase0_3();
          }
          break;
        case 3:
          Biblioteca.creditos();
          break;
        case 4:
          System.out.println("FIM");
          break;
        default:
          System.out.println(" Comando Invalido ");
          break;

      }
   
    }
  }
}