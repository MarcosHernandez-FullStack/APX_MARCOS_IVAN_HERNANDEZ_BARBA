/*
    * Si deseo usar la clase Date de java.util.Date y la clase Date de java.sql.Date, 
    * debo importar la clase java.util.Date y usar el nombre completo para la clase java.sql.Date.
*/
import java.util.Date;
public class Conflicts {
Date date;
java.sql.Date sqlDate;
}

/*
* Otra forma de evitar conflictos es no importar ninguna de las clases Date y usar el nombre completo para ambas clases.
*/
public class Conflicts {
java.util.Date date;
java.sql.Date sqlDate;
}

