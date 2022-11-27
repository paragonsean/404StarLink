# PhoneNumberValidateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number_validate_response** | [**NumberValidateResponse**](NumberValidateResponse.md) |  | 

## Example

```python
from openapi_client.models.phone_number_validate_response import PhoneNumberValidateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PhoneNumberValidateResponse from a JSON string
phone_number_validate_response_instance = PhoneNumberValidateResponse.from_json(json)
# print the JSON string representation of the object
print(PhoneNumberValidateResponse.to_json())

# convert the object into a dict
phone_number_validate_response_dict = phone_number_validate_response_instance.to_dict()
# create an instance of PhoneNumberValidateResponse from a dict
phone_number_validate_response_from_dict = PhoneNumberValidateResponse.from_dict(phone_number_validate_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


