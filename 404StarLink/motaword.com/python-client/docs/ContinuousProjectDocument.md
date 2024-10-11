# ContinuousProjectDocument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billed_word_count** | **int** |  | [optional] 
**id** | **str** |  | [optional] 
**links** | [**DocumentLinks**](DocumentLinks.md) |  | [optional] 
**name** | **str** |  | [optional] 
**post_edit_enabled** | **bool** |  | [optional] 
**project_id** | **str** |  | [optional] 
**source_language** | **str** |  | [optional] 
**target_languages** | **List[str]** |  | [optional] 
**word_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.continuous_project_document import ContinuousProjectDocument

# TODO update the JSON string below
json = "{}"
# create an instance of ContinuousProjectDocument from a JSON string
continuous_project_document_instance = ContinuousProjectDocument.from_json(json)
# print the JSON string representation of the object
print(ContinuousProjectDocument.to_json())

# convert the object into a dict
continuous_project_document_dict = continuous_project_document_instance.to_dict()
# create an instance of ContinuousProjectDocument from a dict
continuous_project_document_from_dict = ContinuousProjectDocument.from_dict(continuous_project_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


