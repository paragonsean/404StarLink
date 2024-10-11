# OcrPageResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mean_confidence_level** | **float** | Confidence level rating of the OCR operation; ratings above 80% are strong. | [optional] 
**page_number** | **int** | Page number of the page that was OCR-ed, starting with 1 for the first page in the PDF file | [optional] 
**text_result** | **str** | Converted text string from the image input. | [optional] 

## Example

```python
from openapi_client.models.ocr_page_result import OcrPageResult

# TODO update the JSON string below
json = "{}"
# create an instance of OcrPageResult from a JSON string
ocr_page_result_instance = OcrPageResult.from_json(json)
# print the JSON string representation of the object
print(OcrPageResult.to_json())

# convert the object into a dict
ocr_page_result_dict = ocr_page_result_instance.to_dict()
# create an instance of OcrPageResult from a dict
ocr_page_result_from_dict = OcrPageResult.from_dict(ocr_page_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


