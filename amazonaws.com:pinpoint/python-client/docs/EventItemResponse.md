# EventItemResponse

Provides the status code and message that result from processing an event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**status_code** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.event_item_response import EventItemResponse

# TODO update the JSON string below
json = "{}"
# create an instance of EventItemResponse from a JSON string
event_item_response_instance = EventItemResponse.from_json(json)
# print the JSON string representation of the object
print(EventItemResponse.to_json())

# convert the object into a dict
event_item_response_dict = event_item_response_instance.to_dict()
# create an instance of EventItemResponse from a dict
event_item_response_from_dict = EventItemResponse.from_dict(event_item_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


