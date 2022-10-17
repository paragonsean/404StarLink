# GetPolicyResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy** | [**GetPolicyResponsePolicy**](GetPolicyResponsePolicy.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_policy_response import GetPolicyResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetPolicyResponse from a JSON string
get_policy_response_instance = GetPolicyResponse.from_json(json)
# print the JSON string representation of the object
print(GetPolicyResponse.to_json())

# convert the object into a dict
get_policy_response_dict = get_policy_response_instance.to_dict()
# create an instance of GetPolicyResponse from a dict
get_policy_response_from_dict = GetPolicyResponse.from_dict(get_policy_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


