# IdentityDocument

The structure that lists each document processed in an AnalyzeID operation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_index** | **int** |  | [optional] 
**identity_document_fields** | **List** |  | [optional] 
**blocks** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.identity_document import IdentityDocument

# TODO update the JSON string below
json = "{}"
# create an instance of IdentityDocument from a JSON string
identity_document_instance = IdentityDocument.from_json(json)
# print the JSON string representation of the object
print(IdentityDocument.to_json())

# convert the object into a dict
identity_document_dict = identity_document_instance.to_dict()
# create an instance of IdentityDocument from a dict
identity_document_from_dict = IdentityDocument.from_dict(identity_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


