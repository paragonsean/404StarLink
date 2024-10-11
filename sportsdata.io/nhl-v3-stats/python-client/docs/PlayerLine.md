# PlayerLine


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_number** | **int** |  | [optional] 
**line_type** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**player_id** | **int** |  | [optional] 
**position** | **str** |  | [optional] 
**shoots** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.player_line import PlayerLine

# TODO update the JSON string below
json = "{}"
# create an instance of PlayerLine from a JSON string
player_line_instance = PlayerLine.from_json(json)
# print the JSON string representation of the object
print(PlayerLine.to_json())

# convert the object into a dict
player_line_dict = player_line_instance.to_dict()
# create an instance of PlayerLine from a dict
player_line_from_dict = PlayerLine.from_dict(player_line_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


