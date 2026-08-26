String[] strings = { "stringValue" }; //Crea un array de tipo String
Object[] objects = strings; //No requiere una conversión de tipo porque Object es un tipo más amplio que String
String[] againStrings = (String[]) objects;/*Se necesita una conversión de tipo porque estamos pasando a un tipo
                                           más específico*/
againStrings[0] = new StringBuilder(); /*No compila porque String[] solo admite objetos String y StringBuilder no 
                                        es un String.*/
objects[0] = new StringBuilder(); /* El problema es que en realidad no tenemos un Object[]. Tenemos un String[] 
                                   * al que se hace referencia desde una variable Object[]
                                   * En tiempo de ejecución, el código lanza una ArrayStoreException
                                   */