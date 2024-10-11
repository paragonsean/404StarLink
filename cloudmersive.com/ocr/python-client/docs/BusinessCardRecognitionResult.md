# BusinessCardRecognitionResult

Result of recognizing a business card, to extract the key information from the business card

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_string** | **str** | The address printed on the business card (if included on the business card) | [optional] 
**business_name** | **str** | The name of the business printed on the business card (if included on the business card) | [optional] 
**email_address** | **str** | The email address printed on the business card (if included on the business card) | [optional] 
**person_name** | **str** | The name of the person printed on the business card (if included on the business card) | [optional] 
**person_title** | **str** | The title of the person printed on the business card (if included on the business card) | [optional] 
**phone_number** | **str** | The phone number printed on the business card (if included on the business card) | [optional] 
**successful** | **bool** | True if the operation was successful, false otherwise | [optional] 
**timestamp** | **datetime** | The date and time printed on the business card (if included on the business card) | [optional] 

## Example

```python
from openapi_client.models.business_card_recognition_result import BusinessCardRecognitionResult

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessCardRecognitionResult from a JSON string
business_card_recognition_result_instance = BusinessCardRecognitionResult.from_json(json)
# print the JSON string representation of the object
print(BusinessCardRecognitionResult.to_json())

# convert the object into a dict
business_card_recognition_result_dict = business_card_recognition_result_instance.to_dict()
# create an instance of BusinessCardRecognitionResult from a dict
business_card_recognition_result_from_dict = BusinessCardRecognitionResult.from_dict(business_card_recognition_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


