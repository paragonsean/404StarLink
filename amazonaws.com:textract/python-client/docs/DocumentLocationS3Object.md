# DocumentLocationS3Object


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucket** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.document_location_s3_object import DocumentLocationS3Object

# TODO update the JSON string below
json = "{}"
# create an instance of DocumentLocationS3Object from a JSON string
document_location_s3_object_instance = DocumentLocationS3Object.from_json(json)
# print the JSON string representation of the object
print(DocumentLocationS3Object.to_json())

# convert the object into a dict
document_location_s3_object_dict = document_location_s3_object_instance.to_dict()
# create an instance of DocumentLocationS3Object from a dict
document_location_s3_object_from_dict = DocumentLocationS3Object.from_dict(document_location_s3_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


