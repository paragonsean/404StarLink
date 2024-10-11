# DescribeGroupRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**group_id** | **str** |  | 

## Example

```python
from openapi_client.models.describe_group_request import DescribeGroupRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeGroupRequest from a JSON string
describe_group_request_instance = DescribeGroupRequest.from_json(json)
# print the JSON string representation of the object
print(DescribeGroupRequest.to_json())

# convert the object into a dict
describe_group_request_dict = describe_group_request_instance.to_dict()
# create an instance of DescribeGroupRequest from a dict
describe_group_request_from_dict = DescribeGroupRequest.from_dict(describe_group_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


