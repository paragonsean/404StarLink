# NOLocalAccountIdentification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_number** | **str** | The 11-digit bank account number, without separators or whitespace. | 
**type** | **str** | **noLocal** | [default to 'noLocal']

## Example

```python
from openapi_client.models.no_local_account_identification import NOLocalAccountIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of NOLocalAccountIdentification from a JSON string
no_local_account_identification_instance = NOLocalAccountIdentification.from_json(json)
# print the JSON string representation of the object
print(NOLocalAccountIdentification.to_json())

# convert the object into a dict
no_local_account_identification_dict = no_local_account_identification_instance.to_dict()
# create an instance of NOLocalAccountIdentification from a dict
no_local_account_identification_from_dict = NOLocalAccountIdentification.from_dict(no_local_account_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


