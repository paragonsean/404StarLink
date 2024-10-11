# LendingField

Holds the normalized key-value pairs returned by AnalyzeDocument, including the document type, detected text, and geometry.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** |  | [optional] 
**key_detection** | [**LendingDetection**](LendingDetection.md) |  | [optional] 
**value_detections** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.lending_field import LendingField

# TODO update the JSON string below
json = "{}"
# create an instance of LendingField from a JSON string
lending_field_instance = LendingField.from_json(json)
# print the JSON string representation of the object
print(LendingField.to_json())

# convert the object into a dict
lending_field_dict = lending_field_instance.to_dict()
# create an instance of LendingField from a dict
lending_field_from_dict = LendingField.from_dict(lending_field_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


