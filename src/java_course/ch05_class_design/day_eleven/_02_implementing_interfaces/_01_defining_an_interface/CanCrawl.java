private final interface CanCrawl { 
    private void dig(int depth); 
    protected abstract double depth(); 
    public final void surface(); 
}

/*
 * Ninguna de las líneas de código anteriores compila por la siguiente razón:
 * 1. Definición de la clase: no compila porque está declarada como private, esto va en contra del concepto público
 * y predeterminado con el que debe contar una interface. Además, está marcada como final, esto entra en conflicto 
 * con la palabra clave abstract. 
 * 2. Segunda línea: no compila porque el método está marcado como private, esto va en contra del concepto público
 * y predeterminado.
 * 3. Tercera línea: no compila porque el método está marcado como private, esto va en contra del concepto público
 * y predeterminado.
 * 4. Cuarta línea: no compila porque se define como final en vez de abstract.
*/