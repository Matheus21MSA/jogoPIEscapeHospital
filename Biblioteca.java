import java.util.Scanner;
import java.util.Random;

class Biblioteca {
  static String inventario[] = new String[3];
  static Random random = new Random();
  static Scanner entrada = new Scanner(System.in);
  static int t = 0, i = 0, a = 0, b = 0, c = 0, menusaida = 0, corredorHomem = 7,  corredorAtual = 1;
  static String p, itemFase, nada = "nada";
  static boolean portaUTI = true, fimdejogo = true, portaRecepcao = true, itemCerto = true, entrou1 = true;

  public static void menu() {
    /*
     * A classe
     */
    System.out.println("       ✚Escape Hospital✚");
    System.out.println("       ==================");
    System.out.println("              Menu");
    System.out.println("       ==================");
    System.out.println("        1 - Instruções");
    System.out.println("           2 - Jogar");
    System.out.println("          3 - Créditos");
    System.out.println("            4 - Sair");
    System.out.println("       ==================");
      
      
    }


  public static void invItem1() {
    System.out.print("Você pegou o suporte de soro");
    if (inventario[0] == null || nada.equalsIgnoreCase(inventario[0])) {
      inventario[0] = "Suporte de soro";
      portaUTI = false;
    } else if (inventario[1] == null || nada.equalsIgnoreCase(inventario[1])) {
      inventario[1] = "Suporte de soro";
      portaUTI = false;
    } else if (inventario[2] == null || nada.equalsIgnoreCase(inventario[2])) {
      inventario[2] = "Suporte de soro";
      portaUTI = false;
    }
  }

  public static void invItem2() {
    System.out.print("Você guardou o bilhete");
    if (inventario[0] == null || nada.equalsIgnoreCase(inventario[0])) {
      inventario[0] = "Bilhete";
    } else if (inventario[1] == null || nada.equalsIgnoreCase(inventario[1])) {
      inventario[1] = "Bilhete";
    } else if (inventario[2] == null || nada.equalsIgnoreCase(inventario[2])) {
      inventario[2] = "Bilhete";
    }
  }

  public static void invItem3() {
    System.out.print("Você pegou o machado");
    if (inventario[0] == null || nada.equalsIgnoreCase(inventario[0])) {
      inventario[0] = "Machado";
    } else if (inventario[1] == null || nada.equalsIgnoreCase(inventario[1])) {
      inventario[1] = "Machado";
    } else if (inventario[2] == null || nada.equalsIgnoreCase(inventario[2])) {
      inventario[2] = "Machado";
    }
  }

  public static void veriInv() {
    int decisao = 0;
    while (b == 0) {
      if (inventario[0] == null) {
        inventario[0] = "nada";
      }
      if (inventario[1] == null) {
        inventario[1] = "nada";
      }
      if (inventario[2] == null) {
        inventario[2] = "nada";
      }
      System.out.println("Seus Itens no inventario são:\n 1 - " + inventario[0] + "\n 2 - " + inventario[1] + "\n 3 - "+ inventario[2]);
      System.out.println("\nSe deseja sair do inventario Digite 9 ");
      decisao = entrada.nextInt();
      if (decisao == 9) {
        b = 1;
      }

    }
    b = 0;
  }

  public static void olharInv() {
    if (inventario[0] == null) {
      inventario[0] = "nada";
    }
    if (inventario[1] == null) {
      inventario[1] = "nada";
    }
    if (inventario[2] == null) {
      inventario[2] = "nada";
    }
  
    System.out.println("Seus Itens no inventario são:\n 1 - " + inventario[0] + "\n 2 - " + inventario[1] + "\n 3 - "+ inventario[2]);
  }

  public static void usarInv() {
    itemCerto = true;
    c = 0;
    while (c != 9) {
      System.out.println("Qual item no seu inventario você deseja usar nessa ocasião? \nSe desejar voltar digite 9");
      olharInv();
      c = entrada.nextInt();
      switch (c) {
        case 1:
          if (itemFase.equalsIgnoreCase(inventario[0])) {
            System.out.println("O Item Funcionou!!!!!!!!");
            itemCerto = false;
            c = 9;
          } else {
            System.out.println("Não funcionou, tente novamente");
          }
          break;
        case 2:
          if (itemFase.equalsIgnoreCase(inventario[1])) {
            System.out.println("O Item Funcionou!!!!!!!!");
            itemCerto = false;
            c = 9;
          } else {
            System.out.println("Não funcionou, tente novamente");
          }
          break;
        case 3:
          if (itemFase.equalsIgnoreCase(inventario[2])) {
            System.out.println("O Item Funcionou!!!!!!!!");
            itemCerto = false;
            c = 9;
          } else {
            System.out.println("Não funcionou, tente novamente");
          }
          break;
       
        case 9:
          System.out.println("Você saiu da opção de escolher");
          break;
        default:
          System.out.println("Opção inexistente");
          break;

      }
    }
  }

