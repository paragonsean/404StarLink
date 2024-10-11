# PutPolicyResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy** | [**GetPolicyResponsePolicy**](GetPolicyResponsePolicy.md) |  | [optional] 

## Example

```python
from openapi_client.models.put_policy_response import PutPolicyResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PutPolicyResponse from a JSON string
put_policy_response_instance = PutPolicyResponse.from_json(json)
# print the JSON string representation of the object
print(PutPolicyResponse.to_json())

# convert the object into a dict
put_policy_response_dict = put_policy_response_instance.to_dict()
# create an instance of PutPolicyResponse from a dict
put_policy_response_from_dict = PutPolicyResponse.from_dict(put_policy_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


