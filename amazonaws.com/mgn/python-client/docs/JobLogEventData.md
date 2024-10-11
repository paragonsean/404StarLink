# JobLogEventData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversion_server_id** | **str** |  | [optional] 
**raw_error** | **str** |  | [optional] 
**source_server_id** | **str** |  | [optional] 
**target_instance_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.job_log_event_data import JobLogEventData

# TODO update the JSON string below
json = "{}"
# create an instance of JobLogEventData from a JSON string
job_log_event_data_instance = JobLogEventData.from_json(json)
# print the JSON string representation of the object
print(JobLogEventData.to_json())

# convert the object into a dict
job_log_event_data_dict = job_log_event_data_instance.to_dict()
# create an instance of JobLogEventData from a dict
job_log_event_data_from_dict = JobLogEventData.from_dict(job_log_event_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


