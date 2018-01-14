short s = 10;
char c = s;

// A opção (b) compila, pois o char que possui 2 bytes pode ser atribuído para um long que possui 8 bytes
char c = 10;
long l = c;

char c = 10;
short s = c;

// As opções (a) e (c) não compilam e precisam do casting mesmo com short e char tendo 2 bytes