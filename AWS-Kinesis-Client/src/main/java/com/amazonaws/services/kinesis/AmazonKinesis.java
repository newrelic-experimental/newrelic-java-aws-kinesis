package com.amazonaws.services.kinesis;

import java.net.URI;

import com.amazonaws.services.kinesis.model.AddTagsToStreamRequest;
import com.amazonaws.services.kinesis.model.AddTagsToStreamResult;
import com.amazonaws.services.kinesis.model.CreateStreamRequest;
import com.amazonaws.services.kinesis.model.CreateStreamResult;
import com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest;
import com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodResult;
import com.amazonaws.services.kinesis.model.DeleteStreamRequest;
import com.amazonaws.services.kinesis.model.DeleteStreamResult;
import com.amazonaws.services.kinesis.model.DescribeStreamRequest;
import com.amazonaws.services.kinesis.model.DescribeStreamResult;
import com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest;
import com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult;
import com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest;
import com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult;
import com.amazonaws.services.kinesis.model.GetRecordsRequest;
import com.amazonaws.services.kinesis.model.GetRecordsResult;
import com.amazonaws.services.kinesis.model.GetShardIteratorRequest;
import com.amazonaws.services.kinesis.model.GetShardIteratorResult;
import com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest;
import com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodResult;
import com.amazonaws.services.kinesis.model.ListStreamsRequest;
import com.amazonaws.services.kinesis.model.ListStreamsResult;
import com.amazonaws.services.kinesis.model.ListTagsForStreamRequest;
import com.amazonaws.services.kinesis.model.ListTagsForStreamResult;
import com.amazonaws.services.kinesis.model.MergeShardsRequest;
import com.amazonaws.services.kinesis.model.MergeShardsResult;
import com.amazonaws.services.kinesis.model.PutRecordRequest;
import com.amazonaws.services.kinesis.model.PutRecordResult;
import com.amazonaws.services.kinesis.model.PutRecordsRequest;
import com.amazonaws.services.kinesis.model.PutRecordsResult;
import com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest;
import com.amazonaws.services.kinesis.model.RemoveTagsFromStreamResult;
import com.amazonaws.services.kinesis.model.SplitShardRequest;
import com.amazonaws.services.kinesis.model.SplitShardResult;
import com.newrelic.api.agent.GenericParameters;
import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

@Weave(type=MatchType.Interface)
public abstract class AmazonKinesis {

	@Trace(async=true)
	public AddTagsToStreamResult addTagsToStream(AddTagsToStreamRequest addTagsToStreamRequest) {
		if(addTagsToStreamRequest.token != null) {
			addTagsToStreamRequest.token.linkAndExpire();
			addTagsToStreamRequest.token = null;
		}
    	String streamName = addTagsToStreamRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("addTagsToStream").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
	}

