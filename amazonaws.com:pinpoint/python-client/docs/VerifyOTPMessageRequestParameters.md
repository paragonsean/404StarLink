# VerifyOTPMessageRequestParameters

Verify OTP message request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination_identity** | **str** |  | 
**otp** | **str** |  | 
**reference_id** | **str** |  | 

## Example

```python
from openapi_client.models.verify_otp_message_request_parameters import VerifyOTPMessageRequestParameters

# TODO update the JSON string below
json = "{}"
# create an instance of VerifyOTPMessageRequestParameters from a JSON string
verify_otp_message_request_parameters_instance = VerifyOTPMessageRequestParameters.from_json(json)
# print the JSON string representation of the object
print(VerifyOTPMessageRequestParameters.to_json())

# convert the object into a dict
verify_otp_message_request_parameters_dict = verify_otp_message_request_parameters_instance.to_dict()
# create an instance of VerifyOTPMessageRequestParameters from a dict
verify_otp_message_request_parameters_from_dict = VerifyOTPMessageRequestParameters.from_dict(verify_otp_message_request_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


