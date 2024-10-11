# SourceServerActionDocument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_id** | **str** |  | [optional] 
**action_name** | **str** |  | [optional] 
**active** | **bool** |  | [optional] 
**category** | [**ActionCategory**](ActionCategory.md) |  | [optional] 
**description** | **str** |  | [optional] 
**document_identifier** | **str** |  | [optional] 
**document_version** | **str** |  | [optional] 
**external_parameters** | **Dict** |  | [optional] 
**must_succeed_for_cutover** | **bool** |  | [optional] 
**order** | **int** |  | [optional] 
**parameters** | **Dict** |  | [optional] 
**timeout_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.source_server_action_document import SourceServerActionDocument

# TODO update the JSON string below
json = "{}"
# create an instance of SourceServerActionDocument from a JSON string
source_server_action_document_instance = SourceServerActionDocument.from_json(json)
# print the JSON string representation of the object
print(SourceServerActionDocument.to_json())

# convert the object into a dict
source_server_action_document_dict = source_server_action_document_instance.to_dict()
# create an instance of SourceServerActionDocument from a dict
source_server_action_document_from_dict = SourceServerActionDocument.from_dict(source_server_action_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


