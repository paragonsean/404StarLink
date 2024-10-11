# CreateGroupMembershipResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**membership_id** | **str** |  | 
**identity_store_id** | **str** |  | 

## Example

```python
from openapi_client.models.create_group_membership_response import CreateGroupMembershipResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateGroupMembershipResponse from a JSON string
create_group_membership_response_instance = CreateGroupMembershipResponse.from_json(json)
# print the JSON string representation of the object
print(CreateGroupMembershipResponse.to_json())

# convert the object into a dict
create_group_membership_response_dict = create_group_membership_response_instance.to_dict()
# create an instance of CreateGroupMembershipResponse from a dict
create_group_membership_response_from_dict = CreateGroupMembershipResponse.from_dict(create_group_membership_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


