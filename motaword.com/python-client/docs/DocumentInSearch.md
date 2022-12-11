# DocumentInSearch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_type** | **str** | Extension of the file | [optional] 
**has_custom_package** | **bool** |  | [optional] 
**id** | **int** |  | [optional] 
**links** | [**DocumentLinks**](DocumentLinks.md) |  | [optional] 
**manual_files** | [**List[ManualFile]**](ManualFile.md) |  | [optional] 
**name** | **str** |  | [optional] 
**project_id** | **int** |  | [optional] 
**review_in_manual_editor** | **bool** |  | [optional] 
**scheme** | **object** |  | [optional] 
**search_score** | **float** |  | [optional] 
**source_language** | **str** |  | [optional] 
**subject** | **str** |  | [optional] 
**target_languages** | **List[str]** |  | [optional] 
**uploaded_at** | **int** | Unix epoch time | [optional] 
**word_count** | **int** |  | [optional] 
**search_result_reason** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.document_in_search import DocumentInSearch

# TODO update the JSON string below
json = "{}"
# create an instance of DocumentInSearch from a JSON string
document_in_search_instance = DocumentInSearch.from_json(json)
# print the JSON string representation of the object
print(DocumentInSearch.to_json())

# convert the object into a dict
document_in_search_dict = document_in_search_instance.to_dict()
# create an instance of DocumentInSearch from a dict
document_in_search_from_dict = DocumentInSearch.from_dict(document_in_search_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


