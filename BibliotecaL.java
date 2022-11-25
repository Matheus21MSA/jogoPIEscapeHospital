import java.util.Scanner;
import java.util.Random;
    class BibliotecaL{
    static Random random = new Random();
    static Scanner entrada = new Scanner(System.in);  
    static String virar;
     public static void sombra(){
      
       System.out.println ("---------------------------------------------------------------\nAo sair do leito Alanis se vira rapidamente para a direita e tenta alcançar a sombra que tinha a silhueta de um homem, mas ele já havia desaparecido, quando ela olha a janela para fora do hospital, tudo que ela vê é uma escuridão imensa e sem sinal de pessoas. Alanis continua andando e seguindo em frente, quando ela avista uma luz acesa, sua curiosidade é imensa e ela segue a luz. Há uma pessoa deitada no sofá de espera, ela descobre, olhando o crachá, que essa pessoa é um segurança do local, ele está desacordado com um bilhete escrito à mão em um guardanapo um pouco rasgado ao lado de seu corpo\n---------------------------------------------------------------\n");
    }
    
    
    public static void fase0_2(){ 
      BibliotecaL.sombra();
       int menu = 0;
      while(menu!=1){
      
      
      Scanner entradarecado = new Scanner(System.in);
      int recado = 0;
      int escolha = 1;
      
    
    
          System.out.println ("⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nO que deseja fazer com o Bilhete? Digite:");
          System.out.println ("  1: para Ler");
          System.out.println ("  2: para Jogar o Bilhete Fora\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n");
        escolha = entradarecado.nextInt();
      
          
       switch (escolha){
        case 1:
              System.out.println("---------------------------------------------------------------\nO bilhete está meio rasurado e Alanis não consegue ler..\n---------------------------------------------------------------\n");
         
         System.out.println ("⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nProcure algum objeto na sala que ajude na leitura \nDigite: 0 para procurar\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n");
        Scanner entradabilhete = new Scanner(System.in); 
        int bilhete = 0;
        bilhete = entradabilhete.nextInt();
       
      System.out.println("⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n1- Olhar a gaveta do armario próximo ao sofá");
      System.out.println("2- Olhar nos bolsos da pessoa\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n");
        
      Scanner procurar = new Scanner(System.in); 
      int gaveta = 1;
      int bolso = 2;
      gaveta= procurar.nextInt();  
     
            
     if(gaveta == 1){
          System.out.println ("Você encontrou uma lupa na gaveta, \n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nDigite: (Usar) para tentar ler novamente\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n");
       Scanner acao = new Scanner(System.in);
        String Usar;
        Usar = acao.next();
      System.out.println("---------------------------------------------------------------\n O bilhete diz:  Vá imediatamente para a sala de segurança, mas tome cuidado com…\n---------------------------------------------------------------\n");
      System.out.println ("---------------------------------------------------------------\nA detetive segue em direção a sala de segurança do hospital, quando chega lá, tudo parece estar em seu devido lugar, a não ser uma foto. A foto do rosto de um homem que ela jamais havia visto em toda sua vida. Ele tem cabelos extremamente escuros e os olhos manchados com olheiras. O som de passos anuncia que alguém está se aproximando, ela se assusta.\n---------------------------------------------------------------\n");
       
        System.out.println("⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nTecle (Enter) para guardar o bilhete\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n");
        Scanner tecla = new Scanner(System.in);
        String enter;
        enter= tecla.nextLine();
       
        System.out.println("---------------------------------------------------------------\nAlanis guarda o bilhete no inventário para utilizar como prova dos rastros do assassino.\n---------------------------------------------------------------\n");
        
        System.out.println("---------------------------------------------------------------\nAlanis sai da sala de segurança e entra no banheiro masculino, mas antes olha rapidamente para quem se aproxima. Um homem de cabeça baixa com fones de ouvido no último volume, cabelos escuros como os da foto e com o corpo igual ao da silhueta que ela havia tentado seguir. Após aproximadamente meia hora, o homem sai da mesma forma que entrou. Alanis, curiosa entra novamente na sala e todos os computadores estão ligados nas câmeras de segurança  “Ele sabe que eu estou aqui!” “Mas quem é esse homem? E porque só tem ele nesse hospital\n---------------------------------------------------------------\n");
         System.out.println(""); //pularlinha
       System.out.println("⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nPara minimizar a janela de cameras que está aberta na tela do computador tecle (Enter)\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n");
           Scanner minimizar = new Scanner(System.in);
           String resposta;
           resposta = minimizar.nextLine();
       
       System.out.println("---------------------------------------------------------------\nAo acessar o computador, a detetive se depara com a foto de uma garotinha e um único documento salvo no computador. O arquivo é um texto que dizia: ");
        System.out.println(""); //pularlinha
     // fim do jogo
       System.out.println("--------------------------------------------------------------\n ⌜⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌝\n “Hoje é dia 08/05/2045,\n às 7:32 da manhã.\n Me chamo David e estou prestes\n a cometer a maior loucura da minha vida.\n Não me deram a oportunidade\n de trabalhar em um lugar harmonioso,\n me chamavam de todos os xingamentos possíveis,\n provavelmente porque eu era um homem\n que trabalhava como faxineiro do hospital,\n mas eu era obrigado a continuar\n pois minha filha precisava daquele transplante,\n e eles não a deram a oportunidade\n para sobreviver, com isso, nenhum desses merecem viver…”\n⌞⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⌟\n");
       menu = 1;
       Biblioteca.fase2_2();
       
         
       // fim do jogo

          
        }else{
       Scanner enter = new Scanner(System.in);
       String resposta;
      
       
       System.out.println ("--------------------------------------------------------------\nNo bolso da pessoa desacordada há apenas um papel com numeros aleatórios\n--------------------------------------------------------------\n");
              System.out.println("⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nTecle (Enter) para guardar papel no inventário\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n");
              enter.nextLine();
              System.out.println (" Papel guardado no inventário");
              System.out.println (""); //PULARLINHA
       
       }
             
            break;
      
            case 2:
            
            System.out.println("--------------------------------------------------------------\nAlanis joga o papel no lixo e nunca saberá se era uma dica importante\n--------------------------------------------------------------\n"); 
           menu = 1;
          Biblioteca.fase1_2(); 
            break;
           
             }}
    } 
      

      public static void fase3_1(){
       
       Scanner telefone = new Scanner(System.in);
       int numero;
        System.out.println("-------------------------------------------------------------=");
       System.out.println("\nA detetive corre até a recepção e encontra um telefone\n--------------------------------------------------------------");
       System.out.println("\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nDigite 911 para ligar para a emergência 📞\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n");
       numero = telefone.nextInt();
       System.out.println("--------------------------------------------------------------\nAo tentar discar um número de telefone o silêncio da linha toma seu ouvido, e Alanis percebe que o telefone não está funcionando..--------------------------------------------------------------");
       System.out.println("\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nTecle (Enter) para virar para um dos lados para procurar um outro telefone na recepção\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n");
       
      virar = entrada.nextLine();
      int lado = random.nextInt(2);
      if(lado == 1){
      System.out.println("--------------------------------------------------------------\nNão há nada ao redor,apenas arquivos de outros pacientes.\n--------------------------------------------------------------");
        
      System.out.println("⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\nTecle (Enter) para continuar andando\n⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n");
      String andar;
      andar= entrada.nextLine();
    }
       else{
      System.out.println("-----------------------------------------------\nAlanis vê apenas portas trancadas a seu redor");
  }}
    }