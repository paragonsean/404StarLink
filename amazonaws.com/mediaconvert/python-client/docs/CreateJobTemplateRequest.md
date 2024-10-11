# CreateJobTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceleration_settings** | [**CreateJobRequestAccelerationSettings**](CreateJobRequestAccelerationSettings.md) |  | [optional] 
**category** | **str** | Optional. A category for the job template you are creating | [optional] 
**description** | **str** | Optional. A description of the job template you are creating. | [optional] 
**hop_destinations** | [**List[HopDestination]**](HopDestination.md) | Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your job to. Specify an alternate queue and the maximum time that your job will wait in the initial queue before hopping. For more information about this feature, see the AWS Elemental MediaConvert User Guide. | [optional] 
**name** | **str** | The name of the job template you are creating. | 
**priority** | **int** | Specify the relative priority for this job. In any given queue, the service begins processing the job with the highest value first. When more than one job has the same priority, the service begins processing the job that you submitted first. If you don&#39;t specify a priority, the service uses the default value 0. | [optional] 
**queue** | **str** | Optional. The queue that jobs created from this template are assigned to. If you don&#39;t specify this, jobs will go to the default queue. | [optional] 
**settings** | [**CreateJobTemplateRequestSettings**](CreateJobTemplateRequestSettings.md) |  | 
**status_update_interval** | **str** | Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error. | [optional] 
**tags** | **Dict[str, str]** | The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key. | [optional] 

## Example

```python
from openapi_client.models.create_job_template_request import CreateJobTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobTemplateRequest from a JSON string
create_job_template_request_instance = CreateJobTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(CreateJobTemplateRequest.to_json())

# convert the object into a dict
create_job_template_request_dict = create_job_template_request_instance.to_dict()
# create an instance of CreateJobTemplateRequest from a dict
create_job_template_request_from_dict = CreateJobTemplateRequest.from_dict(create_job_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


