# CreateJobTemplateResponseJobTemplate


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
from openapi_client.models.create_job_template_response_job_template import CreateJobTemplateResponseJobTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobTemplateResponseJobTemplate from a JSON string
create_job_template_response_job_template_instance = CreateJobTemplateResponseJobTemplate.from_json(json)
# print the JSON string representation of the object
print(CreateJobTemplateResponseJobTemplate.to_json())

# convert the object into a dict
create_job_template_response_job_template_dict = create_job_template_response_job_template_instance.to_dict()
# create an instance of CreateJobTemplateResponseJobTemplate from a dict
create_job_template_response_job_template_from_dict = CreateJobTemplateResponseJobTemplate.from_dict(create_job_template_response_job_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


