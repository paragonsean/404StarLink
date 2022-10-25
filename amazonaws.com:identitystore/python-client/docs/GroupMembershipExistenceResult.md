# GroupMembershipExistenceResult

Indicates whether a resource is a member of a group in the identity store.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_id** | **str** |  | [optional] 
**member_id** | [**CreateGroupMembershipRequestMemberId**](CreateGroupMembershipRequestMemberId.md) |  | [optional] 
**membership_exists** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.group_membership_existence_result import GroupMembershipExistenceResult

# TODO update the JSON string below
json = "{}"
# create an instance of GroupMembershipExistenceResult from a JSON string
group_membership_existence_result_instance = GroupMembershipExistenceResult.from_json(json)
# print the JSON string representation of the object
print(GroupMembershipExistenceResult.to_json())

# convert the object into a dict
group_membership_existence_result_dict = group_membership_existence_result_instance.to_dict()
# create an instance of GroupMembershipExistenceResult from a dict
group_membership_existence_result_from_dict = GroupMembershipExistenceResult.from_dict(group_membership_existence_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


