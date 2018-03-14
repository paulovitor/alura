if ((trem && !carro) || (!trem && carro)) { // if testa se o carro é diferente do trem
    // ....
}

// uma condição mais curta seria através do XOR (disjunção exclusiva)
if (trem ^ carro) {
	// ...
}