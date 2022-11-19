# OcrPageResultWithWordsWithLocation

OCR results of a page, including words of text and their location

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page_number** | **int** | Page number of the page that was OCR-ed, starting with 1 for the first page in the PDF file | [optional] 
**successful** | **bool** | True if successful, false otherwise | [optional] 
**words** | [**List[OcrWordElement]**](OcrWordElement.md) | Word elements in the image | [optional] 

## Example

```python
from openapi_client.models.ocr_page_result_with_words_with_location import OcrPageResultWithWordsWithLocation

# TODO update the JSON string below
json = "{}"
# create an instance of OcrPageResultWithWordsWithLocation from a JSON string
ocr_page_result_with_words_with_location_instance = OcrPageResultWithWordsWithLocation.from_json(json)
# print the JSON string representation of the object
print(OcrPageResultWithWordsWithLocation.to_json())

# convert the object into a dict
ocr_page_result_with_words_with_location_dict = ocr_page_result_with_words_with_location_instance.to_dict()
# create an instance of OcrPageResultWithWordsWithLocation from a dict
ocr_page_result_with_words_with_location_from_dict = OcrPageResultWithWordsWithLocation.from_dict(ocr_page_result_with_words_with_location_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


