# OcrWordElement

A single word in an OCR document

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**block_number** | **int** | Index of the containing block | [optional] 
**confidence_level** | **float** | Confidence level of the machine learning result; possible values are 0.0 (lowest accuracy) - 1.0 (highest accuracy) | [optional] 
**height** | **int** | Height of the word in pixels | [optional] 
**line_number** | **int** | Line number of the word | [optional] 
**page_number** | **int** | Index of the containing page | [optional] 
**paragraph_number** | **int** | Index of the containing paragraph | [optional] 
**width** | **int** | Width of the word in pixels | [optional] 
**word_number** | **int** | Index of the word in the line | [optional] 
**word_text** | **str** | Text of the word | [optional] 
**x_left** | **int** | X location of the left edge of the word in pixels | [optional] 
**y_top** | **int** | Y location of the top edge of the word in pixels | [optional] 

## Example

```python
from openapi_client.models.ocr_word_element import OcrWordElement

# TODO update the JSON string below
json = "{}"
# create an instance of OcrWordElement from a JSON string
ocr_word_element_instance = OcrWordElement.from_json(json)
# print the JSON string representation of the object
print(OcrWordElement.to_json())

# convert the object into a dict
ocr_word_element_dict = ocr_word_element_instance.to_dict()
# create an instance of OcrWordElement from a dict
ocr_word_element_from_dict = OcrWordElement.from_dict(ocr_word_element_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


