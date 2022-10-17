# CreateJobRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceleration_settings** | [**CreateJobRequestAccelerationSettings**](CreateJobRequestAccelerationSettings.md) |  | [optional] 
**billing_tags_source** | **str** | The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up. | [optional] 
**client_request_token** | **str** | Prevent duplicate jobs from being created and ensure idempotency for your requests. A client request token can be any string that includes up to 64 ASCII characters. If you reuse a client request token within one minute of a successful request, the API returns the job details of the original request instead. For more information see https://docs.aws.amazon.com/mediaconvert/latest/apireference/idempotency.html. | [optional] 
**hop_destinations** | [**List[HopDestination]**](HopDestination.md) | Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your job to. Specify an alternate queue and the maximum time that your job will wait in the initial queue before hopping. For more information about this feature, see the AWS Elemental MediaConvert User Guide. | [optional] 
**job_template** | **str** | Optional. When you create a job, you can either specify a job template or specify the transcoding settings individually. | [optional] 
**priority** | **int** | Optional. Specify the relative priority for this job. In any given queue, the service begins processing the job with the highest value first. When more than one job has the same priority, the service begins processing the job that you submitted first. If you don&#39;t specify a priority, the service uses the default value 0. | [optional] 
**queue** | **str** | Optional. When you create a job, you can specify a queue to send it to. If you don&#39;t specify, the job will go to the default queue. For more about queues, see the User Guide topic at https://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html. | [optional] 
**role** | **str** | Required. The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html. | 
**settings** | [**CreateJobRequestSettings**](CreateJobRequestSettings.md) |  | 
**simulate_reserved_queue** | **str** | Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see with one RTS in a reserved queue. This setting is disabled by default. | [optional] 
**status_update_interval** | **str** | Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error. | [optional] 
**tags** | **Dict[str, str]** | Optional. The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.  Use standard AWS tags on your job for automatic integration with AWS services and for custom integrations and workflows. | [optional] 
**user_metadata** | **Dict[str, str]** | Optional. User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value pairs.  Use only for existing integrations or workflows that rely on job metadata tags. Otherwise, we recommend that you use standard AWS tags. | [optional] 

## Example

```python
from openapi_client.models.create_job_request import CreateJobRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobRequest from a JSON string
create_job_request_instance = CreateJobRequest.from_json(json)
# print the JSON string representation of the object
print(CreateJobRequest.to_json())

# convert the object into a dict
create_job_request_dict = create_job_request_instance.to_dict()
# create an instance of CreateJobRequest from a dict
create_job_request_from_dict = CreateJobRequest.from_dict(create_job_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


