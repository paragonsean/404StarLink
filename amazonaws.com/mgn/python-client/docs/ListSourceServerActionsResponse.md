# ListSourceServerActionsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_source_server_actions_response import ListSourceServerActionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListSourceServerActionsResponse from a JSON string
list_source_server_actions_response_instance = ListSourceServerActionsResponse.from_json(json)
# print the JSON string representation of the object
print(ListSourceServerActionsResponse.to_json())

# convert the object into a dict
list_source_server_actions_response_dict = list_source_server_actions_response_instance.to_dict()
# create an instance of ListSourceServerActionsResponse from a dict
list_source_server_actions_response_from_dict = ListSourceServerActionsResponse.from_dict(list_source_server_actions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


