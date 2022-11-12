# DKLocalAccountIdentification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_number** | **str** | The 4-10 digits bank account number (Kontonummer) (without separators or whitespace). | 
**bank_code** | **str** | The 4-digit bank code (Registreringsnummer) (without separators or whitespace). | 
**type** | **str** | **dkLocal** | [default to 'dkLocal']

## Example

```python
from openapi_client.models.dk_local_account_identification import DKLocalAccountIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of DKLocalAccountIdentification from a JSON string
dk_local_account_identification_instance = DKLocalAccountIdentification.from_json(json)
# print the JSON string representation of the object
print(DKLocalAccountIdentification.to_json())

# convert the object into a dict
dk_local_account_identification_dict = dk_local_account_identification_instance.to_dict()
# create an instance of DKLocalAccountIdentification from a dict
dk_local_account_identification_from_dict = DKLocalAccountIdentification.from_dict(dk_local_account_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


