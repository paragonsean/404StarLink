# SendOTPMessageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**send_otp_message_request_parameters** | [**SendOTPMessageRequestSendOTPMessageRequestParameters**](SendOTPMessageRequestSendOTPMessageRequestParameters.md) |  | 

## Example

```python
from openapi_client.models.send_otp_message_request import SendOTPMessageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SendOTPMessageRequest from a JSON string
send_otp_message_request_instance = SendOTPMessageRequest.from_json(json)
# print the JSON string representation of the object
print(SendOTPMessageRequest.to_json())

# convert the object into a dict
send_otp_message_request_dict = send_otp_message_request_instance.to_dict()
# create an instance of SendOTPMessageRequest from a dict
send_otp_message_request_from_dict = SendOTPMessageRequest.from_dict(send_otp_message_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


