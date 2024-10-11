# VerificationResponse

Verify OTP Message Response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**valid** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.verification_response import VerificationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of VerificationResponse from a JSON string
verification_response_instance = VerificationResponse.from_json(json)
# print the JSON string representation of the object
print(VerificationResponse.to_json())

# convert the object into a dict
verification_response_dict = verification_response_instance.to_dict()
# create an instance of VerificationResponse from a dict
verification_response_from_dict = VerificationResponse.from_dict(verification_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