  public static void intro() {
    System.out.println(
        "---------------------------------------------------------------\nEm uma noite chuvosa, a Sra. Alanis dá entrada desacordada ao hospital Son Cristovan, após levar um tiro em uma operação. Depois de 24h, ela acorda ao ouvir gritos e em seguida um silêncio avassalador. Ela levanta de sua maca e vai até a porta e observa uma sombra caminhando em sua direção que deixa uma chave do outro lado da porta, ela retorna rapidamente para a maca e finge estar dormindo.\n---------------------------------------------------------------");
    System.out.println("⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nAperte qualquer caracter para continuar\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿");
    p = entrada.nextLine();
    System.out.println("---------------------------------------------------------------\nSra Alanis se levanta.\n---------------------------------------------------------------");
  }

  public static void intro2() {
    System.out.println(
        "---------------------------------------------------------------\nO som dos passos ficam cada vez mais altos. A porta vai se abrindo lentamente, um homem abre a porta, o mesmo homem da foto. Ele estava com uma seringa na mão com um líquido transparente dentro, parece zangado e parte para cima de Alanis.\n---------------------------------------------------------------");
  }

  public static void intro3() {
    System.out.println(
        "---------------------------------------------------------------\nA detetive sai correndo em direção ao elevador, mas ele parece não estar funcionando, ela desce pelas escadas de emergência, ao ouvir o som da porta bater, ela ouve novamente o som da porta abrir, ela desceu três degraus de uma vez só e chega ao terreo e tranca a porta que da acesso ao terreo para não ser perseguida.\n---------------------------------------------------------------");
  }

  public static void intro4() {
    System.out.println(
        "---------------------------------------------------------------\nAlanis ignora o recado com medo do que pode acabar lendo. Ao se virar para sair da sala, ela dá de cara com um homem a observando, ele tem cabelos escuros e olheiras abaixo dos olhos. Ele está chorando com um olhar de arrependido, mas antes que ela possa dizer alguma coisa, ele se vira e sai andando quando a detetive se dá conta do que acabou de acontecer, ela corre atrás do homem, mas é tarde demais, ele já havia desaparecido.\n---------------------------------------------------------------");
  }
  public static void intro5() {
    System.out.println("Alanis sai correndo e consegue alcançar o homem, ele só conseguia dizer (“Foi eu que fiz isso, foi eu que fiz isso”).Quando Alanis olha para o lado há uma mulher, com um crachá que estava escrito “supervisora”,provavelmente sem vida. Ao questionar o homem sobre o que estava acontecendo, o homem entrega uma carta, e sai andando em direção ao elevador. Alanis abre a carta e começa a ler.");
      System.out.println("“Hoje é dia 08/05/2045, às 7:32 da manhã. Me chamo David e estou prestes a cometer a maior loucura da minha vida. Não me deram a oportunidade de trabalhar em um lugar harmonioso, me chamavam de todos os xingamentos possíveis, provavelmente porque eu era um homem que trabalhava como faxineiro do hospital, mas eu era obrigado a continuar pois minha filha precisava daquele transplante, e eles não a deram a oportunidade para sobreviver, com isso, nenhum desses merecem viver…”");
  }
  public static void creditos(){
    System.out.println("          ═════════Créditos═════════\n\n              Integrantes do Grupo 3 - Turma C:\n════════════════════════════════════════════════════════════\n\n              -Eduardo Pereira;\n                -Elias Gomes;\n                -Kaique Tinti;\n                -Lívia Amaral;\n             -Luis Felipe Mendes;\n            -Matheus Silva Azevedo;\n               -Sabrina Ribas;\n\n┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅\n\nProjeto Integrador: Desenvolvimento de Lógica;\n\nProfessor: Galvez Golçalves;\n\nCentro Universitário SENAC - Análise e Desenvolvimento de Sistemas;\n\n════════════════════════════════════════════════════════════");
  }

  public static void pront() {
    System.out.println(
        " ⌜⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌝\n\nNome Completo: Alanis Tinti Brandt\nData da internação: 08/05/2045\nData de Nascimento: 14/05/2012\nIdade: 33 anos \nSexo: Feminino\nTipo sanguíneo: O-\n\n⌞⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌟");
  }

