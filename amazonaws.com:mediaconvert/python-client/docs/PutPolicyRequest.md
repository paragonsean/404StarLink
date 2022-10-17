# PutPolicyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy** | [**PutPolicyRequestPolicy**](PutPolicyRequestPolicy.md) |  | 

## Example

```python
from openapi_client.models.put_policy_request import PutPolicyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PutPolicyRequest from a JSON string
put_policy_request_instance = PutPolicyRequest.from_json(json)
# print the JSON string representation of the object
print(PutPolicyRequest.to_json())

# convert the object into a dict
put_policy_request_dict = put_policy_request_instance.to_dict()
# create an instance of PutPolicyRequest from a dict
put_policy_request_from_dict = PutPolicyRequest.from_dict(put_policy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


