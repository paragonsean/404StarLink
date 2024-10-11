# Timeframe


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**api_season** | **str** |  | [optional] 
**api_week** | **str** |  | [optional] 
**end_date** | **str** |  | [optional] 
**first_game_end** | **str** |  | [optional] 
**first_game_start** | **str** |  | [optional] 
**has_ended** | **bool** |  | [optional] 
**has_first_game_ended** | **bool** |  | [optional] 
**has_first_game_started** | **bool** |  | [optional] 
**has_games** | **bool** |  | [optional] 
**has_last_game_ended** | **bool** |  | [optional] 
**has_started** | **bool** |  | [optional] 
**last_game_end** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**season** | **int** |  | [optional] 
**season_type** | **int** |  | [optional] 
**short_name** | **str** |  | [optional] 
**start_date** | **str** |  | [optional] 
**week** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.timeframe import Timeframe

# TODO update the JSON string below
json = "{}"
# create an instance of Timeframe from a JSON string
timeframe_instance = Timeframe.from_json(json)
# print the JSON string representation of the object
print(Timeframe.to_json())

# convert the object into a dict
timeframe_dict = timeframe_instance.to_dict()
# create an instance of Timeframe from a dict
timeframe_from_dict = Timeframe.from_dict(timeframe_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


