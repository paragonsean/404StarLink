# TaxInformation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **str** | The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code. | [optional] 
**number** | **str** | The tax ID number (TIN) of the organization or individual. | [optional] 
**type** | **str** | The TIN type depending on the country where it was issued. Provide only for countries that have multiple tax IDs, such as Sweden, the UK, or the US. For example, provide **SSN**, **EIN**, or **ITIN** for the US. | [optional] 

## Example

```python
from openapi_client.models.tax_information import TaxInformation

# TODO update the JSON string below
json = "{}"
# create an instance of TaxInformation from a JSON string
tax_information_instance = TaxInformation.from_json(json)
# print the JSON string representation of the object
print(TaxInformation.to_json())

# convert the object into a dict
tax_information_dict = tax_information_instance.to_dict()
# create an instance of TaxInformation from a dict
tax_information_from_dict = TaxInformation.from_dict(tax_information_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


