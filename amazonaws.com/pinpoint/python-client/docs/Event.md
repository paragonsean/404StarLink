# Event

Specifies information about an event that reports data to Amazon Pinpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_package_name** | **str** |  | [optional] 
**app_title** | **str** |  | [optional] 
**app_version_code** | **str** |  | [optional] 
**attributes** | **Dict** |  | [optional] 
**client_sdk_version** | **str** |  | [optional] 
**event_type** | **str** |  | 
**metrics** | **Dict** |  | [optional] 
**sdk_name** | **str** |  | [optional] 
**session** | [**EventSession**](EventSession.md) |  | [optional] 
**timestamp** | **str** |  | 

## Example

```python
from openapi_client.models.event import Event

# TODO update the JSON string below
json = "{}"
# create an instance of Event from a JSON string
event_instance = Event.from_json(json)
# print the JSON string representation of the object
print(Event.to_json())

# convert the object into a dict
event_dict = event_instance.to_dict()
# create an instance of Event from a dict
event_from_dict = Event.from_dict(event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


