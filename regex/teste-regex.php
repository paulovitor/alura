<?php
$regex = '~(\d\d)(\w)~';
$alvo = '11a22b33c';
$acho = preg_match($regex, $alvo, $match);
echo $acho;
print_r($match);

$acho = preg_match_all($regex, $alvo, $match);
echo $acho; // quantidade de resultados
print_r($match);
echo $match[2][2];

$acho = preg_match_all($regex, $alvo, $match, PREG_OFFSET_CAPTURE); // para receber os índices
echo $acho;
print_r($match);
echo $match[2][0][1];

$string = '2007-12-31';
$regex = '~(\d{4})-(\d{2})-(\d{2})~';
$novoTexto = '$3-$2-$1';
$resultado = preg_replace($regex, $novoTexto, $string);
echo $resultado; // 31-12-2007

$string = 'Setembro 21';
$regex = '~(\w+)\s(\d+)~';
$novoTexto = '$2 de $1';
$resultado = preg_replace($regex, $novoTexto, $string);
echo $resultado; // 21 de Setembro

$string = '31-12-2007';
$resultado = preg_replace('~-~', '/', $string);
echo $resultado; // 31/12/2007