describe("Paciente", function () {

    var guilherme;

    beforeEach(function () {
        guilherme = new PacienteBuilder().comAltura(1.82).constroi();
    });

    it("deve calcular o IMC", function () {
        expect(guilherme.imc()).toEqual(72 / (1.82 * 1.82));
    });

    it("deve calcular os batimentos", function () {
        expect(guilherme.batimentos()).toEqual(28 * 365 * 24 * 60 * 80);
    });
});