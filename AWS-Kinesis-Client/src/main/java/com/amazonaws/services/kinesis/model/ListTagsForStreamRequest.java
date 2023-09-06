package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.newrelic.api.agent.Token;
import com.newrelic.api.agent.weaver.NewField;
import com.newrelic.api.agent.weaver.Weave;

@Weave
public abstract class ListTagsForStreamRequest extends AmazonWebServiceRequest {

	@NewField
	public Token token = null;

	public abstract String getStreamName();

}
