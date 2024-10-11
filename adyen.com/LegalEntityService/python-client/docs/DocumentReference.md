# DocumentReference


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** | Identifies whether the document is active and used for checks. | [optional] 
**description** | **str** | Your description for the document. | [optional] 
**file_name** | **str** | Document name. | [optional] 
**id** | **str** | The unique identifier of the resource. | [optional] 
**modification_date** | **datetime** | The modification date of the document. | [optional] 
**type** | **str** | Type of document, used when providing an ID number or uploading a document. | [optional] 

## Example

```python
from openapi_client.models.document_reference import DocumentReference

# TODO update the JSON string below
json = "{}"
# create an instance of DocumentReference from a JSON string
document_reference_instance = DocumentReference.from_json(json)
# print the JSON string representation of the object
print(DocumentReference.to_json())

# convert the object into a dict
document_reference_dict = document_reference_instance.to_dict()
# create an instance of DocumentReference from a dict
document_reference_from_dict = DocumentReference.from_dict(document_reference_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


