using System.Text.RegularExpressions;

namespace ExemploRegex
{
    class Program
    {
        static void Main(string[] args)
        {
            string alvo = "11a22b33c";
            // string pattern = "(\\d\\d)(\\w)";
            string pattern = @"(\d\d)(\w)";

            Regex regex = new Regex(pattern);
            Match match = regex.Match(alvo);

            Console.WriteLine(match.Groups[0].Value);
            Console.WriteLine(match.Groups[1].Value);
            Console.WriteLine(match.Groups[2].Value);
            Console.WriteLine(match.Value);
            Console.WriteLine(match.Index);
            Console.WriteLine(match.Length);

            MatchCollection matches = regex.Matches(alvo);
            for (Match resultado in matches) {
                Console.WriteLine(string.Format("Resultado: {0}, Grupos: {1} e {2}, Index: [{3},{4}]", 
                    resultado.Value, 
                    resultado.Groups[1], 
                    resultado.Groups[2],
                    resultado.Index,
                    (resultado.Index+resultado.Length)));
                    Console.WriteLine("--------------");
            }

            string alvo = "2007-12-31"; 
            Regex regexp = new Regex(@"(\d{4})(-)(\d{2})(-)(\d{2})");
            MatchCollection resultados = regexp.Matches(alvo);
            foreach(Match resultado in resultados)
            {

                string ano = resultado.Groups[1].Value;
                string mes = resultado.Groups[3].Value;
                string dia = resultado.Groups[5].Value;

                string separador1 = resultado.Groups[2].Value;
                string separador2 = resultado.Groups[4].Value;

                Console.WriteLine(string.Format("{0}/{1}/{2}", dia, mes, ano));
            }
        }
    }
}