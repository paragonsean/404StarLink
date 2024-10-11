# CellTowers

The cell towers that were used to perform the measurements.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gsm** | **List** |  | [optional] 
**wcdma** | **List** |  | [optional] 
**tdscdma** | **List** |  | [optional] 
**lte** | **List** |  | [optional] 
**cdma** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.cell_towers import CellTowers

# TODO update the JSON string below
json = "{}"
# create an instance of CellTowers from a JSON string
cell_towers_instance = CellTowers.from_json(json)
# print the JSON string representation of the object
print(CellTowers.to_json())

# convert the object into a dict
cell_towers_dict = cell_towers_instance.to_dict()
# create an instance of CellTowers from a dict
cell_towers_from_dict = CellTowers.from_dict(cell_towers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


