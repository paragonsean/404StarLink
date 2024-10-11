# OcrPhotoTextElement

A single text in an OCR document

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bounding_points** | [**List[Point]**](Point.md) | Points that form the bounding polygon around the text | [optional] 
**confidence_level** | **float** | Confidence level of the machine learning result; possible values are 0.0 (lowest accuracy) - 1.0 (highest accuracy) | [optional] 
**height** | **int** | Height of the word in pixels | [optional] 
**text** | **str** | Text of the word | [optional] 
**width** | **int** | Width of the word in pixels | [optional] 
**x_left** | **int** | X location of the left edge of the word in pixels | [optional] 
**y_top** | **int** | Y location of the top edge of the word in pixels | [optional] 

## Example

```python
from openapi_client.models.ocr_photo_text_element import OcrPhotoTextElement

# TODO update the JSON string below
json = "{}"
# create an instance of OcrPhotoTextElement from a JSON string
ocr_photo_text_element_instance = OcrPhotoTextElement.from_json(json)
# print the JSON string representation of the object
print(OcrPhotoTextElement.to_json())

# convert the object into a dict
ocr_photo_text_element_dict = ocr_photo_text_element_instance.to_dict()
# create an instance of OcrPhotoTextElement from a dict
ocr_photo_text_element_from_dict = OcrPhotoTextElement.from_dict(ocr_photo_text_element_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


