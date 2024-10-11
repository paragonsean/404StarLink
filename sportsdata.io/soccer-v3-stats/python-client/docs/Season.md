# Season


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competition_id** | **int** |  | [optional] 
**competition_name** | **str** |  | [optional] 
**current_season** | **bool** |  | [optional] 
**end_date** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**rounds** | [**List[Round]**](Round.md) |  | [optional] 
**season** | **int** |  | [optional] 
**season_id** | **int** |  | [optional] 
**start_date** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.season import Season

# TODO update the JSON string below
json = "{}"
# create an instance of Season from a JSON string
season_instance = Season.from_json(json)
# print the JSON string representation of the object
print(Season.to_json())

# convert the object into a dict
season_dict = season_instance.to_dict()
# create an instance of Season from a dict
season_from_dict = Season.from_dict(season_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


