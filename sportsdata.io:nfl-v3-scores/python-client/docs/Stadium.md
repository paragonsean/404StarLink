# Stadium


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capacity** | **int** |  | [optional] 
**city** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**geo_lat** | **float** |  | [optional] 
**geo_long** | **float** |  | [optional] 
**name** | **str** |  | [optional] 
**playing_surface** | **str** |  | [optional] 
**stadium_id** | **int** |  | [optional] 
**state** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.stadium import Stadium

# TODO update the JSON string below
json = "{}"
# create an instance of Stadium from a JSON string
stadium_instance = Stadium.from_json(json)
# print the JSON string representation of the object
print(Stadium.to_json())

# convert the object into a dict
stadium_dict = stadium_instance.to_dict()
# create an instance of Stadium from a dict
stadium_from_dict = Stadium.from_dict(stadium_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