  public static void olharJanela() {
    System.out.println(
        "---------------------------------------------------------------\nEla decide olhar pela janela e observa que haviam apenas árvores se mexendo com o vento e algumas luzes acessas bem distante e abaixo dela o chão a mais ou menos uns 5 andares de altura.\n---------------------------------------------------------------");
  }

  public static void porta1() {
    usarInv();
    if (itemCerto) {
      System.out.println(
          "---------------------------------------------------------------\nEla tenta abrir a porta, mas aparenta estar fechada, talvez ela consiga pegar chave com algum item da sala.\n---------------------------------------------------------------");
    } else {
      System.out.println(
          "---------------------------------------------------------------\nEla consegue abrir a porta, pois pegou o suporte de soro para pegar a chave atrás da porta e consegue abri-la!\n---------------------------------------------------------------");
      fimdejogo = false;
    }
  }

  public static void porta2() {
    System.out.println(
        "---------------------------------------------------------------\nAlanis tenta abrir a porta do terreo mas ela força e não consegue, ela olha para a porta que estava fechada no terreo e ve o homem que estava lhe perseguindo tentando abrir a porta ela fica desesperada, é melhor não tentar denovo até ter uma solução\n---------------------------------------------------------------");
    a = a + 1;
  }

  public static void fimDeJogo1() {
    System.out.println(
        "——————————————————————————————\nAlanis resolve pular da janela e acaba sofrendo um traumatismo craniano e finaliza sua jornada........... morrendo FIM!!\n——————————————————————————————");
    fimdejogo = false;
  }

  public static void fimDeJogo2() {
    System.out.println(
        "——————————————————————————————\nComo força do hábito a detetive tenta sacar sua arma, mas ela estava com a roupa do hospital, o homem da foto logo percebe e parte pra cima dela e aplica e seringa enquanto ela se contorce tentando fugir.......... FIM\n——————————————————————————————");
  }

  public static void fimDeJogo3() {
    System.out.println(
        "——————————————————————————————\nAlanis tenta abrir a porta novamente e sem sucesso, o homem tenta abrir a porta da escada de emergencia e tem sucesso, pega a seringa que estava em seu bolso e injeta na Alanis e .......... FIM\n——————————————————————————————");
  }

  public static void fimDeJogoCerto1() {
    System.out.println(
        "——————————————————————————————\nQuando Alanis consegue finalmente abrir a porta e sair, ela sai correndo em direção a rua, mas uma viatura que parecia estar chegando no hospital a atropela. De repente a detetive acorda na mesma maca do hospital que ela havia acordado anteriormente, mas dessa vez tudo parecia normal e tudo isso não passou de um pesadelo, e o homem o qual a perseguia era o mesmo homem que havia atirado em Alanis anteriormente.......... FIM\n——————————————————————————————");
    fimdejogo = false;
  }

  public static void debaixoCama() {
    System.out.println("---------------------------------------------------------------\nEla apenas encontra um suporte de soro quebrado deseja pegar o suporte?\n---------------------------------------------------------------");
    System.out.println("⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nSe sim digite (1), se não digite (2)\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿");
  }

