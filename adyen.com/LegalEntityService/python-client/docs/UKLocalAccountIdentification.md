# UKLocalAccountIdentification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_number** | **str** | The 8-digit bank account number, without separators or whitespace. | 
**sort_code** | **str** | The 6-digit [sort code](https://en.wikipedia.org/wiki/Sort_code), without separators or whitespace. | 
**type** | **str** | **ukLocal** | [default to 'ukLocal']

## Example

```python
from openapi_client.models.uk_local_account_identification import UKLocalAccountIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of UKLocalAccountIdentification from a JSON string
uk_local_account_identification_instance = UKLocalAccountIdentification.from_json(json)
# print the JSON string representation of the object
print(UKLocalAccountIdentification.to_json())

# convert the object into a dict
uk_local_account_identification_dict = uk_local_account_identification_instance.to_dict()
# create an instance of UKLocalAccountIdentification from a dict
uk_local_account_identification_from_dict = UKLocalAccountIdentification.from_dict(uk_local_account_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


