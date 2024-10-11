# DocumentS3Object


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucket** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.document_s3_object import DocumentS3Object

# TODO update the JSON string below
json = "{}"
# create an instance of DocumentS3Object from a JSON string
document_s3_object_instance = DocumentS3Object.from_json(json)
# print the JSON string representation of the object
print(DocumentS3Object.to_json())

# convert the object into a dict
document_s3_object_dict = document_s3_object_instance.to_dict()
# create an instance of DocumentS3Object from a dict
document_s3_object_from_dict = DocumentS3Object.from_dict(document_s3_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


