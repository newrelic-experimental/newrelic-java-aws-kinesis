package com.amazonaws.services.kinesis.producer;

import java.net.URI;
import java.nio.ByteBuffer;

import com.google.common.util.concurrent.ListenableFuture;
import com.newrelic.api.agent.GenericParameters;
import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

@Weave
public abstract class KinesisProducer {

	@Trace(dispatcher=true)
	public ListenableFuture<UserRecordResult> addUserRecord(String stream, String partitionKey, String explicitHashKey, ByteBuffer data) {
		String uriStr = "kinesis://Producer/" + stream;
		URI uri = URI.create(uriStr);
		GenericParameters params = GenericParameters.library("Kinesis-Producer").uri(uri).procedure("addUserRecord").build();
		NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
		return Weaver.callOriginal();
	}
}
