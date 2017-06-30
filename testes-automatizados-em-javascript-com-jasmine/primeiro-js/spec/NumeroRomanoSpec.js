describe("NumeroRomano", function () {

    var numeroRomano;
    beforeEach(function () {
        numeroRomano = new NumeroRomano();
    });

    it("deve transformar a letra I em 1", function () {
        var um = "I";

        expect(numeroRomano.transforma(um)).toEqual(1);
    });

    it("deve transformar a letra V em 5", function () {
        var cinco = "V";

        expect(numeroRomano.transforma(cinco)).toEqual(5);
    });

    it("deve transformar a letra X em 10", function () {
        var cinco = "X";

        expect(numeroRomano.transforma(cinco)).toEqual(10);
    });

    it("deve transformar as letras IV em 4", function () {
        var quatro = "IV";

        expect(numeroRomano.transforma(quatro)).toEqual(4);
    });

    it("deve transformar as letras VI em 6", function () {
        var seis = "VI";

        expect(numeroRomano.transforma(seis)).toEqual(6);
    });

    // it("deve transformar as letras XIV em 14", function () {
    //     var quatorze = "XIV";

    //     expect(numeroRomano.transforma(quatorze)).toEqual(14);
    // });

    it("deve transformar as letras XVI em 16", function () {
        var dezesseis = "XVI";

        expect(numeroRomano.transforma(dezesseis)).toEqual(16);
    });

    it("não deve transformar letra inválida", function () {
        var invalida = "Z";

        expect(numeroRomano.transforma(invalida)).toEqual(0);
    });
});