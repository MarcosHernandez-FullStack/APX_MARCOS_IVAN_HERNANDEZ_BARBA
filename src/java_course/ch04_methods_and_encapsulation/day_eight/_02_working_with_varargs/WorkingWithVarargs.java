public void walk1(int... nums) { }
public void walk2(int start, int... nums) { }
public void walk3(int... nums, int start) { } // No compila, porque tienen un parámetro vararg en una posición que no es la última (...)
public void walk4(int... start, int... nums) { } // No compila, porque tienen un parámetro vararg en una posición que no es la última (...)