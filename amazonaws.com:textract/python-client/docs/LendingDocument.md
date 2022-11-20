# LendingDocument

Holds the structured data returned by AnalyzeDocument for lending documents.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lending_fields** | **List** |  | [optional] 
**signature_detections** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.lending_document import LendingDocument

# TODO update the JSON string below
json = "{}"
# create an instance of LendingDocument from a JSON string
lending_document_instance = LendingDocument.from_json(json)
# print the JSON string representation of the object
print(LendingDocument.to_json())

# convert the object into a dict
lending_document_dict = lending_document_instance.to_dict()
# create an instance of LendingDocument from a dict
lending_document_from_dict = LendingDocument.from_dict(lending_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


