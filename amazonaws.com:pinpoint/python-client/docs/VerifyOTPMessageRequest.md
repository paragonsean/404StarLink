# VerifyOTPMessageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verify_otp_message_request_parameters** | [**VerifyOTPMessageRequestVerifyOTPMessageRequestParameters**](VerifyOTPMessageRequestVerifyOTPMessageRequestParameters.md) |  | 

## Example

```python
from openapi_client.models.verify_otp_message_request import VerifyOTPMessageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of VerifyOTPMessageRequest from a JSON string
verify_otp_message_request_instance = VerifyOTPMessageRequest.from_json(json)
# print the JSON string representation of the object
print(VerifyOTPMessageRequest.to_json())

# convert the object into a dict
verify_otp_message_request_dict = verify_otp_message_request_instance.to_dict()
# create an instance of VerifyOTPMessageRequest from a dict
verify_otp_message_request_from_dict = VerifyOTPMessageRequest.from_dict(verify_otp_message_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


