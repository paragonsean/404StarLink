# GetPolicyResponsePolicy


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**http_inputs** | [**InputPolicy**](InputPolicy.md) |  | [optional] 
**https_inputs** | [**InputPolicy**](InputPolicy.md) |  | [optional] 
**s3_inputs** | [**InputPolicy**](InputPolicy.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_policy_response_policy import GetPolicyResponsePolicy

# TODO update the JSON string below
json = "{}"
# create an instance of GetPolicyResponsePolicy from a JSON string
get_policy_response_policy_instance = GetPolicyResponsePolicy.from_json(json)
# print the JSON string representation of the object
print(GetPolicyResponsePolicy.to_json())

# convert the object into a dict
get_policy_response_policy_dict = get_policy_response_policy_instance.to_dict()
# create an instance of GetPolicyResponsePolicy from a dict
get_policy_response_policy_from_dict = GetPolicyResponsePolicy.from_dict(get_policy_response_policy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


