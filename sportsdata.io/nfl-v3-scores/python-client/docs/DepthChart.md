# DepthChart


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depth_chart_id** | **int** |  | [optional] 
**depth_order** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**player_id** | **int** |  | [optional] 
**position** | **str** |  | [optional] 
**position_category** | **str** |  | [optional] 
**team_id** | **int** |  | [optional] 
**updated** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.depth_chart import DepthChart

# TODO update the JSON string below
json = "{}"
# create an instance of DepthChart from a JSON string
depth_chart_instance = DepthChart.from_json(json)
# print the JSON string representation of the object
print(DepthChart.to_json())

# convert the object into a dict
depth_chart_dict = depth_chart_instance.to_dict()
# create an instance of DepthChart from a dict
depth_chart_from_dict = DepthChart.from_dict(depth_chart_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


