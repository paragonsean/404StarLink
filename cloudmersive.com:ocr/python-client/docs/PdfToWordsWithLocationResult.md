# PdfToWordsWithLocationResult

Response from an OCR to words with location operation.  Includes the confience rating and converted text result, along with the locations of the words in the pages.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ocr_pages** | [**List[OcrPageResultWithWordsWithLocation]**](OcrPageResultWithWordsWithLocation.md) | OCR page results | [optional] 
**successful** | **bool** | True if successful, false otherwise | [optional] 

## Example

```python
from openapi_client.models.pdf_to_words_with_location_result import PdfToWordsWithLocationResult

# TODO update the JSON string below
json = "{}"
# create an instance of PdfToWordsWithLocationResult from a JSON string
pdf_to_words_with_location_result_instance = PdfToWordsWithLocationResult.from_json(json)
# print the JSON string representation of the object
print(PdfToWordsWithLocationResult.to_json())

# convert the object into a dict
pdf_to_words_with_location_result_dict = pdf_to_words_with_location_result_instance.to_dict()
# create an instance of PdfToWordsWithLocationResult from a dict
pdf_to_words_with_location_result_from_dict = PdfToWordsWithLocationResult.from_dict(pdf_to_words_with_location_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


