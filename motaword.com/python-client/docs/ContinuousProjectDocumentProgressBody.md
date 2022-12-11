# ContinuousProjectDocumentProgressBody


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_name** | **str** |  | [optional] 
**filter_by_language** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.continuous_project_document_progress_body import ContinuousProjectDocumentProgressBody

# TODO update the JSON string below
json = "{}"
# create an instance of ContinuousProjectDocumentProgressBody from a JSON string
continuous_project_document_progress_body_instance = ContinuousProjectDocumentProgressBody.from_json(json)
# print the JSON string representation of the object
print(ContinuousProjectDocumentProgressBody.to_json())

# convert the object into a dict
continuous_project_document_progress_body_dict = continuous_project_document_progress_body_instance.to_dict()
# create an instance of ContinuousProjectDocumentProgressBody from a dict
continuous_project_document_progress_body_from_dict = ContinuousProjectDocumentProgressBody.from_dict(continuous_project_document_progress_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


