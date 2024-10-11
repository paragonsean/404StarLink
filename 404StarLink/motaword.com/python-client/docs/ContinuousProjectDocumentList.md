# ContinuousProjectDocumentList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documents** | [**List[ContinuousProjectDocument]**](ContinuousProjectDocument.md) |  | [optional] 
**meta** | [**PagingMeta**](PagingMeta.md) |  | [optional] 

## Example

```python
from openapi_client.models.continuous_project_document_list import ContinuousProjectDocumentList

# TODO update the JSON string below
json = "{}"
# create an instance of ContinuousProjectDocumentList from a JSON string
continuous_project_document_list_instance = ContinuousProjectDocumentList.from_json(json)
# print the JSON string representation of the object
print(ContinuousProjectDocumentList.to_json())

# convert the object into a dict
continuous_project_document_list_dict = continuous_project_document_list_instance.to_dict()
# create an instance of ContinuousProjectDocumentList from a dict
continuous_project_document_list_from_dict = ContinuousProjectDocumentList.from_dict(continuous_project_document_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


