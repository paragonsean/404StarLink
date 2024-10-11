# WaitTime

Specifies a duration or a date and time that indicates when Amazon Pinpoint determines whether an activity's conditions have been met or an activity moves participants to the next activity in a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wait_for** | **str** |  | [optional] 
**wait_until** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.wait_time import WaitTime

# TODO update the JSON string below
json = "{}"
# create an instance of WaitTime from a JSON string
wait_time_instance = WaitTime.from_json(json)
# print the JSON string representation of the object
print(WaitTime.to_json())

# convert the object into a dict
wait_time_dict = wait_time_instance.to_dict()
# create an instance of WaitTime from a dict
wait_time_from_dict = WaitTime.from_dict(wait_time_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


