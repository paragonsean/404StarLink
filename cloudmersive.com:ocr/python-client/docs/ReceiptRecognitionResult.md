# ReceiptRecognitionResult

Result of recognizing a receipt, to extract the key information from the receipt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_string** | **str** | The address of the business printed on the receipt (if included on the receipt) | [optional] 
**business_name** | **str** | The name of the business printed on the receipt (if included on the receipt) | [optional] 
**business_website** | **str** | The website URL of the business printed on the receipt (if included on the receipt) | [optional] 
**phone_number** | **str** | The phone number printed on the receipt (if included on the receipt) | [optional] 
**receipt_items** | [**List[ReceiptLineItem]**](ReceiptLineItem.md) | The individual line items comprising the order; does not include total (see ReceiptTotal) | [optional] 
**receipt_sub_total** | **float** | Optional; if available, the monetary value of the receipt subtotal - typically not including specialized line items such as Tax. If this value is not available, it will be 0. | [optional] 
**receipt_total** | **float** | The total monetary value of the receipt (if included on the receipt) | [optional] 
**successful** | **bool** | True if the operation was successful, false otherwise | [optional] 
**timestamp** | **datetime** | The date and time printed on the receipt (if included on the receipt) | [optional] 

## Example

```python
from openapi_client.models.receipt_recognition_result import ReceiptRecognitionResult

# TODO update the JSON string below
json = "{}"
# create an instance of ReceiptRecognitionResult from a JSON string
receipt_recognition_result_instance = ReceiptRecognitionResult.from_json(json)
# print the JSON string representation of the object
print(ReceiptRecognitionResult.to_json())

# convert the object into a dict
receipt_recognition_result_dict = receipt_recognition_result_instance.to_dict()
# create an instance of ReceiptRecognitionResult from a dict
receipt_recognition_result_from_dict = ReceiptRecognitionResult.from_dict(receipt_recognition_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


