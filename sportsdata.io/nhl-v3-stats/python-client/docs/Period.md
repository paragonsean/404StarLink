# Period


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**away_score** | **int** |  | [optional] 
**game_id** | **int** |  | [optional] 
**home_score** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**penalties** | [**List[Penalty]**](Penalty.md) |  | [optional] 
**period_id** | **int** |  | [optional] 
**scoring_plays** | [**List[ScoringPlay]**](ScoringPlay.md) |  | [optional] 

## Example

```python
from openapi_client.models.period import Period

# TODO update the JSON string below
json = "{}"
# create an instance of Period from a JSON string
period_instance = Period.from_json(json)
# print the JSON string representation of the object
print(Period.to_json())

# convert the object into a dict
period_dict = period_instance.to_dict()
# create an instance of Period from a dict
period_from_dict = Period.from_dict(period_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


