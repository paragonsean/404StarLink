# CreateGroupMembershipRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**group_id** | **str** |  | 
**member_id** | [**CreateGroupMembershipRequestMemberId**](CreateGroupMembershipRequestMemberId.md) |  | 

## Example

```python
from openapi_client.models.create_group_membership_request import CreateGroupMembershipRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateGroupMembershipRequest from a JSON string
create_group_membership_request_instance = CreateGroupMembershipRequest.from_json(json)
# print the JSON string representation of the object
print(CreateGroupMembershipRequest.to_json())

# convert the object into a dict
create_group_membership_request_dict = create_group_membership_request_instance.to_dict()
# create an instance of CreateGroupMembershipRequest from a dict
create_group_membership_request_from_dict = CreateGroupMembershipRequest.from_dict(create_group_membership_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


