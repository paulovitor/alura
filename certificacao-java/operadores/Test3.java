void metodo(Carro c) {
	// Solução seria usar o curto-circuito, &&
        if(c != null & c.getPreco() > 100000) { // usando & a segunda expressão será sempre verificada (podendo causar um NullPointerException)
            System.out.println("possivel sequestro");
        }
    }