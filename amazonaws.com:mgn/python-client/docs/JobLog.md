# JobLog

Job log.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | [**JobLogEvent**](JobLogEvent.md) |  | [optional] 
**event_data** | [**JobLogEventData**](JobLogEventData.md) |  | [optional] 
**log_date_time** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.job_log import JobLog

# TODO update the JSON string below
json = "{}"
# create an instance of JobLog from a JSON string
job_log_instance = JobLog.from_json(json)
# print the JSON string representation of the object
print(JobLog.to_json())

# convert the object into a dict
job_log_dict = job_log_instance.to_dict()
# create an instance of JobLog from a dict
job_log_from_dict = JobLog.from_dict(job_log_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


