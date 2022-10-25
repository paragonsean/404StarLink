# DescribeUserResponseName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**formatted** | **str** |  | [optional] 
**family_name** | **str** |  | [optional] 
**given_name** | **str** |  | [optional] 
**middle_name** | **str** |  | [optional] 
**honorific_prefix** | **str** |  | [optional] 
**honorific_suffix** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.describe_user_response_name import DescribeUserResponseName

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeUserResponseName from a JSON string
describe_user_response_name_instance = DescribeUserResponseName.from_json(json)
# print the JSON string representation of the object
print(DescribeUserResponseName.to_json())

# convert the object into a dict
describe_user_response_name_dict = describe_user_response_name_instance.to_dict()
# create an instance of DescribeUserResponseName from a dict
describe_user_response_name_from_dict = DescribeUserResponseName.from_dict(describe_user_response_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


