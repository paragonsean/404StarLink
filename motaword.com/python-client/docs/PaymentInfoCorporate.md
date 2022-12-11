# PaymentInfoCorporate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_api_invoicing** | **bool** |  | [optional] 
**allow_payment_code** | **bool** |  | [optional] 
**auto_charge** | **bool** |  | [optional] 
**billing** | [**BillingAddress**](BillingAddress.md) |  | [optional] 
**card** | [**CreditCard**](CreditCard.md) |  | [optional] 
**contact_email_address** | **str** |  | [optional] 
**payment_code** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.payment_info_corporate import PaymentInfoCorporate

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentInfoCorporate from a JSON string
payment_info_corporate_instance = PaymentInfoCorporate.from_json(json)
# print the JSON string representation of the object
print(PaymentInfoCorporate.to_json())

# convert the object into a dict
payment_info_corporate_dict = payment_info_corporate_instance.to_dict()
# create an instance of PaymentInfoCorporate from a dict
payment_info_corporate_from_dict = PaymentInfoCorporate.from_dict(payment_info_corporate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


