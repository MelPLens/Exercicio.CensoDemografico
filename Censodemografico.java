package Listaexercicios;

import java.util.Scanner;

public class exerciciocenso {

	public static void main(String[] args){
	Scanner ler = new Scanner (System.in); {
	} 
	{
    @SuppressWarnings("unused")
	int feminino,masculino,outro,idade1,idade2,altura,pesquisa;
 } 
	    System.out.println("----- PESQUISA -----");
	    System.out.println("Qual sexo se identifica de acordo com as opcoes abaixo?");
	    System.out.println("(1) FEMININO");
	    System.out.println("(2) MASCULINO");
	    System.out.println("(3) OUTRO GENERO");
	    
	    System.out.println("Qual sua idade entre 18 e 35 anos?\n"); //media da idade do grupo idade
	    int idade1 = ler.nextInt();
	    
	    System.out.println("Homens: Qual é sua idade ?\n");// media dos homens idade
	    int idade2 = ler.nextInt();
	    
	    System.out.println("Mulheres : Qual a sua altura?\n"); // media da altura das mulheres
		int altura = ler.nextInt();
	    System.out.println("----------------");
	
	    
		int media = (idade1+idade2)/3; // calcular a media das idades
	    if(media>=18) {
	    	System.out.println("A média do grupo é : %d% ");
	    } else if (media>=30) {
	    	System.out.println("A média do grupo de homens é : %d%");
	    	
	    @SuppressWarnings("unused")
		int mediaaltura = (altura)/3; // calcular a media de altura das mulheres
	    if(media>=150) {
	    	System.out.println("A média de altura das mulheres é ; %d%");
	    }
	    	
	    }
		// solicitando para o cidadao responder as perguntas 
		int pesquisa= ler.nextInt();  
		
		// Comandos para fazer a contagem das informacoes da pesquisa
		
		int feminino=0; // para saber o percentual de pessoas com a idade entre 18 e 35 anos
		int masculino=0; // para saber o percentual de pessoas com a idade entre 18 e 35 anos
		int outro=0; //percentual de pessoas que identificaram como outro
		
		 
		
		while(pesquisa>=0){ // A pesquisa devera acontecer com votos maiores que zero.
			
			if(pesquisa==1) {
		    feminino=feminino+1;
		    System.out.println("Sua resposta foi registrada");
		    }
			else if(pesquisa==2) {
			masculino= masculino+1;
			System.out.println("Sua resposta foi registrada");
			}
			else if(pesquisa==3){
			outro = outro+1;
			System.out.println("Sua resposta foi registrada");
			}
			
			else
			System.out.println("Resposta invalida, digite novamente");
	
	        if (pesquisa==1|| pesquisa==2 || pesquisa==3 || pesquisa==18 || pesquisa==19 || pesquisa==20 || pesquisa==21 || pesquisa==22 || pesquisa==23 || pesquisa==24 || pesquisa==25 || pesquisa==26 || pesquisa==27 || pesquisa==28 || pesquisa==29 || pesquisa==30 || pesquisa==31 || pesquisa==32 || pesquisa==33 || pesquisa==34 || pesquisa==35) {
	        pesquisa++;
	        }
	        
	        {
	        	System.out.println("Vote novamente");
	        	System.out.println("Digite (0) para finalizar a pesquisa");
	        	pesquisa=ler.nextInt();
	        	
	        }
	        
	        System.out.println("----- RESULTADO DA PESQUISA DO CENSO DEMOGRAFICO");
	        System.out.println("O total = "+ pesquisa + "%");
	        
	        
	        System.out.println("----- Feminino : " + pesquisa);
	        System.out.println("----- Masculino:+" + pesquisa);
	        double porcoutro = (100*outro)/pesquisa;
	        System.out.println("----- pessoas que seidentificaram como outro : " + porcoutro +"%");
		 
	        System.out.println("-----RESULTADO FINAL -----");
	        ler.close();
		}
	   
		}


	}
	
