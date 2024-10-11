# PLLocalAccountIdentification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_number** | **str** | The 26-digit bank account number ([Numer rachunku](https://pl.wikipedia.org/wiki/Numer_Rachunku_Bankowego)), without separators or whitespace. | 
**type** | **str** | **plLocal** | [default to 'plLocal']

## Example

```python
from openapi_client.models.pl_local_account_identification import PLLocalAccountIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of PLLocalAccountIdentification from a JSON string
pl_local_account_identification_instance = PLLocalAccountIdentification.from_json(json)
# print the JSON string representation of the object
print(PLLocalAccountIdentification.to_json())

# convert the object into a dict
pl_local_account_identification_dict = pl_local_account_identification_instance.to_dict()
# create an instance of PLLocalAccountIdentification from a dict
pl_local_account_identification_from_dict = PLLocalAccountIdentification.from_dict(pl_local_account_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


