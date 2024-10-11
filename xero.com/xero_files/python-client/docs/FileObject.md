# FileObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_date_utc** | **str** | Created date in UTC | [optional] 
**folder_id** | **str** | Folder relation object&#39;s UUID | [optional] 
**id** | **str** | File object&#39;s UUID | [optional] 
**mime_type** | **str** | MimeType of the file (image/png, image/jpeg, application/pdf, etc..) | [optional] 
**name** | **str** | File Name | [optional] 
**size** | **int** | Numeric value in bytes | [optional] 
**updated_date_utc** | **str** | Updated date in UTC | [optional] 
**user** | [**User**](User.md) |  | [optional] 

## Example

```python
from openapi_client.models.file_object import FileObject

# TODO update the JSON string below
json = "{}"
# create an instance of FileObject from a JSON string
file_object_instance = FileObject.from_json(json)
# print the JSON string representation of the object
print(FileObject.to_json())

# convert the object into a dict
file_object_dict = file_object_instance.to_dict()
# create an instance of FileObject from a dict
file_object_from_dict = FileObject.from_dict(file_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


