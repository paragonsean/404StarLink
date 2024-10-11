# SoleProprietorship


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country_of_governing_law** | **str** | The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of the governing country. | 
**date_of_incorporation** | **str** | The date when the legal arrangement was incorporated in YYYY-MM-DD format. | [optional] 
**doing_business_as** | **str** | The registered name, if different from the &#x60;name&#x60;. | [optional] 
**name** | **str** | The legal name. | 
**principal_place_of_business** | [**Address**](Address.md) | The business address. Required if the principal place of business is different from the &#x60;registeredAddress&#x60;. | [optional] 
**registered_address** | [**Address**](Address.md) | The address registered at the registrar, such as the Chamber of Commerce. | 
**registration_number** | **str** | The registration number. | [optional] 
**vat_absence_reason** | **str** | The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**. | [optional] 
**vat_number** | **str** | The VAT number. | [optional] 

## Example

```python
from openapi_client.models.sole_proprietorship import SoleProprietorship

# TODO update the JSON string below
json = "{}"
# create an instance of SoleProprietorship from a JSON string
sole_proprietorship_instance = SoleProprietorship.from_json(json)
# print the JSON string representation of the object
print(SoleProprietorship.to_json())

# convert the object into a dict
sole_proprietorship_dict = sole_proprietorship_instance.to_dict()
# create an instance of SoleProprietorship from a dict
sole_proprietorship_from_dict = SoleProprietorship.from_dict(sole_proprietorship_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


