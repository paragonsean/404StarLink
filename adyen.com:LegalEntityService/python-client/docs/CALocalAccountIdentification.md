# CALocalAccountIdentification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_number** | **str** | The 5- to 12-digit bank account number, without separators or whitespace. | 
**account_type** | **str** | The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**. | [optional] [default to 'checking']
**institution_number** | **str** | The 3-digit institution number, without separators or whitespace. | 
**transit_number** | **str** | The 5-digit transit number, without separators or whitespace. | 
**type** | **str** | **caLocal** | [default to 'caLocal']

## Example

```python
from openapi_client.models.ca_local_account_identification import CALocalAccountIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of CALocalAccountIdentification from a JSON string
ca_local_account_identification_instance = CALocalAccountIdentification.from_json(json)
# print the JSON string representation of the object
print(CALocalAccountIdentification.to_json())

# convert the object into a dict
ca_local_account_identification_dict = ca_local_account_identification_instance.to_dict()
# create an instance of CALocalAccountIdentification from a dict
ca_local_account_identification_from_dict = CALocalAccountIdentification.from_dict(ca_local_account_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


