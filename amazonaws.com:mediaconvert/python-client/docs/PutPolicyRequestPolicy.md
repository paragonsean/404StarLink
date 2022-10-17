# PutPolicyRequestPolicy

A policy configures behavior that you allow or disallow for your account. For information about MediaConvert policies, see the user guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**http_inputs** | [**InputPolicy**](InputPolicy.md) |  | [optional] 
**https_inputs** | [**InputPolicy**](InputPolicy.md) |  | [optional] 
**s3_inputs** | [**InputPolicy**](InputPolicy.md) |  | [optional] 

## Example

```python
from openapi_client.models.put_policy_request_policy import PutPolicyRequestPolicy

# TODO update the JSON string below
json = "{}"
# create an instance of PutPolicyRequestPolicy from a JSON string
put_policy_request_policy_instance = PutPolicyRequestPolicy.from_json(json)
# print the JSON string representation of the object
print(PutPolicyRequestPolicy.to_json())

# convert the object into a dict
put_policy_request_policy_dict = put_policy_request_policy_instance.to_dict()
# create an instance of PutPolicyRequestPolicy from a dict
put_policy_request_policy_from_dict = PutPolicyRequestPolicy.from_dict(put_policy_request_policy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


