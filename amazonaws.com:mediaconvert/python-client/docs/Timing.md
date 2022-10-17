# Timing

Information about when jobs are submitted, started, and finished is specified in Unix epoch format in seconds.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finish_time** | **datetime** |  | [optional] 
**start_time** | **datetime** |  | [optional] 
**submit_time** | **datetime** |  | [optional] 

## Example

```python
from openapi_client.models.timing import Timing

# TODO update the JSON string below
json = "{}"
# create an instance of Timing from a JSON string
timing_instance = Timing.from_json(json)
# print the JSON string representation of the object
print(Timing.to_json())

# convert the object into a dict
timing_dict = timing_instance.to_dict()
# create an instance of Timing from a dict
timing_from_dict = Timing.from_dict(timing_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


