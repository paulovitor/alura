class TestaSwitch {
	public static void main(String[] args) {
		int opcao = 1;
		final int variavel = 1;
		switch(opcao) {
			case variavel:
				System.out.println("PRIMEIRA OPÇÃO");
				break;
			default:
				System.out.println("default");
			case 2:
				System.out.println("SEGUNDA OPÇÃO");
			case 3:
			case 4:
				System.out.println("TERCEIRA OPÇÃO");
		}

		int v = 1;
		switch(v){
		    case 1:
		    case 2:
		    case 3:
		        System.out.println("Até 3");
		}

		String a = new String("Gui");
		final String b = "Gui";
		switch(a) {
            case b: 
                System.out.println("Guilherme");
                break;
            case "42":
                System.out.println("42");
            default:
                System.out.println("Outro nome");
        }
	}
}