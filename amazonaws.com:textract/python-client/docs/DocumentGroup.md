# DocumentGroup

Summary information about documents grouped by the same document type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** |  | [optional] 
**split_documents** | **List** |  | [optional] 
**detected_signatures** | **List** |  | [optional] 
**undetected_signatures** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.document_group import DocumentGroup

# TODO update the JSON string below
json = "{}"
# create an instance of DocumentGroup from a JSON string
document_group_instance = DocumentGroup.from_json(json)
# print the JSON string representation of the object
print(DocumentGroup.to_json())

# convert the object into a dict
document_group_dict = document_group_instance.to_dict()
# create an instance of DocumentGroup from a dict
document_group_from_dict = DocumentGroup.from_dict(document_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


