# FormRecognitionResult

The result of extracting form field values

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**best_match_form_setting_name** | **str** | Optional; populated when using photo/recognize/form/advanced with the Setting Name of the best-matching highest-relevance form | [optional] 
**diagnostics** | **List[str]** | Diagnostic images - default is null, enable diagnostics&#x3D;true to populate this parameter with one image per field | [optional] 
**field_value_extraction_result** | [**List[FieldResult]**](FieldResult.md) | Result of form field OCR data extraction | [optional] 
**successful** | **bool** | True if the operation was successful, false otherwise | [optional] 
**table_value_extraction_results** | [**List[TableResult]**](TableResult.md) | Result of form table OCR data extraction | [optional] 

## Example

```python
from openapi_client.models.form_recognition_result import FormRecognitionResult

# TODO update the JSON string below
json = "{}"
# create an instance of FormRecognitionResult from a JSON string
form_recognition_result_instance = FormRecognitionResult.from_json(json)
# print the JSON string representation of the object
print(FormRecognitionResult.to_json())

# convert the object into a dict
form_recognition_result_dict = form_recognition_result_instance.to_dict()
# create an instance of FormRecognitionResult from a dict
form_recognition_result_from_dict = FormRecognitionResult.from_dict(form_recognition_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


