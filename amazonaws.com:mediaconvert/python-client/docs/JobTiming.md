# JobTiming


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finish_time** | **datetime** |  | [optional] 
**start_time** | **datetime** |  | [optional] 
**submit_time** | **datetime** |  | [optional] 

## Example

```python
from openapi_client.models.job_timing import JobTiming

# TODO update the JSON string below
json = "{}"
# create an instance of JobTiming from a JSON string
job_timing_instance = JobTiming.from_json(json)
# print the JSON string representation of the object
print(JobTiming.to_json())

# convert the object into a dict
job_timing_dict = job_timing_instance.to_dict()
# create an instance of JobTiming from a dict
job_timing_from_dict = JobTiming.from_dict(job_timing_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


