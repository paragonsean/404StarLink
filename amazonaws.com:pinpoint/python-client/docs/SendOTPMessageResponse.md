# SendOTPMessageResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_response** | [**MessageResponse**](MessageResponse.md) |  | 

## Example

```python
from openapi_client.models.send_otp_message_response import SendOTPMessageResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SendOTPMessageResponse from a JSON string
send_otp_message_response_instance = SendOTPMessageResponse.from_json(json)
# print the JSON string representation of the object
print(SendOTPMessageResponse.to_json())

# convert the object into a dict
send_otp_message_response_dict = send_otp_message_response_instance.to_dict()
# create an instance of SendOTPMessageResponse from a dict
send_otp_message_response_from_dict = SendOTPMessageResponse.from_dict(send_otp_message_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


