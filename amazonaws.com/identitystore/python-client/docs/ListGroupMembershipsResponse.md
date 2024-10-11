# ListGroupMembershipsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_memberships** | **List** |  | 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_group_memberships_response import ListGroupMembershipsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListGroupMembershipsResponse from a JSON string
list_group_memberships_response_instance = ListGroupMembershipsResponse.from_json(json)
# print the JSON string representation of the object
print(ListGroupMembershipsResponse.to_json())

# convert the object into a dict
list_group_memberships_response_dict = list_group_memberships_response_instance.to_dict()
# create an instance of ListGroupMembershipsResponse from a dict
list_group_memberships_response_from_dict = ListGroupMembershipsResponse.from_dict(list_group_memberships_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


