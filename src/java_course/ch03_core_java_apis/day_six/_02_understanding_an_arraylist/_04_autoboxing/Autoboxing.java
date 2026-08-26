//Autobboxing: consiste en convertir de forma automática un valor a primitivo a su clase contenedora correspondiente.
List<Double> weights = new ArrayList<>();
weights.add(50.5); // Convierte automáticamente el tipo double primitivo en un objeto Double y lo agrega a la lista --> [50.5]
weights.add(new Double(60)); // Muestra que aún se puede escribir código de forma extensa y pasar un objeto contenedor --> [50.5, 60.0]
weights.remove(50.5); // Realiza una conversión automática al objeto contenedor y lo pasa a remove() --> [60.0]
double first = weights.get(0); // Recupera el Double y lo convierte en un tipo primitivo double --> 60.0