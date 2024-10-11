# DocumentLocation

<p>The Amazon S3 bucket that contains the document to be processed. It's used by asynchronous operations.</p> <p>The input document can be an image file in JPEG or PNG format. It can also be a file in PDF format.</p>

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**s3_object** | [**DocumentLocationS3Object**](DocumentLocationS3Object.md) |  | [optional] 

## Example

```python
from openapi_client.models.document_location import DocumentLocation

# TODO update the JSON string below
json = "{}"
# create an instance of DocumentLocation from a JSON string
document_location_instance = DocumentLocation.from_json(json)
# print the JSON string representation of the object
print(DocumentLocation.to_json())

# convert the object into a dict
document_location_dict = document_location_instance.to_dict()
# create an instance of DocumentLocation from a dict
document_location_from_dict = DocumentLocation.from_dict(document_location_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


