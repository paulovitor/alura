function NumeroRomano() {
    var clazz = {
        transforma: function (letra) {
            var letras = letra.split("");
            var numero = this.getValor(letras[0]);
            var anterior = numero;
            for (i = 1; i <= letras.length; i++) {
                var valor = this.getValor(letras[i]);
                
                if (anterior - valor < 0)
                    numero = valor - numero;
                else if (anterior - valor > 0)
                    numero += valor;
                else
                    numero = valor;

                anterior = valor;
            }
            return numero;
        },
        getValor(letra) {
            return letra == "I" ? 1 : letra == "V" ? 5 : letra == "X" ? 10 : 0;
        }
    };
    return clazz;
}