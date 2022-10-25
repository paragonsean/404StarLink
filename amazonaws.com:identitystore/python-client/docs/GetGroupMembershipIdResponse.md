# GetGroupMembershipIdResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**membership_id** | **str** |  | 
**identity_store_id** | **str** |  | 

## Example

```python
from openapi_client.models.get_group_membership_id_response import GetGroupMembershipIdResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetGroupMembershipIdResponse from a JSON string
get_group_membership_id_response_instance = GetGroupMembershipIdResponse.from_json(json)
# print the JSON string representation of the object
print(GetGroupMembershipIdResponse.to_json())

# convert the object into a dict
get_group_membership_id_response_dict = get_group_membership_id_response_instance.to_dict()
# create an instance of GetGroupMembershipIdResponse from a dict
get_group_membership_id_response_from_dict = GetGroupMembershipIdResponse.from_dict(get_group_membership_id_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


