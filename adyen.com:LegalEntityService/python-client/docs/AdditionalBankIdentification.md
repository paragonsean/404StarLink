# AdditionalBankIdentification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | The value of the additional bank identification. | [optional] 
**type** | **str** | The type of additional bank identification, depending on the country.  Possible values:   * **gbSortCode**: The 6-digit [UK sort code](https://en.wikipedia.org/wiki/Sort_code), without separators or spaces  * **usRoutingNumber**: The 9-digit [routing number](https://en.wikipedia.org/wiki/ABA_routing_transit_number), without separators or spaces. | [optional] 

## Example

```python
from openapi_client.models.additional_bank_identification import AdditionalBankIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of AdditionalBankIdentification from a JSON string
additional_bank_identification_instance = AdditionalBankIdentification.from_json(json)
# print the JSON string representation of the object
print(AdditionalBankIdentification.to_json())

# convert the object into a dict
additional_bank_identification_dict = additional_bank_identification_instance.to_dict()
# create an instance of AdditionalBankIdentification from a dict
additional_bank_identification_from_dict = AdditionalBankIdentification.from_dict(additional_bank_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


