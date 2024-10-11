# NumberValidateRequest

Specifies a phone number to validate and retrieve information about.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iso_country_code** | **str** |  | [optional] 
**phone_number** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.number_validate_request import NumberValidateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of NumberValidateRequest from a JSON string
number_validate_request_instance = NumberValidateRequest.from_json(json)
# print the JSON string representation of the object
print(NumberValidateRequest.to_json())

# convert the object into a dict
number_validate_request_dict = number_validate_request_instance.to_dict()
# create an instance of NumberValidateRequest from a dict
number_validate_request_from_dict = NumberValidateRequest.from_dict(number_validate_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


