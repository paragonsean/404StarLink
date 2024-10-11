# Job

Job.

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
from openapi_client.models.job import Job

# TODO update the JSON string below
json = "{}"
# create an instance of Job from a JSON string
job_instance = Job.from_json(json)
# print the JSON string representation of the object
print(Job.to_json())

# convert the object into a dict
job_dict = job_instance.to_dict()
# create an instance of Job from a dict
job_from_dict = Job.from_dict(job_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


