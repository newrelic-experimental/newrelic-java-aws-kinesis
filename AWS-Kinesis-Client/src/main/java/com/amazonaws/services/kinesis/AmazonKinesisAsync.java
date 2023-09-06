package com.amazonaws.services.kinesis;

import com.amazonaws.services.kinesis.model.*;
import com.newrelic.api.agent.GenericParameters;
import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import com.amazonaws.handlers.AsyncHandler;

import java.net.URI;
import java.util.concurrent.Future;

@Weave(type=MatchType.Interface)
public abstract class AmazonKinesisAsync {

	@Trace
	public Future<AddTagsToStreamResult> addTagsToStreamAsync(AddTagsToStreamRequest addTagsToStreamRequest, AsyncHandler<AddTagsToStreamRequest, AddTagsToStreamResult> asyncHandler) {
		String streamName = addTagsToStreamRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("addTagsToStreamAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//		NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","addTagsToStreamAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(addTagsToStreamRequest.token == null) {
				addTagsToStreamRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<CreateStreamResult> createStreamAsync(CreateStreamRequest createStreamRequest, AsyncHandler<CreateStreamRequest, CreateStreamResult> asyncHandler) {
    	String streamName = createStreamRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("createStreamAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","createStreamAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(createStreamRequest.token == null) {
				createStreamRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<DecreaseStreamRetentionPeriodResult> decreaseStreamRetentionPeriodAsync(DecreaseStreamRetentionPeriodRequest decreaseStreamRetentionPeriodRequest,
			AsyncHandler<DecreaseStreamRetentionPeriodRequest, DecreaseStreamRetentionPeriodResult> asyncHandler) {
    	String streamName = decreaseStreamRetentionPeriodRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("decreaseStreamRetentionPeriodAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","decreaseStreamRetentionPeriodAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(decreaseStreamRetentionPeriodRequest.token == null) {
				decreaseStreamRetentionPeriodRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<DeleteStreamResult> deleteStreamAsync(DeleteStreamRequest deleteStreamRequest, AsyncHandler<DeleteStreamRequest, DeleteStreamResult> asyncHandler) {
    	String streamName = deleteStreamRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("deleteStreamAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","deleteStreamAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(deleteStreamRequest.token == null) {
				deleteStreamRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest describeStreamRequest, AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {
    	String streamName = describeStreamRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("describeStreamAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","describeStreamAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(describeStreamRequest.token == null) {
				describeStreamRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<DisableEnhancedMonitoringResult> disableEnhancedMonitoringAsync(DisableEnhancedMonitoringRequest disableEnhancedMonitoringRequest, AsyncHandler<DisableEnhancedMonitoringRequest, DisableEnhancedMonitoringResult> asyncHandler) {
    	String streamName = disableEnhancedMonitoringRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("disableEnhancedMonitoringAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","disableEnhancedMonitoringAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(disableEnhancedMonitoringRequest.token == null) {
				disableEnhancedMonitoringRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<EnableEnhancedMonitoringResult> enableEnhancedMonitoringAsync(EnableEnhancedMonitoringRequest enableEnhancedMonitoringRequest, AsyncHandler<EnableEnhancedMonitoringRequest, EnableEnhancedMonitoringResult> asyncHandler) {
    	String streamName = enableEnhancedMonitoringRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("enableEnhancedMonitoringAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","enableEnhancedMonitoringAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(enableEnhancedMonitoringRequest.token == null) {
				enableEnhancedMonitoringRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<GetRecordsResult> getRecordsAsync(GetRecordsRequest getRecordsRequest, AsyncHandler<GetRecordsRequest, GetRecordsResult> asyncHandler) {
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","getRecordsAsync"});
    	String uriString = "kinesis://GetRecordsRequestAsync";
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("getRecordsAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(getRecordsRequest.token == null) {
				getRecordsRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<GetShardIteratorResult> getShardIteratorAsync(GetShardIteratorRequest getShardIteratorRequest, AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {
    	String streamName = getShardIteratorRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("getShardIteratorAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//   	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","getShardIteratorAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(getShardIteratorRequest.token == null) {
				getShardIteratorRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<IncreaseStreamRetentionPeriodResult> increaseStreamRetentionPeriodAsync(IncreaseStreamRetentionPeriodRequest increaseStreamRetentionPeriodRequest,AsyncHandler<IncreaseStreamRetentionPeriodRequest, IncreaseStreamRetentionPeriodResult> asyncHandler) {
    	String streamName = increaseStreamRetentionPeriodRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("increaseStreamRetentionPeriodAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","increaseStreamRetentionPeriodAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(increaseStreamRetentionPeriodRequest.token == null) {
				increaseStreamRetentionPeriodRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest listStreamsRequest, AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","listStreamsAsync"});
    	String uriString = "kinesis://ListStreamsRequest";
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("listStreamsAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
		
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(listStreamsRequest.token == null) {
				listStreamsRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<ListTagsForStreamResult> listTagsForStreamAsync(ListTagsForStreamRequest listTagsForStreamRequest, AsyncHandler<ListTagsForStreamRequest, ListTagsForStreamResult> asyncHandler) {
    	String streamName = listTagsForStreamRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("listTagsForStreamAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","listTagsForStreamAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(listTagsForStreamRequest.token == null) {
				listTagsForStreamRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<MergeShardsResult> mergeShardsAsync(MergeShardsRequest mergeShardsRequest, AsyncHandler<MergeShardsRequest, MergeShardsResult> asyncHandler) {
    	String streamName = mergeShardsRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("mergeShardsAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//   	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","mergeShardsAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(mergeShardsRequest.token == null) {
				mergeShardsRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<PutRecordResult> putRecordAsync(PutRecordRequest putRecordRequest, AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {
    	String streamName = putRecordRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("putRecordAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","putRecordAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(putRecordRequest.token == null) {
				putRecordRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<PutRecordsResult> putRecordsAsync(PutRecordsRequest putRecordsRequest, AsyncHandler<PutRecordsRequest, PutRecordsResult> asyncHandler) {
    	String streamName = putRecordsRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("putRecordsAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","putRecordsAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(putRecordsRequest.token == null) {
				putRecordsRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<RemoveTagsFromStreamResult> removeTagsFromStreamAsync(RemoveTagsFromStreamRequest removeTagsFromStreamRequest, AsyncHandler<RemoveTagsFromStreamRequest, RemoveTagsFromStreamResult> asyncHandler) {
    	String streamName = removeTagsFromStreamRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("removeTagsFromStreamAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","removeTagsFromStreamAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(removeTagsFromStreamRequest.token == null) {
				removeTagsFromStreamRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}

	@Trace
	public Future<SplitShardResult> splitShardAsync(SplitShardRequest splitShardRequest, AsyncHandler<SplitShardRequest, SplitShardResult> asyncHandler) {
    	String streamName = splitShardRequest.getStreamName();
    	String uriString = "kinesis://" + streamName;
    	URI uri = URI.create(uriString);
    	GenericParameters params = GenericParameters.library("Kinesis").uri(uri).procedure("splitShardAsync").build();
    	NewRelic.getAgent().getTracedMethod().reportAsExternal(params);
//    	NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","Kinesis","splitShardAsync",streamName});
    	if(asyncHandler != null) {
			if(asyncHandler.token == null) {
				asyncHandler.token = NewRelic.getAgent().getTransaction().getToken();
			}
		} else {
			if(splitShardRequest.token == null) {
				splitShardRequest.token = NewRelic.getAgent().getTransaction().getToken();
			}
		}
		return Weaver.callOriginal();
	}


}
