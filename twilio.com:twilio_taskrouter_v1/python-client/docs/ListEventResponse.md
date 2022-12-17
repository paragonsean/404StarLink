# ListEventResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**List[TaskrouterV1WorkspaceEvent]**](TaskrouterV1WorkspaceEvent.md) |  | [optional] 
**meta** | [**ListWorkspaceResponseMeta**](ListWorkspaceResponseMeta.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_event_response import ListEventResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListEventResponse from a JSON string
list_event_response_instance = ListEventResponse.from_json(json)
# print the JSON string representation of the object
print(ListEventResponse.to_json())

# convert the object into a dict
list_event_response_dict = list_event_response_instance.to_dict()
# create an instance of ListEventResponse from a dict
list_event_response_from_dict = ListEventResponse.from_dict(list_event_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


