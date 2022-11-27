# SendOTPMessageRequestParameters

Send OTP message request parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed_attempts** | **int** |  | [optional] 
**brand_name** | **str** |  | 
**channel** | **str** |  | 
**code_length** | **int** |  | [optional] 
**destination_identity** | **str** |  | 
**entity_id** | **str** |  | [optional] 
**language** | **str** |  | [optional] 
**origination_identity** | **str** |  | 
**reference_id** | **str** |  | 
**template_id** | **str** |  | [optional] 
**validity_period** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.send_otp_message_request_parameters import SendOTPMessageRequestParameters

# TODO update the JSON string below
json = "{}"
# create an instance of SendOTPMessageRequestParameters from a JSON string
send_otp_message_request_parameters_instance = SendOTPMessageRequestParameters.from_json(json)
# print the JSON string representation of the object
print(SendOTPMessageRequestParameters.to_json())

# convert the object into a dict
send_otp_message_request_parameters_dict = send_otp_message_request_parameters_instance.to_dict()
# create an instance of SendOTPMessageRequestParameters from a dict
send_otp_message_request_parameters_from_dict = SendOTPMessageRequestParameters.from_dict(send_otp_message_request_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


