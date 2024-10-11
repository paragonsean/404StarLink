# VerifyOTPMessageResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verification_response** | [**VerificationResponse**](VerificationResponse.md) |  | 

## Example

```python
from openapi_client.models.verify_otp_message_response import VerifyOTPMessageResponse

# TODO update the JSON string below
json = "{}"
# create an instance of VerifyOTPMessageResponse from a JSON string
verify_otp_message_response_instance = VerifyOTPMessageResponse.from_json(json)
# print the JSON string representation of the object
print(VerifyOTPMessageResponse.to_json())

# convert the object into a dict
verify_otp_message_response_dict = verify_otp_message_response_instance.to_dict()
# create an instance of VerifyOTPMessageResponse from a dict
verify_otp_message_response_from_dict = VerifyOTPMessageResponse.from_dict(verify_otp_message_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


