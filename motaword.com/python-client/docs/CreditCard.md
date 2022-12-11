# CreditCard


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bin** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**is_default** | **bool** |  | [optional] 
**payment_code** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.credit_card import CreditCard

# TODO update the JSON string below
json = "{}"
# create an instance of CreditCard from a JSON string
credit_card_instance = CreditCard.from_json(json)
# print the JSON string representation of the object
print(CreditCard.to_json())

# convert the object into a dict
credit_card_dict = credit_card_instance.to_dict()
# create an instance of CreditCard from a dict
credit_card_from_dict = CreditCard.from_dict(credit_card_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


