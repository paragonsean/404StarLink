# StartCutoverResponseJob


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**creation_date_time** | **str** |  | [optional] 
**end_date_time** | **str** |  | [optional] 
**initiated_by** | [**InitiatedBy**](InitiatedBy.md) |  | [optional] 
**job_id** | **str** |  | 
**participating_servers** | **List** |  | [optional] 
**status** | [**JobStatus**](JobStatus.md) |  | [optional] 
**tags** | **Dict** |  | [optional] 
**type** | [**JobType**](JobType.md) |  | [optional] 

## Example

```python
from openapi_client.models.start_cutover_response_job import StartCutoverResponseJob

# TODO update the JSON string below
json = "{}"
# create an instance of StartCutoverResponseJob from a JSON string
start_cutover_response_job_instance = StartCutoverResponseJob.from_json(json)
# print the JSON string representation of the object
print(StartCutoverResponseJob.to_json())

# convert the object into a dict
start_cutover_response_job_dict = start_cutover_response_job_instance.to_dict()
# create an instance of StartCutoverResponseJob from a dict
start_cutover_response_job_from_dict = StartCutoverResponseJob.from_dict(start_cutover_response_job_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


