# Season


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**api_season** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**end_year** | **int** |  | [optional] 
**post_season_start_date** | **str** |  | [optional] 
**regular_season_start_date** | **str** |  | [optional] 
**season** | **int** |  | [optional] 
**season_type** | **str** |  | [optional] 
**start_year** | **int** |  | [optional] 

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


