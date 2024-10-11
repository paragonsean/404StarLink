# IbanAccountIdentification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iban** | **str** | The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard. | 
**type** | **str** | **iban** | [default to 'iban']

## Example

```python
from openapi_client.models.iban_account_identification import IbanAccountIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of IbanAccountIdentification from a JSON string
iban_account_identification_instance = IbanAccountIdentification.from_json(json)
# print the JSON string representation of the object
print(IbanAccountIdentification.to_json())

# convert the object into a dict
iban_account_identification_dict = iban_account_identification_instance.to_dict()
# create an instance of IbanAccountIdentification from a dict
iban_account_identification_from_dict = IbanAccountIdentification.from_dict(iban_account_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


