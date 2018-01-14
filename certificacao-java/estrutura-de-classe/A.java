class A implements B { //A
}
// interface pública precisa ter o mesmo nome do arquivo
public interface B { //B
}
class C extends A { //C
}
// não existe , antes do operador implements
class D extends A, implements B { //D
}