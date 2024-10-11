# VerifyOTPMessageRequestVerifyOTPMessageRequestParameters

Verify OTP message request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination_identity** | **str** |  | [optional] 
**otp** | **str** |  | [optional] 
**reference_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.verify_otp_message_request_verify_otp_message_request_parameters import VerifyOTPMessageRequestVerifyOTPMessageRequestParameters

# TODO update the JSON string below
json = "{}"
# create an instance of VerifyOTPMessageRequestVerifyOTPMessageRequestParameters from a JSON string
verify_otp_message_request_verify_otp_message_request_parameters_instance = VerifyOTPMessageRequestVerifyOTPMessageRequestParameters.from_json(json)
# print the JSON string representation of the object
print(VerifyOTPMessageRequestVerifyOTPMessageRequestParameters.to_json())

# convert the object into a dict
verify_otp_message_request_verify_otp_message_request_parameters_dict = verify_otp_message_request_verify_otp_message_request_parameters_instance.to_dict()
# create an instance of VerifyOTPMessageRequestVerifyOTPMessageRequestParameters from a dict
verify_otp_message_request_verify_otp_message_request_parameters_from_dict = VerifyOTPMessageRequestVerifyOTPMessageRequestParameters.from_dict(verify_otp_message_request_verify_otp_message_request_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


