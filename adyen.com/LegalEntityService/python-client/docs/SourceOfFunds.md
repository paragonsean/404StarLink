# SourceOfFunds


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acquiring_business_line_id** | **str** | The unique identifier of the business line that will be the source of funds.This must be a business line for a **receivePayments** or **receiveFromPlatformPayments** capability. | [optional] 
**adyen_processed_funds** | **bool** | Indicates whether the funds are coming from transactions processed by Adyen. If **false**, a &#x60;description&#x60; is required. | [optional] 
**description** | **str** | Text describing the source of funds. For example, for &#x60;type&#x60; **business**, provide a description of where the business transactions come from, such as payments through bank transfer. Required when &#x60;adyenProcessedFunds&#x60; is **false**. | [optional] 
**type** | **str** | The type of the source of funds. Possible value: **business**. | [optional] 

## Example

```python
from openapi_client.models.source_of_funds import SourceOfFunds

# TODO update the JSON string below
json = "{}"
# create an instance of SourceOfFunds from a JSON string
source_of_funds_instance = SourceOfFunds.from_json(json)
# print the JSON string representation of the object
print(SourceOfFunds.to_json())

# convert the object into a dict
source_of_funds_dict = source_of_funds_instance.to_dict()
# create an instance of SourceOfFunds from a dict
source_of_funds_from_dict = SourceOfFunds.from_dict(source_of_funds_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


