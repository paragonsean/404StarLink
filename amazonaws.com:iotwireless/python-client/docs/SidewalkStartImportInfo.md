# SidewalkStartImportInfo

Information about an import task created for bulk provisioning.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_creation_file** | **str** |  | [optional] 
**role** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_start_import_info import SidewalkStartImportInfo

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkStartImportInfo from a JSON string
sidewalk_start_import_info_instance = SidewalkStartImportInfo.from_json(json)
# print the JSON string representation of the object
print(SidewalkStartImportInfo.to_json())

# convert the object into a dict
sidewalk_start_import_info_dict = sidewalk_start_import_info_instance.to_dict()
# create an instance of SidewalkStartImportInfo from a dict
sidewalk_start_import_info_from_dict = SidewalkStartImportInfo.from_dict(sidewalk_start_import_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


