# SidewalkGetStartImportInfo

Sidewalk-related information for devices in an import task that are being onboarded.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_creation_file_list** | **List** |  | [optional] 
**role** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_get_start_import_info import SidewalkGetStartImportInfo

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkGetStartImportInfo from a JSON string
sidewalk_get_start_import_info_instance = SidewalkGetStartImportInfo.from_json(json)
# print the JSON string representation of the object
print(SidewalkGetStartImportInfo.to_json())

# convert the object into a dict
sidewalk_get_start_import_info_dict = sidewalk_get_start_import_info_instance.to_dict()
# create an instance of SidewalkGetStartImportInfo from a dict
sidewalk_get_start_import_info_from_dict = SidewalkGetStartImportInfo.from_dict(sidewalk_get_start_import_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


