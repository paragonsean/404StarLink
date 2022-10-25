# ListGroupMembershipsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**group_id** | **str** |  | 
**max_results** | **int** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_group_memberships_request import ListGroupMembershipsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListGroupMembershipsRequest from a JSON string
list_group_memberships_request_instance = ListGroupMembershipsRequest.from_json(json)
# print the JSON string representation of the object
print(ListGroupMembershipsRequest.to_json())

# convert the object into a dict
list_group_memberships_request_dict = list_group_memberships_request_instance.to_dict()
# create an instance of ListGroupMembershipsRequest from a dict
list_group_memberships_request_from_dict = ListGroupMembershipsRequest.from_dict(list_group_memberships_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


