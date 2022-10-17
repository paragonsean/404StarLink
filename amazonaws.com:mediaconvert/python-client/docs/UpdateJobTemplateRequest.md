# UpdateJobTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceleration_settings** | [**CreateJobRequestAccelerationSettings**](CreateJobRequestAccelerationSettings.md) |  | [optional] 
**category** | **str** | The new category for the job template, if you are changing it. | [optional] 
**description** | **str** | The new description for the job template, if you are changing it. | [optional] 
**hop_destinations** | [**List[HopDestination]**](HopDestination.md) | Optional list of hop destinations. | [optional] 
**priority** | **int** | Specify the relative priority for this job. In any given queue, the service begins processing the job with the highest value first. When more than one job has the same priority, the service begins processing the job that you submitted first. If you don&#39;t specify a priority, the service uses the default value 0. | [optional] 
**queue** | **str** | The new queue for the job template, if you are changing it. | [optional] 
**settings** | [**CreateJobTemplateRequestSettings**](CreateJobTemplateRequestSettings.md) |  | [optional] 
**status_update_interval** | **str** | Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error. | [optional] 

## Example

```python
from openapi_client.models.update_job_template_request import UpdateJobTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateJobTemplateRequest from a JSON string
update_job_template_request_instance = UpdateJobTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateJobTemplateRequest.to_json())

# convert the object into a dict
update_job_template_request_dict = update_job_template_request_instance.to_dict()
# create an instance of UpdateJobTemplateRequest from a dict
update_job_template_request_from_dict = UpdateJobTemplateRequest.from_dict(update_job_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


