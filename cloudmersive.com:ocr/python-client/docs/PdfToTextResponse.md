# PdfToTextResponse

Response from an OCR to text operation.  Includes the confidence rating and converted text result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ocr_pages** | [**List[OcrPageResult]**](OcrPageResult.md) | Page OCR results | [optional] 
**successful** | **bool** | True if successful, false otherwise | [optional] 

## Example

```python
from openapi_client.models.pdf_to_text_response import PdfToTextResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PdfToTextResponse from a JSON string
pdf_to_text_response_instance = PdfToTextResponse.from_json(json)
# print the JSON string representation of the object
print(PdfToTextResponse.to_json())

# convert the object into a dict
pdf_to_text_response_dict = pdf_to_text_response_instance.to_dict()
# create an instance of PdfToTextResponse from a dict
pdf_to_text_response_from_dict = PdfToTextResponse.from_dict(pdf_to_text_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


