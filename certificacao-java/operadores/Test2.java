int i1 = 3/2; // divisão inteira: i1 vale 1
double i2 = 3/2; // divisão inteira, que depois é promovido a double: i2 vale 1.0
double i3 = 3/2.0; // divisão double: i3 vale 1.5

long x = 0; double d = 0; // x vale 0L e d vale 0.0 (duas promoções)
double zero = x + d;
System.out.println(i1 + i2 + i3 + x + d + zero); // O resultado é 3.5