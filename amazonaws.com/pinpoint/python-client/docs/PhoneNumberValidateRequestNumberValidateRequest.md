# PhoneNumberValidateRequestNumberValidateRequest

Specifies a phone number to validate and retrieve information about.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iso_country_code** | **str** |  | [optional] 
**phone_number** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.phone_number_validate_request_number_validate_request import PhoneNumberValidateRequestNumberValidateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PhoneNumberValidateRequestNumberValidateRequest from a JSON string
phone_number_validate_request_number_validate_request_instance = PhoneNumberValidateRequestNumberValidateRequest.from_json(json)
# print the JSON string representation of the object
print(PhoneNumberValidateRequestNumberValidateRequest.to_json())

# convert the object into a dict
phone_number_validate_request_number_validate_request_dict = phone_number_validate_request_number_validate_request_instance.to_dict()
# create an instance of PhoneNumberValidateRequestNumberValidateRequest from a dict
phone_number_validate_request_number_validate_request_from_dict = PhoneNumberValidateRequestNumberValidateRequest.from_dict(phone_number_validate_request_number_validate_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


