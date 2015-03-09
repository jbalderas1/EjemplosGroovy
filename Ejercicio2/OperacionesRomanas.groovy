import java.io.*;
import java.util.Scanner;

    arabigoRomano()
    romanoArabigo()

def arabigoRomano(){

    Scanner sc=new Scanner(System.in)

    println("Escribe Numero Arabigo:")

    def arabigo=sc.nextLine()
    def numeroArabigo = arabigo as int

    if (numeroArabigo>=1 && numeroArabigo<=3888){
            
            def remplazaNumero = []
            def numeroEntrada = []
            numeroEntrada = arabigo.split("")
            
            if(arabigo.length()==1){
                remplazaNumero[0]="0"
                remplazaNumero[1]="0"
                remplazaNumero[2]="0"
                remplazaNumero[3]=numeroEntrada[1]
            }
            
            if(arabigo.length()==2){
                remplazaNumero[0]="0"
                remplazaNumero[1]="0"
                remplazaNumero[2]=numeroEntrada[1]
                remplazaNumero[3]=numeroEntrada[2]
            }
            
            if(arabigo.length()==3){
                remplazaNumero[0]="0"
                remplazaNumero[1]=numeroEntrada[1]
                remplazaNumero[2]=numeroEntrada[2]
                remplazaNumero[3]=numeroEntrada[3]
                println "RemNumero: ${remplazaNumero}" 
            }
            
            if(arabigo.length()==4){
                remplazaNumero[0]=numeroEntrada[1]
                remplazaNumero[1]=numeroEntrada[2]
                remplazaNumero[2]=numeroEntrada[3]
                remplazaNumero[3]=numeroEntrada[4]
            }
            
            if(remplazaNumero.size()==4){
                String miles=""
                String centenas=""
                String decenas=""
                String unidad=""
                
                if(remplazaNumero[0].equals("1")){
                    miles = "M"
                }else if(remplazaNumero[0].equals("2")){
                    miles = "MM"
                }else if(remplazaNumero[0].equals("3")){
                    miles = "MMM"
                }else if(remplazaNumero[1].equals("1")){
                    centenas = "C"
                }else if(remplazaNumero[1].equals("2")){
                    centenas = "CC"
                }else if(remplazaNumero[1].equals("3")){
                    centenas = "CCC"
                }else if(remplazaNumero[1].equals("4")){
                    centenas = "CD"
                }else if(remplazaNumero[1].equals("5")){
                    centenas = "D"
                }else if(remplazaNumero[1].equals("6")){
                    centenas = "DC"                
                }else if(remplazaNumero[1].equals("7")){
                    centenas = "DCC"
                }else if(remplazaNumero[1].equals("8")){
                    centenas = "DCCC"
                }else if(remplazaNumero[1].equals("9")){
                    centenas = "CM"  
                }
                             
                if(remplazaNumero[2].equals("1")){
                    decenas = "X"
                }else if(remplazaNumero[2].equals("2")){
                    decenas = "XX"
                }else if(remplazaNumero[2].equals("3")){
                    decenas = "XXX"
                }else if(remplazaNumero[2].equals("4")){
                    decenas = "XL"
                }else if(remplazaNumero[2].equals("5")){
                    decenas = "L"
                }else if(remplazaNumero[2].equals("6")){
                    decenas = "LX"                
                }else if(remplazaNumero[2].equals("7")){
                    decenas = "LXX"
                }else if(remplazaNumero[2].equals("8")){
                    decenas = "LXXX"
                }else if(remplazaNumero[2].equals("9")){
                    decenas = "XC"               
                }
                
                if(remplazaNumero[3].equals("1")){
                    unidad = "I"
                }else if(remplazaNumero[3].equals("2")){
                    unidad = "II"
                }else if(remplazaNumero[3].equals("3")){
                    unidad = "III"
                }else if(remplazaNumero[3].equals("4")){
                    unidad = "IV"
                }else if(remplazaNumero[3].equals("5")){
                    unidad = "V"
                }else if(remplazaNumero[3].equals("6")){
                    unidad = "VI"                
                }else if(remplazaNumero[3].equals("7")){
                    unidad = "VII"
                }else if(remplazaNumero[3].equals("8")){
                    unidad = "VIII"
                }else if(remplazaNumero[3].equals("9")){
                    unidad = "IX"             
                }
            
            println "Numero Arabigo ingresado: ${arabigo}"
            println "Numero Romano: ${miles}${centenas}${decenas}${unidad}" 
            
            } 
                           
        }else{
        
            println "Numero fuera de rango"
            
    }

}

def romanoArabigo(){

        Scanner sc=new Scanner(System.in)

        println("Escribe el numero Romano (I,V,X...):")

        //DATO DE PRUEBA
        def numeroRomano=sc.nextLine()
        
        def simboloRomano = ["I","V","X","L","C","D","M"]
        def numeroEntrada = []           
        numeroEntrada = numeroRomano.split("")
            
            def romano = []
            def contador= 0;
            for(int e= 1; e< numeroEntrada.length; e++){
            
                romano.add(simboloRomano.contains(numeroEntrada[e]));
                //println "Numero: ${e}: ${numeroEntrada[e]}${romano}"           
            
                if (romano.contains(false)){
                   contador++;
               }
            }

            def remplazaSimbolo;
            def miles=0;
            def centenas=0;
            def decenas =0;
            def unidades=0;
            
            if (contador==0){
                
                for(int e= 1; e< numeroEntrada.length; e++){
                   
                   switch (numeroEntrada[e]){
                   
                    case "M":
                         miles++
                         break
                    case "C":
                         centenas++
                         break
                    case "X":
                         decenas++
                         break
                    case "I":
                         unidades++
                         break  
                    case "D":
                         centenas=5
                         break
                    case "L":
                         decenas=5
                         break
                    case "V":
                         unidades=5
                         break
                    case "I" && "V":
                        unidades=4
                        break     
                   }
                    
                }
                
                decenas = decenas*10;
                centenas= centenas*100;
                miles= miles*1000;
                
                remplazaSimbolo=miles+centenas+decenas+unidades;
                
                println "Numero Arabigo: ${remplazaSimbolo}"
                
            }else{
                println "No puede ser evaluado."
            }

}

   /** def inicio() {  
        
        BufferedReader en = new BufferedReader (new InputStreamReader(System.in));
        int opcion;            
        
                println "CONVERSOR ROMANO-ARABICO"
                println "Elige una opcion:"
                println "1. Arabico-Romano"
                println "2. Romano-Arabico"
                println "3. Salir"                
                opcion = Integer.parseInt(en.readLine());  

                switch(opcion){

                    case 1:
                        arabicoRomano()
                    break;
                    case 2:
                        println "Implementar"
                    break;
                }

    }**/