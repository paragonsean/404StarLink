# BankAccountInfoAccountIdentification

Identification of the bank account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_number** | **str** | The bank account number, without separators or whitespace. | 
**bsb_code** | **str** | The 6-digit [Bank State Branch (BSB) code](https://en.wikipedia.org/wiki/Bank_state_branch), without separators or whitespace. | 
**type** | **str** | **auLocal** | [default to 'auLocal']
**account_type** | **str** | The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**. | [optional] [default to 'checking']
**institution_number** | **str** | The 3-digit institution number, without separators or whitespace. | 
**transit_number** | **str** | The 5-digit transit number, without separators or whitespace. | 
**bank_code** | **str** | The 4-digit bank code (Registreringsnummer) (without separators or whitespace). | 
**iban** | **str** | The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard. | 
**additional_bank_identification** | [**AdditionalBankIdentification**](AdditionalBankIdentification.md) | Additional identification codes of the bank. Some banks may require these identifiers for cross-border transfers. | [optional] 
**bic** | **str** | The bank&#39;s 8- or 11-character BIC or SWIFT code. | 
**clearing_number** | **str** | The 4- to 5-digit clearing number ([Clearingnummer](https://sv.wikipedia.org/wiki/Clearingnummer)), without separators or whitespace. | 
**sort_code** | **str** | The 6-digit [sort code](https://en.wikipedia.org/wiki/Sort_code), without separators or whitespace. | 
**routing_number** | **str** | The 9-digit [routing number](https://en.wikipedia.org/wiki/ABA_routing_transit_number), without separators or whitespace. | 

## Example

```python
from openapi_client.models.bank_account_info_account_identification import BankAccountInfoAccountIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of BankAccountInfoAccountIdentification from a JSON string
bank_account_info_account_identification_instance = BankAccountInfoAccountIdentification.from_json(json)
# print the JSON string representation of the object
print(BankAccountInfoAccountIdentification.to_json())

# convert the object into a dict
bank_account_info_account_identification_dict = bank_account_info_account_identification_instance.to_dict()
# create an instance of BankAccountInfoAccountIdentification from a dict
bank_account_info_account_identification_from_dict = BankAccountInfoAccountIdentification.from_dict(bank_account_info_account_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


