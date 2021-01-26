package org.mycompany.processor;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;

public class CxfRsClientConfigRetrieveAccounts implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.setPattern(ExchangePattern.InOut);
        Message inMessage = exchange.getIn();
        // set the operation name
        inMessage.setHeader(CxfConstants.OPERATION_NAME, "retrieveAccounts");
        // using the proxy client API
        inMessage.setHeader(CxfConstants.CAMEL_CXF_RS_USING_HTTP_API, Boolean.FALSE);
        // set a customer header
        //inMessage.setHeader("key", "value");
        // setup the accept content type  
        inMessage.setHeader(Exchange.ACCEPT_CONTENT_TYPE, "application/json");
        // set the parameters , if you just have one parameter
        // camel will put this object into an Object[] itself
        String userId = String.valueOf(exchange.getIn().getHeader("userId"));
        MessageContentsList req = new MessageContentsList();
        req.add(userId);
        inMessage.setBody(req);

	}

}
