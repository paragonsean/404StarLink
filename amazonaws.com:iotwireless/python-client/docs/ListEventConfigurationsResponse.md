# ListEventConfigurationsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**event_configurations_list** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_event_configurations_response import ListEventConfigurationsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListEventConfigurationsResponse from a JSON string
list_event_configurations_response_instance = ListEventConfigurationsResponse.from_json(json)
# print the JSON string representation of the object
print(ListEventConfigurationsResponse.to_json())

# convert the object into a dict
list_event_configurations_response_dict = list_event_configurations_response_instance.to_dict()
# create an instance of ListEventConfigurationsResponse from a dict
list_event_configurations_response_from_dict = ListEventConfigurationsResponse.from_dict(list_event_configurations_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


