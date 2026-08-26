/*
 * StringBuilder es lo mismo que StringBuffer, pero no es seguro para subprocesos. 
 * Esto significa que StringBuilder no está sincronizado y no se puede utilizar de manera 
 * segura en entornos multihilo. 
 * Por otro lado, StringBuffer es seguro para subprocesos y se puede utilizar en entornos 
 * multihilo sin problemas de concurrencia.
*/

//Ejemplo de StringBuilder:
StringBuilder sb = new StringBuilder("abc");

//Ejemplo de StringBuffer:
StringBuffer sbf = new StringBuffer("abc");
