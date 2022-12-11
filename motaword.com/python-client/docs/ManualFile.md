# ManualFile


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**drive_file_id** | **int** |  | [optional] 
**is_proofread** | **bool** |  | [optional] 
**is_translated** | **bool** |  | [optional] 
**language** | **str** |  | [optional] 
**proofreading_file_id** | **int** |  | [optional] 
**translation_file_id** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.manual_file import ManualFile

# TODO update the JSON string below
json = "{}"
# create an instance of ManualFile from a JSON string
manual_file_instance = ManualFile.from_json(json)
# print the JSON string representation of the object
print(ManualFile.to_json())

# convert the object into a dict
manual_file_dict = manual_file_instance.to_dict()
# create an instance of ManualFile from a dict
manual_file_from_dict = ManualFile.from_dict(manual_file_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


