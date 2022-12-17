# ListActivityResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activities** | [**List[TaskrouterV1WorkspaceActivity]**](TaskrouterV1WorkspaceActivity.md) |  | [optional] 
**meta** | [**ListWorkspaceResponseMeta**](ListWorkspaceResponseMeta.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_activity_response import ListActivityResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListActivityResponse from a JSON string
list_activity_response_instance = ListActivityResponse.from_json(json)
# print the JSON string representation of the object
print(ListActivityResponse.to_json())

# convert the object into a dict
list_activity_response_dict = list_activity_response_instance.to_dict()
# create an instance of ListActivityResponse from a dict
list_activity_response_from_dict = ListActivityResponse.from_dict(list_activity_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


