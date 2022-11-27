# OpenHours

The time when journey allow to send messages. QuietTime should be configured first and SendingSchedule should be set to true.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **Dict** |  | [optional] 
**sms** | **Dict** |  | [optional] 
**push** | **Dict** |  | [optional] 
**voice** | **Dict** |  | [optional] 
**custom** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.open_hours import OpenHours

# TODO update the JSON string below
json = "{}"
# create an instance of OpenHours from a JSON string
open_hours_instance = OpenHours.from_json(json)
# print the JSON string representation of the object
print(OpenHours.to_json())

# convert the object into a dict
open_hours_dict = open_hours_instance.to_dict()
# create an instance of OpenHours from a dict
open_hours_from_dict = OpenHours.from_dict(open_hours_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


