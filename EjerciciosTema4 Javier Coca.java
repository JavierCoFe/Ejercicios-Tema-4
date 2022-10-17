
IF:


public class MyClass {
    public static void main(String args[]) {
      int numerolf = 3;
      if (numerolf > 0) {
       System.out.println("numero positivo");
    } else if (numerolf < 0);
        System.out.println("numero negativo");
    } else {   (numerolf == 0);
        System.out.println ("numero es  0");
    }
}




WHILE:

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
   int numeroWhile = 2;
      while (numeroWhile <3) {
        numeroWhile = numeroWhile +1 ;
       System.out.println (numeroWhile);



DO-WHILE:

public class Main {
    public static void main(String[] args) throws Exception {
       
      int numeroWhile = 4;
      do {
          System.out.println (numeroWhile);
          numeroWhile = numeroWhile +1;
      }
      while (numeroWhile <3) {
       System.out.println (numeroWhile);
        numeroWhile = numeroWhile +1;


FOR:

public class Main {
    public static void main(String[] args) throws Exception {
    
      int numeroFor = 0;
      for ( numeroFor <=3; numeroFor = numeroFor +1) {
          System.out.println (numeroFor);


SWITCH:

public class Main {
    public static void main(String[] args) throws Exception {
           var estación = "primavera";
        
        switch (estación) {
            case "primavera":
                System.out.println ("es primavera en el Corte Inglés");
                break;
            case "verano":
                System.out.println ("es verano");
                break;
            case "otoño":
                System.out.println ("es otoño");
                break;
            case "invierno":
                System.out.println ("es invierno");
                break;
            default:
                System.out.println ("esto no es una estación");
        }        
    }
}

                
