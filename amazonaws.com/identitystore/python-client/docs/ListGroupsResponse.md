# ListGroupsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | **List** |  | 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_groups_response import ListGroupsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListGroupsResponse from a JSON string
list_groups_response_instance = ListGroupsResponse.from_json(json)
# print the JSON string representation of the object
print(ListGroupsResponse.to_json())

# convert the object into a dict
list_groups_response_dict = list_groups_response_instance.to_dict()
# create an instance of ListGroupsResponse from a dict
list_groups_response_from_dict = ListGroupsResponse.from_dict(list_groups_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


