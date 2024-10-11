# BankAccountInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_identification** | [**BankAccountInfoAccountIdentification**](BankAccountInfoAccountIdentification.md) |  | [optional] 
**account_type** | **str** | The type of bank account. | [optional] 
**country_code** | **str** | The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the bank account is registered. For example, **NL**. | [optional] 

## Example

```python
from openapi_client.models.bank_account_info import BankAccountInfo

# TODO update the JSON string below
json = "{}"
# create an instance of BankAccountInfo from a JSON string
bank_account_info_instance = BankAccountInfo.from_json(json)
# print the JSON string representation of the object
print(BankAccountInfo.to_json())

# convert the object into a dict
bank_account_info_dict = bank_account_info_instance.to_dict()
# create an instance of BankAccountInfo from a dict
bank_account_info_from_dict = BankAccountInfo.from_dict(bank_account_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


