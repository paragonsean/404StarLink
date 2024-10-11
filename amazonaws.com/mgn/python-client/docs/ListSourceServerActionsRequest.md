# ListSourceServerActionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**ListSourceServerActionsRequestFilters**](ListSourceServerActionsRequestFilters.md) |  | [optional] 
**max_results** | **int** | Maximum amount of items to return when listing source server post migration custom actions. | [optional] 
**next_token** | **str** | Next token to use when listing source server post migration custom actions. | [optional] 
**source_server_id** | **str** | Source server ID. | 

## Example

```python
from openapi_client.models.list_source_server_actions_request import ListSourceServerActionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListSourceServerActionsRequest from a JSON string
list_source_server_actions_request_instance = ListSourceServerActionsRequest.from_json(json)
# print the JSON string representation of the object
print(ListSourceServerActionsRequest.to_json())

# convert the object into a dict
list_source_server_actions_request_dict = list_source_server_actions_request_instance.to_dict()
# create an instance of ListSourceServerActionsRequest from a dict
list_source_server_actions_request_from_dict = ListSourceServerActionsRequest.from_dict(list_source_server_actions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


