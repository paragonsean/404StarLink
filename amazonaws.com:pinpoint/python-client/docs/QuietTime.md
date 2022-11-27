# QuietTime

Specifies the start and end times that define a time range when messages aren't sent to endpoints.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end** | **str** |  | [optional] 
**start** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.quiet_time import QuietTime

# TODO update the JSON string below
json = "{}"
# create an instance of QuietTime from a JSON string
quiet_time_instance = QuietTime.from_json(json)
# print the JSON string representation of the object
print(QuietTime.to_json())

# convert the object into a dict
quiet_time_dict = quiet_time_instance.to_dict()
# create an instance of QuietTime from a dict
quiet_time_from_dict = QuietTime.from_dict(quiet_time_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


