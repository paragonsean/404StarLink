# DescribeUserResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_name** | **str** |  | [optional] 
**user_id** | **str** |  | 
**external_ids** | **List** |  | [optional] 
**name** | [**DescribeUserResponseName**](DescribeUserResponseName.md) |  | [optional] 
**display_name** | **str** |  | [optional] 
**nick_name** | **str** |  | [optional] 
**profile_url** | **str** |  | [optional] 
**emails** | **List** |  | [optional] 
**addresses** | **List** |  | [optional] 
**phone_numbers** | **List** |  | [optional] 
**user_type** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**preferred_language** | **str** |  | [optional] 
**locale** | **str** |  | [optional] 
**timezone** | **str** |  | [optional] 
**identity_store_id** | **str** |  | 

## Example

```python
from openapi_client.models.describe_user_response import DescribeUserResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeUserResponse from a JSON string
describe_user_response_instance = DescribeUserResponse.from_json(json)
# print the JSON string representation of the object
print(DescribeUserResponse.to_json())

# convert the object into a dict
describe_user_response_dict = describe_user_response_instance.to_dict()
# create an instance of DescribeUserResponse from a dict
describe_user_response_from_dict = DescribeUserResponse.from_dict(describe_user_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


