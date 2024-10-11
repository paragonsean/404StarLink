# ListGroupMembershipsForMemberResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_memberships** | **List** |  | 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_group_memberships_for_member_response import ListGroupMembershipsForMemberResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListGroupMembershipsForMemberResponse from a JSON string
list_group_memberships_for_member_response_instance = ListGroupMembershipsForMemberResponse.from_json(json)
# print the JSON string representation of the object
print(ListGroupMembershipsForMemberResponse.to_json())

# convert the object into a dict
list_group_memberships_for_member_response_dict = list_group_memberships_for_member_response_instance.to_dict()
# create an instance of ListGroupMembershipsForMemberResponse from a dict
list_group_memberships_for_member_response_from_dict = ListGroupMembershipsForMemberResponse.from_dict(list_group_memberships_for_member_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


