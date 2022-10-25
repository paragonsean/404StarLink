# GetGroupMembershipIdRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**group_id** | **str** |  | 
**member_id** | [**CreateGroupMembershipRequestMemberId**](CreateGroupMembershipRequestMemberId.md) |  | 

## Example

```python
from openapi_client.models.get_group_membership_id_request import GetGroupMembershipIdRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetGroupMembershipIdRequest from a JSON string
get_group_membership_id_request_instance = GetGroupMembershipIdRequest.from_json(json)
# print the JSON string representation of the object
print(GetGroupMembershipIdRequest.to_json())

# convert the object into a dict
get_group_membership_id_request_dict = get_group_membership_id_request_instance.to_dict()
# create an instance of GetGroupMembershipIdRequest from a dict
get_group_membership_id_request_from_dict = GetGroupMembershipIdRequest.from_dict(get_group_membership_id_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


