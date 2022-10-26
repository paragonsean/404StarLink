# Schedule


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**away_team** | **str** |  | [optional] 
**away_team_money_line** | **int** |  | [optional] 
**canceled** | **bool** |  | [optional] 
**channel** | **str** |  | [optional] 
**var_date** | **str** |  | [optional] 
**date_time** | **str** |  | [optional] 
**day** | **str** |  | [optional] 
**forecast_description** | **str** |  | [optional] 
**forecast_temp_high** | **int** |  | [optional] 
**forecast_temp_low** | **int** |  | [optional] 
**forecast_wind_chill** | **int** |  | [optional] 
**forecast_wind_speed** | **int** |  | [optional] 
**game_key** | **str** |  | [optional] 
**geo_lat** | **float** |  | [optional] 
**geo_long** | **float** |  | [optional] 
**global_away_team_id** | **int** |  | [optional] 
**global_game_id** | **int** |  | [optional] 
**global_home_team_id** | **int** |  | [optional] 
**home_team** | **str** |  | [optional] 
**home_team_money_line** | **int** |  | [optional] 
**over_under** | **float** |  | [optional] 
**point_spread** | **float** |  | [optional] 
**score_id** | **int** |  | [optional] 
**season** | **int** |  | [optional] 
**season_type** | **int** |  | [optional] 
**stadium_details** | [**Stadium**](Stadium.md) |  | [optional] 
**stadium_id** | **int** |  | [optional] 
**status** | **str** |  | [optional] 
**week** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.schedule import Schedule

# TODO update the JSON string below
json = "{}"
# create an instance of Schedule from a JSON string
schedule_instance = Schedule.from_json(json)
# print the JSON string representation of the object
print(Schedule.to_json())

# convert the object into a dict
schedule_dict = schedule_instance.to_dict()
# create an instance of Schedule from a dict
schedule_from_dict = Schedule.from_dict(schedule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


