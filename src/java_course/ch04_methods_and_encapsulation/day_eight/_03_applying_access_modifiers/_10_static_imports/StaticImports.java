import java.util.List;
import static java.util.Arrays.asList; // Importación estática
public class StaticImports {
public static void main(String[] args) {
List<String> list = asList("one", "two"); // Se utiliza directamente el asList
} }

/*
 * Explicación:
 *
 * Estas son importaciones normales:
 *
 * import java.util.List;
 * import java.util.Arrays;
 *
 * Permiten usar las clases List y Arrays sin escribir su ruta completa.
 *
 * Por eso podemos escribir:
 * List<String> list = Arrays.asList("one", "two");
 *
 * En cambio, una importación static permite importar directamente
 * métodos o variables static de una clase.
 *
 * Ejemplo:
 * import static java.util.Arrays.asList;
 *
 * Entonces ya no necesitamos escribir Arrays.asList():
 *
 * List<String> list = asList("one", "two");
 *
 * Regla:
 * import normal  -> importa clases.
 * import static  -> importa miembros static (métodos o variables).
 */