# Competition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area_id** | **int** |  | [optional] 
**area_name** | **str** |  | [optional] 
**competition_id** | **int** |  | [optional] 
**format** | **str** |  | [optional] 
**gender** | **str** |  | [optional] 
**key** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**seasons** | [**List[Season]**](Season.md) |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.competition import Competition

# TODO update the JSON string below
json = "{}"
# create an instance of Competition from a JSON string
competition_instance = Competition.from_json(json)
# print the JSON string representation of the object
print(Competition.to_json())

# convert the object into a dict
competition_dict = competition_instance.to_dict()
# create an instance of Competition from a dict
competition_from_dict = Competition.from_dict(competition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


