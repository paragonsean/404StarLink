# PhoneNumberValidateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number_validate_request** | [**PhoneNumberValidateRequestNumberValidateRequest**](PhoneNumberValidateRequestNumberValidateRequest.md) |  | 

## Example

```python
from openapi_client.models.phone_number_validate_request import PhoneNumberValidateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PhoneNumberValidateRequest from a JSON string
phone_number_validate_request_instance = PhoneNumberValidateRequest.from_json(json)
# print the JSON string representation of the object
print(PhoneNumberValidateRequest.to_json())

# convert the object into a dict
phone_number_validate_request_dict = phone_number_validate_request_instance.to_dict()
# create an instance of PhoneNumberValidateRequest from a dict
phone_number_validate_request_from_dict = PhoneNumberValidateRequest.from_dict(phone_number_validate_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


