# CompetitionDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area_id** | **int** |  | [optional] 
**area_name** | **str** |  | [optional] 
**competition_id** | **int** |  | [optional] 
**current_season** | [**Season**](Season.md) |  | [optional] 
**format** | **str** |  | [optional] 
**games** | [**List[Game]**](Game.md) |  | [optional] 
**gender** | **str** |  | [optional] 
**key** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**seasons** | [**List[Season]**](Season.md) |  | [optional] 
**teams** | [**List[TeamDetail]**](TeamDetail.md) |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.competition_detail import CompetitionDetail

# TODO update the JSON string below
json = "{}"
# create an instance of CompetitionDetail from a JSON string
competition_detail_instance = CompetitionDetail.from_json(json)
# print the JSON string representation of the object
print(CompetitionDetail.to_json())

# convert the object into a dict
competition_detail_dict = competition_detail_instance.to_dict()
# create an instance of CompetitionDetail from a dict
competition_detail_from_dict = CompetitionDetail.from_dict(competition_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


