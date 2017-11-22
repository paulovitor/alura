import re

# r'(\d\d)(\w)' #string raw (string sem escapar)
regex = re.compile(r'(\d\d)\w') #compila a regex antes de usá-la
alvo = '11a22b33c'

resultado = re.findall(regex, alvo)
print resultado

#resultado = re.search(regex, alvo)
resultado.group()
resultado.group(0)
resultado.group(1)
resultado.group(2)
resultado.start()
resultado.end()

resultados = re.finditer(regex, alvo)
for resultado in resultados;
    print "%s | %s | %s [%s,%s]" % (resultado.group(), resultado.group(1), resultado.group(2), resultado.start(), resultado.end())

alvo = '2007-12-31'
resultado = re.sub('-', '/', alvo)
print resultado

regex = '\s-\s'
novotexto = ': '
alura = 'Alura - Regex'
resultado = re.sub(regex, novotexto, alura)
print resultado