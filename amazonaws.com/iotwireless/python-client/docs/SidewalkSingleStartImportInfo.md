# SidewalkSingleStartImportInfo

Information about an import task created for an individual Sidewalk device.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk_manufacturing_sn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_single_start_import_info import SidewalkSingleStartImportInfo

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkSingleStartImportInfo from a JSON string
sidewalk_single_start_import_info_instance = SidewalkSingleStartImportInfo.from_json(json)
# print the JSON string representation of the object
print(SidewalkSingleStartImportInfo.to_json())

# convert the object into a dict
sidewalk_single_start_import_info_dict = sidewalk_single_start_import_info_instance.to_dict()
# create an instance of SidewalkSingleStartImportInfo from a dict
sidewalk_single_start_import_info_from_dict = SidewalkSingleStartImportInfo.from_dict(sidewalk_single_start_import_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


