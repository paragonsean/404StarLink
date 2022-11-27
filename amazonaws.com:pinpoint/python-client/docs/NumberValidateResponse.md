# NumberValidateResponse

Provides information about a phone number.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**carrier** | **str** |  | [optional] 
**city** | **str** |  | [optional] 
**cleansed_phone_number_e164** | **str** |  | [optional] 
**cleansed_phone_number_national** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**country_code_iso2** | **str** |  | [optional] 
**country_code_numeric** | **str** |  | [optional] 
**county** | **str** |  | [optional] 
**original_country_code_iso2** | **str** |  | [optional] 
**original_phone_number** | **str** |  | [optional] 
**phone_type** | **str** |  | [optional] 
**phone_type_code** | **int** |  | [optional] 
**timezone** | **str** |  | [optional] 
**zip_code** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.number_validate_response import NumberValidateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of NumberValidateResponse from a JSON string
number_validate_response_instance = NumberValidateResponse.from_json(json)
# print the JSON string representation of the object
print(NumberValidateResponse.to_json())

# convert the object into a dict
number_validate_response_dict = number_validate_response_instance.to_dict()
# create an instance of NumberValidateResponse from a dict
number_validate_response_from_dict = NumberValidateResponse.from_dict(number_validate_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


