import java.lang.System;
import java.lang.*;
import java.util.Random;
import java.util.*;
public class ImportExample {
 public static void main(String[] args) {
   Random r = new Random();
   System.out.println(r.nextInt(10));
 }
}

/*
 * Las líneas redundantes son la línea 1, 2 y 4. 
    * La línea 1 es redundante porque la clase System se importa automáticamente desde el paquete java.lang. 
    * La línea 2 es redundante porque el paquete java.lang se importa automáticamente. 
    * La línea 4 es redundante porque la clase Random ya se ha importado en la línea 3.
*/