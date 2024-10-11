# CZLocalAccountIdentification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_number** | **str** | The 2- to 16-digit bank account number (Číslo účtu) in the following format:  - The optional prefix (předčíslí).  - The required second part (základní část) which must be at least two non-zero digits.  Examples:  - **19-123457** (with prefix)  - **123457** (without prefix)  - **000019-0000123457** (with prefix, normalized)  - **000000-0000123457** (without prefix, normalized) | 
**bank_code** | **str** | The 4-digit bank code (Kód banky), without separators or whitespace. | 
**type** | **str** | **czLocal** | [default to 'czLocal']

## Example

```python
from openapi_client.models.cz_local_account_identification import CZLocalAccountIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of CZLocalAccountIdentification from a JSON string
cz_local_account_identification_instance = CZLocalAccountIdentification.from_json(json)
# print the JSON string representation of the object
print(CZLocalAccountIdentification.to_json())

# convert the object into a dict
cz_local_account_identification_dict = cz_local_account_identification_instance.to_dict()
# create an instance of CZLocalAccountIdentification from a dict
cz_local_account_identification_from_dict = CZLocalAccountIdentification.from_dict(cz_local_account_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


