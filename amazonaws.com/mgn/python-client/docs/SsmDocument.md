# SsmDocument

AWS Systems Manager Document.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_name** | **str** |  | 
**external_parameters** | **Dict** |  | [optional] 
**must_succeed_for_cutover** | **bool** |  | [optional] 
**parameters** | **Dict** |  | [optional] 
**ssm_document_name** | **str** |  | 
**timeout_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.ssm_document import SsmDocument

# TODO update the JSON string below
json = "{}"
# create an instance of SsmDocument from a JSON string
ssm_document_instance = SsmDocument.from_json(json)
# print the JSON string representation of the object
print(SsmDocument.to_json())

# convert the object into a dict
ssm_document_dict = ssm_document_instance.to_dict()
# create an instance of SsmDocument from a dict
ssm_document_from_dict = SsmDocument.from_dict(ssm_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


