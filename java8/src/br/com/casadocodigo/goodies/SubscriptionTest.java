package br.com.casadocodigo.goodies;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class SubscriptionTest {

	public static void main(String[] args) {
		BigDecimal monthlyFee = new BigDecimal("99.90");

		Customer paulo = new Customer("Paulo Silveira");
		Customer rodrigo = new Customer("Rodrigo Turini");
		Customer adriano = new Customer("Adriano Almeida");

		LocalDateTime today = LocalDateTime.now();
		LocalDateTime yesterday = today.minusDays(1);

		Subscription s1 = new Subscription(monthlyFee, yesterday.minusMonths(5), paulo);
		Subscription s2 = new Subscription(monthlyFee, yesterday.minusMonths(8), today.minusMonths(1), rodrigo);
		Subscription s3 = new Subscription(monthlyFee, yesterday.minusMonths(5), today.minusMonths(2), adriano);

		List<Subscription> subscriptions = Arrays.asList(s1, s2, s3);

		BigDecimal totalPaid = subscriptions.stream()
					.map(Subscription::getTotalPaid)
					.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		System.out.println(totalPaid);
	}

}
