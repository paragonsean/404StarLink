# DescribeGroupMembershipResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**membership_id** | **str** |  | 
**group_id** | **str** |  | 
**member_id** | [**MemberId**](MemberId.md) |  | 

## Example

```python
from openapi_client.models.describe_group_membership_response import DescribeGroupMembershipResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeGroupMembershipResponse from a JSON string
describe_group_membership_response_instance = DescribeGroupMembershipResponse.from_json(json)
# print the JSON string representation of the object
print(DescribeGroupMembershipResponse.to_json())

# convert the object into a dict
describe_group_membership_response_dict = describe_group_membership_response_instance.to_dict()
# create an instance of DescribeGroupMembershipResponse from a dict
describe_group_membership_response_from_dict = DescribeGroupMembershipResponse.from_dict(describe_group_membership_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


