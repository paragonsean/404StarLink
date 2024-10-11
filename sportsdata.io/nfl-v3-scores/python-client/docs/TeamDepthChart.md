# TeamDepthChart


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defense** | [**List[DepthChart]**](DepthChart.md) |  | [optional] 
**offense** | [**List[DepthChart]**](DepthChart.md) |  | [optional] 
**special_teams** | [**List[DepthChart]**](DepthChart.md) |  | [optional] 
**team_id** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.team_depth_chart import TeamDepthChart

# TODO update the JSON string below
json = "{}"
# create an instance of TeamDepthChart from a JSON string
team_depth_chart_instance = TeamDepthChart.from_json(json)
# print the JSON string representation of the object
print(TeamDepthChart.to_json())

# convert the object into a dict
team_depth_chart_dict = team_depth_chart_instance.to_dict()
# create an instance of TeamDepthChart from a dict
team_depth_chart_from_dict = TeamDepthChart.from_dict(team_depth_chart_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


