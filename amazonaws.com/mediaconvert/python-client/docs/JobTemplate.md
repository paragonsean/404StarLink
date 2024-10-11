# JobTemplate

A job template is a pre-made set of encoding instructions that you can use to quickly create a job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceleration_settings** | [**JobAccelerationSettings**](JobAccelerationSettings.md) |  | [optional] 
**arn** | **str** |  | [optional] 
**category** | **str** |  | [optional] 
**created_at** | **datetime** |  | [optional] 
**description** | **str** |  | [optional] 
**hop_destinations** | **List** |  | [optional] 
**last_updated** | **datetime** |  | [optional] 
**name** | **str** |  | 
**priority** | **int** |  | [optional] 
**queue** | **str** |  | [optional] 
**settings** | [**CreateJobTemplateRequestSettings**](CreateJobTemplateRequestSettings.md) |  | 
**status_update_interval** | [**StatusUpdateInterval**](StatusUpdateInterval.md) |  | [optional] 
**type** | [**Type**](Type.md) |  | [optional] 

## Example

```python
from openapi_client.models.job_template import JobTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of JobTemplate from a JSON string
job_template_instance = JobTemplate.from_json(json)
# print the JSON string representation of the object
print(JobTemplate.to_json())

# convert the object into a dict
job_template_dict = job_template_instance.to_dict()
# create an instance of JobTemplate from a dict
job_template_from_dict = JobTemplate.from_dict(job_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


