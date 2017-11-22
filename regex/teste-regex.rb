regex = /(\d\d)(\w)/
alvo = "11a22b33c"
resultado = regex.match(alvo)
resultado[0]
resultado[1]
resultado[2]
resultado.begin 2
resultado.end 2
resultado.begin 0
resultado.end 0

resultados = alvo.scan regex
resultado[2][1]
resultados[0][0]

cpfLimpo = "111.222.333-96".gsub(/[.-]/,"")

cpf = "111.222.333-96"
cpf.gsub!(/[.-]/,"") #manipula a mesma String