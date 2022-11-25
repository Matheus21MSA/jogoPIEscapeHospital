import java.util.Random;
import java.util.Scanner;
class BibliotecaK{
  static Random random = new Random();
  static Scanner entrada = new Scanner(System.in);
  static String acao, nome, ler;
  static int opcao, senha, assa, opcao2, enter, opcao3, opcao4;
  static boolean bilhete = true, fimdejogo = true;

//caminho oposto/terceiro final
  //completo
  
  public static void fase0_3(){
    System.out.println("---------------------------------------------------------------\nCom medo, a detetive se vira e segue a direção oposta à sombra. Caminha até o final do corredor e vira à direita, quando encontra dois médicos caídos no chão, a detetive verifica os pulsos mas infelizmente estavam mortos e sem ferimentos\n\n- O que está acontecendo aqui! Quem matou eles?.\n Ao lado dos corpos, Alanis encontra um papel quase todo rabiscado e parecia ser feito as pressas, sendo possível ler apenas algumas palavras:\n---------------------------------------------------------------\nPressione (Enter) para ler!");
    
      ler = entrada.nextLine();
    
    System.out.println("\n ⌜⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌝\n “Hoje é dia 08/05/2045,\n às 7:32 da manhã. ░░░░░░░░░░░░\n e estou prestes a cometer a maior\n loucura da minha vida.\n Não me deram a oportunidade de trabalhar\n em um lugar harmonioso,\n ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░,\n provavelmente porque ░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░ do hospital,\n mas eu era obrigado a continuar\n pois░░░░░░░░░░░░░░░░░░░░░░░░░░░░,\n ░░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░, com isso,\n nenhum desses merecem viver…”\n⌞⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌟\n\n");

    System.out.println("---------------------------------------------------------------\nConfusa, Alanis segue até o final do corredor e se depara com escadas, cuidadosamente ela desce até o térreo, onde encontra um corredor com luzes falhando.\n---------------------------------------------------------------");

    System.out.println("\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nPressione (Enter) para que Alanis escolha entre:\n Correr pelo corredor ou seguir cuidadosamente.\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿");
    
    acao = entrada.nextLine();
      int number = random.nextInt(2);
                            if(number == 1){
                                System.out.println("---------------------------------------------------------------\nUsando a parede como apoio Alanis segue até a recepção que estava em completo silêncio, só se ouvia som de passos que ecoavam de parede em parede. Ao olhar para frente estava a porta que dava acesso ao lado de fora do hospital.\n---------------------------------------------------------------");
                              fase1_3();
                            }
                            else{
                                System.out.println("---------------------------------------------------------------\nCorrendo desesperada e levemente tonta, Alanis escorrega no chão liso e molhado, ferindo levemente seu braço esquerdo. Segue até a recepção que estava em completo silêncio, só se ouvia som de passos que ecoavam de parede em parede. Ao olhar para frente estava a porta que dava acesso ao lado de fora do hospital.\n---------------------------------------------------------------");
                              fase1_3();
      }
    }

//escolha saída/passos
  //completo
  public static void fase1_3(){
    
while(fimdejogo){      System.out.println("\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n              Deseja:\n\n (1 - Seguir até a saída)\n (2 - Seguir o som dos passos)\n (3 - Verificar Inventario)\n\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿");
    
    opcao = entrada.nextInt();
    switch(opcao){
      case 1:
        BibliotecaK.fase2_3();
        fimdejogo = false;
          break;
 
      case 2:
        BibliotecaK.fase3_3();
        fimdejogo = false;
          break;
      case 3:
        Biblioteca.olharInv();
          break;
    }
    }
  }

//caminho saída
  //completo
  public static void fase2_3(){
    
        System.out.println("---------------------------------------------------------------\nAlanis segue até a porta de saída, quando tenta abrir, a fechadura estava trancada. Não obtendo nenhum sucesso, a detetive decide tentar descobrir quem ou o que estava matando essas pessoas. Após caminhar novamente até a recepção ela procura por algo que possa ajuda-la, as únicas coisas que haviam em cima das mesas eram os computadores que não ligavam e um celular aberto em uma conversa ameaçadora que dizia:\n---------------------------------------------------------------\n  ⌜⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌝\n                   -É bom você dar um\n                   jeito de conseguir essa cirurgia,\n                   Doutora Míriam,\n                   ou todos saberão do seu segredinho!\n\n\n\n -Ninguém acreditaria numa pessoa\n como você! é bom tomar\n cuidado como fala comigo,\n se depender de mim,\n você e todos,\n somem desse hospital ainda hoje!\n\n\n⌞⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌟ ."); 
    
        System.out.println("---------------------------------------------------------------\nEntão Alanis decide ir pelo corredor que tinha à sua esquerda, ao caminhar até o final do corredor onde haviam apenas salas trancadas ao seu redor. Logo a frente virando a esquerda novamente ela encontra uma pessoa caída aparentemente sem vida ao lado de um bebedouro, quando a detetive vira o corpo era um homem usando um crachá escrito “Segurança Kevin”.E no bolso dele havia um papel com os seguintes números:(2486).\n\nAlanis se encontra entre a Sala de Segurança e a Sala da Limpeza.\n---------------------------------------------------------------\n ");
    Biblioteca.invItem2();
    bilhete = false;
    BibliotecaK.salas();
  }

//salas
  //completo
  public static void salas(){
    fimdejogo = true;
    while(fimdejogo){
    Biblioteca.itemFase = "Bilhete";
        System.out.println("\nDeseja:\n(1 - Entrar na Sala de Segurança.)\n(2 - Entrar na Sala da Limpeza.)\n(3 - Usar item do Inventario.)");
      opcao2 = entrada.nextInt();
        switch(opcao2){
          case 1:
            BibliotecaK.fase1_2_3();
              break;

          case 2:
            BibliotecaK.fase2_2_3();
              break;
          case 3:
              Biblioteca.usarInv();
              if(Biblioteca.itemCerto){
                
              }else{
                System.out.println("A senha é 2486");
              }
            break;
        }
          }
        }
      
    

//caminho sala de segurança
  public static void fase1_2_3(){     
            System.out.println("\nAlanis decide entrar na Sala de Segurança.\n---------------------------------------------------------------\nEntrando na sala de segurança, procurando alguma pista, Alanis encontra um computador ligado mas bloqueado pela senha.\n---------------------------------------------------------------");
    
        System.out.println("▶ Digite a senha: ◀");
        senha = entrada.nextInt();
          if(senha == 2486){
            System.out.println("---------------------------------------------------------------\nAcesso Autorizado!\n\n Ao acessar o computador, a detetive se depara com os arquivos dos pacientes, e na lixeira um email do faxineiro dizendo sobre algum transplante. Procurando mais, Alanis acha um chat do segurança chamado Bob, aberto com a seguinte mensagem:\n---------------------------------------------------------------\n⌜⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌝\n                 -Tem certeza de que não vão descobrir\n                 nosso caso Dra. Míriam?!\n\n\n -Claro que tenho Bob,\n estou cansada desse hospital,\n e sei que você também está.\n\n\n                 -Sim, e deviamos fazer algo contra...∠✕∪✕✕..∠✕∪✕✕∠✕∪✕✕........\n\n\n\n⌞⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌟ .");
            System.out.println("---------------------------------------------------------------\nO computador desliga, e de repente ela escuta alguém andando às pressas por perto.\n  Sem muitas opções a detetive decide seguir cautelosamente o som dos passos. No caminho ela encontra um extintor de incêndio pendurado na parede, ela o alcança, olhando pela fresta da parede era um homem de cabelos preto, usando uniforme e segurando uma garrafa com um líquido marrom. Ele abre a fechadura de uma porta e entra. Alanis se pergunta quem é o misterioso assassino.\n---------------------------------------------------------------\n");

            System.out.println("⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nQuem você acha que é o assassino?\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n");
            System.out.println(" 1 - Dra. Míriam.\n 2 - Segurança Bob.\n 3 - Faxineiro.");
            assa = entrada.nextInt();
            switch(assa){
              case 1:
                System.out.println("---------------------------------------------------------------\nApós alguns minutos a detetive entra pela mesma porta apontando o extintor para o suspeito dentro da sala, mas o homem estava sentado em uma cadeira preta, imóvel, com um copo de líquido Marrom em sua mão, provavelmente morto, usando uma roupa de faxineiro com diversas garrafas espalhadas por cima da mesa. Ao lado de sua mão havia um papel escrito:\n---------------------------------------------------------------\n ⌜⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌝\n “Hoje é dia 08/05/2045,\n às 7:32 da manhã.\n Me chamo David e estou prestes\n a cometer a maior loucura da minha vida.\n Não me deram a oportunidade\n de trabalhar em um lugar harmonioso,\n me chamavam de todos os xingamentos possíveis,\n provavelmente porque eu era um homem\n que trabalhava como faxineiro do hospital,\n mas eu era obrigado a continuar\n pois minha filha precisava daquele transplante,\n e eles não a deram a oportunidade\n para sobreviver, com isso, nenhum desses merecem viver…”\n⌞⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌟\n\n---------------------------------------------------------------\nAlanis se espanta com a revelação do assassino, por achar que a Dra Miriam fosse a verdadeira criminosa.\n---------------------------------------------------------------\n");
                fimdejogo = false;
                fimdejogo();
                break;
              case 2:
                System.out.println("---------------------------------------------------------------\nApós alguns minutos a detetive entra pela mesma porta apontando o extintor para o suspeito dentro da sala, mas o homem estava sentado em uma cadeira preta, imóvel, com um copo de líquido Marrom em sua mão, provavelmente morto, usando uma roupa de faxineiro com diversas garrafas espalhadas por cima da mesa. Ao lado de sua mão havia um papel escrito:\n---------------------------------------------------------------\n ⌜⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌝\n “Hoje é dia 08/05/2045,\n às 7:32 da manhã.\n Me chamo David e estou prestes\n a cometer a maior loucura da minha vida.\n Não me deram a oportunidade\n de trabalhar em um lugar harmonioso,\n me chamavam de todos os xingamentos possíveis,\n provavelmente porque eu era um homem\n que trabalhava como faxineiro do hospital,\n mas eu era obrigado a continuar\n pois minha filha precisava daquele transplante,\n e eles não a deram a oportunidade\n para sobreviver, com isso, nenhum desses merecem viver…”\n⌞⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌟\n\n---------------------------------------------------------------\nAlanis se espanta com a revelação do assassino, por achar que o segurança Bob fosse o verdadeiro criminoso.\n---------------------------------------------------------------\n");
                fimdejogo = false;
                fimdejogo();
                break;
              case 3:
                System.out.println("---------------------------------------------------------------\nApós alguns minutos a detetive entra pela mesma porta apontando o extintor para o suspeito dentro da sala, mas o homem estava sentado em uma cadeira preta, imóvel, com um copo de líquido Marrom em sua mão, provavelmente morto, usando uma roupa de faxineiro com diversas garrafas espalhadas por cima da mesa. Ao lado de sua mão havia um papel escrito:\n---------------------------------------------------------------\n ⌜⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌝\n “Hoje é dia 08/05/2045,\n às 7:32 da manhã.\n Me chamo David e estou prestes\n a cometer a maior loucura da minha vida.\n Não me deram a oportunidade\n de trabalhar em um lugar harmonioso,\n me chamavam de todos os xingamentos possíveis,\n provavelmente porque eu era um homem\n que trabalhava como faxineiro do hospital,\n mas eu era obrigado a continuar\n pois minha filha precisava daquele transplante,\n e eles não a deram a oportunidade\n para sobreviver, com isso, nenhum desses merecem viver…”\n⌞⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌟\n\n---------------------------------------------------------------\nAlanis já imaginava que David fosse o assassino, tudo apontava para ele.\n---------------------------------------------------------------\n");
                fimdejogo = false;
                fimdejogo();
                break;
            }
            
          }
            
        else{
          System.out.println("Acesso Negado! Tente novamente.");
        }
    }

//caminho sala da limpeza
  //completo
  public static void fase2_2_3(){
    System.out.println("\nAlanis decide entrar na Sala da Limpeza.\n---------------------------------------------------------------\nEntrando na sala escura, procurando alguma pista, Alanis encontra um liquido estranho derramado no chão e vários cacos de vidro, como se fosse uma armadilha pra quem chegasse perto. Alanis acaba se cortando com o vidro sujo do liquido misterioso!\n---------------------------------------------------------------");

    System.out.println("Digite (1) para Alanis decidir se corre da sala ou segue cuidadosamente:");

    enter = entrada.nextInt();
      int number = random.nextInt(2);
                            if(number == 1){
                                System.out.println("---------------------------------------------------------------\nCautelosamente, Analis segue para a porta, pórem sente seu corpo enfraquecendo e aos poucos sua visão vai sumindo. A detetive se da conta que foi infectada por um tipo de veneno quando foi cortada pelo vidro.\n---------------------------------------------------------------\n\n\n---------------------------------------------------------------\nAlanis acaba morrendo devido ao veneno e seu corpo!\n---------------------------------------------------------------\n");
                              
while(opcao3 <= 3){
  System.out.println("\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n              Deseja:\n\n (1 - Voltar para a última decisão)\n (2 - Voltar ao menu do jogo)\n\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿");
                            opcao3 = entrada.nextInt();
                              switch(opcao3){
                                case 1:
                                  BibliotecaK.salas();
                                  break;

                                case 2:
                                  BibliotecaK.fase0_3();
                                  break;

                                default:
                                  System.out.println("Comando inválido");
                                }
}
                              
                            }
                            
    else{
      System.out.println("---------------------------------------------------------------\nDesesperada, Alanis corre até a porta, mas escorrega no liquido e cai em cima dos cacos de vidro. A detetive se da conta que foi infectada por um tipo de veneno quando foi cortada pelo vidro.\n---------------------------------------------------------------\n\n\n---------------------------------------------------------------\nAlanis acaba morrendo devido ao veneno e seu corpo!\n---------------------------------------------------------------\n");
     
      while(opcao4 <= 3){
  System.out.println("\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n              Deseja:\n\n (1 - Voltar para a última decisão)\n (2 - Voltar ao menu do jogo)\n\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿");
                            opcao4 = entrada.nextInt();
                              switch(opcao4){
                                case 1:
                                  BibliotecaK.salas();
                                  break;

                                case 2:
                                  BibliotecaK.fase0_3();
                                  break;

                                default:
                                  System.out.println("Comando inválido");
                                }
}
    }
                          }
  
                            

//caminho passos
  //completo
  public static void fase3_3(){
       System.out.println("---------------------------------------------------------------\nApós caminhar em direção aos passos, Alanis decide ir pelo corredor que tinha à sua esquerda, ao caminhar até o final do corredor onde haviam apenas salas trancadas ao seu redor. Logo a frente virando a esquerda novamente ela encontra uma pessoa caída aparentemente sem vida ao lado de um bebedouro, quando a detetive vira o corpo era um homem usando um crachá escrito “Segurança Kevin”.E no bolso dele havia um papel com os seguintes números:(2486).\n\nAlanis se encontra entre a Sala de Segurança e a Sala da Limpeza.\n---------------------------------------------------------------\n ");
      Biblioteca.invItem2();
      BibliotecaK.salas();
    }

//fim de jogo
  //completo
  public static void fimdejogo(){
    System.out.println("---------------------------------------------------------------\nO mistério finalmente chega ao fim, o assassino era na verdade o faxineiro que enlouqueceu por conta do que fizeram com sua filha, e resolveu se vingar da médica que recusou a cirurgia e ameaçando seu relaciomento secreto. Depois de tudo isso Alanis é resgatada por policiais e assim fechando seu estranho caso. FIM!\n---------------------------------------------------------------");

  }
  }