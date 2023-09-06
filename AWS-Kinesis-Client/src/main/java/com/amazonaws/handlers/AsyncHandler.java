package com.amazonaws.handlers;

import com.amazonaws.AmazonWebServiceRequest;
import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Token;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.NewField;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

@Weave(type=MatchType.Interface)
public abstract class AsyncHandler<REQUEST extends AmazonWebServiceRequest, RESULT> {

	@NewField
	public Token token = null;
	
	@Trace(async=true)
	public void onError(Exception exception) {
		if(token != null) {
			token.linkAndExpire();
			token = null;
		}
		NewRelic.noticeError(exception);
		Weaver.callOriginal();
	}
	
	@Trace(async=true)
	public void onSuccess(REQUEST request, RESULT result) {
		if(token != null) {
			token.linkAndExpire();
			token = null;
		}
		Weaver.callOriginal();
	}
}
