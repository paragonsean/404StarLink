# VerificationErrorRecursive


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilities** | **List[str]** | Contains key-value pairs that specify the actions that the legal entity can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability. | [optional] 
**code** | **str** | The general error code. | [optional] 
**message** | **str** | The general error message. | [optional] 
**remediating_actions** | [**List[RemediatingAction]**](RemediatingAction.md) | An object containing possible solutions to fix a verification error. | [optional] 
**type** | **str** | The type of error. | [optional] 

## Example

```python
from openapi_client.models.verification_error_recursive import VerificationErrorRecursive

# TODO update the JSON string below
json = "{}"
# create an instance of VerificationErrorRecursive from a JSON string
verification_error_recursive_instance = VerificationErrorRecursive.from_json(json)
# print the JSON string representation of the object
print(VerificationErrorRecursive.to_json())

# convert the object into a dict
verification_error_recursive_dict = verification_error_recursive_instance.to_dict()
# create an instance of VerificationErrorRecursive from a dict
verification_error_recursive_from_dict = VerificationErrorRecursive.from_dict(verification_error_recursive_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


