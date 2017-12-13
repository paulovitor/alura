package br.com.casadocodigo.goodies;

import static java.util.Arrays.asList;

import java.math.BigDecimal;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PaymentTest {

	public static void main(String[] args) {
		Customer paulo = new Customer("Paulo Silveira");
		Customer rodrigo = new Customer("Rodrigo Turini");
		Customer guilherme = new Customer("Guilherme Silveira");
		Customer adriano = new Customer("Adriano Almeida");

		Product bach = new Product("Bach Completo", Paths.get("/music/bach.mp3"), new BigDecimal(100));
		Product poderosas = new Product("Poderosas Anita", Paths.get("/music/poderosas.mp3"), new BigDecimal(90));
		Product bandeira = new Product("Bandeira Brasil", Paths.get("/images/brasil.jpg"), new BigDecimal(50));
		Product beauty = new Product("Beleza Americana", Paths.get("beauty.mov"), new BigDecimal(150));
		Product vingadores = new Product("Os Vingadores", Paths.get("/movies/vingadores.mov"), new BigDecimal(200));
		Product amelie = new Product("Amelie Poulain", Paths.get("/movies/amelie.mov"), new BigDecimal(100));

		LocalDateTime today = LocalDateTime.now();
		LocalDateTime yesterday = today.minusDays(1);
		LocalDateTime lastMonth = today.minusMonths(1);

		Payment payment1 = new Payment(asList(bach, poderosas), today, paulo);
		Payment payment2 = new Payment(asList(bach, bandeira, amelie), yesterday, rodrigo);
		Payment payment3 = new Payment(asList(beauty, vingadores, bach), today, adriano);
		Payment payment4 = new Payment(asList(bach, poderosas, amelie), lastMonth, guilherme);
		Payment payment5 = new Payment(asList(beauty, amelie), yesterday, paulo);

		List<Payment> payments = asList(payment1, payment2, payment3, payment4, payment5);

		ordenandoNossosPagamentos(payments);
		
		reduzindoBigDecimalEmSomas(payment1, payments);
		
		produtosMaisVendidos(payments);
		
		valoresGeradosPorProduto(payments);
		
		quaisSaoOsProdutosDeCadaCliente(payments);
		
		qualEhNossoClienteEspecial(payments);
		
		relatoriosComDatas(payments);
	}

	private static void relatoriosComDatas(List<Payment> payments) {
		System.out.println("\nPagamentos por data");
		Map<YearMonth, List<Payment>> paymentsPerMonth = payments.stream()
			.collect(Collectors.groupingBy(p -> YearMonth.from(p.getDate())));
		
		paymentsPerMonth.entrySet().stream()
			.forEach(System.out::println);
		
		System.out.println("\nQuanto foi faturado por mês");
		Map<YearMonth, BigDecimal> paymentsValuePerMonth = payments.stream()
			.collect(Collectors.groupingBy(p -> YearMonth.from(p.getDate()),
					Collectors.reducing(BigDecimal.ZERO,
							p -> p.getProducts().stream()
								.map(Product::getPrice)
								.reduce(BigDecimal.ZERO,
										BigDecimal::add), BigDecimal::add)));
		
		paymentsValuePerMonth.entrySet().stream()
			.forEach(System.out::println);
	}

	private static void qualEhNossoClienteEspecial(List<Payment> payments) {
		System.out.println("\nCliente especiais");
		Function<Payment, BigDecimal> paymentToTotal = p -> p.getProducts().stream()
				.map(Product::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		Map<Customer, BigDecimal> totalValuePerCustomer = payments.stream()
			.collect(Collectors.groupingBy(Payment::getCustomer,
					Collectors.reducing(BigDecimal.ZERO,
							paymentToTotal,
							BigDecimal::add)));
		
		totalValuePerCustomer.entrySet().stream()
			.sorted(Comparator.comparing(Map.Entry::getValue))
			.forEach(System.out::println);
	}

	private static void quaisSaoOsProdutosDeCadaCliente(List<Payment> payments) {
		System.out.println("\nProdutos de cada cliente");
		payments.stream()
			.collect(Collectors.groupingBy(Payment::getCustomer));
		
		Map<Customer, List<List<Product>>> customerToProductList = payments.stream()
			.collect(Collectors.groupingBy(Payment::getCustomer,
					Collectors.mapping(Payment::getProducts, Collectors.toList())));
		
		System.out.println("\nLista aninhada");
		customerToProductList.entrySet().stream()
			.sorted(Comparator.comparing(e -> e.getKey().getName()))
			.forEach(System.out::println);
		
		System.out.println("\nLista achatada");
		Map<Customer, List<Product>> customerToProductList2Steps = customerToProductList.entrySet().stream()
			.collect(Collectors.toMap(Map.Entry::getKey,
					e -> e.getValue().stream()
						.flatMap(List::stream)
						.collect(Collectors.toList())));
		
		customerToProductList2Steps.entrySet().stream()
			.sorted(Comparator.comparing(e -> e.getKey().getName()))
			.forEach(System.out::println);
		
		Map<Customer, List<Product>> customerToProducts = payments.stream()
				.collect(Collectors.groupingBy(Payment::getCustomer,
						Collectors.reducing(Collections.emptyList(),
								Payment::getProducts, (l1, l2) -> {
									List<Product> l = new ArrayList<>();
									l.addAll(l1);
									l.addAll(l2);
									return l;
								})));
		
		customerToProducts.entrySet().stream()
			.sorted(Comparator.comparing(e -> e.getKey().getName()))
			.forEach(System.out::println);
	}

	private static void valoresGeradosPorProduto(List<Payment> payments) {
		System.out.println("\nSoma do valor por produto");
		Map<Product, BigDecimal> totalValuePerProduct = payments.stream()
			.flatMap(p -> p.getProducts().stream())
			.collect(Collectors.groupingBy(Function.identity(),
					Collectors.reducing(BigDecimal.ZERO, Product::getPrice, BigDecimal::add)));
		
		totalValuePerProduct.entrySet().stream()
			.sorted(Comparator.comparing(Map.Entry::getValue))
			.forEach(System.out::println);
	}

	private static void produtosMaisVendidos(List<Payment> payments) {
		System.out.println("\nProdutos campeões de vendas");
		payments.stream()
			.map(Payment::getProducts)
			.flatMap(List::stream);
		
		Stream<Product> products = payments.stream()
			.flatMap(p -> p.getProducts().stream());
		
		Map<Product, Long> topProducts = products.collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		
		topProducts.entrySet().stream()
			.forEach(System.out::println);
		
		System.out.println("\nRecupera o mais popular");
		topProducts.entrySet().stream()
			.max(Comparator.comparing(Map.Entry::getValue))
			.ifPresent(System.out::println);
	}

	private static void reduzindoBigDecimalEmSomas(Payment payment1, List<Payment> payments) {
		System.out.println("\nCalcular o valor total do payment1 - 1 opção");
		payment1.getProducts().stream()
			.map(Product::getPrice)
			.reduce(BigDecimal::add)
			.ifPresent(System.out::println);
		
		System.out.println("\nCalcular o valor total do payment1 - 2 opção");
		BigDecimal totalPayment1 = payment1.getProducts().stream()
			.map(Product::getPrice)
			.reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println(totalPayment1);
		
		System.out.println("\nSomar todos os valores de todos os pagamentos da lista de payments - 1 opção");
		BigDecimal total1 = payments.stream()
			.map(p -> p.getProducts().stream()
					.map(Product::getPrice)
					.reduce(BigDecimal.ZERO, BigDecimal::add))
			.reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println(total1);
		
		System.out.println("\nSomar todos os valores de todos os pagamentos da lista de payments - 2 opção");
		Function<Payment, Stream<BigDecimal>> mapper = p -> p.getProducts().stream()
				.map(Product::getPrice);
		BigDecimal total2 = payments.stream()
			.flatMap(mapper)
			.reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println(total2);
	}

	private static void ordenandoNossosPagamentos(List<Payment> payments) {
		System.out.println("\nOrdenar os pagamentos por data e imprimi-los");
		payments.stream()
			.sorted(Comparator.comparing(Payment::getDate))
			.forEach(System.out::println);
	}

}
