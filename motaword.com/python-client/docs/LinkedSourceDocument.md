# LinkedSourceDocument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**size** | **int** | file size in bytes. optional. | [optional] 
**source** | **str** | Preferred source names are listed as enum. If you have a custom file type, simply enter that name. | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.linked_source_document import LinkedSourceDocument

# TODO update the JSON string below
json = "{}"
# create an instance of LinkedSourceDocument from a JSON string
linked_source_document_instance = LinkedSourceDocument.from_json(json)
# print the JSON string representation of the object
print(LinkedSourceDocument.to_json())

# convert the object into a dict
linked_source_document_dict = linked_source_document_instance.to_dict()
# create an instance of LinkedSourceDocument from a dict
linked_source_document_from_dict = LinkedSourceDocument.from_dict(linked_source_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


