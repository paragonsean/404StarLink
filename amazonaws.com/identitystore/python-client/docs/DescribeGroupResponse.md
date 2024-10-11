# DescribeGroupResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_id** | **str** |  | 
**display_name** | **str** |  | [optional] 
**external_ids** | **List** |  | [optional] 
**description** | **str** |  | [optional] 
**identity_store_id** | **str** |  | 

## Example

```python
from openapi_client.models.describe_group_response import DescribeGroupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeGroupResponse from a JSON string
describe_group_response_instance = DescribeGroupResponse.from_json(json)
# print the JSON string representation of the object
print(DescribeGroupResponse.to_json())

# convert the object into a dict
describe_group_response_dict = describe_group_response_instance.to_dict()
# create an instance of DescribeGroupResponse from a dict
describe_group_response_from_dict = DescribeGroupResponse.from_dict(describe_group_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


