# ProjectPayment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bin** | **str** | Last 4 digits of the credit card you are using one-time. This parameter is only required when stripe_token is provided. | [optional] 
**budget_code** | **str** | Optional with corporate accounts. Not available for others. | [optional] 
**card_id** | **int** | Optional. &#x60;client&#x60;, &#x60;app&#x60;, &#x60;corporate_card&#x60; methods require a credit card ID. &#x60;credit&#x60; method requires Stripe token and bin. | [optional] 
**payment_code** | **str** | Optional. &#x60;corporate&#x60; payment method requires this.s | [optional] 
**payment_method** | **str** | Optional. Determines which method to use for payment. &#x60;client&#x60;, &#x60;app&#x60;, &#x60;corporate_card&#x60; methods require a credit card ID. &#x60;credit&#x60; method requires Stripe token and bin. &#x60;corporate&#x60; method follows corporate account policy automatically, either follows invoicing flow or automatically charges corporate&#39;s primary card. | [optional] 
**stripe_token** | **str** | This is required if you are using a one-time credit card. This is the token generted from frontend via Stripe SDK. If you are using a one-time card with &#x60;stripe_token&#x60;, you must also provide &#x60;bin&#x60;, last 4 digits of the card. | [optional] 

## Example

```python
from openapi_client.models.project_payment import ProjectPayment

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectPayment from a JSON string
project_payment_instance = ProjectPayment.from_json(json)
# print the JSON string representation of the object
print(ProjectPayment.to_json())

# convert the object into a dict
project_payment_dict = project_payment_instance.to_dict()
# create an instance of ProjectPayment from a dict
project_payment_from_dict = ProjectPayment.from_dict(project_payment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


