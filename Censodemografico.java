package Listaexercicios;

import java.util.Scanner;

class exerciciocensodemografico
{

public static void main (String[] args)
{
        @SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);

        @SuppressWarnings("unused")
		int // utilizo int para os numeros inteiros
		quantidadetotalpessoas = 0,// utilizo int para os numeros inteiros
		feminino = 0,
		masculino = 0,
		outros = 0,
		genero = 0,
		idadefeminino = 0,
		idademasculino = 0,
		idadeoutros = 0,
		totalidadefeminino = 0,
		totalidademasculino = 0,
		totalidadeoutros = 0,
		mediaidadefeminino = 0,
		mediaidademasculino = 0,
		mediaidadeoutros = 0,
		mediaidadegrupo = 0;
       
    
		int pesquisa = 0;
        //Realizara a estrutura de repeticao " o laco"
        
        
        
         @SuppressWarnings("unused")
		float  // utilizo o float por ser numeros fracionados como altura 
		porcentagemtotalpessoas = 0,
		alturafeminino = 0,
		alturamasculino = 0,
		alturaoutros = 0,
		totalalturafeminino = 0,
		totalalturamasculino = 0,
		totalalturaoutros = 0,
		mediaalturafeminino = 0,
		mediaalturamasculino = 0,
		mediaalturaoutros = 0;
        
    
        {
        
        }
           
            //contagens das respostas
            pesquisa++;
           

            System.out.print(" ----- PESQUISA -----");
            System.out.print("Qual genero voce se identifica?");
            System.out.print("Digite uma das opcoes abaixo:");
            System.out.print("(0) Feminino");
            System.out.print("(1) Masculino");
            System.out.print("(2) outro genero");
            System.out.print("---------------------");

            genero = ler.nextInt(); //ler a variavel
           

            switch(genero) //utilizo o switch como a pessoa vai poder realizar a escolha com o "porteiro" para responder as perguntas
         
            {
            case 0:

                feminino++; //adiciona a quantidade de pessoas que escolheram essa resposta
               
                System.out.print ("Qual sua Idade ?:\n");
                idadefeminino=ler.nextInt();
                if (idadefeminino>=18 && idadefeminino <=35) // se for maior ou igual a 18 e menor ou igual a 35
                
                {

                    quantidadetotalpessoas++; //variavel para sabermos qual é a media do grupo feminino
                   
                }
                totalidadefeminino=totalidadefeminino+idadefeminino;
                mediaidadefeminino=totalidadefeminino/feminino;
                
                System.out.print ("Mulheres, qual sua altura ?:\n");
                alturafeminino=ler.nextFloat(); // vai ler a resposta do usuario para fazer os calculos
              
                totalalturafeminino=totalalturafeminino+alturafeminino;// realizamos a soma primeiro
                mediaalturafeminino=totalalturafeminino/feminino; // depois com o resultado da soma dividimos com o feminino
                
                break; //fim dessa case e pula para a proxima
                
                
            case 1:
                masculino++;
                
                System.out.print ("Qual é a sua idade? \n");
                idademasculino=ler.nextInt();
                if (idademasculino>=18 && idademasculino <=35) 
                {
                    quantidadetotalpessoas++; //variavel para sabermos qual é a media do grupo masculino
                    
                }
                totalidademasculino=totalidademasculino+idademasculino;
                mediaidademasculino=totalidademasculino/masculino;
               
                System.out.print ("Informe sua altura(m):\n");
                alturamasculino=ler.nextFloat();
                
                totalalturamasculino=totalalturamasculino+alturamasculino;
                mediaalturamasculino=totalalturamasculino/masculino;
                
                break;
                
            case 2:
                outros++;
               
                System.out.print ("Qual é a sua idade?\n"); 
                idadeoutros=ler.nextInt();
           if (idadeoutros>=18 && idadeoutros <=35)
              
                {
                    quantidadetotalpessoas++; //variavel para sabermos qual é a media do grupo de outros
                    
                }
                totalidadeoutros=totalidadeoutros+idadeoutros;
                mediaidadeoutros=totalidadeoutros/outros;
                
                System.out.print ("Informe sua altura(m):\n");
                alturaoutros=ler.nextFloat();
              
                totalalturaoutros=totalalturaoutros+alturaoutros;
                mediaalturaoutros=totalalturaoutros/outros;
              
                break;
                

            
            }	 
         while(pesquisa<1000);  // Enquanto a variavel i for menor que 1000 vai realizar o loop para contagem de pessoas que fizeram a pesquisa

        porcentagemtotalpessoas=(quantidadetotalpessoas*100)/(feminino+masculino+outros);
        //Logo o total de quantidade adulto multiplicado por 100 para saber a porcentagem, dividido pelo  feminino + masculino + outros

        mediaidadegrupo = (totalidademasculino+totalidadefeminino+totalidadeoutros)/(masculino+feminino+outros);
        // para saber a media ,fazemos a soma do total do masculino,feminino e outros , com o resultado dividimos pelo grupo feminino,masculino e outros.
       
        System.out.print("-----  RESULTADO DA PESQUISA -----");
        System.out.print("A media de idade do grupo é :" + mediaidadegrupo+"" );
        System.out.print("A media das alturas das mulheres é :" + mediaalturafeminino+"" );
        System.out.print("A media de idade dos homens é :" + mediaidademasculino+"" );
        System.out.print("A quantidade de pessoas que se identificam como outros:" + outros+"" );
        System.out.print("Porcentagem de pessoas entre 18 a 35 anos :" + porcentagemtotalpessoas+"%" );
        System.out.print("----- FIM DA PESQUISA -----" );
    } 
}    
