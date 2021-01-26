package org.mycompany.processor.aggregator;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import com.sun.tools.javac.util.List;

import io.endpoints.client.accounts.model.Account;
import io.endpoints.client.accounts.model.AccountList;
import io.endpoints.server.users.model.UserAccounts;

public class UserAccountsAggregationStrategy implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		UserAccounts oldUA = oldExchange.getIn().getBody(UserAccounts.class);
		UserAccounts newUA = newExchange.getIn().getBody(UserAccounts.class);
		oldUA.setAccounts(newUA.getAccounts());
		oldExchange.getIn().setBody(oldUA);
		return oldExchange;
	}

}
