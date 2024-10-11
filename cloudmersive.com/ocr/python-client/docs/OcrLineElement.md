# OcrLineElement

A contiguous line of text in an OCR document

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_text** | **str** | Text of the line | [optional] 
**words** | [**List[OcrWordElement]**](OcrWordElement.md) | Word objects in the line | [optional] 

## Example

```python
from openapi_client.models.ocr_line_element import OcrLineElement

# TODO update the JSON string below
json = "{}"
# create an instance of OcrLineElement from a JSON string
ocr_line_element_instance = OcrLineElement.from_json(json)
# print the JSON string representation of the object
print(OcrLineElement.to_json())

# convert the object into a dict
ocr_line_element_dict = ocr_line_element_instance.to_dict()
# create an instance of OcrLineElement from a dict
ocr_line_element_from_dict = OcrLineElement.from_dict(ocr_line_element_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


