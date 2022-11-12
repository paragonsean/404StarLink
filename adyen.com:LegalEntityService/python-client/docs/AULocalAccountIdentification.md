# AULocalAccountIdentification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_number** | **str** | The bank account number, without separators or whitespace. | 
**bsb_code** | **str** | The 6-digit [Bank State Branch (BSB) code](https://en.wikipedia.org/wiki/Bank_state_branch), without separators or whitespace. | 
**type** | **str** | **auLocal** | [default to 'auLocal']

## Example

```python
from openapi_client.models.au_local_account_identification import AULocalAccountIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of AULocalAccountIdentification from a JSON string
au_local_account_identification_instance = AULocalAccountIdentification.from_json(json)
# print the JSON string representation of the object
print(AULocalAccountIdentification.to_json())

# convert the object into a dict
au_local_account_identification_dict = au_local_account_identification_instance.to_dict()
# create an instance of AULocalAccountIdentification from a dict
au_local_account_identification_from_dict = AULocalAccountIdentification.from_dict(au_local_account_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


