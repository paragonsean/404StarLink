# GroupMembership

Contains the identifiers for a group, a group member, and a <code>GroupMembership</code> object in the identity store.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**membership_id** | **str** |  | [optional] 
**group_id** | **str** |  | [optional] 
**member_id** | [**CreateGroupMembershipRequestMemberId**](CreateGroupMembershipRequestMemberId.md) |  | [optional] 

## Example

```python
from openapi_client.models.group_membership import GroupMembership

# TODO update the JSON string below
json = "{}"
# create an instance of GroupMembership from a JSON string
group_membership_instance = GroupMembership.from_json(json)
# print the JSON string representation of the object
print(GroupMembership.to_json())

# convert the object into a dict
group_membership_dict = group_membership_instance.to_dict()
# create an instance of GroupMembership from a dict
group_membership_from_dict = GroupMembership.from_dict(group_membership_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


