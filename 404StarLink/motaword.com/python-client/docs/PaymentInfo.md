# PaymentInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billing** | [**BillingAddress**](BillingAddress.md) |  | [optional] 
**card** | [**CreditCard**](CreditCard.md) |  | [optional] 
**cards** | [**List[CreditCard]**](CreditCard.md) |  | [optional] 
**corporate** | [**PaymentInfoCorporate**](PaymentInfoCorporate.md) |  | [optional] 
**shared_card** | [**CreditCard**](CreditCard.md) |  | [optional] 

## Example

```python
from openapi_client.models.payment_info import PaymentInfo

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentInfo from a JSON string
payment_info_instance = PaymentInfo.from_json(json)
# print the JSON string representation of the object
print(PaymentInfo.to_json())

# convert the object into a dict
payment_info_dict = payment_info_instance.to_dict()
# create an instance of PaymentInfo from a dict
payment_info_from_dict = PaymentInfo.from_dict(payment_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


