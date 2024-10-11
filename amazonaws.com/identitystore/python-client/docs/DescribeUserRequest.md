# DescribeUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**user_id** | **str** |  | 

## Example

```python
from openapi_client.models.describe_user_request import DescribeUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeUserRequest from a JSON string
describe_user_request_instance = DescribeUserRequest.from_json(json)
# print the JSON string representation of the object
print(DescribeUserRequest.to_json())

# convert the object into a dict
describe_user_request_dict = describe_user_request_instance.to_dict()
# create an instance of DescribeUserRequest from a dict
describe_user_request_from_dict = DescribeUserRequest.from_dict(describe_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