  public static void escolhaRecepcao() {
    System.out.println(
        "---------------------------------------------------------------\nNa recepção há apenas corpos jogados no chão, um machado pra emergência e um telefone.\n---------------------------------------------------------------\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nTentar usar o Telefone Digite (1) \nIr até o Machado Digite (2)\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿ ");
  }
    public static void olharRecepcao() {
    System.out.println(
        "---------------------------------------------------------------\nDeseja pegar o machado?\n---------------------------------------------------------------\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nSe sim digite (1) \nSe não digite (2)\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿ ");
  }
  public static void corredor1(){
    int decisao, corredorAtual = 1;
    if(corredorAtual == corredorHomem){
      intro5();
      fimdejogo = false;
    }else{
      System.out.println("Você está no corredor " + corredorAtual );
    System.out.println("Para onde você deseja ir?");
    System.out.println("1 - Para a esquerda");
    System.out.println("2 - Para a direita");
    System.out.println("3 - Para o centro");
    System.out.println("9 - Para voltar ao inicio");
    
    decisao = entrada.nextInt();
    switch(decisao){
      case 1:
        corredor2();
        break;
      case 2:
        corredor4();
        break;
      case 3:
        corredor3();
        break;
      case 9:
        retornofase1_2();
        break;
          default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void corredor2(){
    int decisao, corredorAtual = 2;
    if(corredorAtual == corredorHomem){
      intro5();
      fimdejogo = false;
    }else{
      System.out.println("Você está no corredor " + corredorAtual );
    System.out.println("Para onde você deseja ir?");
    System.out.println("1 - Para a esquerda");
    System.out.println("2 - Para a direita");
    System.out.println("3 - Voltar");
    System.out.println("9 - Para voltar ao inicio");
    decisao = entrada.nextInt();
    switch(decisao){
      case 1:
        corredor5();
        break;
      case 2:
        corredor3();
        break;
      case 3:
        corredor1();
        break;
        case 9:
        retornofase1_2();
        break;
          default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void corredor3(){
    int decisao, corredorAtual = 3;
    if(corredorAtual == corredorHomem){
      intro5();
      fimdejogo = false;
    }else{
      System.out.println("Você está no corredor " + corredorAtual );
    System.out.println("Para onde você deseja ir?");
    System.out.println("1 - Para a esquerda");
    System.out.println("2 - Para a direita");
    System.out.println("3 - Para o centro");
    System.out.println("9 - Para voltar ao inicio");
    decisao = entrada.nextInt();
    switch(decisao){
      case 1:
        corredor7();
        break;
      case 2:
        corredor8();
        break;
      case 3:
        corredor9();
        break;
      case 9:
        retornofase1_2();
        break;
          default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void corredor4(){
    int decisao, corredorAtual = 4;
    if(corredorAtual == corredorHomem){
      intro5();
      fimdejogo = false;
    }else{
      System.out.println("Você está no corredor " + corredorAtual );
    System.out.println("Para onde você deseja ir?");
    System.out.println("1 - Para a esquerda");
    System.out.println("2 - Para a direita");
    System.out.println("3 - Voltar");
    System.out.println("9 - Para voltar ao inicio");
    decisao = entrada.nextInt();
    switch(decisao){
      case 1:
        corredor3();
        break;
      case 2:
        corredor6();
        break;
      case 3:
        corredor1();
        break;
      case 9:
        retornofase1_2();
        break;
          default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void corredor5(){
    int decisao,corredorAtual = 5;
    if(corredorAtual == corredorHomem){
      intro5();
      fimdejogo = false;
    }else{
    System.out.println("Você está no corredor " + corredorAtual );
    System.out.println("Para onde você deseja ir?");
    System.out.println("1 - Para a centro");
    System.out.println("2 - Para a direita");
    System.out.println("3 - Voltar");
    System.out.println("9 - Para voltar ao inicio");
    decisao = entrada.nextInt();
    switch(decisao){
      case 1:
        corredor10();
        break;
      case 2:
        corredor7();
        break;
      case 3:
        corredor2();
        break;
      case 9:
        retornofase1_2();
        break;
          default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void corredor6(){
    int decisao, corredorAtual = 6;
    if(corredorAtual == corredorHomem){
      intro5();
      fimdejogo = false;
    }else{
      System.out.println("Você está no corredor " + corredorAtual );
    System.out.println("Para onde você deseja ir?");
    System.out.println("1 - Para a esquerda");
    System.out.println("2 - Para o centro");
    System.out.println("3 - Para atrás");
    System.out.println("9 - Para voltar ao inicio");
    decisao = entrada.nextInt();
    switch(decisao){
      case 1:
        corredor8();
        break;
      case 2:
        corredor11();
        break;
      case 3:
        corredor4();
        break;
      case 9:
        retornofase1_2();
        break;
          default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void corredor7(){
    int decisao, corredorAtual = 7;
    if(corredorAtual == corredorHomem){
      intro5();
      fimdejogo = false;
    }else{
      System.out.println("Você está no corredor " + corredorAtual );
    System.out.println("Para onde você deseja ir?");
    System.out.println("1 - Para a esquerda");
    System.out.println("2 - Para a direita");
    System.out.println("3 - Para trás");
    System.out.println("9 - Para voltar ao inicio");
    decisao = entrada.nextInt();
    switch(decisao){
      case 1:
        corredor10();
        break;
      case 2:
        corredor9();
        break;
      case 3:
        corredor5();
        break;
      case 9:
        retornofase1_2();
        break;
          default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void corredor8(){
    int decisao, corredorAtual = 8;
    if(corredorAtual == corredorHomem){
      intro5();
      fimdejogo = false;
    }else{
      System.out.println("Você está no corredor " + corredorAtual );
    System.out.println("Para onde você deseja ir?");
    System.out.println("1 - Para a esquerda");
    System.out.println("2 - Para a direita");
    System.out.println("3 - Para o centro");
    System.out.println("9 - Para voltar ao inicio");
    decisao = entrada.nextInt();
    switch(decisao){
      case 1:
        corredor9();
        break;
      case 2:
        corredor11();
        break;
      case 3:
        corredor9();
        break;
      case 9:
        retornofase1_2();
        break;
          default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void corredor9(){
    int decisao, corredorAtual = 9;
    if(corredorAtual == corredorHomem){
      intro5();
      fimdejogo = false;
    }else{
      System.out.println("Você está no corredor " + corredorAtual );
    System.out.println("Para onde você deseja ir?");
    System.out.println("1 - Para a esquerda");
    System.out.println("2 - Para a direita");
    System.out.println("3 - Para o centro");
    System.out.println("9 - Para voltar ao inicio");
    decisao = entrada.nextInt();
    switch(decisao){
      case 1:
        corredor12();
        break;
      case 2:
        corredor13();
        break;
      case 3:
        corredor7();
        break;
      case 9:
        retornofase1_2();
        break;
          default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void corredor10(){
    int decisao, corredorAtual = 10;
    if(corredorAtual == corredorHomem){
      intro5();
      fimdejogo = false;
    }else{
      System.out.println("Você está no corredor " + corredorAtual );
    System.out.println("Para onde você deseja ir?");
    System.out.println("1 - Para trás");
    System.out.println("2 - Para a direita");
    System.out.println("3 - Para o centro");
    System.out.println("9 - Para voltar ao inicio");
    decisao = entrada.nextInt();
    switch(decisao){
      case 1:
        corredor5();
        break;
      case 2:
        corredor12();
        break;
      case 3:
        corredor7();
        break;
      case 9:
        retornofase1_2();
        break;
          default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void corredor11(){
    int decisao, corredorAtual = 11;
    if(corredorAtual == corredorHomem){
      intro5();
      fimdejogo = false;
    }else{
      System.out.println("Você está no corredor " + corredorAtual );
    System.out.println("Para onde você deseja ir?");
    System.out.println("1 - Para a esquerda");
    System.out.println("2 - Para o centro");
    System.out.println("3 - Para trás");
    System.out.println("9 - Para voltar ao inicio");
    decisao = entrada.nextInt();
    switch(decisao){
      case 1:
        corredor13();
        break;
      case 2:
        corredor8();
        break;
      case 3:
        corredor6();
        break;
      case 9:
        retornofase1_2();
        break;
          default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void corredor12(){
    int decisao, corredorAtual = 12;
    if(corredorAtual == corredorHomem){
      intro5();
      fimdejogo = false;
    }else{
      System.out.println("Você está no corredor " + corredorAtual );
    System.out.println("Para onde você deseja ir?");
    System.out.println("1 - Para a esquerda");
    System.out.println("2 - Para a direita");
    System.out.println("3 - Para o centro");
    System.out.println("9 - Para voltar ao inicio");
    decisao = entrada.nextInt();
    switch(decisao){
      case 1:
        corredor10();
        break;
      case 2:
        corredor13();
        break;
      case 3:
        corredor9();
        break;
      case 9:
        retornofase1_2();
        break;
          default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void corredor13(){
    int decisao, corredorAtual = 13;
    if(corredorAtual == corredorHomem){
      intro5();
      fimdejogo = false;
    }else{
      System.out.println("Você está no corredor " + corredorAtual );
    System.out.println("Para onde você deseja ir?");
    System.out.println("1 - Para a esquerda");
    System.out.println("2 - Para a direita");
    System.out.println("3 - Para o centro");
    System.out.println("9 - Para voltar ao inicio");
    decisao = entrada.nextInt();
    switch(decisao){
      case 1:
        corredor12();
        break;
      case 2:
        corredor10();
        break;
      case 3:
        corredor9();
        break;
        case 9:
        retornofase1_2();
        break;
          default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void salaSeguranca(){
    corredorHomem = random.nextInt(13);
    if(entrou1){
      System.out.println("Alanis entrou na sala de segurança e observa as cameras e ve o homem no corredor " + corredorHomem);
    }else{
      System.out.println("O homem esta atualmente no corredor " + corredorHomem );
    }
    entrou1 = false;
  }

  public static void fase0_1() {
    inventario[0] = null;
    inventario[1] = null;
    inventario[2] = null;
    fimdejogo = true;
    int decisao, cama;
    itemFase = "Suporte de soro";
    intro();
    while (fimdejogo) {
      System.out.println("\nO que deseja fazer?");
      System.out.println("1 - Abrir a porta");
      System.out.println("2 - Ler o prontuário");
      System.out.println("3 - Olhar pela Janela");
      System.out.println("4 - Olhar debaixo da cama ");
      System.out.println("5 - Olhar a gaveta");
      System.out.println("6 - Verificar inventario");
      decisao = entrada.nextInt();
      switch (decisao) {
        case 1:
          porta1();
          break;
        case 2:
          pront();
          break;
        case 3:
          olharJanela();
          break;
        case 4:
          if (portaUTI) {
            debaixoCama();
            cama = entrada.nextInt();
            if (cama == 1) {
              invItem1();

            } else {

            }
          } else {
            System.out.println("Alanis olha a cama novamente mas não tem mais nada");
          }

          break;
        case 5:
          System.out.println("Ela apenas encontra seu antigo distintivo. mas está quebrado.");
          break;
        case 6:
          olharInv();
          break;
        default:
          System.out.println("Comando Invalido, tente novamente");
          break;
      }
    }

  }

  public static void fase2_2() {
    intro2();
    int number = random.nextInt(10);
    System.out.println(number);
    if (number >= 3) {
      System.out.println(
          " Logo ela parte para cima dele e tenta acerta-lo no queixo. Mas ele consegue desviar e cai no chão, então Alanis sai correndo para fora da sala de segurança.");
      fase3_2();
    } else {
      fimDeJogo2();
    }
    
  }

  public static void fase3_2() {
    fimdejogo = true;
    itemFase = "Machado";
    int decisao = 0, e = 0;
    intro3();
    while (fimdejogo) {
      System.out.println("\nO que deseja fazer?");
      System.out.println("1 - Tentar abrir a porta da saida");
      System.out.println("2 - Olhar a recepção");
      System.out.println("3 - Entrar no elevador");
      if (portaRecepcao) {
        System.out.println("4 - Derrubar a estante na porta");
      }
      System.out.println("5 - Verificar Inventario");
      decisao = entrada.nextInt();
      switch (decisao) {
        case 1:

          if (a < 3) {
            porta2();
          } else if (a > 3) {
            fimDeJogo3();
            fimdejogo = false;
          } else {
            usarInv();
            fimDeJogoCerto1();
          }
          break;
        case 2:
          escolhaRecepcao();
          t = entrada.nextInt();
            if(t == 1){
          BibliotecaL.fase3_1();
            }
            else{
          olharRecepcao();
          e = entrada.nextInt();
            }
          if (e == 1) {
            invItem3();
            a = 3;
          } else {
            System.out.println("Você voltou para o centro do terreo");
          }
          break;
        case 3:
          System.out.println(
              "Ela tenta usar o elevador mas não esta funcionando, o homem que esta perseguindo Alanis esta chegando mais perto ");
          a = a + 1;
          break;

        case 4:
          System.out.println("Você derrubou a estante na porta da escada de emergencia ");
          portaRecepcao = false;
          a = a - 1;
          break;
        case 5:
          olharInv();
          break;
        default:
          System.out.println("Comando Inexistente");

      }
    }
  }

  public static void fase1_2() {
    /*
     * Fazer um sistema de busca em corredor para achar o homem e dar o fim de jogo
     */
    fimdejogo = true;
    int decisao;
    intro4();
    while(fimdejogo){
    System.out.println("O que deseja fazer agora");
    System.out.println("1 - Seguir o Homem");
    System.out.println("2 - Entrar na sala de segurança");
    System.out.println("3 - Verificar inventario");
    decisao = entrada.nextInt();
    switch (decisao) {
      case 1:
        corredor1();
        break;
      case 2:
        salaSeguranca();
        break;
      case 3:
        olharInv();
        break;
      default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }
  public static void retornofase1_2(){
    int decisao;
    while(fimdejogo){
    System.out.println("O que deseja fazer agora");
    System.out.println("1 - Seguir o Homem");
    System.out.println("2 - Entrar na sala de segurança");
    System.out.println("3 - Verificar inventario");
    decisao = entrada.nextInt();
    switch (decisao) {
      case 1:
        corredor1();
        break;
      case 2:
        salaSeguranca();
        break;
      case 3:
        olharInv();
        break;
      default:
        System.out.println("Comando Invalido");
        break;
    }
    }
  }

}