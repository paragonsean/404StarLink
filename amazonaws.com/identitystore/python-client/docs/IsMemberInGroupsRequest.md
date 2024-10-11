# IsMemberInGroupsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**member_id** | [**IsMemberInGroupsRequestMemberId**](IsMemberInGroupsRequestMemberId.md) |  | 
**group_ids** | **List** |  | 

## Example

```python
from openapi_client.models.is_member_in_groups_request import IsMemberInGroupsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of IsMemberInGroupsRequest from a JSON string
is_member_in_groups_request_instance = IsMemberInGroupsRequest.from_json(json)
# print the JSON string representation of the object
print(IsMemberInGroupsRequest.to_json())

# convert the object into a dict
is_member_in_groups_request_dict = is_member_in_groups_request_instance.to_dict()
# create an instance of IsMemberInGroupsRequest from a dict
is_member_in_groups_request_from_dict = IsMemberInGroupsRequest.from_dict(is_member_in_groups_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


