# PdfToLinesWithLocationResult

Response from an OCR to lines with location operation.  Includes the confience rating and converted text result, along with the locations of the lines in the pages.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ocr_pages** | [**List[OcrPageResultWithLinesWithLocation]**](OcrPageResultWithLinesWithLocation.md) | OCR results for each page | [optional] 
**successful** | **bool** | True if successful, false otherwise | [optional] 

## Example

```python
from openapi_client.models.pdf_to_lines_with_location_result import PdfToLinesWithLocationResult

# TODO update the JSON string below
json = "{}"
# create an instance of PdfToLinesWithLocationResult from a JSON string
pdf_to_lines_with_location_result_instance = PdfToLinesWithLocationResult.from_json(json)
# print the JSON string representation of the object
print(PdfToLinesWithLocationResult.to_json())

# convert the object into a dict
pdf_to_lines_with_location_result_dict = pdf_to_lines_with_location_result_instance.to_dict()
# create an instance of PdfToLinesWithLocationResult from a dict
pdf_to_lines_with_location_result_from_dict = PdfToLinesWithLocationResult.from_dict(pdf_to_lines_with_location_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


