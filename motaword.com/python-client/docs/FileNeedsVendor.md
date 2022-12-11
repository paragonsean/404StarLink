# FileNeedsVendor


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **int** |  | [optional] 
**guid** | **str** |  | [optional] 
**project_id** | **int** |  | [optional] 
**reason** | **str** |  | [optional] 
**target_language** | **List[str]** |  | [optional] 
**task_type** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.file_needs_vendor import FileNeedsVendor

# TODO update the JSON string below
json = "{}"
# create an instance of FileNeedsVendor from a JSON string
file_needs_vendor_instance = FileNeedsVendor.from_json(json)
# print the JSON string representation of the object
print(FileNeedsVendor.to_json())

# convert the object into a dict
file_needs_vendor_dict = file_needs_vendor_instance.to_dict()
# create an instance of FileNeedsVendor from a dict
file_needs_vendor_from_dict = FileNeedsVendor.from_dict(file_needs_vendor_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


