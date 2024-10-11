# ListGroupMembershipsForMemberRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**member_id** | [**CreateGroupMembershipRequestMemberId**](CreateGroupMembershipRequestMemberId.md) |  | 
**max_results** | **int** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_group_memberships_for_member_request import ListGroupMembershipsForMemberRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListGroupMembershipsForMemberRequest from a JSON string
list_group_memberships_for_member_request_instance = ListGroupMembershipsForMemberRequest.from_json(json)
# print the JSON string representation of the object
print(ListGroupMembershipsForMemberRequest.to_json())

# convert the object into a dict
list_group_memberships_for_member_request_dict = list_group_memberships_for_member_request_instance.to_dict()
# create an instance of ListGroupMembershipsForMemberRequest from a dict
list_group_memberships_for_member_request_from_dict = ListGroupMembershipsForMemberRequest.from_dict(list_group_memberships_for_member_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


