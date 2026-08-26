public void walk1() {}
public final void walk2() {}
public static final void walk3() {}
public final static void walk4() {}
public modifier void walk5() {} // No compila, porque modifier no es un especificación válida
public void final walk6() {} // No compila, porque void no es un especificación válida
final public void walk7() {}