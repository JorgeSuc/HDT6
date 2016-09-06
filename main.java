/*
Universidad del Valle de Guatemala 
Algoritmos y estructura de Datos
Jose Ramirez
Jorge Suchite 
Hoja de Trabajo 5 
fecha: septiembre 5, 2016

este es el mainichi a ver que tal 

 */
package hdt6;


import java.util.Set;
import java.util.Scanner;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        int menu = 0;
        int opcion= 0;

        sc = new Scanner (System.in);
        menu=0;
        System.out.println("Bienvenido Al mundo de Willy Wonka \n Por favor, Se le implora que usted, con su libre albedrio \n escoja la implementacion SET a utilzar: ");
        while (menu==0){
            
            
                 // variable pa guardar
                 
                System.out.println("    1. HashSet");
                System.out.println("    2. TreeSet");
                System.out.println("    3. LinkedHashSet");
                System.out.print("      Ingrese la opcionaza que usted desea chavo: ");            
                try{opcion=sc.nextInt();}         //guardemos datos en variables  
                catch(Exception e){System.out.println();}
                
                
                //Se pregunta por la implementacion a utilizar las unicas 3 pociones que el user puede usar son las 
                // sieguientes
                if (opcion==1){
                    menu =1; 
                    System.out.print(" La HashSet \n");
                }
                if (opcion==2){
                    menu=2;  
                    System.out.print(" EL TreeSet \n");
                }
                if (opcion==3){
                    menu=2;
                    System.out.print("LinkedHashSet \n");
                }
                
                if (opcion>3||opcion<1){
                    System.out.print("Por favor amigo, ingrese algo que sea correcto");  
                }
            }
        
        
        
      //Desarrroladores dores dores
      
      
      System.out.println("Ahora debera Ingresar a los Desarrolladores\n");
      boolean ciclo = true;
      String eleccion = "";
      String desarrollador = "";
      HashTable conjunto1 = new HashTable(menu);
      HashTable conjunto2 = new HashTable(menu);
      HashTable conjunto3 = new HashTable(menu);
      boolean sino = true;
      
      while(ciclo == true){
          System.out.println("Ingrese el Name del Desarollador dor dor: ");
          desarrollador = sc.next();
          
          
          
          //Dependiendo de que tipo de desarrollador es se va para uno de los conjuntos 
          
          
          System.out.println("¿Es Desarrollador del lenguaje  Java ?");
          sino = true;
          
          while( sino == true){
           eleccion = sc.next();
           if(eleccion.toLowerCase().equals("si")){
              
              conjunto1.setTable(desarrollador);
              sino = false;
              
             } 
          
           
           else{
                if(eleccion.toLowerCase().equals("no")){
              
                    sino = false;
              
                }
                
                else{
                    System.out.println("Ingrese una de dos; Si o No");
                }

           }
           
          }

      
          System.out.println("¿Es Desarrollador de tipo Web?");
          sino = true;
          
          while( sino == true){
           eleccion = sc.next();    
           if(eleccion.toLowerCase().equals("si")){
              
              conjunto2.setTable(desarrollador);
              sino = false;
              
             } 
          
           
           else{
                if(eleccion.toLowerCase().equals("no")){
              
                    sino = false;
              
                }
                
                else{
                    System.out.println("Ingrese una de dos; Si o No");
                }

           
             }
          }      
          
          System.out.println("¿Es Desarrollador  para los Celulares?");
          sino = true;
          
          while( sino == true){
           eleccion = sc.next();  
           if(eleccion.toLowerCase().equals("si")){
              
              conjunto3.setTable(desarrollador);
              sino = false;
              
             } 
          
           
           else{
                if(eleccion.toLowerCase().equals("no")){
              
                    sino = false;
              
                }
                
                else{
                    System.out.println("Ingrese una de dos; Si o No");
                }

           
            }
          }
          
          System.out.println(" Amigo, ¿Usted desea Ingresar otro Desarrollador?");
          sino=true;
          
          while( sino == true){
           eleccion = sc.next();    
           if(eleccion.toLowerCase().equals("si")){
              
             
              sino= false;
              
             } 
          
           
           else{
                if(eleccion.toLowerCase().equals("no")){
              
                    sino = false;
                     ciclo = false;
              
                }
                
                else{
                    System.out.println("Ingrese Si o No");
                }

          
             }

          }
        }  
      
      // aqui imprimimos todos los chavos que tenemos en los conjuntos de esta hoja chilera 
    
        System.out.println("######################################Holi########################################");
              Set conjunt1=conjunto1.getConjunto();
              Set conjunt2=conjunto2.getConjunto();
              Set conjunt3=conjunto3.getConjunto();
              Set conjuntMayor=conjunto1.biggerConjunto(conjunt1, conjunt2, conjunt3);
              System.out.println(" Estos son los Desarrolladores con experiencia en Java, web y celulares: ");
              

// la intersección de los tres conjuntos)
              System.out.println(conjunto1.interseccion3(conjunt1,conjunt2,conjunt3));

// Java pero que no tengan experiencia en web
              System.out.println(" Estos son los Desarrolladores con experiencia en Java pero no los que saben Disenio Web: ");
              System.out.println(conjunto1.inclusion(conjunt1,conjunt2));
              
// Web y Celulares (interseccion)pero no en java

              System.out.println("  Intersección de los que saben Web y Celuares, pero que saben el de java: ");
              System.out.println(conjunto1.inclusion(conjunto2.interseccion(conjunt2,conjunt3), conjunt1));

// Web o Celulares (union) , pero que no en java

              System.out.println(" Unión de Web y Celuares, pero sin experiencia en java: ");
              System.out.println(conjunto1.inclusion(conjunto2.union(conjunt2, conjunt3),conjunt1));
              
// Indicar si los de java son subconjunto de los de la Web
              if (conjunto1.subConjunto(conjunt1, conjunt3)==true){
                  System.out.println("5. Java es un subconjunto de Desarrolladores Web.");
              }
              else{
                  System.out.println("5. Java no es un subconjunto de Desarrolladores Web.");
              }

//El conjunto mas grande de los tres con su respectivos nombres de la mara

              System.out.println(" El conjunto mas grande de los tres, es el de: "+conjunto1.getConjuntoMayor() );
              System.out.println(conjunto1.biggerConjunto(conjunt1, conjunt2, conjunt3));
              
              
//del conjunto mas grande he de desplegar tengo que poner los nombres de los cuates en forma ascendente

// prints prints prints prints 
              System.out.println(" Los nombres de la Lista son: "+conjunto1.getConjuntoMayor()+" orden ascendente: ");
              System.out.println(conjunto1.getStringConjunto(conjunto2.biggerConjunto(conjunt1, conjunt2, conjunt3)));
              System.out.println(conjunt1);
              System.out.println(conjunt2);
              System.out.println(conjunt3);

    }

    
    }
    

      

