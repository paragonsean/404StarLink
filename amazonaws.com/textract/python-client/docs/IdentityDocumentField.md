# IdentityDocumentField

Structure containing both the normalized type of the extracted information and the text associated with it. These are extracted as Type and Value respectively.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**AnalyzeIDDetections**](AnalyzeIDDetections.md) |  | [optional] 
**value_detection** | [**AnalyzeIDDetections**](AnalyzeIDDetections.md) |  | [optional] 

## Example

```python
from openapi_client.models.identity_document_field import IdentityDocumentField

# TODO update the JSON string below
json = "{}"
# create an instance of IdentityDocumentField from a JSON string
identity_document_field_instance = IdentityDocumentField.from_json(json)
# print the JSON string representation of the object
print(IdentityDocumentField.to_json())

# convert the object into a dict
identity_document_field_dict = identity_document_field_instance.to_dict()
# create an instance of IdentityDocumentField from a dict
identity_document_field_from_dict = IdentityDocumentField.from_dict(identity_document_field_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


