# SELocalAccountIdentification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_number** | **str** | The 7- to 10-digit bank account number ([Bankkontonummer](https://sv.wikipedia.org/wiki/Bankkonto)), without the clearing number, separators, or whitespace. | 
**clearing_number** | **str** | The 4- to 5-digit clearing number ([Clearingnummer](https://sv.wikipedia.org/wiki/Clearingnummer)), without separators or whitespace. | 
**type** | **str** | **seLocal** | [default to 'seLocal']

## Example

```python
from openapi_client.models.se_local_account_identification import SELocalAccountIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of SELocalAccountIdentification from a JSON string
se_local_account_identification_instance = SELocalAccountIdentification.from_json(json)
# print the JSON string representation of the object
print(SELocalAccountIdentification.to_json())

# convert the object into a dict
se_local_account_identification_dict = se_local_account_identification_instance.to_dict()
# create an instance of SELocalAccountIdentification from a dict
se_local_account_identification_from_dict = SELocalAccountIdentification.from_dict(se_local_account_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


