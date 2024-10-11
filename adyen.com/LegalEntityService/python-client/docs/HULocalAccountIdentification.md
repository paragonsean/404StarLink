# HULocalAccountIdentification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_number** | **str** | The 24-digit bank account number, without separators or whitespace. | 
**type** | **str** | **huLocal** | [default to 'huLocal']

## Example

```python
from openapi_client.models.hu_local_account_identification import HULocalAccountIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of HULocalAccountIdentification from a JSON string
hu_local_account_identification_instance = HULocalAccountIdentification.from_json(json)
# print the JSON string representation of the object
print(HULocalAccountIdentification.to_json())

# convert the object into a dict
hu_local_account_identification_dict = hu_local_account_identification_instance.to_dict()
# create an instance of HULocalAccountIdentification from a dict
hu_local_account_identification_from_dict = HULocalAccountIdentification.from_dict(hu_local_account_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


