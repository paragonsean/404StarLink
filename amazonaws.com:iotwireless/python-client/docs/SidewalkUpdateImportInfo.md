# SidewalkUpdateImportInfo

Sidewalk object information for updating an import task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_creation_file** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_update_import_info import SidewalkUpdateImportInfo

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkUpdateImportInfo from a JSON string
sidewalk_update_import_info_instance = SidewalkUpdateImportInfo.from_json(json)
# print the JSON string representation of the object
print(SidewalkUpdateImportInfo.to_json())

# convert the object into a dict
sidewalk_update_import_info_dict = sidewalk_update_import_info_instance.to_dict()
# create an instance of SidewalkUpdateImportInfo from a dict
sidewalk_update_import_info_from_dict = SidewalkUpdateImportInfo.from_dict(sidewalk_update_import_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


