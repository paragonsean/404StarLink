# SplitDocument

Contains information about the pages of a document, defined by logical boundary.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** |  | [optional] 
**pages** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.split_document import SplitDocument

# TODO update the JSON string below
json = "{}"
# create an instance of SplitDocument from a JSON string
split_document_instance = SplitDocument.from_json(json)
# print the JSON string representation of the object
print(SplitDocument.to_json())

# convert the object into a dict
split_document_dict = split_document_instance.to_dict()
# create an instance of SplitDocument from a dict
split_document_from_dict = SplitDocument.from_dict(split_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


