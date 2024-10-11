# NumberAndBicAccountIdentification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_number** | **str** | The bank account number, without separators or whitespace. The length and format depends on the bank or country. | 
**additional_bank_identification** | [**AdditionalBankIdentification**](AdditionalBankIdentification.md) | Additional identification codes of the bank. Some banks may require these identifiers for cross-border transfers. | [optional] 
**bic** | **str** | The bank&#39;s 8- or 11-character BIC or SWIFT code. | 
**type** | **str** | **numberAndBic** | [default to 'numberAndBic']

## Example

```python
from openapi_client.models.number_and_bic_account_identification import NumberAndBicAccountIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of NumberAndBicAccountIdentification from a JSON string
number_and_bic_account_identification_instance = NumberAndBicAccountIdentification.from_json(json)
# print the JSON string representation of the object
print(NumberAndBicAccountIdentification.to_json())

# convert the object into a dict
number_and_bic_account_identification_dict = number_and_bic_account_identification_instance.to_dict()
# create an instance of NumberAndBicAccountIdentification from a dict
number_and_bic_account_identification_from_dict = NumberAndBicAccountIdentification.from_dict(number_and_bic_account_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