	@Trace(async=true)
    public CreateStreamResult createStream(CreateStreamRequest createStreamRequest) {
		if(createStreamRequest.token != null) {
			createStreamRequest.token.linkAndExpire();
			createStreamRequest.token = null;
		}
    	String streamName = createStreamRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("createStream").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public DecreaseStreamRetentionPeriodResult decreaseStreamRetentionPeriod(DecreaseStreamRetentionPeriodRequest decreaseStreamRetentionPeriodRequest) {
		if(decreaseStreamRetentionPeriodRequest.token != null) {
			decreaseStreamRetentionPeriodRequest.token.linkAndExpire();
			decreaseStreamRetentionPeriodRequest.token = null;
		}
    	String streamName = decreaseStreamRetentionPeriodRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("decreaseStreamRetentionPeriod").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public DeleteStreamResult deleteStream(DeleteStreamRequest deleteStreamRequest) {
		if(deleteStreamRequest.token != null) {
			deleteStreamRequest.token.linkAndExpire();
			deleteStreamRequest.token = null;
		}
    	String streamName = deleteStreamRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("deleteStream").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public DescribeStreamResult describeStream(DescribeStreamRequest describeStreamRequest) {
		if(describeStreamRequest.token != null) {
			describeStreamRequest.token.linkAndExpire();
			describeStreamRequest.token = null;
		}
    	String streamName = describeStreamRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("describeStream").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public DisableEnhancedMonitoringResult disableEnhancedMonitoring(DisableEnhancedMonitoringRequest disableEnhancedMonitoringRequest) {
		if(disableEnhancedMonitoringRequest.token != null) {
			disableEnhancedMonitoringRequest.token.linkAndExpire();
			disableEnhancedMonitoringRequest.token = null;
		}
    	String streamName = disableEnhancedMonitoringRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("disableEnhancedMonitoring").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public EnableEnhancedMonitoringResult enableEnhancedMonitoring(EnableEnhancedMonitoringRequest enableEnhancedMonitoringRequest) {
		if(enableEnhancedMonitoringRequest.token != null) {
			enableEnhancedMonitoringRequest.token.linkAndExpire();
			enableEnhancedMonitoringRequest.token = null;
		}
    	String streamName = enableEnhancedMonitoringRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("enableEnhancedMonitoring").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public GetRecordsResult getRecords(GetRecordsRequest getRecordsRequest) {
		if(getRecordsRequest.token != null) {
			getRecordsRequest.token.linkAndExpire();
			getRecordsRequest.token = null;
		}
    	String uriString = "kinesis://GetRecordsRequest";
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("getRecords").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public GetShardIteratorResult getShardIterator(GetShardIteratorRequest getShardIteratorRequest) {
		if(getShardIteratorRequest.token != null) {
			getShardIteratorRequest.token.linkAndExpire();
			getShardIteratorRequest.token = null;
		}
    	String uriString = "kinesis://GetShardIteratorRequest";
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("getShardIterator").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }


	@Trace(async=true)
    public IncreaseStreamRetentionPeriodResult increaseStreamRetentionPeriod(IncreaseStreamRetentionPeriodRequest increaseStreamRetentionPeriodRequest) {
		if(increaseStreamRetentionPeriodRequest.token != null) {
			increaseStreamRetentionPeriodRequest.token.linkAndExpire();
			increaseStreamRetentionPeriodRequest.token = null;
		}
    	String streamName = increaseStreamRetentionPeriodRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("increaseStreamRetentionPeriod").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public ListStreamsResult listStreams(ListStreamsRequest listStreamsRequest) {
    	if(listStreamsRequest.token != null) {
    		listStreamsRequest.token.linkAndExpire();
    		listStreamsRequest.token = null;
    	}
    	String uriString = "kinesis://ListStreamsRequest";
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("getRecords").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public ListTagsForStreamResult listTagsForStream(ListTagsForStreamRequest listTagsForStreamRequest) {
		if(listTagsForStreamRequest.token != null) {
			listTagsForStreamRequest.token.linkAndExpire();
			listTagsForStreamRequest.token = null;
		}
    	String streamName = listTagsForStreamRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("listTagsForStream").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public MergeShardsResult mergeShards(MergeShardsRequest mergeShardsRequest) {
		if(mergeShardsRequest.token != null) {
			mergeShardsRequest.token.linkAndExpire();
			mergeShardsRequest.token = null;
		}
    	String streamName = mergeShardsRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("mergeShards").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public PutRecordResult putRecord(PutRecordRequest putRecordRequest) {
		if(putRecordRequest.token != null) {
			putRecordRequest.token.linkAndExpire();
			putRecordRequest.token = null;
		}
    	String streamName = putRecordRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("putRecord").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public PutRecordsResult putRecords(PutRecordsRequest putRecordsRequest) {
		if(putRecordsRequest.token != null) {
			putRecordsRequest.token.linkAndExpire();
			putRecordsRequest.token = null;
		}
    	String streamName = putRecordsRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("putRecords").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public RemoveTagsFromStreamResult removeTagsFromStream(RemoveTagsFromStreamRequest removeTagsFromStreamRequest) {
		if(removeTagsFromStreamRequest.token != null) {
			removeTagsFromStreamRequest.token.linkAndExpire();
			removeTagsFromStreamRequest.token = null;
		}
    	String streamName = removeTagsFromStreamRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("removeTagsFromStream").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public SplitShardResult splitShard(SplitShardRequest splitShardRequest) {
		if(splitShardRequest.token != null) {
			splitShardRequest.token.linkAndExpire();
			splitShardRequest.token = null;
		}
    	String streamName = splitShardRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("splitShard").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	return Weaver.callOriginal();
    }

	@Trace(async=true)
    public void shutdown() {
    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","shutdown"});
    	Weaver.callOriginal();
    }
	
}
