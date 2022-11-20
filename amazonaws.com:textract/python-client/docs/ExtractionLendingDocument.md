# ExtractionLendingDocument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lending_fields** | **List** |  | [optional] 
**signature_detections** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.extraction_lending_document import ExtractionLendingDocument

# TODO update the JSON string below
json = "{}"
# create an instance of ExtractionLendingDocument from a JSON string
extraction_lending_document_instance = ExtractionLendingDocument.from_json(json)
# print the JSON string representation of the object
print(ExtractionLendingDocument.to_json())

# convert the object into a dict
extraction_lending_document_dict = extraction_lending_document_instance.to_dict()
# create an instance of ExtractionLendingDocument from a dict
extraction_lending_document_from_dict = ExtractionLendingDocument.from_dict(extraction_lending_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


