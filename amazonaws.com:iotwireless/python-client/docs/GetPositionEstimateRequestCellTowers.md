# GetPositionEstimateRequestCellTowers


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
from openapi_client.models.get_position_estimate_request_cell_towers import GetPositionEstimateRequestCellTowers

# TODO update the JSON string below
json = "{}"
# create an instance of GetPositionEstimateRequestCellTowers from a JSON string
get_position_estimate_request_cell_towers_instance = GetPositionEstimateRequestCellTowers.from_json(json)
# print the JSON string representation of the object
print(GetPositionEstimateRequestCellTowers.to_json())

# convert the object into a dict
get_position_estimate_request_cell_towers_dict = get_position_estimate_request_cell_towers_instance.to_dict()
# create an instance of GetPositionEstimateRequestCellTowers from a dict
get_position_estimate_request_cell_towers_from_dict = GetPositionEstimateRequestCellTowers.from_dict(get_position_estimate_request_cell_towers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


